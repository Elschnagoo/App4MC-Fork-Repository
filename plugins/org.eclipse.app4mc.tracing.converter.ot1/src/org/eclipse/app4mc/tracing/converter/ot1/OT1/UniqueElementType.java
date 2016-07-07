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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basis-Type für alle global eindeutigen Elemente
 * 				über OT1-Konfigurationen hinweg.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getUniqueElementType()
 * @model extendedMetaData="name='UniqueElementType' kind='elementOnly'"
 * @generated
 */
public interface UniqueElementType extends ElementType {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #setUuid(long)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getUniqueElementType_Uuid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid' namespace='##targetNamespace'"
	 * @generated
	 */
	long getUuid();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUuid()
	 * @see #getUuid()
	 * @see #setUuid(long)
	 * @generated
	 */
	void unsetUuid();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.UniqueElementType#getUuid <em>Uuid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uuid</em>' attribute is set.
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @see #setUuid(long)
	 * @generated
	 */
	boolean isSetUuid();

} // UniqueElementType
