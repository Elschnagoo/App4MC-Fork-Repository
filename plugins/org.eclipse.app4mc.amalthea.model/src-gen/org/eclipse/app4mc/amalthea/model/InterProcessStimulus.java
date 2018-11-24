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
 * A representation of the model object '<em><b>Inter Process Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stimulus based on a explicit inter process trigger.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InterProcessStimulus#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InterProcessStimulus#getExplicitTriggers <em>Explicit Triggers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessStimulus()
 * @model
 * @generated
 */
public interface InterProcessStimulus extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' containment reference.
	 * @see #setCounter(Counter)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessStimulus_Counter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InterProcessStimulus#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Counter value);

	/**
	 * Returns the value of the '<em><b>Explicit Triggers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.InterProcessTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of triggers (InterProcessTrigger).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explicit Triggers</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterProcessStimulus_ExplicitTriggers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	EList<InterProcessTrigger> getExplicitTriggers();

} // InterProcessStimulus
