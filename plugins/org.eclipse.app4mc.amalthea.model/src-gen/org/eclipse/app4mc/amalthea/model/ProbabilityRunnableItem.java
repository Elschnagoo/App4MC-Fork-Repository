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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Runnable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A runnable item with a probability
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getRunnableItem <em>Runnable Item</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProbabilityRunnableItem()
 * @model
 * @generated
 */
public interface ProbabilityRunnableItem extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProbabilityRunnableItem_Probability()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getProbability();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(int value);

	/**
	 * Returns the value of the '<em><b>Runnable Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable Item</em>' containment reference.
	 * @see #setRunnableItem(RunnableItem)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProbabilityRunnableItem_RunnableItem()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	RunnableItem getRunnableItem();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem#getRunnableItem <em>Runnable Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable Item</em>' containment reference.
	 * @see #getRunnableItem()
	 * @generated
	 */
	void setRunnableItem(RunnableItem value);

} // ProbabilityRunnableItem
