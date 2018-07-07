/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein InterruptType beschreibt einen Interrupt in
 * 				einem OS.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getInterruptType()
 * @model extendedMetaData="name='InterruptType' kind='elementOnly'"
 * @generated
 */
public interface InterruptType extends SchedulableApplicationElementType {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(long)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getInterruptType_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(long)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(long)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(InterruptTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getInterruptType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	InterruptTypeEnum getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(InterruptTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(InterruptTypeEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(InterruptTypeEnum)
	 * @generated
	 */
	boolean isSetType();

} // InterruptType
