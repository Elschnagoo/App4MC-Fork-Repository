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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AbstractMemoryElement;
import org.eclipse.app4mc.amalthea.model.AmaltheaCrossReferenceUtil;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Memory Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractMemoryElementImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractMemoryElementImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractMemoryElementImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMemoryElementImpl extends ReferableBaseObjectImpl implements AbstractMemoryElement {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMemoryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAbstractMemoryElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(DataSize newSize, NotificationChain msgs) {
		DataSize oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(DataSize newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryMapping> getMappings() {
		return AmaltheaCrossReferenceUtil.<MemoryMapping>getInverseReferences(this, 
			AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Mappings(), AmaltheaPackage.eINSTANCE.getMemoryMapping_AbstractElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE:
				return basicSetSize(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS:
				return getTags();
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE:
				return getSize();
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__MAPPINGS:
				return getMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE:
				setSize((DataSize)newValue);
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
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE:
				setSize((DataSize)null);
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
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__SIZE:
				return size != null;
			case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__MAPPINGS:
				return !getMappings().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.ABSTRACT_MEMORY_ELEMENT__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractMemoryElementImpl
