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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Label Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of a mode label access of a run entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getModeValue <em>Mode Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess()
 * @model
 * @generated
 */
public interface ModeLabelAccess extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(ModeLabel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess_Data()
	 * @model required="true"
	 * @generated
	 */
	ModeLabel getData();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(ModeLabel value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LabelAccessEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessEnum
	 * @see #setAccess(LabelAccessEnum)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess_Access()
	 * @model unique="false"
	 * @generated
	 */
	LabelAccessEnum getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessEnum
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(LabelAccessEnum value);

	/**
	 * Returns the value of the '<em><b>Mode Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Just used in case that this access writes a value to a Mode-Label.
	 * It can be used to define which mode value is written to the label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode Value</em>' reference.
	 * @see #setModeValue(ModeLiteral)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess_ModeValue()
	 * @model
	 * @generated
	 */
	ModeLiteral getModeValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getModeValue <em>Mode Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Value</em>' reference.
	 * @see #getModeValue()
	 * @generated
	 */
	void setModeValue(ModeLiteral value);

} // ModeLabelAccess
