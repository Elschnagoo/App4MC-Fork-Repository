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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrary Event Triggering Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType#getMinDistance <em>Min Distance</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.ArbitraryEventTriggeringType#getMaxDistance <em>Max Distance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getArbitraryEventTriggeringType()
 * @model extendedMetaData="name='ArbitraryEventTriggeringType' kind='elementOnly'"
 * @generated
 */
public interface ArbitraryEventTriggeringType extends EventTriggeringType {
	/**
	 * Returns the value of the '<em><b>Min Distance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Distance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Distance</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getArbitraryEventTriggeringType_MinDistance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MinDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeValueType> getMinDistance();

	/**
	 * Returns the value of the '<em><b>Max Distance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Distance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Distance</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getArbitraryEventTriggeringType_MaxDistance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MaxDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeValueType> getMaxDistance();

} // ArbitraryEventTriggeringType
