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
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * scheduling algorithm: The used algorithm for scheduling
 * computation items: steps to perform the scheduling algorithm
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scheduler#getComputationItems <em>Computation Items</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scheduler#getSchedulerAllocations <em>Scheduler Allocations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Scheduler#getRunnableAllocations <em>Runnable Allocations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Computation Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ComputationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computation Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computation Items</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler_ComputationItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputationItem> getComputationItems();

	/**
	 * Returns the value of the '<em><b>Scheduler Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.SchedulerAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of scheduler allocations (SchedulerAllocation).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduler Allocations</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler_SchedulerAllocations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _schedulerAllocation_Scheduler = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSchedulerAllocation_Scheduler();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.SchedulerAllocation%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getScheduler_SchedulerAllocations(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_schedulerAllocation_Scheduler)));'"
	 * @generated
	 */
	EList<SchedulerAllocation> getSchedulerAllocations();

	/**
	 * Returns the value of the '<em><b>Runnable Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.RunnableAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of runnable allocations (RunnableAllocation).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runnable Allocations</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getScheduler_RunnableAllocations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _runnableAllocation_Scheduler = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getRunnableAllocation_Scheduler();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.RunnableAllocation%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getScheduler_RunnableAllocations(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_runnableAllocation_Scheduler)));'"
	 * @generated
	 */
	EList<RunnableAllocation> getRunnableAllocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
	 * @generated
	 */
	Algorithm getSchedulingAlgorithm();

} // Scheduler
