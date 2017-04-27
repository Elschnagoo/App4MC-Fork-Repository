/**
 * *******************************************************************************
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

package org.eclipse.app4mc.amalthea.validation.checks;

import org.eclipse.app4mc.amalthea.model.HWModel;
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
	public void checkSystemStructure(final HWModel model) {
		this.hardwareModelImpl.checkSystemStructure(model);
	}
}
