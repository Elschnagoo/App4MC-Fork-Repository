/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.VariableRateActivation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Rate Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateActivationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateActivationImpl#getActivationDeviation <em>Activation Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableRateActivationImpl extends ActivationImpl implements VariableRateActivation {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivationDeviation() <em>Activation Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationDeviation()
	 * @generated
	 * @ordered
	 */
	protected Deviation<Time> activationDeviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRateActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getVariableRateActivation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation<Time> getActivationDeviation() {
		return activationDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationDeviation(Deviation<Time> newActivationDeviation, NotificationChain msgs) {
		Deviation<Time> oldActivationDeviation = activationDeviation;
		activationDeviation = newActivationDeviation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION, oldActivationDeviation, newActivationDeviation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationDeviation(Deviation<Time> newActivationDeviation) {
		if (newActivationDeviation != activationDeviation) {
			NotificationChain msgs = null;
			if (activationDeviation != null)
				msgs = ((InternalEObject)activationDeviation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION, null, msgs);
			if (newActivationDeviation != null)
				msgs = ((InternalEObject)newActivationDeviation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION, null, msgs);
			msgs = basicSetActivationDeviation(newActivationDeviation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION, newActivationDeviation, newActivationDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION:
				return basicSetActivationDeviation(null, msgs);
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__DESCRIPTION:
				return getDescription();
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION:
				return getActivationDeviation();
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION:
				setActivationDeviation((Deviation<Time>)newValue);
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION:
				setActivationDeviation((Deviation<Time>)null);
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__ACTIVATION_DEVIATION:
				return activationDeviation != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //VariableRateActivationImpl
