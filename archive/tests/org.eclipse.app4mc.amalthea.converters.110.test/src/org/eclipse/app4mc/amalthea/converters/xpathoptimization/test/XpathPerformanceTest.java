/*********************************************************************************
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

package org.eclipse.app4mc.amalthea.converters.xpathoptimization.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.converters.common.xpath.utils.BulkXpathOperation;
import org.eclipse.app4mc.amalthea.converters110.test.AbstractConverterTest;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class XpathPerformanceTest extends AbstractConverterTest

{


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/urifragments/test.amxmi", true } });
	}

	public XpathPerformanceTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void test_XpathOptimization() {

		if (!this.canExecuteTestCase) {
			return;
		}
		try {

			final Set<File> keySet = this.fileName_documentsMap.keySet();

			for (final File file : keySet) {
				final Document doc = this.fileName_documentsMap.get(file);
				invokeXpath2(doc, new ArrayList<String>());
			}

		}
		catch (final Exception e) {

			fail(e.getMessage());

		}


	}

	public void invokeXpath2(final Document document, final List<String> xpaths) {

		xpaths.add("//osModel/scheduler[3]");
		xpaths.add("//osModel/scheduler[2]");
		xpaths.add("//osModel/scheduler[1]");
		xpaths.add("//swModel/tasks[16]");
		xpaths.add("//swModel/tasks[27]");
		xpaths.add("//swModel/tasks[38]");
		xpaths.add("//swModel/tasks[49]");
		xpaths.add("//swModel/tasks[100]");

		final BulkXpathOperation bulkXpathOperation = new BulkXpathOperation();

		final Map<String, List<Element>> resultsMap = bulkXpathOperation.invokeXpath(document, xpaths, this.helper);

		for (final String string : xpaths) {
			this.logger.trace("xpath : " + string + " elements : " + resultsMap.get(string).size());
		}

	}

}
