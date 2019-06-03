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
 * A representation of the model object '<em><b>Process Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Prototype class for Process.
 * It does contain meta information of potential processes, which does not represent the final state.
 * The final state can be several Tasks, which can be computed using provided information of this prototype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getFirstRunnable <em>First Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getLastRunnable <em>Last Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getAccessPrecedenceSpec <em>Access Precedence Spec</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getOrderPrecedenceSpec <em>Order Precedence Spec</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getChainedPrototypes <em>Chained Prototypes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getRunnableCalls <em>Runnable Calls</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype()
 * @model
 * @generated
 */
public interface ProcessPrototype extends AbstractProcess {
	/**
	 * Returns the value of the '<em><b>Preemption</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.Preemption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Preemption
	 * @see #setPreemption(Preemption)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_Preemption()
	 * @model unique="false"
	 * @generated
	 */
	Preemption getPreemption();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getPreemption <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.Preemption
	 * @see #getPreemption()
	 * @generated
	 */
	void setPreemption(Preemption value);

	/**
	 * Returns the value of the '<em><b>First Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Runnable</em>' reference.
	 * @see #setFirstRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_FirstRunnable()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getFirstRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getFirstRunnable <em>First Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Runnable</em>' reference.
	 * @see #getFirstRunnable()
	 * @generated
	 */
	void setFirstRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

	/**
	 * Returns the value of the '<em><b>Last Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Runnable</em>' reference.
	 * @see #setLastRunnable(org.eclipse.app4mc.amalthea.model.Runnable)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_LastRunnable()
	 * @model
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getLastRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getLastRunnable <em>Last Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Runnable</em>' reference.
	 * @see #getLastRunnable()
	 * @generated
	 */
	void setLastRunnable(org.eclipse.app4mc.amalthea.model.Runnable value);

	/**
	 * Returns the value of the '<em><b>Access Precedence Spec</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the general label accesses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Precedence Spec</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_AccessPrecedenceSpec()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessPrecedenceSpec> getAccessPrecedenceSpec();

	/**
	 * Returns the value of the '<em><b>Order Precedence Spec</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the general order of runnables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Precedence Spec</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_OrderPrecedenceSpec()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderPrecedenceSpec> getOrderPrecedenceSpec();

	/**
	 * Returns the value of the '<em><b>Chained Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chained Prototypes</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_ChainedPrototypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChainedProcessPrototype> getChainedPrototypes();

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' reference.
	 * @see #setActivation(Activation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_Activation()
	 * @model
	 * @generated
	 */
	Activation getActivation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessPrototype#getActivation <em>Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Activation value);

	/**
	 * Returns the value of the '<em><b>Runnable Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TaskRunnableCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable Calls</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessPrototype_RunnableCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskRunnableCall> getRunnableCalls();

} // ProcessPrototype
