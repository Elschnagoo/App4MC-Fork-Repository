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
 * A representation of the model object '<em><b>Code Block Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein CodeBlockType beschreibt einen Code-Block.
 * 
 * 				Alle
 * 				Elemente dieses Typs (und der abgeleiteten Typen) teilen sich einen
 * 				ID-Raum!!
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getAddressRange <em>Address Range</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getSymbolRange <em>Symbol Range</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getCodeBlockType()
 * @model extendedMetaData="name='CodeBlockType' kind='elementOnly'"
 * @generated
 */
public interface CodeBlockType extends ApplicationElementType {
	/**
	 * Returns the value of the '<em><b>Address Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Range</em>' containment reference.
	 * @see #setAddressRange(AddressRangeType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getCodeBlockType_AddressRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressRange' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressRangeType getAddressRange();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getAddressRange <em>Address Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Range</em>' containment reference.
	 * @see #getAddressRange()
	 * @generated
	 */
	void setAddressRange(AddressRangeType value);

	/**
	 * Returns the value of the '<em><b>Symbol Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Range</em>' containment reference.
	 * @see #setSymbolRange(SymbolRangeType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getCodeBlockType_SymbolRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SymbolRange' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolRangeType getSymbolRange();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType#getSymbolRange <em>Symbol Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Range</em>' containment reference.
	 * @see #getSymbolRange()
	 * @generated
	 */
	void setSymbolRange(SymbolRangeType value);

} // CodeBlockType
