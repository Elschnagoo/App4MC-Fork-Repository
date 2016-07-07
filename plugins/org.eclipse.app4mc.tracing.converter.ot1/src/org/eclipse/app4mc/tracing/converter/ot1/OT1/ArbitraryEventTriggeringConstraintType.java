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
 * A representation of the model object '<em><b>Arbitrary Event Triggering Constraint Type</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getArbitraryEventTriggeringConstraintType()
 * @model extendedMetaData="name='ArbitraryEventTriggeringConstraintType' kind='elementOnly'"
 * @generated
 */
public interface ArbitraryEventTriggeringConstraintType extends EventTriggeringConstraintType {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getArbitraryEventTriggeringConstraintType_LowerBound()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LowerBound' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getArbitraryEventTriggeringConstraintType_UpperBound()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpperBound' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringConstraintType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(TimeValueType value);

} // ArbitraryEventTriggeringConstraintType
