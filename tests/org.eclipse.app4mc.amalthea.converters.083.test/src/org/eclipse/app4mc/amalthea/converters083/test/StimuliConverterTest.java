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
package org.eclipse.app4mc.amalthea.converters083.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters083.impl.ComponentModelConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.StimuliConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.SwConverter;
import org.eclipse.app4mc.amalthea.converters083.utils.PeriodicStimulusCacheBuilder;
import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class StimuliConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/stimuli/model.amxmi", true } });
	}

	public StimuliConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, RootElementConverter.class, ComponentModelConverter.class, SwConverter.class, StimuliConverter.class );
	}

	
	@Override
	protected List<ICache> buildCaches() {

		final List<ICache> caches = new ArrayList<ICache>();
		
		PeriodicStimulusCacheBuilder cacheBuilder=new PeriodicStimulusCacheBuilder();
		caches.add(cacheBuilder);

		for (final ICache iCache : caches) {
			iCache.buildCache(this.fileName_documentsMap);
		}
		
		return caches;
	}

	@Override
	@Test
	public void verification() {
		super.verification();
		
	}
	
	@Override
	protected void namespaceVerification(Document document) {
		super.namespaceVerification(document);
	}
  @Override
protected void modelFileVerificationHook(Document document) {

	  super.modelFileVerificationHook(document);
	  
		
		
	  final XMLOutputter outputter = new XMLOutputter();
		final String docBufferString = outputter.outputString(document);


		assertTrue("Model migration of \"SyntheticStimulus\" element is not successful in model file : "
				+ document.getBaseURI(), !docBufferString.contains("am:SyntheticStimulus"));

		assertTrue("Model migration of \"SporadicStimulus\" element is not successful in model file : "
				+ document.getBaseURI(), !docBufferString.contains("am:SporadicStimulus"));

		assertTrue("Model migration of \"ArrivalCurveStimulus\" element is not successful in model file : "
				+ document.getBaseURI(), !docBufferString.contains("numberOfEvents"));
		
		
	
}

}

