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
 * A representation of the model object '<em><b>Sporadic Event Triggering Constraint Type</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMinInterArrivalTime <em>Min Inter Arrival Time</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMaxInterArrivalTime <em>Max Inter Arrival Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSporadicEventTriggeringConstraintType()
 * @model extendedMetaData="name='SporadicEventTriggeringConstraintType' kind='elementOnly'"
 * @generated
 */
public interface SporadicEventTriggeringConstraintType extends EventTriggeringConstraintType {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSporadicEventTriggeringConstraintType_Period()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSporadicEventTriggeringConstraintType_Jitter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Jitter' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getJitter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Min Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inter Arrival Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inter Arrival Time</em>' containment reference.
	 * @see #setMinInterArrivalTime(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSporadicEventTriggeringConstraintType_MinInterArrivalTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MinInterArrivalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getMinInterArrivalTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMinInterArrivalTime <em>Min Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inter Arrival Time</em>' containment reference.
	 * @see #getMinInterArrivalTime()
	 * @generated
	 */
	void setMinInterArrivalTime(TimeValueType value);

	/**
	 * Returns the value of the '<em><b>Max Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inter Arrival Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inter Arrival Time</em>' containment reference.
	 * @see #setMaxInterArrivalTime(TimeValueType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSporadicEventTriggeringConstraintType_MaxInterArrivalTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MaxInterArrivalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeValueType getMaxInterArrivalTime();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SporadicEventTriggeringConstraintType#getMaxInterArrivalTime <em>Max Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inter Arrival Time</em>' containment reference.
	 * @see #getMaxInterArrivalTime()
	 * @generated
	 */
	void setMaxInterArrivalTime(TimeValueType value);

} // SporadicEventTriggeringConstraintType
