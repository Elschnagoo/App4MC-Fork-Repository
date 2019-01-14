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
 * A representation of the model object '<em><b>ISR Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getIsr <em>Isr</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getController <em>Controller</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getISRAllocation()
 * @model
 * @generated
 */
public interface ISRAllocation extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Isr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr</em>' reference.
	 * @see #setIsr(ISR)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getISRAllocation_Isr()
	 * @model required="true"
	 * @generated
	 */
	ISR getIsr();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getIsr <em>Isr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isr</em>' reference.
	 * @see #getIsr()
	 * @generated
	 */
	void setIsr(ISR value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(InterruptController)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getISRAllocation_Controller()
	 * @model required="true"
	 * @generated
	 */
	InterruptController getController();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(InterruptController value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getISRAllocation_Priority()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ISRAllocation#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

} // ISRAllocation
