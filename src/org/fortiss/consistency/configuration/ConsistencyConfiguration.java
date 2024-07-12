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
package org.fortiss.consistency.configuration;

import static java.util.logging.Level.ALL;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.eclipse.emf.ecore.EPackage;
import org.fortiss.consistency.checking.evaluators.IRuleEvaluator;
import org.fortiss.consistency.checking.evaluators.fullEvaluators.OclEvaluator;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.RelationTargetInformation;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.security.clearance.ClearanceManager;
import org.fortiss.consistency.security.encryption.IEncryptionManager;
import org.fortiss.consistency.security.encryption.TinkEncryptionManager;

/**
 * This class contains/provides all important configuration details/information to the CCCC, like
 * the keys, rules, links, etc. (most of them are read from external resource files).
 * 
 * Future Work: This should be an own program/service that manages all of this setup/configuration
 * of the base consistency information and have an own API with which consistency manager can adjust
 * such information, e.g., register new users or add new consistency rules.
 * 
 * @author bergemann
 */
public class ConsistencyConfiguration {

	/** The identifier tag of this checker. */
	private static final String CONSISTENCY_IDENTIFIER = "CCCC";
	/** The identifier/prefix used to tag/identify an error message. */
	private static final String ERROR_MSG_IDENTIFIER = "[ERROR] ";
	/** The prefix length of the byte array identifying the sender. */
	private static final int SENDER_IDENTIFIER_BYTES_LENGTH = 20;
	/** The prefix whether the message body is encrypted. */
	private static final String ENCRYPTED_STATUS_PREFIX = "ENCRYPTION";
	/** Flag whether the message body should be internally encrypted as well (in addition). */
	private static final boolean ENCRYPT_DATA = true;
	/** Encoding that should be used for transformations between strings and byte (arrays). */
	private static final Charset BYTE_ENCODING = StandardCharsets.UTF_8;

	/** The path to the resource directory. */
	private String resourceDirectoryPath;
	/** The loader instance for the current configuration. */
	protected ConfigurationLoader loader;
	/** The currently used encryption manager. */
	protected IEncryptionManager encryptionManager;
	/** The currently used encryption manager. */
	private ClearanceManager clearancenManager;
	/** The currently used logger. */
	private Logger consistencyLogger;
	/** The currently used logger level. */
	private Level generalLoggerLevel;
	/** The currently used path of the log file. */
	private String logFilePath;

	/**
	 * Constructor.
	 * 
	 * @param resourceDirectoryPath
	 *            The path to the resource directory in which all the important files are searched
	 *            for.
	 */
	public ConsistencyConfiguration(String resourceDirectoryPath) {
		this.resourceDirectoryPath = resourceDirectoryPath;
		this.loader = new ConfigurationLoader(this);
		this.encryptionManager = null;
		this.clearancenManager = null;
		this.consistencyLogger = null;
		this.logFilePath = null;
	}

	/** Loads all configuration details from the configuration files into this configuration. */
	public void loadConfiguration() {
		loader.loadCompleteConfiguration();
	}

	/** Registers all important elements for the consistency process. */
	public void registerAllElements() {
		loader.registerAllImportantElementsFromFile();
	}

	/**
	 * Returns whether the consistency configuration is already loaded (successfully).
	 * 
	 * @return True if the whole consistency configuration is loaded correctly, otherwise false.
	 */
	public boolean isConfigurationLoaded() {
		return loader.isConfigurationLoaded();
	}

	/**
	 * Returns the identifier tag of this consistency checker.
	 * 
	 * @return The identifier tag of this consistency checker.
	 */
	public String getConsistencyCheckerIdentifier() {
		return CONSISTENCY_IDENTIFIER;
	}

	/**
	 * Returns the prefix used for messages from this consistency checker.
	 * 
	 * @return The prefix used for messages from this consistency checker.
	 */
	public String getConsistencyCheckerPrefix() {
		return "[" + getConsistencyCheckerIdentifier() + "]";
	}

	/**
	 * Returns the identifier/prefix used to tag/identify an error message.
	 * 
	 * @return The identifier/prefix used to tag/identify an error message.
	 */
	public String getErrorMessageIdentifier() {
		return ERROR_MSG_IDENTIFIER;
	}

	/**
	 * Returns the prefix whether the message body is encrypted.
	 * 
	 * @return The prefix whether the message body is encrypted.
	 */
	public int getSenderIdentifierBytesLength() {
		return SENDER_IDENTIFIER_BYTES_LENGTH;
	}

	/**
	 * Returns the prefix whether the message body is encrypted.
	 * 
	 * @return The prefix whether the message body is encrypted.
	 */
	public String getEncryptedStatusPrefix() {
		return ENCRYPTED_STATUS_PREFIX;
	}

	/**
	 * Returns whether the current setup is to encrypt the message body in addition to the
	 * encryption provided by the usual communication technique.
	 * 
	 * @return True if double encryption is enabled, otherwise false.
	 */
	public boolean isDoubleEncryptionEnabled() {
		return ENCRYPT_DATA;
	}

	/**
	 * Returns the encoding that should be used for transformations between strings and byte arrays.
	 * 
	 * @return The encoding that should be used for transformations between strings and byte arrays.
	 */
	public Charset getByteEncoding() {
		return BYTE_ENCODING;
	}

	/**
	 * Returns the consistency server address.
	 * 
	 * @return The consistency server address.
	 */
	public String getConsistencyServerAddress() {
		return loader.consistencyServerAddress;
	}

	/**
	 * Returns the consistency server port.
	 * 
	 * @return The consistency server port.
	 */
	public int getConsistencyServerPort() {
		return loader.consistencyServerPort;
	}

	/**
	 * Returns the maximum thread number of the consistency server.
	 * 
	 * @return The maximum thread number of the consistency server.
	 */
	public int getConsistencyServerMaxRequestThreads() {
		return loader.consistencyServerMaxThreads;
	}

	/**
	 * Returns the timeout after which an connection attempt should be canceled.
	 * 
	 * @return The timeout after which an connection attempt should be canceled.
	 */
	public int getConnectionTimeoutInMs() {
		return loader.connectionTimeoutInMilliseconds;
	}

	/**
	 * Returns the timeout after which a read operation attempt should be canceled.
	 * 
	 * @return The timeout after which a read operation attempt should be canceled.
	 */
	public int getReadTimeoutInMs() {
		return loader.readTimeoutInMilliseconds;
	}

	/**
	 * Returns the protocol used for the socket communication between this server and a client.
	 * 
	 * @return The protocol used for the socket communication between this server and a client.
	 */
	public String getSslProtocol() {
		return loader.sslProtocol;
	}

	/**
	 * Returns the cipher suite that should be used for this server communication.
	 * 
	 * @return The cipher suite that should be used for this server communication.
	 */
	public String getSslCipherSuite() {
		return loader.sslCipherSuite;
	}

	/**
	 * Returns the type of the key store used to store the internal communication keys.
	 * 
	 * @return The type of the key store used to store the internal communication keys.
	 */
	public String getSslKeyStoreType() {
		return loader.sslKeyStoreType;
	}

	/**
	 * Returns the type of the key manager used to manage the internal communication keys.
	 * 
	 * @return The type of the key manager used to manage the internal communication keys.
	 */
	public String getSslKeyManagerType() {
		return loader.sslKeyManagerType;
	}

	/**
	 * Returns the REST endpoint path for requesting a consistency check from consistency server.
	 * 
	 * @return The REST endpoint path for requesting a consistency check from consistency server.
	 */
	public String getConsistencyCheckEndpoint() {
		return loader.consistencyCheckEndpoint;
	}

	/**
	 * Returns the REST endpoint path for requesting model data from adapters.
	 * 
	 * @return The REST endpoint path for requesting model data from adapters.
	 */
	public String getDataRequestEndpoint() {
		return loader.dataRequestEndpoint;
	}

	/**
	 * Returns the absolute path to the logging directory.
	 * 
	 * @return The absolute path to the logging directory.
	 */
	public String getAbsoluteLogDirectoyPath() {
		return getAbsolutePathOfCentralResourceFile(loader.logDirectoryPath);
	}

	/**
	 * Returns the internal resource path to the key store file.
	 * 
	 * @return The internal resource path to the key store file.
	 */
	public String getKeyStoreFilePath() {
		return loader.keyStoreFilePath;
	}

	/**
	 * Returns the key store file.
	 * 
	 * @return The key store file.
	 */
	public File getKeyStoreFile() {
		return getInternalResourceFile(getKeyStoreFilePath());
	}

	/**
	 * Returns the internal resource path to the trust store file.
	 * 
	 * @return The internal resource path to the trust store file.
	 */
	public String getTrustStoreFilePath() {
		return loader.trustStoreFilePath;
	}

	/**
	 * Returns the trust store file.
	 * 
	 * @return The trust store file.
	 */
	public File getTrustStoreFile() {
		return getInternalResourceFile(getTrustStoreFilePath());
	}

	/**
	 * Returns the password of the key store.
	 * 
	 * @return The password of the key store.
	 */
	public String getKeyStorePassword() {
		return loader.keyStorePassword;
	}

	/**
	 * Returns the password of the trust store.
	 * 
	 * @return The password of the trust store.
	 */
	public String getTrustStorePassword() {
		return loader.trustStorePassword;
	}

	/**
	 * Returns the path to the private encryption key file.
	 * 
	 * @return The path to the private encryption key file.
	 */
	public String getPathOfPrivateEncryptionKeyFile() {
		return loader.privateEncryptionKeyPath;
	}

	/**
	 * Returns the path to the public encryption key file.
	 * 
	 * @return The path to the public encryption key file.
	 */
	public String getPathOfPublicEncryptionKeyFile() {
		return loader.publicEncryptionKeyPath;
	}

	/**
	 * Returns the registered tool adapters.
	 * 
	 * @return A map of the registered tool adapter entries (with their identifier).
	 */
	public Map<String, ToolAdapterRegistrationEntry> getRegisteredAdapters() {
		return loader.registeredAdapters;
	}

	/**
	 * Returns the entry of a registered tool adapter based on the given adapter identifier.
	 * 
	 * @param adapterIdentifier
	 *            The identifier of the wanted adapter.
	 * 
	 * @return The entry of the found registered tool adapter or null if not found.
	 */
	public ToolAdapterRegistrationEntry getRegistrationEntryOf(String adapterIdentifier) {
		if(getRegisteredAdapters() != null) {
			return getRegisteredAdapters().get(adapterIdentifier);
		}
		return null;
	}

	/**
	 * Returns all available/registered metamodels.
	 * 
	 * @return A list of all metamodel packages.
	 */
	public List<EPackage> getAllAvailableMetamodels() {
		return loader.loadedMetamodels;
	}

	/**
	 * Returns all available/registered global links between model elements.
	 * 
	 * @return A list of all global element links.
	 */
	public HashMap<String, List<RelationTargetInformation>> getAllGlobalElementLinks() {
		return loader.globalElementLinks;
	}

	/**
	 * Returns all available/registered consistency rules.
	 * 
	 * @return A list of all consistency rules.
	 */
	public List<ConsistencyRule> getAllConsistencyRules() {
		return loader.consistencyRules;
	}

	/**
	 * Returns all available/registered clearance attributes.
	 * 
	 * @return A list of all possible clearance attributes.
	 */
	public HashMap<String, List<String>> getAllPossibleClearanceAttributes() {
		return loader.userAttributes;
	}

	/**
	 * Returns all available/registered user attributes.
	 * 
	 * @return A map of all registered user attributes (with their user tokens).
	 */
	public HashMap<String, UserBaseAttributes> getUserAttributes() {
		return loader.userAttributesPerToken;
	}

	/**
	 * Returns an evaluator instance of the evaluator type that should be used for the whole
	 * consistency process.
	 * 
	 * @return A full/deep evaluator instance.
	 */
	public IRuleEvaluator getNewDeepEvaluatorInstance() {
		boolean shallowInstance = false;
		return getNewEvaluatorInstance(shallowInstance);
	}

	/**
	 * Returns a shallow evaluator instance on which the initial setup method can be executed,
	 * but nothing else.
	 * 
	 * @return A shallow evaluator instance.
	 */
	public IRuleEvaluator getNewShallowEvaluatorInstance() {
		boolean shallowInstance = true;
		return getNewEvaluatorInstance(shallowInstance);
	}

	/**
	 * Returns an evaluator instance of the evaluator type that should be used for the whole
	 * consistency process. If another evaluator type should be used, please change this (only)
	 * here. If only a shallow evaluator instance is needed, the dummy parameter needs to be set to
	 * true. Then, only an instance is returned on which the initial setup method can be executed,
	 * but nothing else.
	 * 
	 * @param isDummy
	 *            True if only a shallow evaluator instance should be provided, otherwise false.
	 * 
	 * @return An evaluator instance.
	 */
	private IRuleEvaluator getNewEvaluatorInstance(boolean isDummy) {
		if(isDummy) {
			return new OclEvaluator();
		}
		return new OclEvaluator(this);
	}

	/**
	 * Returns the current encryption manager that should be used for the whole consistency process.
	 * 
	 * @return The current encryption manager.
	 */
	public IEncryptionManager getEncryptionManager() {
		if(encryptionManager == null) {
			encryptionManager = new TinkEncryptionManager(this);
		}
		return encryptionManager;
	}

	/**
	 * Returns the current clearance manager that should be used for the whole consistency process.
	 * 
	 * @return The current clearance manager.
	 */
	public ClearanceManager getClearanceManager() {
		if(clearancenManager == null) {
			clearancenManager = new ClearanceManager(this);
		}
		return clearancenManager;
	}

	/**
	 * Returns the current consistency logger that should be used for the whole consistency process.
	 * 
	 * @return A logger.
	 */
	public Logger getConsistencyLogger() {
		return consistencyLogger;
	}

	/**
	 * Sets the current consistency logger.
	 * 
	 * @param consistencyLogger
	 *            The new logger.
	 */
	public void setConsistencyLogger(Logger consistencyLogger) {
		this.consistencyLogger = consistencyLogger;
	}

	/**
	 * Returns the general consistency logger level.
	 * 
	 * @return The level.
	 */
	public Level getGeneralLoggerLevel() {
		return generalLoggerLevel;
	}

	/**
	 * Sets the general consistency logger level.
	 * 
	 * @param level
	 *            The new level.
	 */
	public void setGeneralLoggerLevel(Level level) {
		this.generalLoggerLevel = level;
	}

	/**
	 * Sets up the consistency logger (even if one exists already). If one was set up already
	 * before, the same log file will be used and the new logs will be appended to the previous
	 * ones.
	 * 
	 * @return The path of the logging file, or null if it could not be set up.
	 * @throws Exception
	 */
	public String setupConsistencyLogger() throws Exception {
		Logger logger = Logger.getLogger("ConsistencyLogger");
		setGeneralLoggerLevel(ALL);
		logger.setLevel(getGeneralLoggerLevel());

		if(logFilePath == null || logFilePath.isBlank()) {
			String dirPath = getAbsoluteLogDirectoyPath();
			if(dirPath.isBlank()) {
				logError("Logger could not be set up correctly. Logging directory path is blank.");
				return null;
			}
			File directory = new File(dirPath);
			if(!directory.exists() || !directory.isDirectory()) {
				directory.mkdirs();
			}
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
			logFilePath = directory.getCanonicalPath() + "/consistencyLogs_" + timeStamp + ".log";
		}
		boolean appendMode = true;
		FileHandler loggingFileHandler = new FileHandler(logFilePath, appendMode);
		SimpleFormatter formatter = new SimpleFormatter();
		loggingFileHandler.setFormatter(formatter);
		loggingFileHandler.setLevel(getGeneralLoggerLevel());

		logger.addHandler(loggingFileHandler);
		logger.setUseParentHandlers(false);

		consistencyLogger = logger;
		return logFilePath;
	}

	/**
	 * Returns the absolute path of the file specified by the given internal path inside the
	 * internal resource directory. In some cases the internal resource directory must not be the
	 * same as the central resource directory, e.g., the internal resource directory could point to
	 * the internal security files!
	 * It is not checked if the file does actually exist! Therefore, this can also be used to get
	 * the absolute path for files that do not exist yet but should be created.
	 * This also works for directories, i.e., if the internal path leads to a directory, the
	 * absolute path to this directory will be returned, but it will not end with '/'!
	 * 
	 * @param internalPath
	 *            The internal/relative path inside the internal resource directory to the wanted
	 *            file.
	 * @return The absolute path of the file/directory with the given internal resource path.
	 */
	public String getAbsolutePathOfInternalResourceFile(String internalPath) {
		// For this basic class (for the central instance), we assume that the internal resource
		// directory is identical with the central resource directory (also includes security).
		return getAbsolutePathOfCentralResourceFile(internalPath);
	}

	/**
	 * Returns the absolute path of the file specified by the given internal path inside the central
	 * resource directory. The central resource directory is specified when setting up the
	 * consistency environment.
	 * It is not checked if the file does actually exist! Therefore, this can also be used to get
	 * the absolute path for files that do not exist yet but should be created.
	 * This also works for directories, i.e., if the internal path leads to a directory, the
	 * absolute path to this directory will be returned, but it will not end with '/'!
	 * 
	 * @param internalPathInRes
	 *            The internal/relative path inside the central resource directory to the wanted
	 *            file.
	 * @return The absolute path of the file/directory with the given central resource path.
	 */
	public String getAbsolutePathOfCentralResourceFile(String internalPathInRes) {
		String path = "";
		if(resourceDirectoryPath != null && !resourceDirectoryPath.isBlank() &&
				internalPathInRes != null && !internalPathInRes.isBlank()) {
			String fullPath = resourceDirectoryPath + "/" + internalPathInRes;
			File file = new File(fullPath);
			return file.getAbsolutePath();
		}
		return path;
	}

	/**
	 * Returns a pointer to a file specified by the given internal path inside the internal resource
	 * directory. In some cases the internal resource directory must not be the same as the central
	 * resource directory, e.g., the internal resource directory could point to the internal
	 * security files!
	 * It is checked if the file really exists and is a valid file. If a real file could not be
	 * found inside the resource directory, null is returned.
	 * 
	 * @param internalPath
	 *            The internal/relative path inside the internal resource directory to the wanted
	 *            file.
	 * @return A file pointer to the file inside the internal resource directory, or null if not
	 *         found.
	 */
	public File getInternalResourceFile(String internalPath) {
		// For this basic class (for the central instance), we assume that the internal resource
		// directory is identical with the central resource directory (also includes security).
		return getCentralResourceFile(internalPath);
	}

	/**
	 * Returns a pointer to a file specified by the given internal path inside the central resource
	 * directory. The central resource directory is specified when setting up the consistency
	 * environment.
	 * It is checked if the file really exists and is a valid file. If a real file could not be
	 * found inside the resource directory, null is returned.
	 * 
	 * @param internalPathInRes
	 *            The internal/relative path inside the central resource directory to the wanted
	 *            file.
	 * @return A file pointer to the file inside the central resource directory, or null if not
	 *         found.
	 */
	public File getCentralResourceFile(String internalPathInRes) {
		String path = getAbsolutePathOfCentralResourceFile(internalPathInRes);

		if(!path.isBlank()) {
			File file = new File(path);
			if(file.exists() && !file.isDirectory()) {
				return file;
			}
		}
		logError("Requested file could not be loaded, because converted path '" + path +
				"' does not point to a file. Initial path of this request: " + internalPathInRes);
		return null;
	}

	/**
	 * Returns a byte array of the given string with the right encoding, but without any
	 * encryption.
	 * 
	 * @param plaintext
	 *            The plaintext as string that is wanted as byte array.
	 * 
	 * @return The plaintext as byte array.
	 */
	public byte[] encodeAsBytes(String plaintext) {
		return plaintext.getBytes(BYTE_ENCODING);
	}

	/**
	 * Returns a string of the given byte array with the right encoding, but without any
	 * decryption.
	 * 
	 * @param plaintext
	 *            The plaintext as byte array that is wanted as string.
	 * 
	 * @return The plaintext as string.
	 */
	public String decodeBytes(byte[] plaintext) {
		return new String(plaintext, BYTE_ENCODING);
	}

	/**
	 * Logs the given message as error.
	 * 
	 * @param message
	 *            The message that should be logged.
	 */
	public void logError(String message) {
		if(consistencyLogger != null) {
			consistencyLogger.severe(message);
		}
		System.err.println(getConsistencyCheckerPrefix() + " " + message);
	}

	/**
	 * Logs the given message as warning.
	 * 
	 * @param message
	 *            The message that should be logged.
	 */
	public void logWarning(String message) {
		if(consistencyLogger != null) {
			consistencyLogger.warning(message);
		}
		System.out.println(getConsistencyCheckerPrefix() + " WARNING: " + message);
	}

	/**
	 * Logs the given message as information message.
	 * 
	 * @param message
	 *            The message that should be logged.
	 */
	public void logInfo(String message) {
		if(consistencyLogger != null) {
			consistencyLogger.info(message);
		}
		System.out.println(getConsistencyCheckerPrefix() + " " + message);
	}

	/**
	 * Logs the given message as debug message.
	 * 
	 * @param message
	 *            The message that should be logged.
	 */
	public void logDebug(String message) {
		if(consistencyLogger != null) {
			consistencyLogger.finer(message);
		}
		System.out.println(getConsistencyCheckerPrefix() + " (DEBUG) " + message);
	}

	/**
	 * Logs the given message as internal message.
	 * 
	 * @param message
	 *            The message that should be logged.
	 */
	public void logInternal(String message) {
		if(consistencyLogger != null) {
			consistencyLogger.fine(message);
		}
	}
}
