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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValuesType#getTimingValue <em>Timing Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingValuesType()
 * @model extendedMetaData="name='TimingValues_._type' kind='elementOnly'"
 * @generated
 */
public interface TimingValuesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Timing Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Value</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTimingValuesType_TimingValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimingValueElementType> getTimingValue();

} // TimingValuesType
