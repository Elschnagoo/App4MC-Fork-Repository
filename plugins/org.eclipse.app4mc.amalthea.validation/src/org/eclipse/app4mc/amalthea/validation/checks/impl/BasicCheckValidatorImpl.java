/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Strings;

public class BasicCheckValidatorImpl extends AbstractValidatorImpl {

	public BasicCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public BasicCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}


	/*
	 * Checks the unique name of all objects that are instances of {@link IReferable}. The unique name is used to refer
	 * to objects in the AMALTHEA model, therefore duplicates are handled as an error.
	 */
	public void checkDuplicateUniqueNames(final Amalthea model) {
		final Map<String, IReferable> visitedObjects = new HashMap<String, IReferable>();

		for (final IReferable element : getObjectHelper().getAllInstancesAndInheritedOf(model, IReferable.class)) {
			
			if (Strings.isNullOrEmpty(element.getName())) continue; // empty names are handled separately
			
			final String id = element.getUniqueName();
			if (visitedObjects.containsKey(id)) {
				final IReferable firstElement = visitedObjects.put(id, null);
				if (firstElement != null) {
					this.issueCreator.issue(
							firstElement,
							AmaltheaPackage.eINSTANCE.getIReferable_Name(),
							firstElement.eClass().getName(),
							firstElement.getName() );
				}
				this.issueCreator.issue(
						element,
						AmaltheaPackage.eINSTANCE.getIReferable_Name(),
						element.eClass().getName(),
						element.getName() );
			}
			else {
				visitedObjects.put(id, element);
			}
		}
	}


	/*
	 * Checks the name of all objects that are instances of {@link IReferable}. The name is used to refer
	 * to objects in the AMALTHEA model, therefore missing names are handled as an error.
	 */
	public void checkReferableNames(final Amalthea model) {
		
		for (final IReferable element : getObjectHelper().getAllInstancesAndInheritedOf(model, IReferable.class)) {
			if (Strings.isNullOrEmpty(element.getName())) {
				this.issueCreator.issue(
						element,
						AmaltheaPackage.eINSTANCE.getIReferable_Name(),
						getObjectHelper().getClassName(element) );
			}
		}
	}
	

	/*
	 * Checks all objects that are instances of {@link IAnnotatable}. If custom properties are defined, all keys will be
	 * checked if there is a duplicate key entry, which will be handled as a warning.
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
						this.issueCreator.issue(
								element,
								AmaltheaPackage.eINSTANCE.getCustomProperty_Key(),
								getObjectHelper().getClassName(element),
								getObjectHelper().getName(element),
								key );
						// mark key as duplicate that already has been reported
						visitedKeys.put(key, false);
					}
				}
				else {
					// first entry
					visitedKeys.put(key, true);
				}
			}
		}
	}


	/*
	 * Checks all units: {@link TimeUnit}, {@link FrequencyUnit}, {@link DataSizeUnit}, {@link DataRateUnit}.
	 * If the unit is undefined, it will be handled as an error.
	 */
	public void checkUnits(final Amalthea model) {
		
		// AbstractTime -> TimeUnit
		for (final AbstractTime element : getObjectHelper().getAllInstancesAndInheritedOf(model, AbstractTime.class)) {
			if (element.getUnit() == TimeUnit._UNDEFINED_) {
				this.issueCreator.issue(
						element,
						AmaltheaPackage.eINSTANCE.getAbstractTime_Unit(),
						getObjectHelper().getClassName(element),
						getObjectHelper().getName(element.eContainer()) );
			}
		}
		
		// Frequency -> FrequencyUnit
		for (final Frequency element : getObjectHelper().getAllInstancesOf(model, Frequency.class)) {
			if (element.getUnit() == FrequencyUnit._UNDEFINED_) {
				this.issueCreator.issue(
						element,
						AmaltheaPackage.eINSTANCE.getFrequency_Unit(),
						getObjectHelper().getClassName(element),
						getObjectHelper().getName(element.eContainer()) );
			}
		}
		
		// DataSize -> DataSizeUnit
		for (final DataSize element : getObjectHelper().getAllInstancesOf(model, DataSize.class)) {
			if (element.getUnit() == DataSizeUnit._UNDEFINED_) {
				this.issueCreator.issue(
						element,
						AmaltheaPackage.eINSTANCE.getDataSize_Unit(),
						getObjectHelper().getClassName(element),
						getObjectHelper().getName(element.eContainer()) );
			}
		}

		// DataRate -> DataRateUnit
		for (final DataRate element : getObjectHelper().getAllInstancesOf(model, DataRate.class)) {
			if (element.getUnit() == DataRateUnit._UNDEFINED_) {
				this.issueCreator.issue(
						element,
						AmaltheaPackage.eINSTANCE.getDataRate_Unit(),
						getObjectHelper().getClassName(element),
						getObjectHelper().getName(element.eContainer()) );
			}
		}

	}


	/*
	 * Checks the parameters in the {@link Distribution} of type {@link WeibullEstimators}. The parameters must not be
	 * equal to each other, if this is the case, it will be handled as an error.
	 */
	public void checkWeibullParameters(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();

			if (elem.eClass().getInstanceClass().equals(AmaltheaPackage.eINSTANCE.getDeviation().getInstanceClass())) {
				final Deviation<LongObject> dev = (Deviation<LongObject>) elem;
				if (null != dev.getDistribution() && dev.getDistribution().eClass().getInstanceClass()
						.equals(AmaltheaPackage.eINSTANCE.getWeibullEstimators().getInstanceClass())) {
					final long lowerBoundValue = dev.getLowerBound().getValue();
					final long upperBoundValue = dev.getUpperBound().getValue();
					final long meanValue = ((WeibullEstimators<LongObject>) dev.getDistribution()).getMean().getValue();

					if (lowerBoundValue == upperBoundValue || lowerBoundValue == meanValue
							|| upperBoundValue == meanValue) {
						this.issueCreator.issue(
								dev,
								AmaltheaPackage.eINSTANCE.getDeviation_Distribution(),
								lowerBoundValue,
								upperBoundValue );
					}
				}
			}
		}
	}

}
