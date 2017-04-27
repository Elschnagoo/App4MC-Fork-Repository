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

import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.impl.MappingModelCheckValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Checks for the entire AMALTHEA model instance if the mapping information are complete and correct between
 * Software(SW) <-> Operating System(OS) <-> Software(SW) model. I.e. mapping relationship {Process(SW) to Scheduler(OS)
 * to Core(HW). A missing mapping information (i.e. no Entity) will be handled as an error.
 */
public class MappingModelCheckValidator extends AbstractCheckValidator implements IssueCreator {

	private final MappingModelCheckValidatorImpl mappingModelImpl;

	public MappingModelCheckValidator() {
		super();
		this.mappingModelImpl = new MappingModelCheckValidatorImpl(this);
	}

	public MappingModelCheckValidator(final boolean doNothing) {
		this.mappingModelImpl = new MappingModelCheckValidatorImpl(this);
	}


	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}


	@Check(constraint = "Process2Scheduler2CoreMapping", categories = { "MappingModel" })
	public void checkTaskToSchedulerToCoreMapping(final MappingModel model) {
		this.mappingModelImpl.checkProcessToSchedulerToCoreMapping(model);
	}
}
