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

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
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
	 * The flag whether the consistency environment, i.e., the central checker instance, should be
	 * started together with Eclipse (with this activator) or without Eclipse (then externally via
	 * the separately built standalone jar of the checker).
	 */
	private static final boolean START_CONSISTENCY_ENVIRONMENT_WITH_ECLIPSE = true;

	/** The shared instance. */
	private static CentralConsistencyActivator plugin;

	/** The consistency environment that starts everything. */
	private CentralConsistencyEnvironment consistencyEnvironment;

	/** Constructor. */
	public CentralConsistencyActivator() {
		if(START_CONSISTENCY_ENVIRONMENT_WITH_ECLIPSE) {
			String resourcePath = getGlobalConsistencyResourcePath();
			consistencyEnvironment = new CentralConsistencyEnvironment(resourcePath);
		}
	}

	/** {@inheritDoc} */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		if(START_CONSISTENCY_ENVIRONMENT_WITH_ECLIPSE) {
			// Since the setup can take some seconds but is not dependent on other plugins and
			// vice versa, it is more efficient to let it run in a separate thread without blocking
			// the other plugin setups.
			new Thread(new Runnable() {
				@Override
				public void run() {
					consistencyEnvironment.start();
				}
			}).start();
		}
	}

	/** {@inheritDoc} */
	@Override
	public void stop(BundleContext context) throws Exception {
		if(START_CONSISTENCY_ENVIRONMENT_WITH_ECLIPSE) {
			consistencyEnvironment.stop();
		}

		plugin = null;
		super.stop(context);
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
