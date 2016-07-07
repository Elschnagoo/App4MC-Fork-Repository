/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAddressRangeType()
 * @model extendedMetaData="name='AddressRangeType' kind='empty'"
 * @generated
 */
public interface AddressRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAddressRangeType_EndAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='EndAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAddressRangeType_StartAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='StartAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AddressRangeType#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(BigInteger value);

} // AddressRangeType
