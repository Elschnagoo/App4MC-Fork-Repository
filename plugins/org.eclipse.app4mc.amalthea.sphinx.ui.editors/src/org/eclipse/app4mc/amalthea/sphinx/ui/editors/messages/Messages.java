/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.messages"; //$NON-NLS-1$
	@SuppressWarnings("javadoc")
	public static String ExtendedContentsTreePage_title;
	@SuppressWarnings("javadoc")
	public static String ModelHitCollector_label;
	@SuppressWarnings("javadoc")
	public static String ModelSearchResult_label;
	@SuppressWarnings("javadoc")
	public static String ModelSearchResult_results;
	@SuppressWarnings("javadoc")
	public static String SearchAction_title;
	@SuppressWarnings("javadoc")
	public static String SearchGUI_button;
	@SuppressWarnings("javadoc")
	public static String SearchGUI_description;
	@SuppressWarnings("javadoc")
	public static String SearchGUI_label;
	@SuppressWarnings("javadoc")
	public static String SearchGUI_title;
	@SuppressWarnings("javadoc")
	public static String ShowTypesAction_title;
	@SuppressWarnings("javadoc")
	public static String ShowTypesAction_tooltip;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
