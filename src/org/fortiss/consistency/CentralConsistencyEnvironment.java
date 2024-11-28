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
package org.fortiss.consistency;

import static org.fortiss.consistency.utils.ConsistencyUtils.appendCausingException;

import org.fortiss.consistency.checking.evaluators.IRuleEvaluator;
import org.fortiss.consistency.communication.CentralConsistencyServer;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.security.encryption.IEncryptionManager;

/**
 * This class is able to create/start the actual consistency environment.
 * 
 * @author bergemann
 */
public class CentralConsistencyEnvironment {

	/** Singleton instance (is only created if actually needed, i.e., on first usage). */
	private static CentralConsistencyEnvironment SINGLETON_INSTANCE;

	/** The configuration that has all the basic consistency information. */
	private ConsistencyConfiguration config;
	/** The server for communicating with the adapters. */
	private CentralConsistencyServer server;
	/** Flag whether the environment was started and is still running (or not). */
	private boolean isRunning;

	/** Elapsed time of logger setup (in milliseconds). */
	private double loggerSetupTime;
	/** Elapsed time of registering elements (in milliseconds). */
	private double registerTime;
	/** Elapsed time of evaluator setup (in milliseconds). */
	private double evaluatorSetupTime;
	/** Elapsed time of security setup (in milliseconds). */
	private double securitySetupTime;
	/** Elapsed time of server setup (in milliseconds). */
	private double serverSetupTime;

	/** Local singleton constructor (therefore only private). */
	private CentralConsistencyEnvironment() {
		isRunning = false;
		loggerSetupTime = 0.0;
		registerTime = 0.0;
		evaluatorSetupTime = 0.0;
		securitySetupTime = 0.0;
		serverSetupTime = 0.0;
	}

	/**
	 * Returns the singleton instance of the {@link CentralConsistencyEnvironment}. The singleton is
	 * not automatically created, but only when really used, which is why the first usage of this
	 * getter will instantiate the singleton.
	 * 
	 * @return The singleton instance of the consistency environment.
	 */
	public static synchronized CentralConsistencyEnvironment getInstance() {
		if(SINGLETON_INSTANCE == null) {
			SINGLETON_INSTANCE = new CentralConsistencyEnvironment();
		}
		return SINGLETON_INSTANCE;
	}

	/**
	 * Returns whether the {@link CentralConsistencyEnvironment} instance exists and its
	 * configuration is loaded.
	 * 
	 * @return True if the environment exists and is loaded, otherwise false.
	 */
	public static synchronized boolean isLoaded() {
		return SINGLETON_INSTANCE != null && SINGLETON_INSTANCE.config != null &&
				SINGLETON_INSTANCE.config.isConfigurationLoaded();
	}

	/**
	 * Returns whether the {@link CentralConsistencyEnvironment} instance exists, its configuration
	 * is loaded, and was also started, i.e., it is running/active.
	 * 
	 * @return True if the environment is running (loaded and started), otherwise false.
	 */
	public static synchronized boolean isRunning() {
		return isLoaded() && SINGLETON_INSTANCE.isRunning;
	}

	/**
	 * Loads the configuration of the consistency environment. This must be done before the
	 * environment is started! The input for the configuration is taken from the given resource
	 * directory.
	 * 
	 * @param resourceDirectoryPath
	 *            The path to the resource directory with all configuration/setting files.
	 */
	public void load(String resourceDirectoryPath) {
		config = new ConsistencyConfiguration(resourceDirectoryPath);
		config.logInfo("Consistency environment is loading configuration ...");
		config.loadConfiguration();
		if(config.isConfigurationLoaded()) {
			config.logInfo(
					"Consistency environment has loaded configuration and is ready to be started.");
		} else {
			config.logWarning(
					"Consistency environment could not (fully) load configuration and is therefore probably not ready to be started.");
		}
	}

	/** Starts the consistency environment including all necessary setups. */
	public void start() {
		config.logInfo("Consistency environment is starting.");
		boolean success = false;

		if(!config.isConfigurationLoaded()) {
			config.logError(
					"Consistency environment could not be started (and is therefore not active), because settings were not loaded beforehand.");
			return;
		}

		String errorMessage =
				"Consistency environment is not active, because setup could not be completed.";
		try {
			success = executeAllNeededSetups();
		} catch(NumberFormatException e) {
			config.logError(appendCausingException(errorMessage, e));
			return;
		}
		if(!success) {
			config.logError(errorMessage);
			return;
		}

		long startTime = System.nanoTime();
		errorMessage =
				"Consistency environment is not active, because server could not be started.";
		server = new CentralConsistencyServer();
		success = server.start();
		if(!success) {
			config.logError(errorMessage);
			return;
		}
		serverSetupTime = (System.nanoTime() - startTime) * 0.000001;

		double totalTime = loggerSetupTime + registerTime + evaluatorSetupTime + securitySetupTime +
				serverSetupTime;
		String finishMessage = String.format(
				"Consistency environment is now active." +
						"\n\t- Elapsed time for setting up the logger:\t% 10.2f ms" +
						"\n\t- Elapsed time for registering the elements:\t% 10.2f ms" +
						"\n\t- Elapsed time for setting up the evaluator:\t% 10.2f ms" +
						"\n\t- Elapsed time for setting up the security:\t% 10.2f ms" +
						"\n\t- Elapsed time for setting up the server:\t% 10.2f ms" +
						"\n\t- Elapsed time for total setup:\t\t       =% 10.2f ms",
				loggerSetupTime, registerTime, evaluatorSetupTime, securitySetupTime,
				serverSetupTime, totalTime);
		config.logInfo(finishMessage + "\n");
		isRunning = true;
	}

	/** Stops the consistency environment, especially the server. */
	public void stop() {
		if(server != null) {
			server.stop();
			server = null;
		}
		config = null;
		isRunning = false;
		SINGLETON_INSTANCE = null;
	}

	/**
	 * Returns the current configuration of the consistency environment instance.
	 * 
	 * @return The current configuration of the consistency environment instance.
	 */
	public ConsistencyConfiguration getConfiguration() {
		return config;
	}

	/**
	 * Refreshes the registered elements based on their current (configuration)
	 * files.
	 */
	public void refreshRegistration() {
		config.registerAllElements();
	}

	/**
	 * Executes once all initial setup tasks for the consistency checking
	 * environment.
	 */
	private boolean executeAllNeededSetups() throws NumberFormatException {
		// Set up logger.
		long startTime = System.nanoTime();
		try {
			String path = config.setupConsistencyLogger();
			if(path == null) {
				return false;
			}
			config.logInfo("Consistency logger is activated and stores at: " + path);
		} catch(Exception e) {
			config.logError(
					"Logger could not be set up correctly. Exception message: " + e.getMessage());
			return false;
		}
		loggerSetupTime = (System.nanoTime() - startTime) * 0.000001;

		// Register/Load metamodels, links, rules, etc.
		startTime = System.nanoTime();
		config.registerAllElements();
		registerTime = (System.nanoTime() - startTime) * 0.000001;

		// Evaluator.
		startTime = System.nanoTime();
		config.logInfo("Setting evaluator up ...");
		IRuleEvaluator evaluator = config.getNewEvaluatorInstance();
		evaluator.performInitialSetup();
		config.logInfo(
				"Chosen consistency evaluator '" + evaluator.getEvaluatorName() + "' is set up.");
		evaluatorSetupTime = (System.nanoTime() - startTime) * 0.000001;

		// Security.
		startTime = System.nanoTime();
		IEncryptionManager encryptionManager = config.getEncryptionManager();
		boolean success = encryptionManager.performInitialSetup();
		if(!success) {
			config.logError(
					"Further cryptography will likely fail, because the initial security setup could not be performed successfully.");
			return false;
		}
		config.getClearanceManager();
		securitySetupTime = (System.nanoTime() - startTime) * 0.000001;

		return true;
	}
}
