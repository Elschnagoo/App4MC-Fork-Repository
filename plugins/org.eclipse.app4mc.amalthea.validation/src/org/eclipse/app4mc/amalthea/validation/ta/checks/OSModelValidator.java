package org.eclipse.app4mc.amalthea.validation.ta.checks;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.OSModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class OSModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final OSModelValidatorImpl osModelValidatorImpl;

	public OSModelValidator() {
		super();
		this.osModelValidatorImpl = new OSModelValidatorImpl(this);
	}

	public OSModelValidator(final boolean doNothing) {
		this.osModelValidatorImpl = new OSModelValidatorImpl(this);
	}

	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "SemaphoreConstraint", categories = { "TAConstraint" })
	public void checkSemaphore(final Amalthea amalthea) {
		this.osModelValidatorImpl.checkSemaphore(amalthea);
	}
	
	@Check(constraint = "SemaphoreReferenceConstraint", categories = { "TAConstraint" })
	public void checkSemaphoreReferences(final Amalthea amalthea) {
		this.osModelValidatorImpl.checkSemaphoreReferences(amalthea);
	}

}
