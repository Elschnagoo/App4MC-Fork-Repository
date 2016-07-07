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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Value Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValueProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModeValueProvider extends IAnnotatable, IReferable {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(Mode)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValueProvider_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' reference.
	 * @see #setInitialValue(ModeLiteral)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValueProvider_InitialValue()
	 * @model
	 * @generated
	 */
	ModeLiteral getInitialValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeValueProvider#getInitialValue <em>Initial Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(ModeLiteral value);

} // ModeValueProvider
