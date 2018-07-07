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


	@Check(constraint = "EventChain", categories = { "ConstraintsModel" })
	public void checkEventChains(final ConstraintsModel model) {
		this.constraintsModelImpl.checkEventChains(model);
	}
}
