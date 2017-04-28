/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A event that can be set, cleared and waited for by a process
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsEvent#getCommunicationOverheadInBit <em>Communication Overhead In Bit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsEvent()
 * @model
 * @generated
 */
public interface OsEvent extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Communication Overhead In Bit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Overhead In Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Overhead In Bit</em>' attribute.
	 * @see #setCommunicationOverheadInBit(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsEvent_CommunicationOverheadInBit()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getCommunicationOverheadInBit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsEvent#getCommunicationOverheadInBit <em>Communication Overhead In Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Overhead In Bit</em>' attribute.
	 * @see #getCommunicationOverheadInBit()
	 * @generated
	 */
	void setCommunicationOverheadInBit(int value);

} // OsEvent
