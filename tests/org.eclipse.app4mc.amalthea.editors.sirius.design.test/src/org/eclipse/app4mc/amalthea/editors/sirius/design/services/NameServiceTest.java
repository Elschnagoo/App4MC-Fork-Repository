/*********************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Task;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class NameServiceTest {

	private NameService nameS = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.nameS = new NameService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.nameS = null;
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.NameService#lengthOfName(org.eclipse.app4mc.amalthea.model.IReferable)}
	 * .
	 */
	@Test
	public void testLengthOfNameNull() {
		int result = this.nameS.lengthOfName(null);
		assertThat(result, is(0));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.NameService#lengthOfName(org.eclipse.app4mc.amalthea.model.IReferable)}
	 * .
	 */
	@Test
	public void testLengthOfNameEmptyObject() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		int result = this.nameS.lengthOfName(task);
		assertThat(result, is(0));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.NameService#lengthOfName(org.eclipse.app4mc.amalthea.model.IReferable)}
	 * .
	 */
	@Test
	public void testLengthOfNameObjectWithName() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setName("name");
		int result = this.nameS.lengthOfName(task);
		assertThat(result, is(6));
	}

}
