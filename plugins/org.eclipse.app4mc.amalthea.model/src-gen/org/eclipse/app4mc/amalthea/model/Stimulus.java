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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Every process/task can have one or more stimuli
 * A stimulus activates the process
 * deviationStimulus: defines the deviation of the activation times of the stimulus
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getStimulusDeviation <em>Stimulus Deviation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getSetModeValueList <em>Set Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getEnablingModeValueList <em>Enabling Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getDisablingModeValueList <em>Disabling Mode Value List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus()
 * @model abstract="true"
 * @generated
 */
public interface Stimulus extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Stimulus Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus Deviation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus Deviation</em>' containment reference.
	 * @see #setStimulusDeviation(Deviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus_StimulusDeviation()
	 * @model containment="true"
	 * @generated
	 */
	Deviation<Time> getStimulusDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getStimulusDeviation <em>Stimulus Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus Deviation</em>' containment reference.
	 * @see #getStimulusDeviation()
	 * @generated
	 */
	void setStimulusDeviation(Deviation<Time> value);

	/**
	 * Returns the value of the '<em><b>Set Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Mode Value List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Mode Value List</em>' containment reference.
	 * @see #setSetModeValueList(ModeValueList)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus_SetModeValueList()
	 * @model containment="true"
	 * @generated
	 */
	ModeValueList getSetModeValueList();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getSetModeValueList <em>Set Mode Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Mode Value List</em>' containment reference.
	 * @see #getSetModeValueList()
	 * @generated
	 */
	void setSetModeValueList(ModeValueList value);

	/**
	 * Returns the value of the '<em><b>Enabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabling Mode Value List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabling Mode Value List</em>' containment reference.
	 * @see #setEnablingModeValueList(ModeValueDisjunction)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus_EnablingModeValueList()
	 * @model containment="true"
	 * @generated
	 */
	ModeValueDisjunction getEnablingModeValueList();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getEnablingModeValueList <em>Enabling Mode Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabling Mode Value List</em>' containment reference.
	 * @see #getEnablingModeValueList()
	 * @generated
	 */
	void setEnablingModeValueList(ModeValueDisjunction value);

	/**
	 * Returns the value of the '<em><b>Disabling Mode Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabling Mode Value List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabling Mode Value List</em>' containment reference.
	 * @see #setDisablingModeValueList(ModeValueDisjunction)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus_DisablingModeValueList()
	 * @model containment="true"
	 * @generated
	 */
	ModeValueDisjunction getDisablingModeValueList();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Stimulus#getDisablingModeValueList <em>Disabling Mode Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabling Mode Value List</em>' containment reference.
	 * @see #getDisablingModeValueList()
	 * @generated
	 */
	void setDisablingModeValueList(ModeValueDisjunction value);

} // Stimulus
