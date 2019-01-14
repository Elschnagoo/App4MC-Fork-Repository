/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeHistogram;
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TimeHistogramImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeHistogramImpl extends AmaltheaExtendedEObjectImpl implements TimeHistogram {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeHistogramEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeHistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTimeHistogram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeHistogramEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<TimeHistogramEntry>(TimeHistogramEntry.class, this, AmaltheaPackage.TIME_HISTOGRAM__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getLowerBound() {
		final Function1<TimeHistogramEntry, Time> _function = new Function1<TimeHistogramEntry, Time>() {
			public Time apply(final TimeHistogramEntry it) {
				return it.getLowerBound();
			}
		};
		return IterableExtensions.<Time>min(XcoreEListExtensions.<TimeHistogramEntry, Time>map(this.getEntries(), _function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getUpperBound() {
		final Function1<TimeHistogramEntry, Time> _function = new Function1<TimeHistogramEntry, Time>() {
			public Time apply(final TimeHistogramEntry it) {
				return it.getUpperBound();
			}
		};
		return IterableExtensions.<Time>max(XcoreEListExtensions.<TimeHistogramEntry, Time>map(this.getEntries(), _function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getAverage() {
		Time _xblockexpression = null;
		{
			final Function1<TimeHistogramEntry, Time> _function = new Function1<TimeHistogramEntry, Time>() {
				public Time apply(final TimeHistogramEntry it) {
					return it.getAverage().multiply(it.getOccurrences());
				}
			};
			final Function2<Time, Time, Time> _function_1 = new Function2<Time, Time, Time>() {
				public Time apply(final Time p1, final Time p2) {
					return p1.add(p2);
				}
			};
			final Time sum = IterableExtensions.<Time>reduce(XcoreEListExtensions.<TimeHistogramEntry, Time>map(this.getEntries(), _function), _function_1);
			final Function1<TimeHistogramEntry, Long> _function_2 = new Function1<TimeHistogramEntry, Long>() {
				public Long apply(final TimeHistogramEntry it) {
					return Long.valueOf(it.getOccurrences());
				}
			};
			final Function2<Long, Long, Long> _function_3 = new Function2<Long, Long, Long>() {
				public Long apply(final Long p1, final Long p2) {
					return Long.valueOf(((p1).longValue() + (p2).longValue()));
				}
			};
			final Long count = IterableExtensions.<Long>reduce(XcoreEListExtensions.<TimeHistogramEntry, Long>map(this.getEntries(), _function_2), _function_3);
			_xblockexpression = sum.multiply((1.0 / (count).longValue()));
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
			case AmaltheaPackage.TIME_HISTOGRAM__ENTRIES:
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
			case AmaltheaPackage.TIME_HISTOGRAM__ENTRIES:
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
			case AmaltheaPackage.TIME_HISTOGRAM__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends TimeHistogramEntry>)newValue);
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
			case AmaltheaPackage.TIME_HISTOGRAM__ENTRIES:
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
			case AmaltheaPackage.TIME_HISTOGRAM__ENTRIES:
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
			case AmaltheaPackage.TIME_HISTOGRAM___GET_LOWER_BOUND:
				return getLowerBound();
			case AmaltheaPackage.TIME_HISTOGRAM___GET_UPPER_BOUND:
				return getUpperBound();
			case AmaltheaPackage.TIME_HISTOGRAM___GET_AVERAGE:
				return getAverage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimeHistogramImpl
