/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters094.test.debug;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters094.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters094.impl.SwConverter;
import org.eclipse.app4mc.amalthea.converters094.utils.HelperUtils_093_094;
import org.jdom2.Document;

// For debugging (run as Java application):
// This class shows how to call several converters without caught exceptions

public class RunModeConditionConverter {

	public static void main(String[] args) {
		final List<ICache> caches = new ArrayList<ICache>();
		
		final String inputGlobalTestsDirectory = "TestModels/input";
		final String outputGlobalTestsDirectory = "TestModels/output";

		HelperUtils_093_094 helper = HelperUtils_093_094.getInstance();
		
		// *** Enter files here ***
		final List<String> inputFiles = Arrays.asList(
				"/swModel/mode-conditions/conditions.amxmi",
				"/swModel/mode-conditions/modes2.amxmi");
		
		// *** Add converters here ***
		final NamespaceConverter converter1 = new NamespaceConverter();
		final SwConverter converter2 = new SwConverter();
		
		
		Map<File, Document> fileName_documentsMap = new HashMap<File, Document>();
		
		// Run converters for every file
		
		for (String file : inputFiles) {
			String inputXmlFilePath = inputGlobalTestsDirectory + file;
			String outputXmlFilePath = outputGlobalTestsDirectory + file;
			
			File inputFile = null;
			try {
				inputFile = new File(inputXmlFilePath).getCanonicalFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				helper.buildXMLDocumentsMap(inputFile, fileName_documentsMap);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// Run converters
				
			converter1.basicConvert(inputFile, fileName_documentsMap, caches);
			converter2.basicConvert(inputFile, fileName_documentsMap, caches);
			
			try {
				helper.saveFile(fileName_documentsMap.get(inputFile), outputXmlFilePath, true, true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
