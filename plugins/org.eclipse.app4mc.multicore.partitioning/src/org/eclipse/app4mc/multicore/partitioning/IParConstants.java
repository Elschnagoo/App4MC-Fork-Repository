/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.partitioning;

/**
 * Constant definitions for plug-in preferences
 */
public interface IParConstants {

	public static final String PLUGIN_ID = "org.eclipse.app4mc.multicore.partitioning"; //$NON-NLS-1$
	public static final String PREFIX = PLUGIN_ID + "."; //$NON-NLS-1$
	public static final String EXTENSION = "amxmi"; //$NON-NLS-1$

	public static final String PRE_ACTIVATION = PREFIX + "boolActivation";
	public static final String PRE_GGP = PREFIX + "boolGGP";
	public static final String PRE_MIN_EDGES = PREFIX + "boolMinEdges";
	public static final String PRE_EFF_EDGE = PREFIX + "boolEffEdge";
	// public static final String PRE_CPP = PREFIX + "boolCPP";
	public static final String PRE_GCP = PREFIX + "boolGCP";
	public static final String PRE_PARTITIONING_ALG = PREFIX + "partAlgorithm";
	// public static final String PRE_ESSP = PREFIX + "boolESSP";
	public static final String PRE_INT = PREFIX + "intThreads";
	public static final String PRE_TA = PREFIX + "boolTA";
	public static final String PRE_VIS = PREFIX + "boolVis";
	public static final String PRE_LOC_STRING = PREFIX + "loc";
	public static final String PRE_LOC_RADIO = PREFIX + "locRadio";
	public static final String PRE_DEBUG = PREFIX + "debug";
	public static final String PRE_TAGS = PREFIX + "boolTAGS";
	public static final String PRE_ASIL = PREFIX + "boolASIL";
	public static final String PRE_RPC = PREFIX + "boolRPC";
	public static final String PRE_RCPC = PREFIX + "boolRCPC";
}
