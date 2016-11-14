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
