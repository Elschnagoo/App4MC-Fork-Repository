/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsEvent#getReferringComponents <em>Referring Components</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Referring Components</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of components the OS event belongs to.</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referring Components</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsEvent_ReferringComponents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Component%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getOsEvent_ReferringComponents(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getComponent_OsEvents());'"
	 * @generated
	 */
	EList<Component> getReferringComponents();

} // OsEvent
