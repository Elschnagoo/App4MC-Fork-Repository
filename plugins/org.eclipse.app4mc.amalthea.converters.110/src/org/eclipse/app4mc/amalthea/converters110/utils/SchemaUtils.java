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
