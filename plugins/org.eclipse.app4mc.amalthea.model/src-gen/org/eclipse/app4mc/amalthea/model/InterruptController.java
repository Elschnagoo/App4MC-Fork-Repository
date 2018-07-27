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
 * A representation of the model object '<em><b>Interrupt Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InterruptController#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.InterruptController#getIsrAllocations <em>Isr Allocations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterruptController()
 * @model
 * @generated
 */
public interface InterruptController extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Scheduling Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Algorithm</em>' containment reference.
	 * @see #setSchedulingAlgorithm(InterruptSchedulingAlgorithm)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterruptController_SchedulingAlgorithm()
	 * @model containment="true"
	 * @generated
	 */
	InterruptSchedulingAlgorithm getSchedulingAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.InterruptController#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Algorithm</em>' containment reference.
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 */
	void setSchedulingAlgorithm(InterruptSchedulingAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Isr Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ISRAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of ISR allocations (ISRAllocation).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isr Allocations</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getInterruptController_IsrAllocations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _iSRAllocation_Controller = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getISRAllocation_Controller();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.ISRAllocation%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getInterruptController_IsrAllocations(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_iSRAllocation_Controller)));'"
	 * @generated
	 */
	EList<ISRAllocation> getIsrAllocations();

} // InterruptController
