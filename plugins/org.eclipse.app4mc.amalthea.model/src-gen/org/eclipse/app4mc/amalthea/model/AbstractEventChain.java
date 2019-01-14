/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Abstract Event Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an event chain which must have a minimum of two events (stimulus and response)
 * If there are more events the event chain have to be divided into segments. Each segment is another event chain.
 * Alternative event paths are contained in strands.
 * stimulus: Beginning of chain
 * response: End of chain
 * segments: Sub event chains
 * strands: alternative event paths
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain#getResponse <em>Response</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain#getStrands <em>Strands</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractEventChain()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEventChain extends BaseObject, INamed {
	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' reference.
	 * @see #setStimulus(Event)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractEventChain_Stimulus()
	 * @model
	 * @generated
	 */
	Event getStimulus();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain#getStimulus <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' reference.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(Event value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Event)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractEventChain_Response()
	 * @model
	 * @generated
	 */
	Event getResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AbstractEventChain#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Event value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.EventChainItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractEventChain_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventChainItem> getSegments();

	/**
	 * Returns the value of the '<em><b>Strands</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.EventChainItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strands</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractEventChain_Strands()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventChainItem> getStrands();

} // AbstractEventChain
