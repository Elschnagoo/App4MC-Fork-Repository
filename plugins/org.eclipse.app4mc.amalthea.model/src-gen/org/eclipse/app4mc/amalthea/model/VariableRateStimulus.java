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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Rate Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Periodic stimulus based on other events, like rotation speed
 * clock: Time base which defines deviation of time, multiple stimuli can have the same time base
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getOccurrencesPerStep <em>Occurrences Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getMaxIncreasePerStep <em>Max Increase Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getMaxDecreasePerStep <em>Max Decrease Per Step</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVariableRateStimulus()
 * @model
 * @generated
 */
public interface VariableRateStimulus extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVariableRateStimulus_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getStep();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Time value);

	/**
	 * Returns the value of the '<em><b>Occurrences Per Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences Per Step</em>' containment reference.
	 * @see #setOccurrencesPerStep(IContinuousValueDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVariableRateStimulus_OccurrencesPerStep()
	 * @model containment="true"
	 * @generated
	 */
	IContinuousValueDeviation getOccurrencesPerStep();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getOccurrencesPerStep <em>Occurrences Per Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences Per Step</em>' containment reference.
	 * @see #getOccurrencesPerStep()
	 * @generated
	 */
	void setOccurrencesPerStep(IContinuousValueDeviation value);

	/**
	 * Returns the value of the '<em><b>Max Increase Per Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Increase Per Step</em>' attribute.
	 * @see #setMaxIncreasePerStep(Double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVariableRateStimulus_MaxIncreasePerStep()
	 * @model unique="false"
	 * @generated
	 */
	Double getMaxIncreasePerStep();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getMaxIncreasePerStep <em>Max Increase Per Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Increase Per Step</em>' attribute.
	 * @see #getMaxIncreasePerStep()
	 * @generated
	 */
	void setMaxIncreasePerStep(Double value);

	/**
	 * Returns the value of the '<em><b>Max Decrease Per Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Decrease Per Step</em>' attribute.
	 * @see #setMaxDecreasePerStep(Double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVariableRateStimulus_MaxDecreasePerStep()
	 * @model unique="false"
	 * @generated
	 */
	Double getMaxDecreasePerStep();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getMaxDecreasePerStep <em>Max Decrease Per Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Decrease Per Step</em>' attribute.
	 * @see #getMaxDecreasePerStep()
	 * @generated
	 */
	void setMaxDecreasePerStep(Double value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(Scenario)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVariableRateStimulus_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.VariableRateStimulus#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

} // VariableRateStimulus
