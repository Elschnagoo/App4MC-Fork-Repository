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

package org.eclipse.app4mc.amalthea.converters093.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters093.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters093.impl.OsConverter;
import org.eclipse.app4mc.amalthea.converters093.impl.SwConverter;
import org.eclipse.app4mc.amalthea.converters093.utils.HWCacheBuilder;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class OsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/os_instructions/instructionsExample.amxmi", true } });
	}

	public OsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, SwConverter.class,OsConverter.class);
	}

	@Override
	protected List<ICache> buildCaches() {

		final List<ICache> caches = new ArrayList<ICache>();
		HWCacheBuilder cacheBuilder=new HWCacheBuilder();
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


}
