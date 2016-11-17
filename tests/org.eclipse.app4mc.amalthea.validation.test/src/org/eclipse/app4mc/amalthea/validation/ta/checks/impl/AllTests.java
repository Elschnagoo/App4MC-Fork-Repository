/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		AmaltheaModelValidatorTests.class,
		ConstraintsModelValidatorTests.class,
		HWModelValidatorTests.class,
		MappingModelValidatorTests.class,
		OSModelValidatorTests.class,
		StimuliModelValidatorTests.class,
		SWModelValidatorTests.class })
public class AllTests {
	// run all tests
}
