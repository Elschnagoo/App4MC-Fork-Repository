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
 * A representation of the model object '<em><b>Time Range Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein TimeRangeElementType definiert eine beliebige
 * 				Zeitspanne, für welche Timing-Informationen gewonnen werden können.
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
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimeRangeElementType()
 * @model extendedMetaData="name='TimeRangeElementType' kind='elementOnly'"
 * @generated
 */
public interface TimeRangeElementType extends VirtualElementType {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
	 * @see #isSetLatency()
	 * @see #unsetLatency()
	 * @see #setLatency(LatencyTypeEnum)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimeRangeElementType_Latency()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='latency' namespace='##targetNamespace'"
	 * @generated
	 */
	LatencyTypeEnum getLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.LatencyTypeEnum
	 * @see #isSetLatency()
	 * @see #unsetLatency()
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(LatencyTypeEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLatency()
	 * @see #getLatency()
	 * @see #setLatency(LatencyTypeEnum)
	 * @generated
	 */
	void unsetLatency();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType#getLatency <em>Latency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Latency</em>' attribute is set.
	 * @see #unsetLatency()
	 * @see #getLatency()
	 * @see #setLatency(LatencyTypeEnum)
	 * @generated
	 */
	boolean isSetLatency();

} // TimeRangeElementType
