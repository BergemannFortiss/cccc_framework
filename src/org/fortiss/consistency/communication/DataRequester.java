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

import static org.fortiss.consistency.utils.ConsistencyUtils.appendCausingException;
import static org.fortiss.consistency.utils.ConsistencyUtils.deserializeConsistencyElement;
import static org.fortiss.consistency.utils.ConsistencyUtils.getPayloadFromMessage;
import static org.fortiss.consistency.utils.ConsistencyUtils.isMessageEncrypted;
import static org.fortiss.consistency.utils.ConsistencyUtils.prepareFinalMessage;
import static org.fortiss.consistency.utils.ConsistencyUtils.serializeConsistencyElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyStore;
import java.security.SecureRandom;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.EmptyResponseException;
import org.fortiss.consistency.exceptions.FailedCommunicationException;
import org.fortiss.consistency.exceptions.FailedDecryptionException;
import org.fortiss.consistency.exceptions.FailedDeserializationException;
import org.fortiss.consistency.exceptions.FailedEncryptionException;
import org.fortiss.consistency.exceptions.FailedSerializationException;
import org.fortiss.consistency.exceptions.ReceivedErrorException;
import org.fortiss.consistency.exceptions.UnexpectedDataTypeException;
import org.fortiss.consistency.model.communication.ModelDataFeedback;
import org.fortiss.consistency.model.communication.ModelDataRequest;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;
import org.fortiss.consistency.model.communication.util.CommunicationResourceFactoryImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * A request client that can connect to the data server of a consistency adapter and request some
 * model data needed for the current check(s). It waits for the data response and returns it to the
 * caller.
 *
 * @author bergemann
 */
public class DataRequester {

	/** The configuration that has all the basic consistency information. */
	private ConsistencyConfiguration config;
	/** The SSL context that should be used to create SSL connections/sockets. */
	private SSLContext sslContext = null;
	/** A shared rest template used to perform all HTTP(S) requests. */
	private RestTemplate restTemplate;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            The configuration with all the information needed for this class.
	 */
	public DataRequester(ConsistencyConfiguration config) {
		this.config = config;
		instantiateSSLContext();

		if(sslContext == null) {
			config.logError(
					"Unable to create SSL REST template because TSL/SSL context does not exist. Data requester cannot be started.");
			this.restTemplate = null;
			return;
		}
		HttpClient client = HttpClients.custom().setSSLContext(sslContext).build();
		HttpComponentsClientHttpRequestFactory requestFactory =
				new HttpComponentsClientHttpRequestFactory(client);
		requestFactory.setReadTimeout(config.getReadTimeoutInMs());
		requestFactory.setConnectionRequestTimeout(config.getConnectionTimeoutInMs());
		this.restTemplate = new RestTemplate(requestFactory);
	}

	/**
	 * Executes the whole data request process for one adapter (of the given identifier). The given
	 * request is serialized, encrypted and sent to the adapter. If a response is received, the
	 * response is decrypted, deserialized and returned as data view (if possible).
	 * 
	 * A TLSv1.3 socket connection is used with two-way authentication and end-to-end encryption to
	 * protect sensible data if it is contained inside the information exchange.
	 * 
	 * @param requestBody
	 *            The request that should be sent. Contains all important information like the
	 *            targeted adapter, requesting user, viewtype and needed elements.
	 * 
	 * @return The decrypted and deserialized, i.e., fully post-processed data view received from
	 *         the adapter (or null if it was not possible).
	 * 
	 * @throws Exception
	 *             Any exception that happened during the communication attempt or the pre- and
	 *             post-processing.
	 */
	public ModelDataFeedback requestDataFromAdapter(ModelDataRequest requestBody) throws Exception {
		if(restTemplate == null) {
			return null;
		}
		String adapterIdentifier = requestBody.getTargetedAdapter();

		// 1. Serialize the request message.
		Factory communicationFactory = new CommunicationResourceFactoryImpl();
		String serializedRequestBody;
		try {
			serializedRequestBody = serializeConsistencyElement(requestBody, communicationFactory);
		} catch(IOException e) {
			String ownExceptionMessage = "Failed serialization of " + requestBody + ".";
			throw new FailedSerializationException(appendCausingException(ownExceptionMessage, e));
		}

		// 2. Encrypt the request message (and other preparations).
		// Although the request and especially the response (data exchange) is done via a
		// TLSv1.3 socket connection with two-way authentication and end-to-end encryption to
		// protect sensible data, it is safer to also encrypt it in addition.
		byte[] encryptedRequestBody;
		try {
			boolean encrytionWanted = true;
			String senderIdentifier = config.getConsistencyCheckerIdentifier();
			String targetIdentifier = adapterIdentifier;
			encryptedRequestBody = prepareFinalMessage(serializedRequestBody, encrytionWanted,
					senderIdentifier, targetIdentifier, config);
		} catch(FailedEncryptionException e) {
			String ownExceptionMessage =
					"Failed encryption of body for request '" + requestBody.getRequestIdentifier() +
							"' to '" + requestBody.getTargetedAdapter() + "'.";
			throw new FailedEncryptionException(appendCausingException(ownExceptionMessage, e));
		}

		// 3. Send the request.
		ResponseEntity<byte[]> receivedResponse;
		try {
			receivedResponse = sendRequest(encryptedRequestBody, adapterIdentifier);
		} catch(Exception e) {
			String ownExceptionMessage = "Could not communicate with tool adapter '" +
					adapterIdentifier + "' (to send a data request).";
			throw new FailedCommunicationException(appendCausingException(ownExceptionMessage, e));
		}

		// 4. Process the response.
		if(!receivedResponse.getStatusCode().equals(HttpStatus.OK)) {
			config.logError(adapterIdentifier +
					" adapter data server responded with an unexpected HTTP status. Cannot continue consistency check. Received HTTP status: '" +
					receivedResponse.getStatusCode().toString() + "'.");
			return null;
		}
		byte[] receivedResponseBody = receivedResponse.getBody();
		// 4.1. Decrypt response and check for error messages.
		byte[] payload = getPayloadFromMessage(receivedResponseBody, config);
		String decryptedFeedback;
		if(isMessageEncrypted(receivedResponseBody, config)) {
			try {
				// It was encrypted for this checker:
				String targetIdentifier = config.getConsistencyCheckerIdentifier();
				decryptedFeedback =
						config.getEncryptionManager().decryptFor(payload, targetIdentifier);
			} catch(Exception e) {
				String ownExceptionMessage = "Failed decryption of received data feedback from '" +
						adapterIdentifier + "'.";
				throw new FailedDecryptionException(appendCausingException(ownExceptionMessage, e));
			}
		} else {
			decryptedFeedback = config.decodeBytes(payload);
		}
		if(decryptedFeedback.isEmpty() || decryptedFeedback.isBlank()) {
			String ownExceptionMessage = "Adapter data server from tool '" + adapterIdentifier +
					"' provided only an empty response.";
			throw new EmptyResponseException(ownExceptionMessage);
		}
		if(decryptedFeedback.startsWith(config.getErrorMessageIdentifier())) {
			String ownExceptionMessage = "Adapter data server from tool '" + adapterIdentifier +
					"' provided an error response.\n\tThe received error message: '" +
					decryptedFeedback.substring(config.getErrorMessageIdentifier().length()) + "'.";
			throw new ReceivedErrorException(ownExceptionMessage);
		}

		// 4.2. Deserialize response.
		EObject deserializedObject;
		try {
			deserializedObject =
					deserializeConsistencyElement(decryptedFeedback, communicationFactory);
		} catch(IOException e) {
			String ownExceptionMessage = "Failed deserialization of '" + decryptedFeedback +
					"' from tool adapter '" + adapterIdentifier + "'.";
			throw new FailedDeserializationException(
					appendCausingException(ownExceptionMessage, e));
		}

		// 4.3. Transform it into the correct return object.
		if(!(deserializedObject instanceof ModelDataFeedback)) {
			String ownExceptionMessage = "Received data from adapter '" + adapterIdentifier +
					"' is not a ModelDataFeedback. Cannot deal here with '" +
					deserializedObject.getClass() + "'.";
			throw new UnexpectedDataTypeException(ownExceptionMessage);
		}
		return (ModelDataFeedback)deserializedObject;
	}

	/**
	 * Requests data from a consistency adapter by sending the given request message to the data
	 * server of the given adapter identifier. It then waits for the response, which is returned
	 * as response entity whose body contains the provided data as encrypted serialized byte array
	 * (no pre-processing done yet!).
	 * 
	 * @param requestMessage
	 *            The message body that should be sent.
	 * @param adapterIdentifier
	 *            The identifier of the adapter to which the message should be sent.
	 * @return The response (or null if it was not possible).
	 */
	private ResponseEntity<byte[]> sendRequest(byte[] requestMessage, String adapterIdentifier) {
		ToolAdapterRegistrationEntry adapterInfo = config.getRegistrationEntryOf(adapterIdentifier);
		URI uri = createUriFor(config.getDataRequestEndpoint(), adapterInfo);
		if(uri == null) {
			return null;
		}

		try {
			return restTemplate.postForEntity(uri, requestMessage, byte[].class);
		} catch(Exception e) {
			config.logError("Could not request model data from " + adapterIdentifier +
					". Exception message: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Creates the URI for the given REST endpoint path. The URI will always used HTTPS as protocol
	 * and take the server address and port information form the given adapter information.
	 * 
	 * @param uriPath
	 *            The REST endpoint path for the URI.
	 * @param adapterInfo
	 *            The information about the adapter for which the URI should be created.
	 * @return The created URI.
	 */
	private URI createUriFor(String uriPath, ToolAdapterRegistrationEntry adapterInfo) {
		String protocol = "https";
		String auth = null;
		String host = adapterInfo.getAdapterDataServerHostAddress();
		int port = adapterInfo.getAdapterDataServerPort();
		String query = null;
		String fragment = null;
		try {
			return new URI(protocol, auth, host, port, uriPath, query, fragment);
		} catch(URISyntaxException e) {
			config.logError("Could not create a valid URI for the model data request from " +
					adapterInfo.getAdapterIdentifier() + ". Exception message: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Initializes the SSL context with the internal key and trust store files. This should be
	 * called exactly once before creating any SSL servers/sockets.
	 */
	private void instantiateSSLContext() {
		File keyStoreFile = config.getKeyStoreFile();
		File trustStoreFile = config.getTrustStoreFile();
		char[] keyStorePassword = config.getKeyStorePassword().toCharArray();
		char[] trustStorePassword = config.getTrustStorePassword().toCharArray();
		String keyStoreType = config.getSslKeyStoreType();
		String keyManagerType = config.getSslKeyManagerType();

		try {
			// For trusting the adapters: load the trust store.
			KeyStore trustStore = KeyStore.getInstance(keyStoreType);
			InputStream trustStoreStream = new FileInputStream(trustStoreFile);
			trustStore.load(trustStoreStream, trustStorePassword);
			TrustManagerFactory trustManagerFactory =
					TrustManagerFactory.getInstance(keyManagerType);
			trustManagerFactory.init(trustStore);

			// For getting trusted by the adapters: load the key store.
			KeyStore keyStore = KeyStore.getInstance(keyStoreType);
			InputStream keyStoreStream = new FileInputStream(keyStoreFile);
			keyStore.load(keyStoreStream, keyStorePassword);
			KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(keyManagerType);
			keyManagerFactory.init(keyStore, keyStorePassword);

			// Initialize SSL context for all future communication.
			sslContext = SSLContext.getInstance(config.getSslProtocol());
			sslContext.init(keyManagerFactory.getKeyManagers(),
					trustManagerFactory.getTrustManagers(), SecureRandom.getInstanceStrong());

			trustStoreStream.close();
			keyStoreStream.close();
		} catch(Exception e) {
			String errorMessage =
					"Unable to instantiate TSL/SSL context with key and trust stores.";
			config.logError(appendCausingException(errorMessage, e));
		}
	}
}
