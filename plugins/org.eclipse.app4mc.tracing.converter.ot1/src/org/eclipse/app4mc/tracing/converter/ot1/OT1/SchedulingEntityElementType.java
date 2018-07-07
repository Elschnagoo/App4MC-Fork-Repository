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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Entity Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein "SchedulingEntityElementType" beschreibt ein
 * 				Element eines SchedulingEntities, also ein Element, welches von
 * 				einem Scheduler verwaltet wird.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingValues <em>Timing Values</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingConstraints <em>Timing Constraints</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityElementType()
 * @model abstract="true"
 *        extendedMetaData="name='SchedulingEntityElementType' kind='elementOnly'"
 * @generated
 */
public interface SchedulingEntityElementType extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityElementType_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SchedulingEntityElementType> getElement();

	/**
	 * Returns the value of the '<em><b>Timing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Values</em>' containment reference.
	 * @see #setTimingValues(TimingValuesType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityElementType_TimingValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimingValues' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingValuesType getTimingValues();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingValues <em>Timing Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Values</em>' containment reference.
	 * @see #getTimingValues()
	 * @generated
	 */
	void setTimingValues(TimingValuesType value);

	/**
	 * Returns the value of the '<em><b>Timing Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Constraints</em>' containment reference.
	 * @see #setTimingConstraints(TimingConstraintsType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityElementType_TimingConstraints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimingConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingConstraintsType getTimingConstraints();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getTimingConstraints <em>Timing Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Constraints</em>' containment reference.
	 * @see #getTimingConstraints()
	 * @generated
	 */
	void setTimingConstraints(TimingConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getSchedulingEntityElementType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SchedulingEntityElementType
