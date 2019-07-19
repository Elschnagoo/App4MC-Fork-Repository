/**
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
 */
package org.eclipse.app4mc.amalthea.validations.test;

import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.validations.HardwareProfile;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class HardwareModelTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private HardwareBuilder b2 = new HardwareBuilder();
  
  @Extension
  private SoftwareBuilder b3 = new SoftwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(HardwareProfile.class);
  
  @Test
  public void testECUType_Attributes_NoDuplicateNameAddAttributeTwice() {
  }
}
