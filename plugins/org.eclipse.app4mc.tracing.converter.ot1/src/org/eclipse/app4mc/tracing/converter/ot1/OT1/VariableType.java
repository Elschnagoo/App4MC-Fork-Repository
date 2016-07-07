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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibt eine Variable oder ein Daten-Symbol.
 * 
 * 				Alle Elemente dieses Typs (und der abgeleiteten Typen) teilen sich
 * 				einen ID-Raum!!
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getVariableType()
 * @model extendedMetaData="name='VariableType' kind='elementOnly'"
 * @generated
 */
public interface VariableType extends DataElementType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definiert die Laenge der Variablen/des Symbols
	 * 							in Bytes
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getVariableType_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='Length' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(BigInteger value);

} // VariableType
