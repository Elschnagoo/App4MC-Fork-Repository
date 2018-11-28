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

package org.eclipse.app4mc.amalthea.converters.ui.utils;

import java.util.ArrayList;
import java.util.List;

public class ModelVersions {

	
	public static List<String> get(){
		
		List<String> allSupportedVersions=new ArrayList<String>();
		
		allSupportedVersions.add("itea.103");
		allSupportedVersions.add("itea.110");
		allSupportedVersions.add("itea.111");
		allSupportedVersions.add("0.7.0");
		allSupportedVersions.add("0.7.1");
		allSupportedVersions.add("0.7.2");
		allSupportedVersions.add("0.8.0");
		allSupportedVersions.add("0.8.1");
		allSupportedVersions.add("0.8.2");
		allSupportedVersions.add("0.8.3");
		allSupportedVersions.add("0.9.0");
		allSupportedVersions.add("0.9.1");
		allSupportedVersions.add("0.9.2");
		allSupportedVersions.add("0.9.3");

		return allSupportedVersions;
	}
}
