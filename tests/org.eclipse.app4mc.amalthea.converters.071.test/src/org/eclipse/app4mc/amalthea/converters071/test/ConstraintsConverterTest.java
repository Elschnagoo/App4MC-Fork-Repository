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
package org.eclipse.app4mc.amalthea.converters071.test;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.converters071.impl.ConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.PropertyConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.SwConverter;
import org.jdom2.Element;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class ConstraintsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles_500501 = new String[] { "/constraints/constraints_500502.amxmi" };

		final String[] inputFiles_500502 = new String[] { "/constraints/constraints_500502.amxmi",
				"/constraints/constraints_sw_model.amxmi" };

		return Arrays.asList(new Object[][] { { "500501", true, inputFiles_500501, "AffinityConstraint change" },
				{ "500502", true, inputFiles_500502, "RunnableSequencingConstraint change" } });
	}

	public ConstraintsConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(RootElementConverter.class, NamespaceConverter.class, SwConverter.class,
				PropertyConstraintsConverter.class, HwConverter.class, ConstraintsConverter.class);
	}


	@Override
	@Test
	public void verification() {

		super.verification();


		final Set<File> keySet = this.fileName_documentsMap.keySet();

		for (final File file : keySet) {

			final Element rootElement = this.fileName_documentsMap.get(file).getRootElement();

			/*-
			 * ===Verifying existance of SchedulerSeparationConstraint and SchedulerPairingConstraint content===
			 */
			verify_affinityConstraints(file, rootElement);


			/* ============Verifying ProcessRunnableGroupEntry content ========== */

			verify_ProcessRunnableGroupEntry(file, rootElement);

			/* ============Verifying ProcessRunnableGroup content ========== */

			verify_ProcessRunnableGroup(file, rootElement);

		}


	}

	private void verify_ProcessRunnableGroupEntry(final File file, final Element rootElement) {

		final List<Element> processRunnableGroupEntries = this.helper.getXpathResult(rootElement,
				"./constraintsModel/runnableSequencingConstraints/runnableGroups/entries", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		for (final Element processRunnableGroupEntry : processRunnableGroupEntries) {

			Assert.assertTrue(
					"ProcessRunnableGroupEntry is not migrated to 0.7.1 format in model file : " + file.getName(),
					processRunnableGroupEntry.getAttribute("processScope") == null
							|| processRunnableGroupEntry.getChildren("processScope").size() == 0);

		}
	}

	private void verify_ProcessRunnableGroup(final File file, final Element rootElement) {

		final List<Element> runnableGroups = this.helper.getXpathResult(rootElement,
				"./constraintsModel/runnableSequencingConstraints/runnableGroups[@groupingType]", Element.class,
				this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));


		Assert.assertTrue("ProcessRunnableGroup is not migrated to 0.7.1 format in model file : " + file.getName(),
				runnableGroups.size() == 0);

	}


	private void verify_affinityConstraints(final File file, final Element rootElement) {

		final List<Element> sch_pairing_separation_constraints = this.helper.getXpathResult(rootElement,
				"./constraintsModel/affinityConstraints[@xsi:type=\"am:SchedulerPairingConstraint\" or @xsi:type=\"am:SchedulerSeparationConstraint\" ]",
				Element.class, this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

		Assert.assertTrue(
				"SchedulerPairing and SchedulerSeparation constraints are not migrated to 0.7.1 format in model file : "
						+ file.getName(),
				sch_pairing_separation_constraints.size() == 0);
	}


}
