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
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tag for processes, runnables, events and labels
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Tag#getTagType <em>Tag Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Tag Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Type</em>' attribute.
	 * @see #setTagType(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTag_TagType()
	 * @model unique="false"
	 * @generated
	 */
	String getTagType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Tag#getTagType <em>Tag Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Type</em>' attribute.
	 * @see #getTagType()
	 * @generated
	 */
	void setTagType(String value);

} // Tag
