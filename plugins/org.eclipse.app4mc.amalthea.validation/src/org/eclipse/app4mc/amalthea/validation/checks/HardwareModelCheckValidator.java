/**
 ********************************************************************************
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

package org.eclipse.app4mc.amalthea.validation.checks;

import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.impl.HardwareModelCheckValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Checks beside the AMALTHEA HardwareModel for all 'Feature' and 'Attribute' types if there are AbstractTypes (e.g.
 * StrValue) having duplicated name entries beside an AbstractionTypeDescription element like ECUType or System.
 */
public class HardwareModelCheckValidator extends AbstractCheckValidator implements IssueCreator {

	private final HardwareModelCheckValidatorImpl hardwareModelImpl;

	public HardwareModelCheckValidator() {
		super();
		this.hardwareModelImpl = new HardwareModelCheckValidatorImpl(this);
	}

	public HardwareModelCheckValidator(final boolean doNothing) {
		this.hardwareModelImpl = new HardwareModelCheckValidatorImpl(this);
	}


	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}


	@Check(constraint = "SystemStructure", categories = { "HardwareModel" })
	public void checkSystemStructure(final HwStructure structure) {
		this.hardwareModelImpl.checkSystemStructure(structure);
	}

	@Check(constraint = "HardwareConnection", categories = { "HardwareModel" })
	public void checkHwConnection(final HwConnection connection) {
		this.hardwareModelImpl.checkHwConnection(connection);
	}

	@Check(constraint = "HardwarePort", categories = { "HardwareModel" })
	public void checkHwPort(final HwPort port) {
		this.hardwareModelImpl.checkHwPort(port);
	}

	@Check(constraint = "HardwareAccessPath", categories = { "HardwareModel" })
	public void checkAccessPath(final HwAccessPath path) {
		this.hardwareModelImpl.checkAccessPath(path);
	}

	@Check(constraint = "UndefinedHardware", categories = { "HardwareModel" })
	public void checkPortForUndefined(final HwPort port) {
		this.hardwareModelImpl.checkPortForUndefined(port);
	}

	@Check(constraint = "UndefinedHardware", categories = { "HardwareModel" })
	public void checkModuleForMissingDefinition(final HwModule module) {
		this.hardwareModelImpl.checkModuleForMissingDefinition(module);
	}

	@Check(constraint = "HardwareDefinition", categories = { "HardwareModel" })
	public void checkDefinitions(final HwDefinition definition) {
		this.hardwareModelImpl.checkDefinitions(definition);
	}

}
