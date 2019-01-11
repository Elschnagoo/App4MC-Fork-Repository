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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.IContinuousValueDeviation;
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateActivationImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateActivationImpl#getOccurrencesPerStep <em>Occurrences Per Step</em>}</li>
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
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Time step;

	/**
	 * The cached value of the '{@link #getOccurrencesPerStep() <em>Occurrences Per Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencesPerStep()
	 * @generated
	 * @ordered
	 */
	protected IContinuousValueDeviation occurrencesPerStep;

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
	public Time getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Time newStep, NotificationChain msgs) {
		Time oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP, oldStep, newStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Time newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContinuousValueDeviation getOccurrencesPerStep() {
		return occurrencesPerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencesPerStep(IContinuousValueDeviation newOccurrencesPerStep, NotificationChain msgs) {
		IContinuousValueDeviation oldOccurrencesPerStep = occurrencesPerStep;
		occurrencesPerStep = newOccurrencesPerStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP, oldOccurrencesPerStep, newOccurrencesPerStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencesPerStep(IContinuousValueDeviation newOccurrencesPerStep) {
		if (newOccurrencesPerStep != occurrencesPerStep) {
			NotificationChain msgs = null;
			if (occurrencesPerStep != null)
				msgs = ((InternalEObject)occurrencesPerStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP, null, msgs);
			if (newOccurrencesPerStep != null)
				msgs = ((InternalEObject)newOccurrencesPerStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP, null, msgs);
			msgs = basicSetOccurrencesPerStep(newOccurrencesPerStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP, newOccurrencesPerStep, newOccurrencesPerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP:
				return basicSetStep(null, msgs);
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP:
				return basicSetOccurrencesPerStep(null, msgs);
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP:
				return getStep();
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP:
				return getOccurrencesPerStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP:
				setStep((Time)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP:
				setOccurrencesPerStep((IContinuousValueDeviation)newValue);
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP:
				setStep((Time)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP:
				setOccurrencesPerStep((IContinuousValueDeviation)null);
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
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__STEP:
				return step != null;
			case AmaltheaPackage.VARIABLE_RATE_ACTIVATION__OCCURRENCES_PER_STEP:
				return occurrencesPerStep != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //VariableRateActivationImpl
