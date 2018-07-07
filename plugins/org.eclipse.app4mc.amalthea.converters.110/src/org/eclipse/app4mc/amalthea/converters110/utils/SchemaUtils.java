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

import java.util.ArrayList;
import java.util.List;

public class SchemaUtils {

	private static final List<String> multipleOccurances = new ArrayList<String>();

	static {
		multipleOccurances.add("taskSchedulers");
		multipleOccurances.add("operatingSystems");
	}

	public static boolean isMultiOccuranceElement(final String elementName) {

		return multipleOccurances.contains(elementName);
	}

}
