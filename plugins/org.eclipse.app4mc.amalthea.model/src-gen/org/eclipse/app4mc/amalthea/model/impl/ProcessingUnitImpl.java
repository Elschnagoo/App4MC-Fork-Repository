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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitImpl#getAccessElements <em>Access Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitImpl#getCaches <em>Caches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingUnitImpl extends HwModuleImpl implements ProcessingUnit {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ProcessingUnitDefinition definition;

	/**
	 * The cached value of the '{@link #getAccessElements() <em>Access Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HwAccessElement> accessElements;

	/**
	 * The cached value of the '{@link #getCaches() <em>Caches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaches()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> caches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessingUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (ProcessingUnitDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROCESSING_UNIT__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingUnitDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ProcessingUnitDefinition newDefinition) {
		ProcessingUnitDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESSING_UNIT__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwAccessElement> getAccessElements() {
		if (accessElements == null) {
			accessElements = new EObjectContainmentWithInverseEList<HwAccessElement>(HwAccessElement.class, this, AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS, AmaltheaPackage.HW_ACCESS_ELEMENT__SOURCE);
		}
		return accessElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getCaches() {
		if (caches == null) {
			caches = new EObjectContainmentEList<Cache>(Cache.class, this, AmaltheaPackage.PROCESSING_UNIT__CACHES);
		}
		return caches;
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
			case AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessElements()).basicAdd(otherEnd, msgs);
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
			case AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS:
				return ((InternalEList<?>)getAccessElements()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.PROCESSING_UNIT__CACHES:
				return ((InternalEList<?>)getCaches()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.PROCESSING_UNIT__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS:
				return getAccessElements();
			case AmaltheaPackage.PROCESSING_UNIT__CACHES:
				return getCaches();
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
			case AmaltheaPackage.PROCESSING_UNIT__DEFINITION:
				setDefinition((ProcessingUnitDefinition)newValue);
				return;
			case AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS:
				getAccessElements().clear();
				getAccessElements().addAll((Collection<? extends HwAccessElement>)newValue);
				return;
			case AmaltheaPackage.PROCESSING_UNIT__CACHES:
				getCaches().clear();
				getCaches().addAll((Collection<? extends Cache>)newValue);
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
			case AmaltheaPackage.PROCESSING_UNIT__DEFINITION:
				setDefinition((ProcessingUnitDefinition)null);
				return;
			case AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS:
				getAccessElements().clear();
				return;
			case AmaltheaPackage.PROCESSING_UNIT__CACHES:
				getCaches().clear();
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
			case AmaltheaPackage.PROCESSING_UNIT__DEFINITION:
				return definition != null;
			case AmaltheaPackage.PROCESSING_UNIT__ACCESS_ELEMENTS:
				return accessElements != null && !accessElements.isEmpty();
			case AmaltheaPackage.PROCESSING_UNIT__CACHES:
				return caches != null && !caches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessingUnitImpl
