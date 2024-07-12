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
import org.fortiss.consistency.communication.ConsistencyServer;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.security.encryption.IEncryptionManager;

/**
 * This class is able to create/start the actual consistency environment.
 * 
 * @author bergemann
 */
public class CentralConsistencyEnvironment {

	/** The current instance. */
	private static CentralConsistencyEnvironment currentConsistencyEnvironment;

	/** The configuration that has all the basic consistency information. */
	private static ConsistencyConfiguration config;
	/** The server for communicating with the adapters. */
	private ConsistencyServer server;

	/** Elapsed time of logger setup (in milliseconds). */
	private double loggerSetupTime = 0.0;
	/** Elapsed time of registering elements (in milliseconds). */
	private double registerTime = 0.0;
	/** Elapsed time of evaluator setup (in milliseconds). */
	private double evaluatorSetupTime = 0.0;
	/** Elapsed time of security setup (in milliseconds). */
	private double securitySetupTime = 0.0;
	/** Elapsed time of server setup (in milliseconds). */
	private double serverSetupTime = 0.0;

	/**
	 * Constructor.
	 * 
	 * @param resourceDirectoryPath
	 *            The path to the resource directory in which all the important files are searched
	 *            for.
	 */
	public CentralConsistencyEnvironment(String resourceDirectoryPath) {
		// Set up the configuration and load the given configuration files.
		config = new ConsistencyConfiguration(resourceDirectoryPath);
		config.logInfo("Consistency environment is loading configuration.");
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
		currentConsistencyEnvironment = this;
		boolean success = false;

		if(!config.isConfigurationLoaded()) {
			config.logError(
					"Consistency environment is not active, because settings could not be loaded.");
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
		server = new ConsistencyServer(config);
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
	}

	/** Stops the consistency environment, especially the server. */
	public void stop() {
		if(server != null) {
			server.stop();
		}

		currentConsistencyEnvironment = null;
	}

	/** Refreshes the registered elements based on their current (configuration) files. */
	public void refreshRegistration() {
		config.registerAllElements();
	}

	/**
	 * Returns the current environment instance.
	 * 
	 * @return The current environment instance.
	 */
	public static CentralConsistencyEnvironment getCurrentConsistencyEnvironment() {
		return currentConsistencyEnvironment;
	}

	/**
	 * Returns the current configuration instance.
	 * 
	 * @return The current configuration instance.
	 */
	public static ConsistencyConfiguration getCurrentConsistencyConfiguration() {
		return config;
	}

	/** Executes once all initial setup tasks for the consistency checking environment. */
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
		IRuleEvaluator shallowEvaluator = config.getNewShallowEvaluatorInstance();
		config.logInfo("Chosen consistency evaluator: " + shallowEvaluator.getEvaluatorName() +
				". Setting it up ...");
		shallowEvaluator.performInitialSetup();
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
