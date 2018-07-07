/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters071.utils;

public enum SectionRunnableLabelCacheEnum {

	/*- Cache is stored in following format :  Map<String, List<String>>
	 *
	 * Key is the Label name
	 *
	 * value is the list of Section names
	 *  */
	Label_Sections,

	/*- Cache is stored in following format :  Map<String, List<String>>
	 *
	 * Key is the Runnable name
	 *
	 * value is the list of Section names
	 *  */
	Runnable_Sections,

	/*- Cache is stored in following format :   List<String>
	 *  */
	Section_Names,

	/*- Cache is stored in following format :   Map<String, List<String>>
	 *  */
	Label_UUID_Sections,

	/*- Cache is stored in following format :   Map<String, List<String>>
	 *  */

	Runnable_UUID_Sections
}
