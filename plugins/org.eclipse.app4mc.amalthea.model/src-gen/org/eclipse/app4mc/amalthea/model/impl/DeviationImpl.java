/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.SamplingType;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DeviationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DeviationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DeviationImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DeviationImpl#getSamplingType <em>Sampling Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviationImpl<T> extends AmaltheaExtendedEObjectImpl implements Deviation<T> {
	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected T lowerBound;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected T upperBound;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected Distribution<T> distribution;

	/**
	 * The default value of the '{@link #getSamplingType() <em>Sampling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingType()
	 * @generated
	 * @ordered
	 */
	protected static final SamplingType SAMPLING_TYPE_EDEFAULT = SamplingType.DEFAULT;

	/**
	 * The cached value of the '{@link #getSamplingType() <em>Sampling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingType()
	 * @generated
	 * @ordered
	 */
	protected SamplingType samplingType = SAMPLING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDeviation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getLowerBound() {
		if (lowerBound != null && ((EObject)lowerBound).eIsProxy()) {
			InternalEObject oldLowerBound = (InternalEObject)lowerBound;
			lowerBound = (T)eResolveProxy(oldLowerBound);
			if (lowerBound != oldLowerBound) {
				InternalEObject newLowerBound = (InternalEObject)lowerBound;
				NotificationChain msgs = oldLowerBound.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__LOWER_BOUND, null, null);
				if (newLowerBound.eInternalContainer() == null) {
					msgs = newLowerBound.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__LOWER_BOUND, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DEVIATION__LOWER_BOUND, oldLowerBound, lowerBound));
			}
		}
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(T newLowerBound, NotificationChain msgs) {
		T oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(T newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getUpperBound() {
		if (upperBound != null && ((EObject)upperBound).eIsProxy()) {
			InternalEObject oldUpperBound = (InternalEObject)upperBound;
			upperBound = (T)eResolveProxy(oldUpperBound);
			if (upperBound != oldUpperBound) {
				InternalEObject newUpperBound = (InternalEObject)upperBound;
				NotificationChain msgs = oldUpperBound.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__UPPER_BOUND, null, null);
				if (newUpperBound.eInternalContainer() == null) {
					msgs = newUpperBound.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__UPPER_BOUND, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DEVIATION__UPPER_BOUND, oldUpperBound, upperBound));
			}
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(T newUpperBound, NotificationChain msgs) {
		T oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(T newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Distribution<T> getDistribution() {
		if (distribution != null && distribution.eIsProxy()) {
			InternalEObject oldDistribution = (InternalEObject)distribution;
			distribution = (Distribution<T>)eResolveProxy(oldDistribution);
			if (distribution != oldDistribution) {
				InternalEObject newDistribution = (InternalEObject)distribution;
				NotificationChain msgs = oldDistribution.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__DISTRIBUTION, null, null);
				if (newDistribution.eInternalContainer() == null) {
					msgs = newDistribution.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__DISTRIBUTION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DEVIATION__DISTRIBUTION, oldDistribution, distribution));
			}
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution<T> basicGetDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistribution(Distribution<T> newDistribution, NotificationChain msgs) {
		Distribution<T> oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__DISTRIBUTION, oldDistribution, newDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(Distribution<T> newDistribution) {
		if (newDistribution != distribution) {
			NotificationChain msgs = null;
			if (distribution != null)
				msgs = ((InternalEObject)distribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__DISTRIBUTION, null, msgs);
			if (newDistribution != null)
				msgs = ((InternalEObject)newDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION__DISTRIBUTION, null, msgs);
			msgs = basicSetDistribution(newDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__DISTRIBUTION, newDistribution, newDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingType getSamplingType() {
		return samplingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingType(SamplingType newSamplingType) {
		SamplingType oldSamplingType = samplingType;
		samplingType = newSamplingType == null ? SAMPLING_TYPE_EDEFAULT : newSamplingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION__SAMPLING_TYPE, oldSamplingType, samplingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containerNotificationRequired() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.DEVIATION__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
			case AmaltheaPackage.DEVIATION__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
			case AmaltheaPackage.DEVIATION__DISTRIBUTION:
				return basicSetDistribution(null, msgs);
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
			case AmaltheaPackage.DEVIATION__LOWER_BOUND:
				if (resolve) return getLowerBound();
				return basicGetLowerBound();
			case AmaltheaPackage.DEVIATION__UPPER_BOUND:
				if (resolve) return getUpperBound();
				return basicGetUpperBound();
			case AmaltheaPackage.DEVIATION__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
			case AmaltheaPackage.DEVIATION__SAMPLING_TYPE:
				return getSamplingType();
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
			case AmaltheaPackage.DEVIATION__LOWER_BOUND:
				setLowerBound((T)newValue);
				return;
			case AmaltheaPackage.DEVIATION__UPPER_BOUND:
				setUpperBound((T)newValue);
				return;
			case AmaltheaPackage.DEVIATION__DISTRIBUTION:
				setDistribution((Distribution<T>)newValue);
				return;
			case AmaltheaPackage.DEVIATION__SAMPLING_TYPE:
				setSamplingType((SamplingType)newValue);
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
			case AmaltheaPackage.DEVIATION__LOWER_BOUND:
				setLowerBound((T)null);
				return;
			case AmaltheaPackage.DEVIATION__UPPER_BOUND:
				setUpperBound((T)null);
				return;
			case AmaltheaPackage.DEVIATION__DISTRIBUTION:
				setDistribution((Distribution<T>)null);
				return;
			case AmaltheaPackage.DEVIATION__SAMPLING_TYPE:
				setSamplingType(SAMPLING_TYPE_EDEFAULT);
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
			case AmaltheaPackage.DEVIATION__LOWER_BOUND:
				return lowerBound != null;
			case AmaltheaPackage.DEVIATION__UPPER_BOUND:
				return upperBound != null;
			case AmaltheaPackage.DEVIATION__DISTRIBUTION:
				return distribution != null;
			case AmaltheaPackage.DEVIATION__SAMPLING_TYPE:
				return samplingType != SAMPLING_TYPE_EDEFAULT;
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
			case AmaltheaPackage.DEVIATION___CONTAINER_NOTIFICATION_REQUIRED:
				return containerNotificationRequired();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (samplingType: ");
		result.append(samplingType);
		result.append(')');
		return result.toString();
	}

} //DeviationImpl
