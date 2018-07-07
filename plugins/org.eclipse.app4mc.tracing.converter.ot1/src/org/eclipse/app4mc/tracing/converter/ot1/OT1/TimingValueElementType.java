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
 * A representation of the model object '<em><b>Timing Value Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * alle Elemente vom Type "TimingValueElementType"
 * 				können Timing-Daten speichern oder diese anfordern (request). Diese
 * 				enthalten die gemessenen oder analysierten Ergebnisse oder auch die
 * 				angenommenen Werte.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#isRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingValueElementType()
 * @model abstract="true"
 *        extendedMetaData="name='TimingValueElementType' kind='elementOnly'"
 * @generated
 */
public interface TimingValueElementType extends ElementType {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #isSetRequest()
	 * @see #unsetRequest()
	 * @see #setRequest(boolean)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingValueElementType_Request()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#isRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #isSetRequest()
	 * @see #unsetRequest()
	 * @see #isRequest()
	 * @generated
	 */
	void setRequest(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#isRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequest()
	 * @see #isRequest()
	 * @see #setRequest(boolean)
	 * @generated
	 */
	void unsetRequest();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#isRequest <em>Request</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request</em>' attribute is set.
	 * @see #unsetRequest()
	 * @see #isRequest()
	 * @see #setRequest(boolean)
	 * @generated
	 */
	boolean isSetRequest();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(TimingInformationSourceEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingValueElementType_Source()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingInformationSourceEnum getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TimingInformationSourceEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(TimingInformationSourceEnum)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(TimingInformationSourceEnum)
	 * @generated
	 */
	boolean isSetSource();

} // TimingValueElementType
