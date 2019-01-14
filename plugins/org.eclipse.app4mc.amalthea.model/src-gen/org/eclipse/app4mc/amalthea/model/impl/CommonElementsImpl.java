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
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CommonElementsImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CommonElementsImpl#getCoreClassifiers <em>Core Classifiers</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CommonElementsImpl#getMemoryClassifiers <em>Memory Classifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonElementsImpl extends BaseObjectImpl implements CommonElements {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getCoreClassifiers() <em>Core Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreClassifier> coreClassifiers;

	/**
	 * The cached value of the '{@link #getMemoryClassifiers() <em>Memory Classifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryClassifier> memoryClassifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCommonElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, AmaltheaPackage.COMMON_ELEMENTS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreClassifier> getCoreClassifiers() {
		if (coreClassifiers == null) {
			coreClassifiers = new EObjectContainmentEList<CoreClassifier>(CoreClassifier.class, this, AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS);
		}
		return coreClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryClassifier> getMemoryClassifiers() {
		if (memoryClassifiers == null) {
			memoryClassifiers = new EObjectContainmentEList<MemoryClassifier>(MemoryClassifier.class, this, AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS);
		}
		return memoryClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.COMMON_ELEMENTS__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS:
				return ((InternalEList<?>)getCoreClassifiers()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS:
				return ((InternalEList<?>)getMemoryClassifiers()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.COMMON_ELEMENTS__TAGS:
				return getTags();
			case AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS:
				return getCoreClassifiers();
			case AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS:
				return getMemoryClassifiers();
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
			case AmaltheaPackage.COMMON_ELEMENTS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS:
				getCoreClassifiers().clear();
				getCoreClassifiers().addAll((Collection<? extends CoreClassifier>)newValue);
				return;
			case AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS:
				getMemoryClassifiers().clear();
				getMemoryClassifiers().addAll((Collection<? extends MemoryClassifier>)newValue);
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
			case AmaltheaPackage.COMMON_ELEMENTS__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS:
				getCoreClassifiers().clear();
				return;
			case AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS:
				getMemoryClassifiers().clear();
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
			case AmaltheaPackage.COMMON_ELEMENTS__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS:
				return coreClassifiers != null && !coreClassifiers.isEmpty();
			case AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS:
				return memoryClassifiers != null && !memoryClassifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommonElementsImpl
