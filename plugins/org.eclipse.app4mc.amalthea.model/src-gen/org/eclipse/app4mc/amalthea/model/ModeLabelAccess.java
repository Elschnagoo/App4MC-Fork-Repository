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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess()
 * @model
 * @generated
 */
public interface ModeLabelAccess extends CallGraphItem {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
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
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum
	 * @see #setAccess(ModeLabelAccessEnum)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess_Access()
	 * @model unique="false"
	 * @generated
	 */
	ModeLabelAccessEnum getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(ModeLabelAccessEnum value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Just used in case that this access writes a value to a Mode-Label.
	 * It can be used to define which mode value is written to the label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Just used in case of increment or decrement.
	 * It can be used to define a step other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLabelAccess_Step()
	 * @model default="1" unique="false" dataType="org.eclipse.app4mc.amalthea.model.PositiveInt"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLabelAccess#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" diagnosticsUnique="false" contextUnique="false"
	 * @generated
	 */
	boolean validateInvariants(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ModeLabelAccess
