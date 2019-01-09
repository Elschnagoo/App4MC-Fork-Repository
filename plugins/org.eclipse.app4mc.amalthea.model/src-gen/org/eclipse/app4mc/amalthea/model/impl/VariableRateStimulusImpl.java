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
import org.eclipse.app4mc.amalthea.model.IContinuousDeviation;
import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Rate Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getOccurrencesPerStep <em>Occurrences Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getMaxIncreasePerStep <em>Max Increase Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getMaxDecreasePerStep <em>Max Decrease Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.VariableRateStimulusImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableRateStimulusImpl extends StimulusImpl implements VariableRateStimulus {
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
	protected IContinuousDeviation occurrencesPerStep;

	/**
	 * The default value of the '{@link #getMaxIncreasePerStep() <em>Max Increase Per Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIncreasePerStep()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_INCREASE_PER_STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxIncreasePerStep() <em>Max Increase Per Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIncreasePerStep()
	 * @generated
	 * @ordered
	 */
	protected Double maxIncreasePerStep = MAX_INCREASE_PER_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDecreasePerStep() <em>Max Decrease Per Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDecreasePerStep()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_DECREASE_PER_STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDecreasePerStep() <em>Max Decrease Per Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDecreasePerStep()
	 * @generated
	 * @ordered
	 */
	protected Double maxDecreasePerStep = MAX_DECREASE_PER_STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRateStimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getVariableRateStimulus();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, oldStep, newStep);
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
				msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, null, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, null, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContinuousDeviation getOccurrencesPerStep() {
		return occurrencesPerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencesPerStep(IContinuousDeviation newOccurrencesPerStep, NotificationChain msgs) {
		IContinuousDeviation oldOccurrencesPerStep = occurrencesPerStep;
		occurrencesPerStep = newOccurrencesPerStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, oldOccurrencesPerStep, newOccurrencesPerStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencesPerStep(IContinuousDeviation newOccurrencesPerStep) {
		if (newOccurrencesPerStep != occurrencesPerStep) {
			NotificationChain msgs = null;
			if (occurrencesPerStep != null)
				msgs = ((InternalEObject)occurrencesPerStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, null, msgs);
			if (newOccurrencesPerStep != null)
				msgs = ((InternalEObject)newOccurrencesPerStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, null, msgs);
			msgs = basicSetOccurrencesPerStep(newOccurrencesPerStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP, newOccurrencesPerStep, newOccurrencesPerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxIncreasePerStep() {
		return maxIncreasePerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIncreasePerStep(Double newMaxIncreasePerStep) {
		Double oldMaxIncreasePerStep = maxIncreasePerStep;
		maxIncreasePerStep = newMaxIncreasePerStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP, oldMaxIncreasePerStep, maxIncreasePerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxDecreasePerStep() {
		return maxDecreasePerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDecreasePerStep(Double newMaxDecreasePerStep) {
		Double oldMaxDecreasePerStep = maxDecreasePerStep;
		maxDecreasePerStep = newMaxDecreasePerStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP, oldMaxDecreasePerStep, maxDecreasePerStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				return basicSetStep(null, msgs);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				return basicSetOccurrencesPerStep(null, msgs);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO:
				return basicSetScenario(null, msgs);
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				return getStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				return getOccurrencesPerStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				return getMaxIncreasePerStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				return getMaxDecreasePerStep();
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO:
				return getScenario();
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				setStep((Time)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				setOccurrencesPerStep((IContinuousDeviation)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				setMaxIncreasePerStep((Double)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				setMaxDecreasePerStep((Double)newValue);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO:
				setScenario((Scenario)newValue);
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				setStep((Time)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				setOccurrencesPerStep((IContinuousDeviation)null);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				setMaxIncreasePerStep(MAX_INCREASE_PER_STEP_EDEFAULT);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				setMaxDecreasePerStep(MAX_DECREASE_PER_STEP_EDEFAULT);
				return;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO:
				setScenario((Scenario)null);
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
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__STEP:
				return step != null;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__OCCURRENCES_PER_STEP:
				return occurrencesPerStep != null;
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_INCREASE_PER_STEP:
				return MAX_INCREASE_PER_STEP_EDEFAULT == null ? maxIncreasePerStep != null : !MAX_INCREASE_PER_STEP_EDEFAULT.equals(maxIncreasePerStep);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__MAX_DECREASE_PER_STEP:
				return MAX_DECREASE_PER_STEP_EDEFAULT == null ? maxDecreasePerStep != null : !MAX_DECREASE_PER_STEP_EDEFAULT.equals(maxDecreasePerStep);
			case AmaltheaPackage.VARIABLE_RATE_STIMULUS__SCENARIO:
				return scenario != null;
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
		result.append(" (maxIncreasePerStep: ");
		result.append(maxIncreasePerStep);
		result.append(", maxDecreasePerStep: ");
		result.append(maxDecreasePerStep);
		result.append(')');
		return result.toString();
	}

} //VariableRateStimulusImpl
