/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.test;

import org.eclipse.app4mc.amalthea.model.util.test.AmaltheaIndexTest;
import org.eclipse.app4mc.amalthea.model.util.test.ConstraintsUtilsTest;
import org.eclipse.app4mc.amalthea.model.util.test.HardwareUtilsTest;
import org.eclipse.app4mc.amalthea.model.util.test.RuntimeUtilsTest;
import org.eclipse.app4mc.amalthea.model.util.test.SoftwareUtilsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	DeviationsTest.class,
	MetamodelStructureTest.class,
	TimeComparisonTest.class,

	HardwareUtilsTest.class,
	RuntimeUtilsTest.class,
	AmaltheaIndexTest.class,
	ConstraintsUtilsTest.class,
	SoftwareUtilsTest.class
})

public class AllTests {
	// empty class to start test suite
}
