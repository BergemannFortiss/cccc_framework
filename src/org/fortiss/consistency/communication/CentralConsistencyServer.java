/*-------------------------------------------------------------------------+
| Copyright 2024 fortiss GmbH                                              |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
+--------------------------------------------------------------------------*/
package org.fortiss.consistency.communication;

import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createUserDetailedInformation;
import static org.fortiss.consistency.utils.ConsistencyUtils.appendCausingException;
import static org.fortiss.consistency.utils.ConsistencyUtils.buildAndStartRestConsistencyServer;
import static org.fortiss.consistency.utils.ConsistencyUtils.createEncryptedErrorMessage;
import static org.fortiss.consistency.utils.ConsistencyUtils.createEncryptedResponseMessage;
import static org.fortiss.consistency.utils.ConsistencyUtils.deserializeConsistencyElement;
import static org.fortiss.consistency.utils.ConsistencyUtils.getPayloadFromMessage;
import static org.fortiss.consistency.utils.ConsistencyUtils.getSenderIdentifierFromMessage;
import static org.fortiss.consistency.utils.ConsistencyUtils.isMessageEncrypted;
import static org.fortiss.consistency.utils.ConsistencyUtils.serializeConsistencyElement;
import static org.fortiss.consistency.utils.ConsistencyUtils.setRestConsistencyServerProperties;
import static org.springframework.http.HttpStatus.NOT_IMPLEMENTED;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.fortiss.consistency.CentralConsistencyEnvironment;
import org.fortiss.consistency.checking.ConsistencyCheckingProcess;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.FailedDecryptionException;
import org.fortiss.consistency.model.communication.TriggerFeedback;
import org.fortiss.consistency.model.communication.TriggerRequest;
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.model.communication.UserDetailedInformation;
import org.fortiss.consistency.model.communication.UserInitialInformation;
import org.fortiss.consistency.model.communication.util.CommunicationResourceFactoryImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A consistency server that should always run when consistency checking should be possible. It's
 * main task is to listen for requests from consistency adapters (of different tools), process such
 * requests (execute the wanted consistency checks) and provide / send back an answer.
 *
 * If @Autowire or @Inject is used in the future, and they need types/beans from other packages,
 * please extend the scan from this package to the others with this
 * command: @ComponentScan("org.fortiss.consistency") (below @SpringBootApplication).
 *
 * @author bergemann
 */
@SpringBootApplication
public class CentralConsistencyServer {

	/** The name of the server (for display purpose). */
	private final String SERVER_NAME;

	/** The context of the server, with which it can also be closed again. */
	private ConfigurableApplicationContext runningServerContext;

	/** Constructor. */
	public CentralConsistencyServer() {
		runningServerContext = null;
		SERVER_NAME = "central consistency server";
	}

	/**
	 * Starts the server and covers all of its setup.
	 * 
	 * @return True if the server could be started, otherwise false.
	 */
	public boolean start() {
		ConsistencyConfiguration config =
				CentralConsistencyEnvironment.getInstance().getConfiguration();
		if(config == null) {
			return false;
		}
		config.logInfo("Starting the " + SERVER_NAME + " ...");

		try {
			String serverAddress = config.getConsistencyServerAddress();
			String serverPort = String.valueOf(config.getConsistencyServerPort());
			String serverMaxThreads =
					String.valueOf(config.getConsistencyServerMaxRequestThreads());

			Properties serverProperties = setRestConsistencyServerProperties(SERVER_NAME,
					serverAddress, serverPort, serverMaxThreads, config);
			// The central server needs in addition the SSL ciphers property as well.
			serverProperties.setProperty("server.ssl.ciphers", config.getSslCipherSuite());
			runningServerContext =
					buildAndStartRestConsistencyServer(this.getClass(), serverProperties);

			// After the server setup, the consistency logger was reset, which is why we need to set
			// it up again.
			config.setupConsistencyLogger();

			config.logInfo("The " + SERVER_NAME + " is ready and waiting for requests on https://" +
					serverAddress + ":" + serverPort + " with a capacity of " + serverMaxThreads +
					" threads.");
			return true;
		} catch(Exception e) {
			config.logError(
					appendCausingException("The " + SERVER_NAME + " could not be started.", e));
			return false;
		}
	}

	/** Stops the current server (if one is active). */
	public void stop() {
		ConsistencyConfiguration config =
				CentralConsistencyEnvironment.getInstance().getConfiguration();
		if(config != null) {
			config.logInfo("Stopping the " + SERVER_NAME + " ...");
		}
		if(runningServerContext != null) {
			runningServerContext.close();
		}
		if(config != null) {
			config.logInfo("The " + SERVER_NAME + " was stopped.");
		}
	}

	/**
	 * The controller for the consistency server that contains all the possible server entry points
	 * (API) for consistency adapters.
	 *
	 * @author bergemann
	 */
	@RestController
	public class ConsistencyServerController {

		/** Constructor. */
		public ConsistencyServerController() {
			// Do nothing.
		}

		/**
		 * Checks what request is meant via the given URL path and then forwards it to the correct
		 * handler method. If the request is invalid, a respective HTTP status is returned.
		 * 
		 * This distributer method is used to be able to have the paths flexible and taken from a
		 * configuration file instead of having them hard-coded above every REST method in a final
		 * string.
		 * 
		 * It is designed as POST operation to provide the possibility to add additional information
		 * via a request body.
		 * 
		 * @param requestName
		 *            requestName The name of the request, i.e., the URL path after the host and
		 *            port.
		 * @param input
		 *            The request input.
		 * @return The response that should be returned.
		 */
		@PostMapping("/{requestName}")
		public ResponseEntity<byte[]> requestAction(@PathVariable String requestName,
				RequestEntity<byte[]> input) {
			ConsistencyConfiguration config =
					CentralConsistencyEnvironment.getInstance().getConfiguration();
			String fullEndpoint = "/" + requestName;
			if(fullEndpoint.equals(config.getConsistencyCheckEndpoint())) {
				return checkConsistency(input);
			}
			return ResponseEntity.status(NOT_IMPLEMENTED).body(config.encodeAsBytes(
					"Test The endpoint '" + fullEndpoint + "' is not implemented/available."));
		}

		/**
		 * Handles the REST endpoint for triggering a consistency check. It needs a valid request
		 * body that contains the byte array with all the trigger information. The response includes
		 * again in its body the byte array of the feedback (and a HTTP status).
		 * 
		 * @param input
		 *            The request input that triggers the consistency check.
		 * @return The response that should be returned.
		 */
		public ResponseEntity<byte[]> checkConsistency(RequestEntity<byte[]> input) {
			ConsistencyConfiguration config =
					CentralConsistencyEnvironment.getInstance().getConfiguration();
			// 1. Pre-process the input for checking process.
			byte[] inputBody = input.getBody();
			Factory communicationFactory = new CommunicationResourceFactoryImpl();
			String ownIdentifier = config.getConsistencyCheckerIdentifier();
			String messageSenderIdentifier = getSenderIdentifierFromMessage(inputBody, config);
			config.logInfo(
					"Sender from received consistency request is: " + messageSenderIdentifier);
			byte[] payload = getPayloadFromMessage(inputBody, config);
			String decryptedRequest;
			if(isMessageEncrypted(inputBody, config)) {
				try {
					// It was encrypted for this checker:
					String targetIdentifier = config.getConsistencyCheckerIdentifier();
					decryptedRequest =
							config.getEncryptionManager().decryptFor(payload, targetIdentifier);
				} catch(FailedDecryptionException e) {
					String errorMessage = "Received trigger request could not be decrypted.";
					return createEncryptedErrorMessage(errorMessage, ownIdentifier,
							messageSenderIdentifier, config);
				}
			} else {
				decryptedRequest = config.decodeBytes(payload);
			}
			EObject deserializedObject = null;
			TriggerRequest request = null;
			try {
				deserializedObject =
						deserializeConsistencyElement(decryptedRequest, communicationFactory);
			} catch(IOException e) {
				String errorMessage = "Received trigger request could not be deserialized.";
				return createEncryptedErrorMessage(errorMessage, ownIdentifier,
						messageSenderIdentifier, config);
			}
			if(deserializedObject == null) {
				String errorMessage = "Received trigger request is null.";
				return createEncryptedErrorMessage(errorMessage, ownIdentifier,
						messageSenderIdentifier, config);
			}
			if(deserializedObject instanceof TriggerRequest) {
				request = (TriggerRequest)deserializedObject;
			} else {
				String errorMessage = "Received trigger request is not of correct type.";
				return createEncryptedErrorMessage(errorMessage, ownIdentifier,
						messageSenderIdentifier, config);
			}

			// 2. Execute the actually triggered checking process.
			config.logInfo("Server got check request from adapter with the identifier '" +
					request.getAdapterIdentifier() +
					"' and can understand it (decryption and deserialization completed). Executing now its request ...");
			Date currentTime = new Date();
			UserInitialInformation userInfo = request.getUser();
			UserBaseAttributes attributes = config.getClearanceManager()
					.getBaseAttributesBasesOnToken(userInfo.getUserToken());
			UserDetailedInformation detailedUserInfo = createUserDetailedInformation(userInfo,
					attributes, request.getAdapterIdentifier(), currentTime);
			ConsistencyCheckingProcess checkingProcess = new ConsistencyCheckingProcess(
					request.getAdapterIdentifier(), detailedUserInfo);
			TriggerFeedback feedback =
					checkingProcess.checkConsistency(request.getElementsToBeCheckedInfo());
			checkingProcess.stop();

			// 3. Pre-process the feedback for the final response.
			String serializedFeedback = "";
			try {
				serializedFeedback = serializeConsistencyElement(feedback, communicationFactory);
			} catch(IOException e) {
				String errorMessage = "Failed serialization of " + feedback + ".";
				config.logError(appendCausingException(errorMessage, e));
			}
			if(serializedFeedback.isEmpty()) {
				String errorMessage = "Consistency feedback could not be serialized.";
				return createEncryptedErrorMessage(errorMessage, ownIdentifier,
						messageSenderIdentifier, config);
			}

			// 4. Return feedback.
			return createEncryptedResponseMessage(serializedFeedback, ownIdentifier,
					messageSenderIdentifier, config);
		}
	}
}
