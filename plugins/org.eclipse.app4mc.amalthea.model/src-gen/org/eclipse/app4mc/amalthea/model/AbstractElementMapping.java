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
 * A representation of the model object '<em><b>Abstract Element Mapping</b></em>'.
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.AbstractElementMapping#getAbstractElement <em>Abstract Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractElementMapping()
 * @model features="abstractElementLinkInt" 
 *        abstractElementLinkIntType="org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation" abstractElementLinkIntOpposite="mappings" abstractElementLinkIntTransient="true" abstractElementLinkIntSuppressedGetVisibility="true" abstractElementLinkIntSuppressedSetVisibility="true"
 *        abstractElementLinkIntAnnotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
 * @generated
 */
public interface AbstractElementMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Abstract Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Element</em>' reference.
	 * @see #setAbstractElement(AbstractElementMemoryInformation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAbstractElementMapping_AbstractElement()
	 * @model required="true"
	 * @generated
	 */
	AbstractElementMemoryInformation getAbstractElement();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.AbstractElementMapping#getAbstractElement <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Element</em>' reference.
	 * @see #getAbstractElement()
	 * @generated
	 */
	void setAbstractElement(AbstractElementMemoryInformation value);

} // AbstractElementMapping
