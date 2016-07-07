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
 * A representation of the model object '<em><b>Offset Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * siehe AUTOSAR_TPS_TimingExtensions.pdf
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getSourceEventId <em>Source Event Id</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getTargetEventId <em>Target Event Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOffsetTimingConstraintType()
 * @model extendedMetaData="name='OffsetTimingConstraintType' kind='elementOnly'"
 * @generated
 */
public interface OffsetTimingConstraintType extends TimingConstraintElementType {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOffsetTimingConstraintType_Minimum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOffsetTimingConstraintType_Maximum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Source Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Event Id</em>' attribute.
	 * @see #setSourceEventId(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOffsetTimingConstraintType_SourceEventId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='sourceEventId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSourceEventId();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getSourceEventId <em>Source Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Event Id</em>' attribute.
	 * @see #getSourceEventId()
	 * @generated
	 */
	void setSourceEventId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Target Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Event Id</em>' attribute.
	 * @see #setTargetEventId(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOffsetTimingConstraintType_TargetEventId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='targetEventId' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTargetEventId();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OffsetTimingConstraintType#getTargetEventId <em>Target Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Event Id</em>' attribute.
	 * @see #getTargetEventId()
	 * @generated
	 */
	void setTargetEventId(BigInteger value);

} // OffsetTimingConstraintType
