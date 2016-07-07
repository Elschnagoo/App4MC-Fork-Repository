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
 * A representation of the model object '<em><b>Section Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sections (D4.2, Chapter 3.3.2)
 * Sections refer to Labels and/or Runnables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SectionMapping#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSectionMapping()
 * @model
 * @generated
 */
public interface SectionMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' reference.
	 * @see #setSection(Section)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSectionMapping_Section()
	 * @model required="true"
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.SectionMapping#getSection <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

} // SectionMapping
