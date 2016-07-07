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

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.impl.ConstraintsModelCheckValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Checks inside an AMALTHEA ConstraintsModel if all existing EventChains have correctly constructed SubEventChains.
 */
public class ConstraintsModelCheckValidator extends AbstractCheckValidator implements IssueCreator {

	private final ConstraintsModelCheckValidatorImpl constraintsModelImpl;

	public ConstraintsModelCheckValidator() {
		super();
		this.constraintsModelImpl = new ConstraintsModelCheckValidatorImpl(this);
	}


	public ConstraintsModelCheckValidator(final boolean doNothing) {
		this.constraintsModelImpl = new ConstraintsModelCheckValidatorImpl(this);
	}


	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}


	@Check(constraint = "EventChainsConstraint", categories = { "ConstraintsModelConstraint" })
	public void eventChainConstraint(final ConstraintsModel model) {
		this.constraintsModelImpl.eventChainConstraint(model);
	}
}
