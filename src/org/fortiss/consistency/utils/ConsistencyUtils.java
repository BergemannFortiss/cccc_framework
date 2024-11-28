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
package org.fortiss.consistency.utils;

import static org.eclipse.emf.common.util.URI.createURI;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createContextWrapper;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.generateUniqueIdentifierBasedOnElemInfo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.apache.catalina.webresources.TomcatURLStreamHandlerFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.FailedEncryptionException;
import org.fortiss.consistency.exceptions.MissingDataException;
import org.fortiss.consistency.model.AbstractElementRelation;
import org.fortiss.consistency.model.BasicElementInformation;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ContextWrapper;
import org.fortiss.consistency.model.RelationTargetInformation;
import org.fortiss.consistency.model.RuleElement;
import org.fortiss.consistency.model.views.ConsistencyView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.xml.sax.InputSource;

/**
 * Class with utility methods for consistency checking.
 *
 * @author bergemann
 */

public class ConsistencyUtils {

	/**
	 * Returns a string where the given causing exception is attached to the end of the given
	 * exception message in a fixed format.
	 * 
	 * @param currentExceptionMessage
	 *            The main exception message.
	 * @param causingException
	 *            The exception that is causing the message above.
	 * @return The extended (more detailed) exception message.
	 */
	public static String appendCausingException(String currentExceptionMessage,
			Exception causingException) {
		String causingExceptionName = causingException.getClass().getName();
		String causingExceptionMessage = causingException.getMessage();
		String originalCauseMessage = "";
		Throwable originalCause = causingException.getCause();
		if(originalCause != null) {
			originalCauseMessage = " [Cause: " + originalCause.getMessage() + "]";
		}
		return currentExceptionMessage + "\n\tCaused by " + causingExceptionName + ": " +
				causingExceptionMessage + originalCauseMessage;
	}

	/**
	 * Returns the class of a model element based on the given information about the element. If it
	 * cannot be found, an exception is thrown.
	 * 
	 * If the class might not be in the general classpath but in an EPackage, this package (or
	 * rather a list of possible ones) can be provided as metamodels and the method will first
	 * search within them for the class. If this should not be done (e.g., no EPackage exists), the
	 * respective parameter should be null.
	 * 
	 * @param elementInfo
	 *            The information about the element.
	 * @param metamodels
	 *            The metamodels in which the class should be searched.
	 * @return The requested class.
	 * 
	 * @throws ClassNotFoundException
	 */
	public static Class<?> getElementClassFromInfo(BasicElementInformation elementInfo,
			List<EPackage> metamodels) throws ClassNotFoundException {
		return getClassFromString(elementInfo.getElementClassString(), metamodels);
	}

	/**
	 * Returns the class based on its given name. If it cannot be found, an exception is thrown.
	 * 
	 * If the class might not be in the general classpath but in an EPackage, this package (or
	 * rather a list of possible ones) can be provided as metamodels and the method will first
	 * search within them for the class. If this should not be done (e.g., no EPackage exists), the
	 * respective parameter should be null.
	 * 
	 * @param classString
	 *            The name of the wanted class as string.
	 * @param metamodels
	 *            The metamodels in which the class should be searched.
	 * @return The requested class.
	 * 
	 * @throws ClassNotFoundException
	 */
	public static Class<?> getClassFromString(String classString, List<EPackage> metamodels)
			throws ClassNotFoundException {
		if(metamodels != null) {
			EClassifier classifier = getClassifierByName(classString, metamodels);
			if(classifier != null && classifier.getInstanceClass() != null) {
				return classifier.getInstanceClass();
			}
		}
		// For some types, like primitives or collections, the detailed prefix is needed to be able
		// to find them. Therefore, the search should be executed also with these refined class
		// paths.
		List<String> possibleClassNames = new ArrayList<>();
		possibleClassNames.add(classString);
		// For primitives, like java.lang.Integer.
		possibleClassNames.add("java.lang." + classString);
		// For collections, like java.util.Set.
		possibleClassNames.add("java.util." + classString);
		Class<?> foundClass = tryGetClassByNames(possibleClassNames);
		if(foundClass == null) {
			throw new ClassNotFoundException(
					"A class with the following name could not be found: '" + classString + "'.");
		}
		return foundClass;
	}

	/**
	 * Tries to find a class by going through the list of given class names. The first to be found
	 * is returned. If none can be found at all, null is returned.
	 * 
	 * @param classNames
	 *            The possible names of the wanted class.
	 * @return The wanted class or null if it is not possible.
	 */
	private static Class<?> tryGetClassByNames(List<String> classNames) {
		if(classNames != null && !classNames.isEmpty()) {
			for(String className : classNames) {
				try {
					return Class.forName(className);
				} catch(Exception ex) {
					// Try next.
					continue;
				}
			}
		}
		return null;
	}

	/**
	 * Returns the classifier of a class based on its given name. The classifier will be searched
	 * within the provided metamodels (packages). If it cannot be found, null is returned.
	 * 
	 * @param classString
	 *            The name of the wanted class/classifier as string.
	 * @param metamodels
	 *            The metamodels in which the class/classifier should be searched.
	 * @return The classifier for the wanted class.
	 */
	public static EClassifier getClassifierByName(String classString, List<EPackage> metamodels) {
		final String className;
		final String classNsPrefix;
		int prefixLimiter = classString.lastIndexOf(".");
		if(prefixLimiter == -1) {
			// Class was given with only the actual class name.
			classNsPrefix = "";
			className = classString;
		} else {
			// Class was given with absolute path.
			classNsPrefix = classString.substring(0, prefixLimiter);
			className = classString.substring(prefixLimiter + 1);
		}

		if(metamodels != null) {
			// First, check if the correct metamodel can be found via the namespace.
			if(!classNsPrefix.isBlank()) {
				Optional<EPackage> possibleMetamodel = metamodels.stream()
						.filter(metamodel -> metamodel.getNsPrefix().equals(classNsPrefix))
						.findFirst();
				if(possibleMetamodel.isPresent()) {
					EPackage foundMetamodel = possibleMetamodel.get();
					EClassifier foundClassifier = foundMetamodel.getEClassifier(className);
					if(foundClassifier != null && foundClassifier.getInstanceClass() != null) {
						return foundClassifier;
					}
				}
			}

			// Otherwise, go through all metamodels and check if a matching class name can be found.
			for(EPackage metamodel : metamodels) {
				for(EClassifier classifier : metamodel.getEClassifiers()) {
					String instanceClassName = classifier.getInstanceClassName();
					if(instanceClassName != null) {
						String instanceClassNamePrefix = "";
						String instanceClassNameBase = "";
						prefixLimiter = instanceClassName.lastIndexOf(".");
						if(prefixLimiter == -1) {
							// Class was given with only the actual class name.
							instanceClassNameBase = instanceClassName;
						} else {
							// Class was given with absolute path.
							instanceClassNamePrefix = instanceClassName.substring(0, prefixLimiter);
							instanceClassNameBase = instanceClassName.substring(prefixLimiter + 1);
						}
						if(instanceClassNameBase.equals(className)) {
							if(instanceClassNamePrefix.isBlank() || classNsPrefix.isBlank() ||
									instanceClassNamePrefix.endsWith(classNsPrefix)) {
								return classifier;
							}
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns all found element instances that are linked to the given source element. The
	 * information about what is linked with what is extracted from the given map, which contains
	 * for each element (identified with its string name) the defined/known linked elements.
	 * 
	 * @param sourceInstance
	 *            Information about the source element of which the links are wanted.
	 * @param allLinks
	 *            A map containing the information about all links.
	 * @return A list with all found linked elements (or rather their information).
	 */
	public static List<BasicElementInformation> getAllLinkedInstancesOf(
			BasicElementInformation sourceInstance,
			HashMap<String, List<RelationTargetInformation>> allLinks) {
		String uuid = generateUniqueIdentifierBasedOnElemInfo(sourceInstance);
		List<BasicElementInformation> allLinkedInstances = new ArrayList<>();
		if(allLinks.containsKey(uuid)) {
			List<RelationTargetInformation> allLinkedTargetInstances = allLinks.get(uuid);
			for(RelationTargetInformation targetInfo : allLinkedTargetInstances) {
				allLinkedInstances.add(targetInfo.getBasicInformation());
			}
		}
		return allLinkedInstances;
	}

	/**
	 * Extracts (and returns) all rule elements of a given rule, i.e., all elements that are
	 * specified in the rule context.
	 * 
	 * @param rule
	 *            The rule whose elements are wanted.
	 * @return A list of all found rule elements.
	 */
	public static List<RuleElement> getAllRuleElementsOfRule(ConsistencyRule rule) {
		List<RuleElement> ruleElements = new ArrayList<>();
		for(AbstractElementRelation contextCase : rule.getRuleContext()) {
			ruleElements.add(contextCase.getSourceElement());
			ruleElements.addAll(contextCase.getTargetElements());
		}
		return ruleElements;
	}

	/**
	 * Creates (and returns) a context wrapper of the data from the given data view to have all the
	 * needed data for the given rule elements. It will throw an exception if data is missing for
	 * one of the needed rule elements.
	 * 
	 * @param dataView
	 *            The view from which the needed data can be taken.
	 * @param ruleElements
	 *            The rule elements for which the context wrapper should contain the (context) data.
	 * @param metamodels
	 *            The metamodels in which classes can be found for the contained data.
	 * @return A context wrapper with the included data for the rule elements.
	 * 
	 * @throws MissingDataException
	 * @throws ClassNotFoundException
	 */
	public static ContextWrapper createContextWrapperBasedOnData(ConsistencyView dataView,
			List<RuleElement> ruleElements, List<EPackage> metamodels)
			throws MissingDataException, ClassNotFoundException {

		Map<String, EObject> contextElementMap = new HashMap<>();
		List<EObject> dataElements = new ArrayList<EObject>(dataView.getContent());

		for(RuleElement ruleElement : ruleElements) {
			String identifier = ruleElement.getNameInRule();
			if(contextElementMap.containsKey(identifier) &&
					contextElementMap.get(identifier) != null) {
				break;
			}
			Class<?> elementClass =
					getClassFromString(ruleElement.getElementClassString(), metamodels);

			boolean dataElementFound = false;
			for(EObject dataElement : dataElements) {
				if(elementClass.isInstance(dataElement)) {
					contextElementMap.put(identifier, dataElement);
					dataElements.remove(dataElement);
					dataElementFound = true;
					break;
				}
			}

			if(!dataElementFound) {
				// For every rule element/identifier, there must be a received data element.
				// Otherwise, the related rule cannot be executed, which is why an exception should
				// be thrown in advance.
				throw new MissingDataException(
						"Missing data for this rule element: " + ruleElement);
			}
		}

		return createContextWrapper(contextElementMap);
	}

	/**
	 * Serializes the given model element in its EMF presentation as {@link EObject} into a
	 * {@link String}.
	 * 
	 * @param element
	 *            The model element that should be serialized.
	 * @param resourceFactory
	 *            A factory that supports the serialization/deserialization of the wanted element.
	 * @return The serialized element as string.
	 * 
	 * @throws IOException
	 */
	public static String serializeConsistencyElement(EObject element, Factory resourceFactory)
			throws IOException {
		XMLResource resource = getXmlResource(resourceFactory);
		resource.getContents().add(element);

		StringWriter writer = new StringWriter();
		resource.save(writer, null);
		return writer.toString();
	}

	/**
	 * Deserializes the given model element as {@link String} into its actual EMF presentation as
	 * {@link EObject}.
	 * 
	 * @param serializedElement
	 *            The currently serialized element that should be deserialized.
	 * @param resourceFactory
	 *            A factory that supports the serialization/deserialization of the wanted element.
	 * @return The deserialized element as EObject.
	 * 
	 * @throws IOException
	 */
	public static EObject deserializeConsistencyElement(String serializedElement,
			Factory resourceFactory) throws IOException {
		XMLResource resource = getXmlResource(resourceFactory);
		resource.load(new InputSource(new StringReader(serializedElement)), null);

		List<EObject> content = resource.getContents();
		if(!content.isEmpty()) {
			// get(0) is safe due to size check.
			return content.get(0);
		}
		return null;
	}

	/**
	 * Returns an {@link XMLResource} based on the given resource factory. The resource can be used
	 * for serializing and deserializing EObjects<>String.
	 */
	private static XMLResource getXmlResource(Factory resourceFactory) {
		String nsUri = ConsistencyPackage.eNS_URI;

		if(resourceFactory != null) {
			Registry registry = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> map = registry.getExtensionToFactoryMap();
			map.put(Resource.Factory.Registry.DEFAULT_EXTENSION, resourceFactory);
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		return (XMLResource)resourceSet.createResource(createURI(nsUri));
	}

	/**
	 * Creates an encrypted error response containing the given message (with a specific
	 * error identifier at the beginning of the message).
	 * 
	 * @param errorMessage
	 *            The message body that should be send as error message.
	 * @param senderIdentifier
	 *            The identifier of the sender.
	 * @param targetIdentifier
	 *            The identifier of the target (needed for the right encryption).
	 * @param config
	 *            The configuration with all the background information.
	 * 
	 * @return The created error response.
	 */
	public static ResponseEntity<byte[]> createEncryptedErrorMessage(String errorMessage,
			String senderIdentifier, String targetIdentifier, ConsistencyConfiguration config) {
		String completeMessage = config.getErrorMessageIdentifier() + errorMessage;
		return createEncryptedResponseMessage(completeMessage, senderIdentifier, targetIdentifier,
				config);
	}

	/**
	 * Creates an encrypted response containing the given message (with a specific HTTP
	 * status/response identifier at the beginning of the message).
	 * 
	 * @param message
	 *            The message body that should be send as response.
	 * @param senderIdentifier
	 *            The identifier of the sender.
	 * @param targetIdentifier
	 *            The identifier of the target (needed for the right encryption).
	 * @param config
	 *            The configuration with all the background information.
	 * 
	 * @return The created response.
	 */
	public static ResponseEntity<byte[]> createEncryptedResponseMessage(String message,
			String senderIdentifier, String targetIdentifier, ConsistencyConfiguration config) {
		boolean encrytionWanted = true;
		byte[] reponseBody;
		HttpStatus status;
		try {
			reponseBody = prepareFinalMessage(message, encrytionWanted, senderIdentifier,
					targetIdentifier, config);
			status = HttpStatus.OK;
		} catch(Exception e) {
			config.logError(appendCausingException("Could not create full response message.", e));
			reponseBody = config.encodeAsBytes("Encryption of response is not possible.");
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return ResponseEntity.status(status).body(reponseBody);
	}

	/**
	 * Returns a prepared byte array that can be sent to transmit the given message body. It can
	 * be specified if the message should be encrypted. If it should be encrypted, the target
	 * must be given.
	 * 
	 * @param messageBody
	 *            The actual message payload.
	 * @param encryptIfRequired
	 *            Specify whether the message should be encrypted if the current setup requires
	 *            it.
	 * @param senderIdentifier
	 *            The identifier of the sender.
	 * @param targetIdentifier
	 *            The identifier of the target (only used for encryption).
	 * @param config
	 *            The configuration with all the background information (prefix, byte length, ...).
	 * 
	 * @return The prepared message.
	 * 
	 * @throws FailedEncryptionException
	 * @throws IOException
	 */
	public static byte[] prepareFinalMessage(String messageBody, boolean encryptIfRequired,
			String senderIdentifier, String targetIdentifier, ConsistencyConfiguration config)
			throws FailedEncryptionException, IOException {
		byte[] payload;
		if(encryptIfRequired && config.isDoubleEncryptionEnabled()) {
			byte[] encryptedPayload =
					config.getEncryptionManager().encryptFor(messageBody, targetIdentifier);
			payload = addEncryptedStatus(encryptedPayload, config);
		} else {
			payload = config.encodeAsBytes(messageBody);
		}
		return addSenderIdentifier(payload, senderIdentifier, config);
	}

	/**
	 * Adds a prefix to the given payload to make sure that the receiver can know whether the
	 * remaining message/payload is encrypted or not.
	 * 
	 * @param payload
	 *            The payload of the message.
	 * @param config
	 *            The configuration with all the background information (prefix, byte length, ...).
	 * 
	 * @return The final message with identifier prefix and message payload.
	 * @throws IOException
	 */
	private static byte[] addEncryptedStatus(byte[] payload, ConsistencyConfiguration config)
			throws IOException {
		byte[] fixedPrefix = config.encodeAsBytes(config.getEncryptedStatusPrefix());

		ByteArrayOutputStream arrayStream = new ByteArrayOutputStream();
		arrayStream.write(fixedPrefix);
		arrayStream.write(payload);

		return arrayStream.toByteArray();
	}

	/**
	 * Adds a prefix to the given payload to make sure that the receiver can know who was the
	 * sender of the returned message.
	 * 
	 * @param payload
	 *            The payload of the message.
	 * @param identifier
	 *            The identifier that should be added to the payload.
	 * @param config
	 *            The configuration with all the background information (prefix, byte length, ...).
	 * 
	 * @return The final message with identifier prefix and message payload.
	 * @throws IOException
	 */
	private static byte[] addSenderIdentifier(byte[] payload, String identifier,
			ConsistencyConfiguration config) throws IOException {
		// The first predefined bytes are for the prefix from which the first byte tells the
		// length of the actual prefix string, i.e., the identifier must not be longer than the
		// predefined bytes - 1.
		byte[] variablePrefix = config.encodeAsBytes(identifier);
		byte[] fixedPrefix = new byte[config.getSenderIdentifierBytesLength()];
		fixedPrefix[0] = (byte)identifier.length();
		System.arraycopy(variablePrefix, 0, fixedPrefix, 1, variablePrefix.length);

		ByteArrayOutputStream arrayStream = new ByteArrayOutputStream();
		arrayStream.write(fixedPrefix);
		arrayStream.write(payload);

		return arrayStream.toByteArray();
	}

	/**
	 * Returns the sender identifier (prefix of the message) of the given message.
	 * 
	 * @param message
	 *            The message with identifier prefix and payload.
	 * @param config
	 *            The configuration with all the background information (prefix, byte length, ...).
	 * 
	 * @return The sender identifier of the message.
	 */
	public static String getSenderIdentifierFromMessage(byte[] message,
			ConsistencyConfiguration config) {
		// The first bytes of predefined length are for the prefix from which the first byte
		// tells the length of the actual prefix string.
		byte[] identifierBytes =
				Arrays.copyOfRange(message, 1, config.getSenderIdentifierBytesLength());
		String wholeIdentifierString = config.decodeBytes(identifierBytes);
		int actualLength = message[0];
		return wholeIdentifierString.substring(0, actualLength);
	}

	/**
	 * Returns whether the given message is encrypted.
	 * 
	 * @param message
	 *            The message with identifier prefix, encryption status and payload.
	 * @param config
	 *            The configuration with all the background information (prefix, byte length, ...).
	 * 
	 * @return True if the message is encrypted, otherwise false.
	 */
	public static boolean isMessageEncrypted(byte[] message, ConsistencyConfiguration config) {
		// The bytes of predefined length after the sender prefix are for the encryption status.
		byte[] encryptedStatus = config.encodeAsBytes(config.getEncryptedStatusPrefix());
		int encryptionStatusLength = encryptedStatus.length;
		int start = config.getSenderIdentifierBytesLength();
		int end = config.getSenderIdentifierBytesLength() + encryptionStatusLength;
		byte[] statusBytes = Arrays.copyOfRange(message, start, end);
		return Arrays.equals(statusBytes, encryptedStatus);
	}

	/**
	 * Returns the payload of the message without the sender identifier and encryption status as
	 * prefix.
	 * 
	 * @param message
	 *            The message with identifier prefix, encryption status and payload.
	 * @param config
	 *            The configuration with all the background information (prefix, byte length, ...).
	 * 
	 * @return The payload of the message.
	 */
	public static byte[] getPayloadFromMessage(byte[] message, ConsistencyConfiguration config) {
		int start = config.getSenderIdentifierBytesLength();
		// If the message is encrypted, it means there is also the encryption identifier after the
		// sender identifier, which is why we have the respect this for the start.
		if(isMessageEncrypted(message, config)) {
			byte[] encryptedStatus = config.encodeAsBytes(config.getEncryptedStatusPrefix());
			start += encryptedStatus.length;
		}
		int end = message.length;
		return Arrays.copyOfRange(message, start, end);
	}

	/**
	 * Returns a property set in which the properties are set for a SpringBoot REST server that is
	 * needed inside the consistency environment based on the given consistency configuration and
	 * the essential interface information like address and port.
	 * 
	 * @param serverName
	 *            The wanted name of the server.
	 * @param serverAddress
	 *            The wanted address of the server.
	 * @param serverPort
	 *            The wanted port of the server.
	 * @param serverMaxThreads
	 *            The wanted maximum number of threads of the server.
	 * @param config
	 *            The consistency configuration containing also SSL server information.
	 * @return A property set that can be used to build and start the wanted server.
	 * @throws IOException
	 */
	public static Properties setRestConsistencyServerProperties(String serverName,
			String serverAddress, String serverPort, String serverMaxThreads,
			ConsistencyConfiguration config) throws IOException {
		// Usually, the following properties are set within an application.properties file.
		// However, some properties I want to get from other configuration files, which is why I
		// want to set them programmatically at runtime. The following way is one option to do
		// this:
		Properties serverProperties = new Properties();
		serverProperties.setProperty("spring.application.name", serverName.replaceAll("\\s", ""));
		// Possible logging levels: TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF.
		serverProperties.setProperty("logging.level.root", "ERROR");
		serverProperties.setProperty("spring.main.banner-mode", "off");

		serverProperties.setProperty("server.address", serverAddress);
		serverProperties.setProperty("server.port", serverPort);
		serverProperties.setProperty("server.servlet.context-path", "/");
		serverProperties.setProperty("server.tomcat.threads.max", serverMaxThreads);

		serverProperties.setProperty("server.ssl.enabled", "true");
		serverProperties.setProperty("server.ssl.enabled-protocols", config.getSslProtocol());
		serverProperties.setProperty("server.ssl.key-store-type", config.getSslKeyStoreType());
		serverProperties.setProperty("server.ssl.key-store",
				config.getKeyStoreFile().getCanonicalPath());
		serverProperties.setProperty("server.ssl.key-store-password", config.getKeyStorePassword());
		serverProperties.setProperty("server.ssl.client-auth", "need");
		serverProperties.setProperty("server.ssl.trust-store-type", config.getSslKeyStoreType());
		serverProperties.setProperty("server.ssl.trust-store",
				config.getTrustStoreFile().getCanonicalPath());
		serverProperties.setProperty("server.ssl.trust-store-password",
				config.getTrustStorePassword());
		return serverProperties;
	}

	/**
	 * Builds and starts a SpringBoot REST server for the consistency environment based on the given
	 * set of server properties and the class of the actual server. The application context of the
	 * started server is returned.
	 * 
	 * @param serverClass
	 *            The class of the implemented server.
	 * @param serverProperties
	 *            The properties with which the server should be built and started.
	 * @return The application context of the started server.
	 */
	public static ConfigurableApplicationContext
			buildAndStartRestConsistencyServer(Class<?> serverClass, Properties serverProperties) {
		// It seems that other instances set the URLStreamHandlerFactory already before, which
		// is why Tomcat fails to do this itself and therefore prevents the whole server setup.
		// A possible workaround is to disable the factory set through Tomcat:
		// Source: https://github.com/spring-projects/spring-boot/issues/21535
		TomcatURLStreamHandlerFactory.disable();

		SpringApplicationBuilder builder = new SpringApplicationBuilder(serverClass);
		SpringApplication serverApplication = builder.properties(serverProperties).build();
		// No additional arguments need to be given.
		String[] args = new String[0];
		return serverApplication.run(args);
	}
}
