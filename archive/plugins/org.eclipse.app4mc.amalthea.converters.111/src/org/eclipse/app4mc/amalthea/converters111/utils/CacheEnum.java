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

package org.eclipse.app4mc.amalthea.converters111.utils;

public enum CacheEnum {


	/*- Cache is stored in following format :  Map<String, Element> */
	UUID_ELEMENT,

	/*- Cache is stored in following format : Map<String, List<Attribute>> */
	URIFRAGMENT_ELEMENT_REFS_ATRIBUTES,

	/*- Cache is stored in following format :  Map<String, Element> */
	URIFRAGMENT_ELEMENT,

	/*- Cache is stored in following format : Map<File,  Table<String,String, List<Attribute>>> */
	HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES,

	/*- Cache is stored in following format :  Map<String, Element>
	 *  ======
	 * ||Note:||
	 *  ======
	 * key is a global URI fragment
	 * Value is a PORT object
	 * */
	HREF_URIFRAGMENT_ELEMENT,

	/*- Cache is stored in following format :BiMap<String, String> */
	ELEMENT_URI_FRAGMENT_NEW_OLD,

	/*- Cache is stored in following format :  Map<String, Element> */
	ELEMENT_NAME;

}
