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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getEndSymbol <em>End Symbol</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getStartSymbol <em>Start Symbol</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSymbolRangeType()
 * @model extendedMetaData="name='SymbolRangeType' kind='empty'"
 * @generated
 */
public interface SymbolRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>End Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Symbol</em>' attribute.
	 * @see #setEndSymbol(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSymbolRangeType_EndSymbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='EndSymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getEndSymbol <em>End Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Symbol</em>' attribute.
	 * @see #getEndSymbol()
	 * @generated
	 */
	void setEndSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Start Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Symbol</em>' attribute.
	 * @see #setStartSymbol(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSymbolRangeType_StartSymbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='StartSymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SymbolRangeType#getStartSymbol <em>Start Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Symbol</em>' attribute.
	 * @see #getStartSymbol()
	 * @generated
	 */
	void setStartSymbol(String value);

} // SymbolRangeType
