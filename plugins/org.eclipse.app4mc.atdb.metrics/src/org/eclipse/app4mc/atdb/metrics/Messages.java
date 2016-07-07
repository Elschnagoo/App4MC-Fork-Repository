package org.eclipse.app4mc.atdb.metrics;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.app4mc.atdb.metrics.messages"; //$NON-NLS-1$
	public static String MetricViewer_averageColumnTitle;
	public static String MetricViewer_fileErrorMessage;
	public static String MetricViewer_fileErrorTitle;
	public static String MetricViewer_maximumColumnTitle;
	public static String MetricViewer_minimumColumnTitle;
	public static String MetricViewer_nameColumnTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
