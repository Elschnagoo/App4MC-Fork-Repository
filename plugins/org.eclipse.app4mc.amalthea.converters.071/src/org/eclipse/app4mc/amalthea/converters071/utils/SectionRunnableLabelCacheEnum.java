/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
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
	Section_Names
}
