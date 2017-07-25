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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Association</em>' containment reference.
	 * @see #setParentAssociation(SchedulerAssociation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_ParentAssociation()
	 * @model containment="true"
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
	 * <p>
	 * If the meaning of the '<em>Child Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Associations</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTaskScheduler_ChildAssociations()
	 * @model opposite="parentLinkInt" transient="true" suppressedSetVisibility="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	EList<SchedulerAssociation> getChildAssociations();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' get='<%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%> _parentAssociation = this.getParentAssociation();\n<%org.eclipse.app4mc.amalthea.model.TaskScheduler%> _parent = null;\nif (_parentAssociation!=null)\n{\n\t_parent=_parentAssociation.getParent();\n}\nreturn _parent;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' get='<%org.eclipse.emf.common.util.EList%><<%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%>> _childAssociations = this.getChildAssociations();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%>, <%org.eclipse.app4mc.amalthea.model.TaskScheduler%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%>, <%org.eclipse.app4mc.amalthea.model.TaskScheduler%>>()\n{\n\tpublic <%org.eclipse.app4mc.amalthea.model.TaskScheduler%> apply(final <%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%> it)\n\t{\n\t\treturn it.getChild();\n\t}\n};\nreturn <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%org.eclipse.app4mc.amalthea.model.SchedulerAssociation%>, <%org.eclipse.app4mc.amalthea.model.TaskScheduler%>>map(_childAssociations, _function);'"
	 * @generated
	 */
	EList<TaskScheduler> getChildSchedulers();

} // TaskScheduler
