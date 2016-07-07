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
package org.eclipse.app4mc.amalthea.converters110.utils;

public enum ProcessCacheEnum {

	/*- Cache is stored in following format :  Map<String, Element> */
	UUID_PROCESS_ELEMENT,

	/*- Cache is stored in following format : Map<String, List<Attribute>> */
	URIFRAGMENT_PROCESS_REFS_ATRIBUTES,

	/*- Cache is stored in following format :  Map<String, Element> */
	URIFRAGMENT_PROCESS_ELEMENT,

	/*- Cache is stored in following format : Map<File,  Table<String,String, List<Attribute>>> */
	HREF_URIFRAGMENT_PROCESS_REFS_ATRIBUTES,

	/*- Cache is stored in following format :  Map<String, Element>
	 *  ======
	 * ||Note:||
	 *  ======
	 * key is a global URI fragment
	 * Value is a Process object
	 * */
	HREF_URIFRAGMENT_PROCESS_ELEMENT;
}
