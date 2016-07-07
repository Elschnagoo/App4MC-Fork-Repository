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
 * A representation of the model object '<em><b>Timing Information Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Basis-Timing-Informationen werden in Elemente
 * 				vom Typ "TimingInformationenElementType" gespeichert. Diese bestehen
 * 				immer aus dem Wert an sich (Value), einem Typ "type", einem Sub-Typ
 * 				"subType" und der Quelle der Information "source".
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationElementType()
 * @model extendedMetaData="name='TimingInformationElementType' kind='elementOnly'"
 * @generated
 */
public interface TimingInformationElementType extends TimingValueElementType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationElementType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
	 * @see #isSetSubType()
	 * @see #unsetSubType()
	 * @see #setSubType(TimingInformationSubTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationElementType_SubType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingInformationSubTypeEnum getSubType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getSubType <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSubTypeEnum
	 * @see #isSetSubType()
	 * @see #unsetSubType()
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(TimingInformationSubTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getSubType <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubType()
	 * @see #getSubType()
	 * @see #setSubType(TimingInformationSubTypeEnum)
	 * @generated
	 */
	void unsetSubType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getSubType <em>Sub Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Type</em>' attribute is set.
	 * @see #unsetSubType()
	 * @see #getSubType()
	 * @see #setSubType(TimingInformationSubTypeEnum)
	 * @generated
	 */
	boolean isSetSubType();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TimingInformationTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationElementType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingInformationTypeEnum getType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TimingInformationTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TimingInformationTypeEnum)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationElementType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TimingInformationTypeEnum)
	 * @generated
	 */
	boolean isSetType();

} // TimingInformationElementType
