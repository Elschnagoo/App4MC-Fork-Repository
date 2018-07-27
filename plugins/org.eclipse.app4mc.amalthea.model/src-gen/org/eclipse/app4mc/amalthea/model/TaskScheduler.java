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
 * A representation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getParentAssociation <em>Parent Association</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getChildAssociations <em>Child Associations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getTaskAllocations <em>Task Allocations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getParentScheduler <em>Parent Scheduler</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getChildSchedulers <em>Child Schedulers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler()
 * @model
 * @generated
 */
public interface TaskScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Scheduling Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Algorithm</em>' containment reference.
	 * @see #setSchedulingAlgorithm(TaskSchedulingAlgorithm)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_SchedulingAlgorithm()
	 * @model containment="true"
	 * @generated
	 */
	TaskSchedulingAlgorithm getSchedulingAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getSchedulingAlgorithm <em>Scheduling Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Algorithm</em>' containment reference.
	 * @see #getSchedulingAlgorithm()
	 * @generated
	 */
	void setSchedulingAlgorithm(TaskSchedulingAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Parent Association</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Association</em>' containment reference.
	 * @see #setParentAssociation(SchedulerAssociation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_ParentAssociation()
	 * @see org.eclipse.app4mc.amalthea.model.SchedulerAssociation#getChild
	 * @model opposite="child" containment="true"
	 * @generated
	 */
	SchedulerAssociation getParentAssociation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TaskScheduler#getParentAssociation <em>Parent Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Association</em>' containment reference.
	 * @see #getParentAssociation()
	 * @generated
	 */
	void setParentAssociation(SchedulerAssociation value);

	/**
	 * Returns the value of the '<em><b>Child Associations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.SchedulerAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of child associations (SchedulerAssociation).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Associations</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_ChildAssociations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _schedulerAssociation_Parent = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSchedulerAssociation_Parent();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getTaskScheduler_ChildAssociations(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_schedulerAssociation_Parent)));'"
	 * @generated
	 */
	EList<SchedulerAssociation> getChildAssociations();

	/**
	 * Returns the value of the '<em><b>Task Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TaskAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of task allocations (TaskAllocation).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task Allocations</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_TaskAllocations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _taskAllocation_Scheduler = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getTaskAllocation_Scheduler();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.TaskAllocation%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getTaskScheduler_TaskAllocations(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_taskAllocation_Scheduler)));'"
	 * @generated
	 */
	EList<TaskAllocation> getTaskAllocations();

	/**
	 * Returns the value of the '<em><b>Parent Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Scheduler</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_ParentScheduler()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' get='&lt;%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%&gt; _parentAssociation = this.getParentAssociation();\n&lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt; _parent = null;\nif (_parentAssociation!=null)\n{\n\t_parent=_parentAssociation.getParent();\n}\nreturn _parent;'"
	 * @generated
	 */
	TaskScheduler getParentScheduler();

	/**
	 * Returns the value of the '<em><b>Child Schedulers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TaskScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Schedulers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Schedulers</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_ChildSchedulers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' get='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%&gt;, &lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%&gt;, &lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt; apply(final &lt;%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%&gt; it)\n\t{\n\t\treturn it.getChild();\n\t}\n};\nfinal &lt;%java.lang.Iterable%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt; result = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt;filterNull(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%&gt;, &lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt;map(this.getChildAssociations(), _function));\n&lt;%org.eclipse.emf.ecore.EReference%&gt; _taskScheduler_ChildSchedulers = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getTaskScheduler_ChildSchedulers();\nint _size = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.size(result);\n&lt;%java.lang.Object%&gt;[] _array = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt;toList(result).toArray();\nreturn new &lt;%org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.TaskScheduler%&gt;&gt;(((&lt;%org.eclipse.emf.ecore.InternalEObject%&gt;) this), _taskScheduler_ChildSchedulers, _size, _array);'"
	 * @generated
	 */
	EList<TaskScheduler> getChildSchedulers();

} // TaskScheduler
