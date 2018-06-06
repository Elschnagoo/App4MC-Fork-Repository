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
 * A representation of the model object '<em><b>Runnable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of a object that can be executed by a Runnable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RunnableItem#getContainingRunnable <em>Containing Runnable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableItem()
 * @model abstract="true"
 * @generated
 */
public interface RunnableItem extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Runnable</em>' reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRunnableItem_ContainingRunnable()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaServices%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt;&gt;getContainerOfType(this, &lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt;.class);'"
	 * @generated
	 */
	org.eclipse.app4mc.amalthea.model.Runnable getContainingRunnable();

} // RunnableItem
