/**
 ********************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.ta.checks;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.AmaltheaModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class AmaltheaModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final AmaltheaModelValidatorImpl amaltheaModelValidatorImpl;

	public AmaltheaModelValidator() {
		super();
		this.amaltheaModelValidatorImpl = new AmaltheaModelValidatorImpl(this);
	}

	public AmaltheaModelValidator(final boolean doNothing) {
		this.amaltheaModelValidatorImpl = new AmaltheaModelValidatorImpl(this);
	}

	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "UniqueNameConstraint", categories = { "TAConstraint" })
	public void checkUniqueNameSize(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkUniqueName(amalthea);
	}

	@Check(constraint = "DeviationConstraint", categories = { "TAConstraint" })
	public void checkDeviation(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkDeviation(amalthea);
	}

	@Check(constraint = "UniformDistributionConstraint", categories = { "TAConstraint" })
	public void checkUniformDistribution(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkUniformDistribution(amalthea);
	}
	
	@Check(constraint = "BetaDistributionConstraint", categories = { "TAConstraint" })
	public void checkBetaDistribution(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkBetaDistribution(amalthea);
	}

	@Check(constraint = "GaussDistributionConstraint", categories = { "TAConstraint" })
	public void checkGaussDistribution(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkGaussDistribution(amalthea);
	}

	@Check(constraint = "WeibullParametersConstraint", categories = { "TAConstraint" })
	public void checkWeibullParameters(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkWeibullParameters(amalthea);
	}

	@Check(constraint = "WeibullEstimatorsConstraint", categories = { "TAConstraint" })
	public void checkWeibullEstimators(final Amalthea amalthea) {
		this.amaltheaModelValidatorImpl.checkWeibullEstimators(amalthea);
	}
}
