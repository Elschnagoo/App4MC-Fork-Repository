/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group that contains only a tag and groups all objects that are marked with this tag
 * This can be runnables or processes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TagGroup#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTagGroup()
 * @model
 * @generated
 */
public interface TagGroup extends RunnableGroup, ProcessGroup, BaseObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(Tag)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTagGroup_Tag()
	 * @model required="true"
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.TagGroup#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

} // TagGroup
