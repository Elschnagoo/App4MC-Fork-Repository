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
 * A representation of the model object '<em><b>Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getSchedulingEntity <em>Scheduling Entity</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type1()
 * @model extendedMetaData="name='OT1_._type' kind='elementOnly'"
 * @generated
 */
public interface OT1Type1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Entity</em>' containment reference list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type1_SchedulingEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SchedulingEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SchedulingEntityType> getSchedulingEntity();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(VersionType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type1_Version()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(VersionType)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(VersionType)
	 * @generated
	 */
	boolean isSetVersion();

} // OT1Type1
