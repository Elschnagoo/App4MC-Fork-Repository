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

package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Strings;

public class TODO_BasicChecks {

	/*
	 * Checks the unique name of all objects that are instances of {@link
	 * IReferable}. The unique name is used to refer to objects in the AMALTHEA
	 * model, therefore duplicates are handled as an error.
	 */
	public void checkDuplicateUniqueNames(final Amalthea model) {
		final Map<String, IReferable> visitedObjects = new HashMap<String, IReferable>();

		for (final IReferable element : getAllInstancesAndInheritedOf(model, IReferable.class)) {

			if (Strings.isNullOrEmpty(element.getName()))
				continue; // empty names are handled separately

			final String id = element.getUniqueName();
			if (visitedObjects.containsKey(id)) {
				final IReferable firstElement = visitedObjects.put(id, null);
				if (firstElement != null) {
					issue(firstElement, AmaltheaPackage.eINSTANCE.getINamed_Name(),
							firstElement.eClass().getName(), firstElement.getName());
				}
				issue(element, AmaltheaPackage.eINSTANCE.getINamed_Name(),
					element.eClass().getName(), element.getName());
			} else {
				visitedObjects.put(id, element);
			}
		}
	}

	/*
	 * Checks the name of all objects that are instances of {@link IReferable}.
	 * The name is used to refer to objects in the AMALTHEA model, therefore
	 * missing names are handled as an error.
	 */
	public void checkReferableNames(final Amalthea model) {

//		for (final IReferable element : getObjectHelper().getAllInstancesAndInheritedOf(model, IReferable.class)) {
//			if (Strings.isNullOrEmpty(element.getName())) {
//				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getINamed_Name(),
//						getObjectHelper().getClassName(element));
//			}
//		}
	}

	/*
	 * Checks the parameters in the {@link Distribution} of type {@link
	 * WeibullEstimators}. The parameters must not be equal to each other, if
	 * this is the case, it will be handled as an error.
	 */
	public void checkWeibullParameters(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents(); // ???? TODO

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
// TODO check if necessary / correct
			if (elem.eClass().getInstanceClass()
					.equals(AmaltheaPackage.eINSTANCE.getDiscreteValueWeibullEstimatorsDistribution().getInstanceClass())) {
				final DiscreteValueWeibullEstimatorsDistribution dev = (DiscreteValueWeibullEstimatorsDistribution) elem;
				final long lowerBoundValue = dev.getLowerBound();
				final long upperBoundValue = dev.getUpperBound();
				final double meanValue = dev.getAverage();

				if (lowerBoundValue == upperBoundValue || lowerBoundValue >= meanValue
						|| upperBoundValue <= meanValue) {
//					this.issueCreator.issue(dev, dev.eContainingFeature(), lowerBoundValue, upperBoundValue);
				}
			}
		}
	}

	private <T> List<T> getAllInstancesAndInheritedOf(final EObject contextObject, final Class<T> type) {
		// dummy to mock old API
		return null;
	}

	private void issue(EObject object, EStructuralFeature feature, Object... messageArguments) {
		// dummy to mock old API
	}

}
