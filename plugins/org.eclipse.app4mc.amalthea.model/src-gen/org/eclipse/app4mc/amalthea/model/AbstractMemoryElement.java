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
 * A representation of the model object '<em><b>Abstract Memory Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractMemoryElement#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractMemoryElement#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractMemoryElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMemoryElement extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifying the size of the element corresponding to the needed memory allocation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(DataSize)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractMemoryElement_Size()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AbstractMemoryElement#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractMemoryElement_Mappings()
	 * @model opposite="memoryElementLinkInt" transient="true" suppressedSetVisibility="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	EList<MemoryMapping> getMappings();

} // AbstractMemoryElement
