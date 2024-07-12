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

import static java.nio.file.Files.readAllBytes;
import static org.apache.commons.io.FileUtils.listFiles;
import static org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY;
import static org.eclipse.emf.common.util.URI.createFileURI;
import static org.eclipse.emf.ecore.xmi.XMLResource.OPTION_EXTENDED_META_DATA;
import static org.fortiss.consistency.configuration.XmlExtractor.parseAdaptersFromXmlFile;
import static org.fortiss.consistency.configuration.XmlExtractor.parseClearanceAttributesFromXmlFile;
import static org.fortiss.consistency.configuration.XmlExtractor.parseCommunicationInformationFromXmlFile;
import static org.fortiss.consistency.configuration.XmlExtractor.parseLinksFromXmlFile;
import static org.fortiss.consistency.configuration.XmlExtractor.parsePathsInformationFromXmlFile;
import static org.fortiss.consistency.configuration.XmlExtractor.parseRulesFromXmlFile;
import static org.fortiss.consistency.configuration.XmlExtractor.parseSecurityInformationFromXmlFile;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createUserBaseAttributes;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createUserHiddenInformation;
import static org.fortiss.consistency.utils.ConsistencyUtils.appendCausingException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.filefilter.RegexFileFilter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.RelationTargetInformation;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.model.communication.UserHiddenInformation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class contains methods to load all important configuration details/information and register
 * the needed consistency artifacts.
 * 
 * @author bergemann
 */
public class ConfigurationLoader {

	/** Internal path (within the resource directory) to the paths setting file. */
	private static final String PATHS_FILE_PATH = "settings/paths_settings.xml";
	/** Internal path (within the resource directory) to the security setting file. */
	private static final String SECURITY_FILE_PATH = "settings/security_settings.xml";
	/** Internal path (within the resource directory) to the communication setting file. */
	private static final String COMMUNICATION_FILE_PATH = "settings/communication_settings.xml";

	/** Internal path (within the resource directory) to the rule file. */
	protected String rulesFilePath;
	/** Internal path (within the resource directory) to the links file. */
	protected String linksFilePath;
	/** Internal path (within the resource directory) to the registered adapter file. */
	protected String adaptersFilePath;
	/** Internal path (within the resource directory) to the viewtype collection directory. */
	protected String viewtypeCollectionDirectoryPath;
	/** Internal path (within the resource directory) to the log directory. */
	protected String logDirectoryPath;

	/** The current file path to the key store file. */
	protected String keyStoreFilePath;
	/** The current file path to the trust store file. */
	protected String trustStoreFilePath;
	/** The current password to the key store. */
	protected String keyStorePassword;
	/** The current password to the trust store. */
	protected String trustStorePassword;
	/** The current file path to the private encryption key file. */
	protected String privateEncryptionKeyPath;
	/** The current file path to the public encryption key file. */
	protected String publicEncryptionKeyPath;
	/** The current file path to the clearance attributes file. */
	protected String clearanceAttributesFilePath;
	/** The current file path to the (hidden) attributes per user token file. */
	protected String hiddenInfoPerUserFilePath;

	/** The current consistency server address. */
	protected String consistencyServerAddress;
	/** The current consistency server port. */
	protected int consistencyServerPort;
	/** The current maximum thread number of the consistency server. */
	protected int consistencyServerMaxThreads;
	/** The current timeout after which an connection attempt should be canceled. */
	protected int connectionTimeoutInMilliseconds;
	/** The current timeout after which a read operation attempt should be canceled. */
	protected int readTimeoutInMilliseconds;
	/** The current protocol used for the socket communication between this server and a client. */
	protected String sslProtocol;
	/** The current available cipher suite that should be used for this server communication. */
	protected String sslCipherSuite;
	/** The current type of the key store used to store the internal communication keys. */
	protected String sslKeyStoreType;
	/** The current type of the key manager used to manage the internal communication keys. */
	protected String sslKeyManagerType;
	/** The current endpoint path for requesting a consistency check from consistency server. */
	protected String consistencyCheckEndpoint;
	/** The current endpoint path for requesting model data from adapters. */
	protected String dataRequestEndpoint;

	/** The currently registered tool adapters (per adapter identifier). */
	protected Map<String, ToolAdapterRegistrationEntry> registeredAdapters;
	/** The loaded metamodels. */
	protected List<EPackage> loadedMetamodels;
	/** The currently registered global element links. */
	protected HashMap<String, List<RelationTargetInformation>> globalElementLinks;
	/** The currently registered consistency rules. */
	protected List<ConsistencyRule> consistencyRules;
	/** The currently registered possible user attributes (per attribute list name). */
	protected HashMap<String, List<String>> userAttributes;
	/** The currently registered user attributes (per actual user token). */
	protected HashMap<String, UserBaseAttributes> userAttributesPerToken;

	/** The configuration in which everything should be loaded. */
	protected ConsistencyConfiguration config;
	/** Flag whether the consistency configuration is already loaded (successfully). */
	protected boolean configurationIsLoaded;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            The configuration in which everything should be loaded.
	 */
	public ConfigurationLoader(ConsistencyConfiguration config) {
		this.config = config;
	}

	/**
	 * Returns whether the consistency configuration is already loaded (successfully).
	 * 
	 * @return True if the whole consistency configuration is loaded correctly, otherwise false.
	 */
	public boolean isConfigurationLoaded() {
		return configurationIsLoaded;
	}

	/** Loads all possible configuration parts/details for the consistency environment. */
	public void loadCompleteConfiguration() {
		configurationIsLoaded = true;
		boolean success = loadPathsInformationFromConfigFile();
		if(!success) {
			config.logError(
					"Loading the paths information from the configuration file could not be performed successfully.");
			configurationIsLoaded = false;
		}
		success = loadSecurityInformationFromConfigFile();
		if(!success) {
			config.logError(
					"Loading the security information from the configuration file could not be performed successfully.");
			configurationIsLoaded = false;
		}
		success = loadCommunicationInformationFromConfigFile();
		if(!success) {
			config.logError(
					"Loading the communication information from the configuration file could not be performed successfully.");
			configurationIsLoaded = false;
		}
	}

	/**
	 * Try to load the paths information from the respective configuration file and return if it was
	 * successful.
	 * 
	 * @return True if the loading was successful, otherwise false.
	 */
	protected boolean loadPathsInformationFromConfigFile() {
		File file = config.getCentralResourceFile(PATHS_FILE_PATH);
		if(file == null) {
			return false;
		}

		Map<String, String> extractedValues = parsePathsInformationFromXmlFile(file, config);

		if(extractedValues != null && extractedValues.containsKey("rulesPath") &&
				extractedValues.containsKey("linksPath") &&
				extractedValues.containsKey("adaptersPath") &&
				extractedValues.containsKey("viewtypesPath") &&
				extractedValues.containsKey("loggingPath")) {
			rulesFilePath = extractedValues.get("rulesPath");
			linksFilePath = extractedValues.get("linksPath");
			adaptersFilePath = extractedValues.get("adaptersPath");
			viewtypeCollectionDirectoryPath = extractedValues.get("viewtypesPath");
			logDirectoryPath = extractedValues.get("loggingPath");
			return true;
		}
		return false;
	}

	/**
	 * Try to load the security information from the respective configuration file and return if it
	 * was successful.
	 * 
	 * @return True if the loading was successful, otherwise false.
	 */
	protected boolean loadSecurityInformationFromConfigFile() {
		File file = config.getCentralResourceFile(SECURITY_FILE_PATH);
		if(file == null) {
			return false;
		}

		Map<String, String> extractedValues = parseSecurityInformationFromXmlFile(file, config);

		if(extractedValues != null && extractedValues.containsKey("keyStoreFilePath") &&
				extractedValues.containsKey("keyStorePassword") &&
				extractedValues.containsKey("trustStoreFilePath") &&
				extractedValues.containsKey("trustStorePassword") &&
				extractedValues.containsKey("privateEncryptionKeyPath") &&
				extractedValues.containsKey("publicEncryptionKeyPath") &&
				extractedValues.containsKey("clearanceAttributesPath") &&
				extractedValues.containsKey("hiddenUserInfoPath")) {
			keyStoreFilePath = extractedValues.get("keyStoreFilePath");
			keyStorePassword = extractedValues.get("keyStorePassword");
			trustStoreFilePath = extractedValues.get("trustStoreFilePath");
			trustStorePassword = extractedValues.get("trustStorePassword");
			privateEncryptionKeyPath = extractedValues.get("privateEncryptionKeyPath");
			publicEncryptionKeyPath = extractedValues.get("publicEncryptionKeyPath");
			clearanceAttributesFilePath = extractedValues.get("clearanceAttributesPath");
			hiddenInfoPerUserFilePath = extractedValues.get("hiddenUserInfoPath");
			return true;
		}
		return false;
	}

	/**
	 * Try to load the communication information from the respective configuration file and return
	 * if it was successful.
	 * 
	 * @return True if the loading was successful, otherwise false.
	 * 
	 * @throws NumberFormatException
	 */
	protected boolean loadCommunicationInformationFromConfigFile() throws NumberFormatException {
		File file = config.getCentralResourceFile(COMMUNICATION_FILE_PATH);
		if(file == null) {
			return false;
		}

		Map<String, String> extractedValues =
				parseCommunicationInformationFromXmlFile(file, config);

		if(extractedValues != null && extractedValues.containsKey("serverAddress") &&
				extractedValues.containsKey("serverPort") &&
				extractedValues.containsKey("serverMaxThreads") &&
				extractedValues.containsKey("connectionTimeout") &&
				extractedValues.containsKey("readTimeout") &&
				extractedValues.containsKey("sslProtocol") &&
				extractedValues.containsKey("sslCipherSuite") &&
				extractedValues.containsKey("sslKeyStoreType") &&
				extractedValues.containsKey("sslKeyManagerType") &&
				extractedValues.containsKey("checkEndpoint") &&
				extractedValues.containsKey("dataEndpoint")) {
			consistencyServerAddress = extractedValues.get("serverAddress");
			consistencyServerPort = Integer.valueOf(extractedValues.get("serverPort"));
			consistencyServerMaxThreads = Integer.valueOf(extractedValues.get("serverMaxThreads"));
			connectionTimeoutInMilliseconds =
					Integer.valueOf(extractedValues.get("connectionTimeout"));
			readTimeoutInMilliseconds = Integer.valueOf(extractedValues.get("readTimeout"));
			sslProtocol = extractedValues.get("sslProtocol");
			sslCipherSuite = extractedValues.get("sslCipherSuite");
			sslKeyStoreType = extractedValues.get("sslKeyStoreType");
			sslKeyManagerType = extractedValues.get("sslKeyManagerType");
			consistencyCheckEndpoint = extractedValues.get("checkEndpoint");
			dataRequestEndpoint = extractedValues.get("dataEndpoint");
			return true;
		}
		return false;
	}

	/**
	 * Registers all elements that are needed for the consistency checking process, like rules,
	 * metamodels, links, based on the their configuration file.
	 */
	public void registerAllImportantElementsFromFile() {
		registerMainMetamodels();
		registerAdapters();
		registerAllGlobalElementLinks();
		registerAllConsistencyRules();
		registerAllUserAttributes();
		registerAllPossibleClearanceAttributes();
	}

	/** Registers all consistency adapters based on the their configuration file. */
	private void registerAdapters() {
		registeredAdapters = new HashMap<>();
		List<ToolAdapterRegistrationEntry> adapters = new ArrayList<>();

		File adapterFile = config.getCentralResourceFile(adaptersFilePath);
		if(adapterFile == null) {
			config.logError(
					"Tool adapters could not be registered correctly, because adapter registration file could not be found/read.");
			return;
		}
		try {
			adapters.addAll(parseAdaptersFromXmlFile(adapterFile, config));
		} catch(IOException e) {
			config.logError(
					appendCausingException("Tool adapters could not be registered correctly.", e));
			return;
		}

		for(ToolAdapterRegistrationEntry entry : adapters) {
			registeredAdapters.put(entry.getAdapterIdentifier(), entry);
		}
	}

	/** Registers all consistency metamodels/viewtypes based on the their configuration file. */
	private void registerMainMetamodels() {
		// Needs to be done when the packages are used by an application outside of Eclipse to be
		// able to serialize and deserialize correctly the consistency model element types.
		org.fortiss.consistency.model.ConsistencyPackage.eINSTANCE.eClass();
		org.fortiss.consistency.model.views.ViewsPackage.eINSTANCE.eClass();
		org.fortiss.consistency.model.communication.CommunicationPackage.eINSTANCE.eClass();

		loadedMetamodels = new ArrayList<>();

		// Currently, the runtime loading of ecore files with loadEcoreViewtypesFromFiles() works,
		// but it will not register any generated code. However, it seems that OCL needs this, which
		// is why I also add the generated packages of the viewtypes here:
		loadedMetamodels.add(org.fortiss.consistency.viewtypes.types.TypesPackage.eINSTANCE);
		loadedMetamodels.add(org.fortiss.consistency.viewtypes.basics.BasicsPackage.eINSTANCE);
		loadedMetamodels.add(
				org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage.eINSTANCE);
		loadedMetamodels.add(
				org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage.eINSTANCE);
		loadedMetamodels
				.add(org.fortiss.consistency.viewtypes.requirements.RequirementsPackage.eINSTANCE);
		loadedMetamodels
				.add(org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage.eINSTANCE);

		registerEcoreViewtypesFromFiles();
	}

	/**
	 * Registers the ecore viewtypes/metamodels whose files are present in the central resource
	 * repository.
	 */
	private void registerEcoreViewtypesFromFiles() {
		// Find all ecore files inside the default viewtype directory.
		List<File> foundEcoreFiles = new ArrayList<>();
		foundEcoreFiles.addAll(getAllEcoreViewtypeFiles());

		// Register everything for the ecore model(s).
		ResourceSet resourceSet = new ResourceSetImpl();
		@SuppressWarnings("unused") EcorePackage ecorePackage = EcorePackage.eINSTANCE;
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> extensionMap = registry.getExtensionToFactoryMap();
		extensionMap.put("ecore", new EcoreResourceFactoryImpl());
		final ExtendedMetaData extendedMetaData =
				new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(OPTION_EXTENDED_META_DATA, extendedMetaData);

		// Try to get the meta models as resources and then load/register them if they are valid.
		boolean demandLoad = true;
		for(File ecoreFile : foundEcoreFiles) {
			URI resourceUri = createFileURI(ecoreFile.getAbsolutePath());
			Resource ecoreMetaModelResource = resourceSet.getResource(resourceUri, demandLoad);
			// get(0) is safe since the ecore resource has always content.
			EObject ecoreMetamodel = ecoreMetaModelResource.getContents().get(0);
			if(ecoreMetamodel instanceof EPackage) {
				EPackage metaModelPackage = (EPackage)ecoreMetamodel;
				// Only add if the metamodel is not loaded yet.
				if(!listContainsEPackage(loadedMetamodels, metaModelPackage)) {
					EPackage.Registry.INSTANCE.put(metaModelPackage.getNsURI(), metaModelPackage);
					loadedMetamodels.add(metaModelPackage);
				}
			}
		}
	}

	/** Registers all global model element links based on the their configuration file. */
	private void registerAllGlobalElementLinks() {
		globalElementLinks = new HashMap<>();

		File linksFile = config.getCentralResourceFile(linksFilePath);
		if(linksFile != null) {
			globalElementLinks.putAll(parseLinksFromXmlFile(linksFile, config));
		}
	}

	/** Registers all consistency rules based on the rule configuration file. */
	private void registerAllConsistencyRules() {
		consistencyRules = new ArrayList<>();

		File ruleFile = config.getCentralResourceFile(rulesFilePath);
		if(ruleFile != null) {
			consistencyRules.addAll(parseRulesFromXmlFile(ruleFile, config));
		}
	}

	/** Registers all possible clearance attributes based on the their configuration file. */
	private void registerAllPossibleClearanceAttributes() {
		userAttributes = new HashMap<>();

		File attributesFile = config.getCentralResourceFile(clearanceAttributesFilePath);
		if(attributesFile != null) {
			userAttributes.putAll(parseClearanceAttributesFromXmlFile(attributesFile, config));
		}
	}

	/** Registers all user attributes based on the their configuration file. */
	private void registerAllUserAttributes() {
		userAttributesPerToken = new HashMap<>();

		HashMap<String, UserHiddenInformation> hiddenInfoMap = getHiddenInformationPerTokenMap();
		for(String key : hiddenInfoMap.keySet()) {
			UserHiddenInformation info = hiddenInfoMap.get(key);
			UserBaseAttributes attributes = info.getBaseAttributes();
			userAttributesPerToken.put(key, attributes);
		}
	}

	/**
	 * Returns all ecore files that represent the consistency viewtypes (in the default viewtype
	 * collection of the central resource directory).
	 * 
	 * @return List of ecore {@link File}s representing the viewtypes.
	 */
	private List<File> getAllEcoreViewtypeFiles() {
		List<File> foundFiles = new ArrayList<>();

		String dirPathString =
				config.getAbsolutePathOfCentralResourceFile(viewtypeCollectionDirectoryPath);
		File directory = new File(dirPathString);
		if(directory.exists()) {
			foundFiles.addAll(listFiles(directory, new RegexFileFilter("^.+\\.ecore$"), DIRECTORY));
		}
		return foundFiles;
	}

	/** Returns the map with the user attributes per user tokens from the respective file. */
	private HashMap<String, UserHiddenInformation> getHiddenInformationPerTokenMap() {
		HashMap<String, UserHiddenInformation> hiddenInformationPerToken = new HashMap<>();

		String hiddenInformationPerTokenFilePath =
				config.getAbsolutePathOfCentralResourceFile(hiddenInfoPerUserFilePath);
		if(hiddenInformationPerTokenFilePath != null &&
				!hiddenInformationPerTokenFilePath.isBlank()) {
			try {
				Path filePath = Paths.get(hiddenInformationPerTokenFilePath);
				String fileString = new String(readAllBytes(filePath), config.getByteEncoding());
				ObjectMapper mapper = new ObjectMapper();
				HashMap<String, HashMap<String, String>> simpleMap = mapper.readValue(fileString,
						new TypeReference<HashMap<String, HashMap<String, String>>>() {
							// No code needed here.
						});
				hiddenInformationPerToken = transformSimpleMapIntoHiddenInfoMap(simpleMap);
			} catch(Exception e) {
				config.logError(appendCausingException(
						"Could not read/parse the attribute per user token map from the json file.",
						e));
			}
		}

		return hiddenInformationPerToken;
	}

	/** Transforms the simple user attributes map into a usable hash map for further processing. */
	private HashMap<String, UserHiddenInformation> transformSimpleMapIntoHiddenInfoMap(
			HashMap<String, HashMap<String, String>> simpleMap) {
		HashMap<String, UserHiddenInformation> hiddenInformationPerToken = new HashMap<>();
		for(String userToken : simpleMap.keySet()) {
			HashMap<String, String> info = simpleMap.get(userToken);
			String userName = info.get("userName");
			String role = info.get("role");
			String hierarchy = info.get("hierarchy");
			String department = info.get("department");
			String company = info.get("company");
			UserBaseAttributes userAttributes =
					createUserBaseAttributes(role, hierarchy, department, company);
			UserHiddenInformation userInfo =
					createUserHiddenInformation(userToken, userName, userAttributes);
			hiddenInformationPerToken.put(userToken, userInfo);
		}
		return hiddenInformationPerToken;
	}

	/**
	 * Returns true if the given EPackage list contains the given EPackage based on name
	 * equivalence, otherwise false is returned.
	 */
	private boolean listContainsEPackage(List<EPackage> list, EPackage ePackage) {
		return list.stream().filter(pkg -> pkg.getName().equals(ePackage.getName())).findFirst()
				.isPresent();
	}
}
