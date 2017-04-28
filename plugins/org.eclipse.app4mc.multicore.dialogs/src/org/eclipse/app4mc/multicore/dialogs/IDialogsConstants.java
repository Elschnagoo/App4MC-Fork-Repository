/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.dialogs;

/**
 * Constant definitions for plug-in preferences
 */
public interface IDialogsConstants {
	public static final String PLUGIN_ID = "org.eclipse.app4mc.multicore.dialogs"; //$NON-NLS-1$
	public static final String PREFIX = PLUGIN_ID + "."; //$NON-NLS-1$
	public static final String EXTENSION = "amxmi"; //$NON-NLS-1$

	// Preferences constants
	public static final String PRE_CHECK_PARTITIONING = PREFIX + "partitioning_check"; //$NON-NLS-1$
	public static final String PRE_CHECK_CREATE_TASKS = PREFIX + "create_tasks_check"; //$NON-NLS-1$
	public static final String PRE_CHECK_MAPPING = PREFIX + "mapping_check"; //$NON-NLS-1$

	public static final String PRE_PROJECT_NAME = PREFIX + "project_name"; //$NON-NLS-1$
	public static final String PRE_HW_MODEL_LOCATION = PREFIX + "hw_model_location"; //$NON-NLS-1$
	public static final String PRE_SW_MODEL_LOCATION = PREFIX + "sw_model_location"; //$NON-NLS-1$

	public static final String PRE_GLOBAL_LOGGING = PREFIX + "global_logging"; //$NON-NLS-1$
	public static final String PRE_OUTPUT_PATH = PREFIX + "output_path"; //$NON-NLS-1$
	public static final String PRE_OUTPUT_PATH_RADIO = PREFIX + "output_path_radio"; //$NON-NLS-1$
}
