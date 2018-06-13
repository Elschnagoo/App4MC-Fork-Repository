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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Tag#getTaggedObjects <em>Tagged Objects</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Tagged Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ITaggable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of objects (ITaggable) referring to the this tag.</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagged Objects</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTag_TaggedObjects()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaCrossReferenceUtil%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.ITaggable%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getTag_TaggedObjects(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getITaggable_Tags());'"
	 * @generated
	 */
	EList<ITaggable> getTaggedObjects();

} // Tag
