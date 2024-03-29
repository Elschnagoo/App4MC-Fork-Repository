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

import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint;
import org.eclipse.app4mc.amalthea.model.AbstractMemoryElement;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element Mapping Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingConstraintImpl#getAbstractElement <em>Abstract Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElementMappingConstraintImpl extends MemoryMappingConstraintImpl implements AbstractElementMappingConstraint {
	/**
	 * The cached value of the '{@link #getAbstractElement() <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractMemoryElement abstractElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementMappingConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAbstractElementMappingConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMemoryElement getAbstractElement() {
		if (abstractElement != null && abstractElement.eIsProxy()) {
			InternalEObject oldAbstractElement = (InternalEObject)abstractElement;
			abstractElement = (AbstractMemoryElement)eResolveProxy(oldAbstractElement);
			if (abstractElement != oldAbstractElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
			}
		}
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMemoryElement basicGetAbstractElement() {
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractElement(AbstractMemoryElement newAbstractElement) {
		AbstractMemoryElement oldAbstractElement = abstractElement;
		abstractElement = newAbstractElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT:
				if (resolve) return getAbstractElement();
				return basicGetAbstractElement();
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT:
				setAbstractElement((AbstractMemoryElement)newValue);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT:
				setAbstractElement((AbstractMemoryElement)null);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT:
				return abstractElement != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractElementMappingConstraintImpl
