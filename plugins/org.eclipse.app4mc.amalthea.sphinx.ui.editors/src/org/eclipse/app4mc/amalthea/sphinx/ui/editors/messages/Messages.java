/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.messages"; //$NON-NLS-1$
	public static String ExtendedContentsTreePage_title;
	public static String ModelHitCollector_label;
	public static String ModelSearchResult_label;
	public static String ModelSearchResult_results;
	public static String SearchAction_title;
	public static String SearchGUI_button;
	public static String SearchGUI_description;
	public static String SearchGUI_label;
	public static String SearchGUI_title;
	public static String ShowTypesAction_title;
	public static String ShowTypesAction_tooltip;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
