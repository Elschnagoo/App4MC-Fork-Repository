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
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Channel#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Channel#getDefaultElements <em>Default Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Channel#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Channel#getChannelAccesses <em>Channel Accesses</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends AbstractMemoryElement, IDisplayName {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(DataType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannel_ElementType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getElementType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Channel#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(DataType value);

	/**
	 * Returns the value of the '<em><b>Default Elements</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Elements</em>' attribute.
	 * @see #setDefaultElements(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannel_DefaultElements()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getDefaultElements();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Channel#getDefaultElements <em>Default Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Elements</em>' attribute.
	 * @see #getDefaultElements()
	 * @generated
	 */
	void setDefaultElements(int value);

	/**
	 * Returns the value of the '<em><b>Max Elements</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Elements</em>' attribute.
	 * @see #setMaxElements(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannel_MaxElements()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMaxElements();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Channel#getMaxElements <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Elements</em>' attribute.
	 * @see #getMaxElements()
	 * @generated
	 */
	void setMaxElements(int value);

	/**
	 * Returns the value of the '<em><b>Channel Accesses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ChannelAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Accesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Accesses</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannel_ChannelAccesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.CrossReferenceUtil%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.ChannelAccess%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getChannelAccess_Data());'"
	 * @generated
	 */
	EList<ChannelAccess> getChannelAccesses();

} // Channel
