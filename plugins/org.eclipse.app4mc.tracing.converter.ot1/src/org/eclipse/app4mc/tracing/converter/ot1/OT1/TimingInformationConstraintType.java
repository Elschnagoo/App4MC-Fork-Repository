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
 * A representation of the model object '<em><b>Timing Information Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Über den Typ "TimingInformationConstraintType"
 * 				können Timing-Constraints oder Min- bzw. Max-Grenzen (thresholdType)
 * 				für alle Basis-Timing-Informationen (timingValueType) definiert
 * 				werden. "Threshold" ist die zu überwachende Grenze.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThresholdType <em>Threshold Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getTimingValueType <em>Timing Value Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationConstraintType()
 * @model extendedMetaData="name='TimingInformationConstraintType' kind='elementOnly'"
 * @generated
 */
public interface TimingInformationConstraintType extends TimingConstraintElementType {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference.
	 * @see #setThreshold(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationConstraintType_Threshold()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThreshold <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' containment reference.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Threshold Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
	 * @see #isSetThresholdType()
	 * @see #unsetThresholdType()
	 * @see #setThresholdType(ThresholdTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationConstraintType_ThresholdType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='thresholdType' namespace='##targetNamespace'"
	 * @generated
	 */
	ThresholdTypeEnum getThresholdType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThresholdType <em>Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.ThresholdTypeEnum
	 * @see #isSetThresholdType()
	 * @see #unsetThresholdType()
	 * @see #getThresholdType()
	 * @generated
	 */
	void setThresholdType(ThresholdTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThresholdType <em>Threshold Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdType()
	 * @see #getThresholdType()
	 * @see #setThresholdType(ThresholdTypeEnum)
	 * @generated
	 */
	void unsetThresholdType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getThresholdType <em>Threshold Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Type</em>' attribute is set.
	 * @see #unsetThresholdType()
	 * @see #getThresholdType()
	 * @see #setThresholdType(ThresholdTypeEnum)
	 * @generated
	 */
	boolean isSetThresholdType();

	/**
	 * Returns the value of the '<em><b>Timing Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Value Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @see #isSetTimingValueType()
	 * @see #unsetTimingValueType()
	 * @see #setTimingValueType(TimingInformationTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingInformationConstraintType_TimingValueType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='timingValueType' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingInformationTypeEnum getTimingValueType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getTimingValueType <em>Timing Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Value Type</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationTypeEnum
	 * @see #isSetTimingValueType()
	 * @see #unsetTimingValueType()
	 * @see #getTimingValueType()
	 * @generated
	 */
	void setTimingValueType(TimingInformationTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getTimingValueType <em>Timing Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimingValueType()
	 * @see #getTimingValueType()
	 * @see #setTimingValueType(TimingInformationTypeEnum)
	 * @generated
	 */
	void unsetTimingValueType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationConstraintType#getTimingValueType <em>Timing Value Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timing Value Type</em>' attribute is set.
	 * @see #unsetTimingValueType()
	 * @see #getTimingValueType()
	 * @see #setTimingValueType(TimingInformationTypeEnum)
	 * @generated
	 */
	boolean isSetTimingValueType();

} // TimingInformationConstraintType
