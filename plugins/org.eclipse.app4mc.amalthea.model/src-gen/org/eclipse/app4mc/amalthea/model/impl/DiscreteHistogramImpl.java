/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DiscreteHistogram;
import org.eclipse.app4mc.amalthea.model.DiscreteHistogramEntry;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.DoubleExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DiscreteHistogramImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteHistogramImpl extends AmaltheaExtendedEObjectImpl implements DiscreteHistogram {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteHistogramEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteHistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDiscreteHistogram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteHistogramEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<DiscreteHistogramEntry>(DiscreteHistogramEntry.class, this, AmaltheaPackage.DISCRETE_HISTOGRAM__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLowerBound() {
		final Function1<DiscreteHistogramEntry, Long> _function = new Function1<DiscreteHistogramEntry, Long>() {
			public Long apply(final DiscreteHistogramEntry it) {
				return it.getInterval().getLowerBound();
			}
		};
		return IterableExtensions.<Long>min(XcoreEListExtensions.<DiscreteHistogramEntry, Long>map(this.getEntries(), _function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getUpperBound() {
		final Function1<DiscreteHistogramEntry, Long> _function = new Function1<DiscreteHistogramEntry, Long>() {
			public Long apply(final DiscreteHistogramEntry it) {
				return it.getInterval().getUpperBound();
			}
		};
		return IterableExtensions.<Long>max(XcoreEListExtensions.<DiscreteHistogramEntry, Long>map(this.getEntries(), _function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverage() {
		double _xblockexpression = (double) 0;
		{
			final Function1<DiscreteHistogramEntry, Double> _function = new Function1<DiscreteHistogramEntry, Double>() {
				public Double apply(final DiscreteHistogramEntry it) {
					double _average = it.getInterval().getAverage();
					long _occurrences = it.getOccurrences();
					return Double.valueOf((_average * _occurrences));
				}
			};
			final Function2<Double, Double, Double> _function_1 = new Function2<Double, Double, Double>() {
				public Double apply(final Double p1, final Double p2) {
					return Double.valueOf(DoubleExtensions.operator_plus(p1, p2));
				}
			};
			final Double sum = IterableExtensions.<Double>reduce(XcoreEListExtensions.<DiscreteHistogramEntry, Double>map(this.getEntries(), _function), _function_1);
			final Function1<DiscreteHistogramEntry, Long> _function_2 = new Function1<DiscreteHistogramEntry, Long>() {
				public Long apply(final DiscreteHistogramEntry it) {
					return Long.valueOf(it.getOccurrences());
				}
			};
			final Function2<Long, Long, Long> _function_3 = new Function2<Long, Long, Long>() {
				public Long apply(final Long p1, final Long p2) {
					return Long.valueOf(((p1).longValue() + (p2).longValue()));
				}
			};
			final Long count = IterableExtensions.<Long>reduce(XcoreEListExtensions.<DiscreteHistogramEntry, Long>map(this.getEntries(), _function_2), _function_3);
			_xblockexpression = DoubleExtensions.operator_divide(sum, count);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.DISCRETE_HISTOGRAM__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.DISCRETE_HISTOGRAM__ENTRIES:
				return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.DISCRETE_HISTOGRAM__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends DiscreteHistogramEntry>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.DISCRETE_HISTOGRAM__ENTRIES:
				getEntries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.DISCRETE_HISTOGRAM__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.DISCRETE_HISTOGRAM___GET_LOWER_BOUND:
				return getLowerBound();
			case AmaltheaPackage.DISCRETE_HISTOGRAM___GET_UPPER_BOUND:
				return getUpperBound();
			case AmaltheaPackage.DISCRETE_HISTOGRAM___GET_AVERAGE:
				return getAverage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscreteHistogramImpl
