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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AbstractElementMapping;
import org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element Memory Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMemoryInformationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMemoryInformationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMemoryInformationImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractElementMemoryInformationImpl extends ReferableBaseObjectImpl implements AbstractElementMemoryInformation {
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
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElementMapping> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementMemoryInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAbstractElementMemoryInformation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getSize() {
		if (size != null && size.eIsProxy()) {
			InternalEObject oldSize = (InternalEObject)size;
			size = (DataSize)eResolveProxy(oldSize);
			if (size != oldSize) {
				InternalEObject newSize = (InternalEObject)size;
				NotificationChain msgs = oldSize.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, null, null);
				if (newSize.eInternalContainer() == null) {
					msgs = newSize.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, oldSize, size));
			}
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize basicGetSize() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElementMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectWithInverseResolvingEList<AbstractElementMapping>(AbstractElementMapping.class, this, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE:
				return basicSetSize(null, msgs);
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS:
				return getTags();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE:
				if (resolve) return getSize();
				return basicGetSize();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS:
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE:
				setSize((DataSize)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends AbstractElementMapping>)newValue);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE:
				setSize((DataSize)null);
				return;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS:
				getMappings().clear();
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__SIZE:
				return size != null;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
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
				case AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractElementMemoryInformationImpl
