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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_MULTIPLIER_LIST_ENTRY__TIME;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_SINUS_FUNCTION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_SINUS_FUNCTION__PERIOD;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.CLOCK_TRIANGLE_FUNCTION__PERIOD;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__MAX;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__MIN;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__OFFSET;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_ACTIVATION__RECURRENCE;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_STIMULUS;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_STIMULUS__OFFSET;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.PERIODIC_STIMULUS__RECURRENCE;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.RUNNABLE;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.RUNNABLE__DEADLINE;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.SINGLE_ACTIVATION;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.SINGLE_ACTIVATION__MAX;
import static org.eclipse.app4mc.amalthea.model.AmaltheaPackage.SINGLE_ACTIVATION__MIN;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Strings;

public class BasicCheckValidatorImpl extends AbstractValidatorImpl {

	public BasicCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public BasicCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks the unique name of all objects that are instances of {@link
	 * IReferable}. The unique name is used to refer to objects in the AMALTHEA
	 * model, therefore duplicates are handled as an error.
	 */
	public void checkDuplicateUniqueNames(final Amalthea model) {
		final Map<String, IReferable> visitedObjects = new HashMap<String, IReferable>();

		for (final IReferable element : getObjectHelper().getAllInstancesAndInheritedOf(model, IReferable.class)) {

			if (Strings.isNullOrEmpty(element.getName()))
				continue; // empty names are handled separately

			final String id = element.getUniqueName();
			if (visitedObjects.containsKey(id)) {
				final IReferable firstElement = visitedObjects.put(id, null);
				if (firstElement != null) {
					this.issueCreator.issue(firstElement, AmaltheaPackage.eINSTANCE.getINamed_Name(),
							firstElement.eClass().getName(), firstElement.getName());
				}
				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getINamed_Name(),
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

		for (final IReferable element : getObjectHelper().getAllInstancesAndInheritedOf(model, IReferable.class)) {
			if (Strings.isNullOrEmpty(element.getName())) {
				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getINamed_Name(),
						getObjectHelper().getClassName(element));
			}
		}
	}

	/*
	 * Checks all objects that are instances of {@link IAnnotatable}. If custom
	 * properties are defined, all keys will be checked if there is a duplicate
	 * key entry, which will be handled as a warning.
	 */
	public void checkForCustomPropertyDuplicateKey(final Amalthea model) {
		// Map of key -> isFirst
		final Map<String, Boolean> visitedKeys = new HashMap<String, Boolean>();

		for (final IAnnotatable element : getObjectHelper().getAllInstancesAndInheritedOf(model, IAnnotatable.class)) {
			visitedKeys.clear();
			for (final Entry<String, Value> entry : element.getCustomProperties().entrySet()) {
				final String key = entry.getKey();
				if (visitedKeys.containsKey(key)) {
					if (visitedKeys.get(key)) {
						// second entry: report duplicate
						this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getCustomProperty_Key(),
								getObjectHelper().getClassName(element), getObjectHelper().getName(element), key);
						// mark key as duplicate that already has been reported
						visitedKeys.put(key, false);
					}
				} else {
					// first entry
					visitedKeys.put(key, true);
				}
			}
		}
	}

	/*
	 * Checks all units: {@link TimeUnit}, {@link FrequencyUnit}, {@link
	 * DataSizeUnit}, {@link DataRateUnit}. If the unit is undefined, it will be
	 * handled as an error.
	 */
	public void checkUnits(final Amalthea model) {

		// Time -> TimeUnit
		for (final Time element : getObjectHelper().getAllInstancesAndInheritedOf(model, Time.class)) {
			if (element.getUnit() == TimeUnit._UNDEFINED_) {
				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getTime_Unit(),
						getObjectHelper().getClassName(element), getObjectHelper().getName(element.eContainer()));
			}
		}

		// Frequency -> FrequencyUnit
		for (final Frequency element : getObjectHelper().getAllInstancesOf(model, Frequency.class)) {
			if (element.getUnit() == FrequencyUnit._UNDEFINED_) {
				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getFrequency_Unit(),
						getObjectHelper().getClassName(element), getObjectHelper().getName(element.eContainer()));
			}
		}

		// DataSize -> DataSizeUnit
		for (final DataSize element : getObjectHelper().getAllInstancesOf(model, DataSize.class)) {
			if (element.getUnit() == DataSizeUnit._UNDEFINED_) {
				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getDataSize_Unit(),
						getObjectHelper().getClassName(element), getObjectHelper().getName(element.eContainer()));
			}
		}

		// DataRate -> DataRateUnit
		for (final DataRate element : getObjectHelper().getAllInstancesOf(model, DataRate.class)) {
			if (element.getUnit() == DataRateUnit._UNDEFINED_) {
				this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getDataRate_Unit(),
						getObjectHelper().getClassName(element), getObjectHelper().getName(element.eContainer()));
			}
		}

	}

	/*
	 * Checks all Time ranges. Possible check conditions are >0 or >=0. If the
	 * evaluation of the condition returns false, it will be handled as an
	 * error.
	 */
	public void checkTimeRanges(final Amalthea model) {
		boolean found;
		
		for (final Time element : getObjectHelper().getAllInstancesOf(model, Time.class)) {
			if (element.getValue().signum() > 0)
				continue; // always valid

			final EStructuralFeature eFeature = element.eContainingFeature();
			if (eFeature == null)
				continue;

			final EClass eClass = eFeature.getEContainingClass();
			if (eClass == null)
				continue;
			
			final int classID = eClass.getClassifierID();
			final int featureID = eFeature.getFeatureID();
			
			//*** the value of the following elements should be > 0
			
			if (element.getValue().signum() <= 0) {
				found = false;
				if (!found) found = (classID == PERIODIC_STIMULUS && featureID == PERIODIC_STIMULUS__RECURRENCE);
				if (!found) found = (classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__RECURRENCE);
				if (!found) found = (classID == CLOCK_SINUS_FUNCTION && featureID == CLOCK_SINUS_FUNCTION__PERIOD);
				if (!found) found = (classID == CLOCK_TRIANGLE_FUNCTION && featureID == CLOCK_TRIANGLE_FUNCTION__PERIOD);
				if (!found) found = (classID == CLOCK_MULTIPLIER_LIST_ENTRY && featureID == CLOCK_MULTIPLIER_LIST_ENTRY__TIME);
				
				if (found) {
					this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getTime_Value(),
							eClass.getName(), getObjectHelper().getName(element.eContainer()),
							eFeature.getName(), "greater than zero");
				}
			} 

			//*** the value of the following elements should be >= 0
			
			if (element.getValue().signum() < 0) {
				found = false;
				if (!found) found = (classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__OFFSET);
				if (!found) found = (classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__MIN);
				if (!found) found = (classID == PERIODIC_ACTIVATION && featureID == PERIODIC_ACTIVATION__MAX);
				if (!found) found = (classID == SINGLE_ACTIVATION && featureID == SINGLE_ACTIVATION__MIN);
				if (!found) found = (classID == SINGLE_ACTIVATION && featureID == SINGLE_ACTIVATION__MAX);
				if (!found) found = (classID == RUNNABLE && featureID == RUNNABLE__DEADLINE);
				if (!found) found = (classID == PERIODIC_STIMULUS && featureID == PERIODIC_STIMULUS__OFFSET);
				
				if (found) {
					this.issueCreator.issue(element, AmaltheaPackage.eINSTANCE.getTime_Value(),
							eClass.getName(), getObjectHelper().getName(element.eContainer()),
							eFeature.getName(), "positive or zero");
				}
			}
		}
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
					this.issueCreator.issue(dev, dev.eContainingFeature(), lowerBoundValue, upperBoundValue);
				}
			}
		}
	}

}
