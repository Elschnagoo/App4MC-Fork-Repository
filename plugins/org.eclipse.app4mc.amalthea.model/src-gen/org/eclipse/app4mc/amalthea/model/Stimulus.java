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
package org.eclipse.app4mc.amalthea.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Every process/task can have one or more stimuli.
 * A stimulus activates the process
 * deviationStimulus: defines the deviation of the activation times of the stimulus
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getSetModeValueList <em>Set Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getEnablingModeValueList <em>Enabling Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getDisablingModeValueList <em>Disabling Mode Value List</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Stimulus#getAffectedProcesses <em>Affected Processes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus()
 * @model abstract="true"
 * @generated
 */
public interface Stimulus extends ReferableBaseObject, ITaggable {
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

	/**
	 * Returns the value of the '<em><b>Affected Processes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of affected processes (Process).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected Processes</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getStimulus_AffectedProcesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Process%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getStimulus_AffectedProcesses(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getProcess_Stimuli());'"
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Process> getAffectedProcesses();

} // Stimulus
