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
 * A representation of the model object '<em><b>Call Sequence Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generalizes task calls
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallSequenceItem#getContainingTask <em>Containing Task</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CallSequenceItem#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallSequenceItem()
 * @model abstract="true"
 * @generated
 */
public interface CallSequenceItem extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Task</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallSequenceItem_ContainingTask()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaServices%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Task%&gt;&gt;getContainerOfType(this, &lt;%org.eclipse.app4mc.amalthea.model.Task%&gt;.class);'"
	 * @generated
	 */
	Task getContainingTask();

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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCallSequenceItem_Counter()
	 * @model containment="true"
	 * @generated
	 */
	Counter getCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CallSequenceItem#getCounter <em>Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' containment reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Counter value);

} // CallSequenceItem
