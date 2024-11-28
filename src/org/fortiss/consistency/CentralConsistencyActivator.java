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

import static org.eclipse.core.runtime.FileLocator.toFileURL;
import static org.eclipse.core.runtime.Status.OK_STATUS;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.jobs.Job;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plugin life cycle.
 * This is only needed if the consistency instance is used directly as Eclipse plugin.
 * 
 * @author bergemann
 */
public class CentralConsistencyActivator extends Plugin {

	/** The plugin ID. */
	public static final String PLUGIN_ID = CentralConsistencyActivator.class.getPackage().getName(); // $NON-NLS-1$

	/**
	 * {@link String} of the default path to the resource directory in which all (external) files
	 * should exist.
	 */
	public static final String RESOURCE_DIRECTORY_PATH = "res/";

	/**
	 * The flag whether the central consistency environment, i.e., the central checker instance
	 * (including central consistency server), should be started with Eclipse (with this activator)
	 * directly at the beginning or manually by the user who needs to start it either externally via
	 * the separately built standalone jar of the checker or internally via an UI implementation of
	 * a tool that will then call/start the environment itself.
	 */
	private static final boolean AUTOMATICALLY_START_CONSISTENCY_ENVIRONMENT_WITH_ECLIPSE = false;

	/** The shared instance. */
	private static CentralConsistencyActivator plugin;

	/** The consistency environment that starts everything. */
	private CentralConsistencyEnvironment centralConsistencyEnvironment;

	/** Constructor. */
	public CentralConsistencyActivator() {
		// Do nothing.
	}

	/** {@inheritDoc} */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		if(AUTOMATICALLY_START_CONSISTENCY_ENVIRONMENT_WITH_ECLIPSE) {
			setUpAndStartCentralConsistencyEnvironment();
		}
	}

	/** {@inheritDoc} */
	@Override
	public void stop(BundleContext context) throws Exception {
		stopCentralConsistencyEnvironment();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Sets up and afterwards starts the central consistency environment in a separate thread/job.
	 * 
	 * This should be either called by the activator plugin when it should be executed automatically
	 * during startup or can be called manually by any other (UI) plugin if the consistency
	 * environment should be started at a specific (later) time.
	 */
	public void setUpAndStartCentralConsistencyEnvironment() {
		centralConsistencyEnvironment = CentralConsistencyEnvironment.getInstance();
		// Since the setup can take some seconds but is not dependent on other plugins and
		// vice versa, it is more efficient to let it run in a separate thread/job without
		// blocking the other plugin setups.
		Job job = new Job("Starting the central consistency environment") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String resourcePath = getGlobalConsistencyResourcePath();
				centralConsistencyEnvironment.load(resourcePath);
				centralConsistencyEnvironment.start();

				return OK_STATUS;
			}
		};
		job.setUser(false);
		job.schedule();
	}

	/**
	 * Stops the central consistency environment if it is active.
	 * 
	 * This should be either called by the activator plugin when it should be executed automatically
	 * during termination or can be called manually by any other (UI) plugin if the consistency
	 * environment should be stopped at a specific (later) time.
	 */
	public void stopCentralConsistencyEnvironment() {
		if(centralConsistencyEnvironment != null) {
			centralConsistencyEnvironment.stop();
		}
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return The plugin instance.
	 */
	public static CentralConsistencyActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns the path to the global consistency resource directory.
	 * 
	 * @return The path to the global consistency resource directory.
	 */
	public static String getGlobalConsistencyResourcePath() {
		String path = "";
		URL url = FileLocator.find(Platform.getBundle(PLUGIN_ID), new Path(RESOURCE_DIRECTORY_PATH),
				null);
		try {
			path = toFileURL(url).getPath();
		} catch(Exception e) {
			System.err.println(
					"Custom URL '" + url + "' could not be converted into normal file URL.");
		}
		if(!path.isBlank()) {
			File ruleFile = new File(path);
			path = ruleFile.getAbsolutePath();
		}
		return path;
	}
}
