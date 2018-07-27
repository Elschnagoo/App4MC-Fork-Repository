/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TagImpl#getTagType <em>Tag Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TagImpl#getTaggedObjects <em>Tagged Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends ReferableBaseObjectImpl implements Tag {
	/**
	 * The default value of the '{@link #getTagType() <em>Tag Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagType()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagType() <em>Tag Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagType()
	 * @generated
	 * @ordered
	 */
	protected String tagType = TAG_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTag();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagType() {
		return tagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagType(String newTagType) {
		String oldTagType = tagType;
		tagType = newTagType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.TAG__TAG_TYPE, oldTagType, tagType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ITaggable> getTaggedObjects() {
		EReference _iTaggable_Tags = AmaltheaPackage.eINSTANCE.getITaggable_Tags();
		return AmaltheaIndex.<ITaggable>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getTag_TaggedObjects(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_iTaggable_Tags)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.TAG__TAG_TYPE:
				return getTagType();
			case AmaltheaPackage.TAG__TAGGED_OBJECTS:
				return getTaggedObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.TAG__TAG_TYPE:
				setTagType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.TAG__TAG_TYPE:
				setTagType(TAG_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmaltheaPackage.TAG__TAG_TYPE:
				return TAG_TYPE_EDEFAULT == null ? tagType != null : !TAG_TYPE_EDEFAULT.equals(tagType);
			case AmaltheaPackage.TAG__TAGGED_OBJECTS:
				return !getTaggedObjects().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tagType: ");
		result.append(tagType);
		result.append(')');
		return result.toString();
	}

} //TagImpl
