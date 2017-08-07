/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping;

/**
 * Constant definitions for plug-in preferences
 */
public interface IOMConstants {
	public static final String PLUGIN_ID = "org.eclipse.app4mc.multicore.openmapping"; //$NON-NLS-1$
	public static final String PREFIX = PLUGIN_ID + "."; //$NON-NLS-1$
	public static final String EXTENSION = "amxmi"; //$NON-NLS-1$

	// Preferences constants
	public static final String PRE_CHECK_LOGCON = PREFIX + "logToConsole"; //$NON-NLS-1$
	public static final String PRE_MAPPING_ALG = PREFIX + "mappingAlgorithm"; //$NON-NLS-1$
	public static final String PRE_RADIO_OUTDIR = PREFIX + "outputLocation"; //$NON-NLS-1$
	public static final String PRE_STRING_OUTDIR = PREFIX + "outputLocationString"; //$NON-NLS-1$

	public static final String PRE_CHECK_GENERATE_MPS = PREFIX + "generateMpsFile"; //$NON-NLS-1$
	public static final String PRE_MAX_GAP = PREFIX + "MaxGap"; //$NON-NLS-1$
	public static final String PRE_MAX_IT_ABORT = PREFIX + "MaxItAbort"; //$NON-NLS-1$
	public static final String PRE_MAX_TIME_ABORT = PREFIX + "MaxTimeAbort"; //$NON-NLS-1$
	public static final String PRE_MAX_IT_SUFFICE = PREFIX + "MaxItSuffice"; //$NON-NLS-1$
	public static final String PRE_MAX_TIME_SUFFICE = PREFIX + "MaxTimeSuffice"; //$NON-NLS-1$
	
	public static final String PRE_TASK_CREATION_ALG = PREFIX + "taskCreationAlgorithm"; //$NON-NLS-1$
}
