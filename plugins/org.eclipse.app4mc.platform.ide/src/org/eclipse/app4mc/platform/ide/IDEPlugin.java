package org.eclipse.app4mc.platform.ide;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * Initial contributor: <a href="mailto:lothar.wendehals@itemis.de">Lothar Wendehals, itemis AG</a>
 */
public class IDEPlugin extends AbstractUIPlugin {

	/**
	 * The shared instance
	 */
	private static IDEPlugin plugin;


	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static IDEPlugin getDefault() {
		return plugin;
	}

	/**
	 * @return the plugin's id.
	 */
	public static String getPluginId() {
		return plugin.getBundle().getSymbolicName();
	}


}
