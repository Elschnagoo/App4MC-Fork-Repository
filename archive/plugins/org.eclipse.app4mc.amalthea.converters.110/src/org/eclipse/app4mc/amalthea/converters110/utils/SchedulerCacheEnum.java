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

package org.eclipse.app4mc.amalthea.converters110.utils;

public enum SchedulerCacheEnum {

	/*- Cache is stored in following format :  Map<String, Element> */
	UUID_SCHEDULER_ELEMENT,

	/*- Cache is stored in following format : Map<String, List<Attribute>> */
	URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES,

	/*- Cache is stored in following format :  Map<String, Element> */
	URIFRAGMENT_SCHEDULER_ELEMENT,

	/*- Cache is stored in following format : Map<File,  Table<String,String, List<Attribute>>> */
	HREF_URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES,

	/*- Cache is stored in following format :  Map<String, Element>
	 *  ======
	 * ||Note:||
	 *  ======
	 * key is a global URI fragment
	 * Value is a Scheduler object
	 * */
	HREF_URIFRAGMENT_SCHEDULER_ELEMENT,

	/*- Cache is stored in following format :BiMap<String, String> */
	URI_FRAGMENT_NEW_OLD;

}
