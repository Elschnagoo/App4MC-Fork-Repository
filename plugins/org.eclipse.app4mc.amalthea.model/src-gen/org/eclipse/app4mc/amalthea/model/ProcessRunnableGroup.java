/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Process Runnable Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getGroupingType <em>Grouping Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessRunnableGroup()
 * @model
 * @generated
 */
public interface ProcessRunnableGroup extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Grouping Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.RunnableGroupingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableGroupingType
	 * @see #setGroupingType(RunnableGroupingType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessRunnableGroup_GroupingType()
	 * @model unique="false"
	 * @generated
	 */
	RunnableGroupingType getGroupingType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup#getGroupingType <em>Grouping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.RunnableGroupingType
	 * @see #getGroupingType()
	 * @generated
	 */
	void setGroupingType(RunnableGroupingType value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessRunnableGroup_Entries()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<ProcessRunnableGroupEntry> getEntries();

} // ProcessRunnableGroup
