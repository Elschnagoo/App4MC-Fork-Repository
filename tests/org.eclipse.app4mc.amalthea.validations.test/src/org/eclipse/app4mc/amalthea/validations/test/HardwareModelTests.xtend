/**
 * *******************************************************************************
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
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.test

import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.HardwareProfile
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Before
import org.junit.Test
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory

class HardwareModelTests {
	
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension HardwareBuilder b2 = new HardwareBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	val executor = new ValidationExecutor(HardwareProfile)

	@Test
	def void testECUType_Attributes_NoDuplicateNameAddAttributeTwice() {

	}

}
