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
 * A representation of the model object '<em><b>Abstract Element Memory Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractElementMemoryInformation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractElementMemoryInformation extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifying the size of the element corresponding to the needed memory allocation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(DataUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractElementMemoryInformation_Size()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	DataUnit getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataUnit value);

} // AbstractElementMemoryInformation
