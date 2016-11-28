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

import org.eclipse.app4mc.amalthea.model.AbstractElementMapping;
import org.eclipse.app4mc.amalthea.model.AbstractElementMemoryInformation;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingImpl#getAbstractElement <em>Abstract Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AbstractElementMappingImpl#getAbstractElementLinkInt <em>Abstract Element Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElementMappingImpl extends MappingImpl implements AbstractElementMapping {
	/**
	 * The cached value of the '{@link #getAbstractElement() <em>Abstract Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractElementMemoryInformation abstractElement;

	/**
	 * The cached value of the '{@link #getAbstractElementLinkInt() <em>Abstract Element Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractElementLinkInt()
	 * @generated
	 * @ordered
	 */
	protected AbstractElementMemoryInformation abstractElementLinkInt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAbstractElementMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementMemoryInformation getAbstractElement() {
		if (abstractElement != null && abstractElement.eIsProxy()) {
			InternalEObject oldAbstractElement = (InternalEObject)abstractElement;
			abstractElement = (AbstractElementMemoryInformation)eResolveProxy(oldAbstractElement);
			if (abstractElement != oldAbstractElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
			}
		}
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementMemoryInformation basicGetAbstractElement() {
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractElement(AbstractElementMemoryInformation newAbstractElement) {
		AbstractElementMemoryInformation oldAbstractElement = abstractElement;
		abstractElement = newAbstractElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT, oldAbstractElement, abstractElement));
 		//Additional setting transient value for transient bi-directional reference
 		setAbstractElementLinkInt(newAbstractElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementMemoryInformation getAbstractElementLinkInt() {
		if (abstractElementLinkInt != null && abstractElementLinkInt.eIsProxy()) {
			InternalEObject oldAbstractElementLinkInt = (InternalEObject)abstractElementLinkInt;
			abstractElementLinkInt = (AbstractElementMemoryInformation)eResolveProxy(oldAbstractElementLinkInt);
			if (abstractElementLinkInt != oldAbstractElementLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT, oldAbstractElementLinkInt, abstractElementLinkInt));
			}
		}
		return abstractElementLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElementMemoryInformation basicGetAbstractElementLinkInt() {
		return abstractElementLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractElementLinkInt(AbstractElementMemoryInformation newAbstractElementLinkInt, NotificationChain msgs) {
		AbstractElementMemoryInformation oldAbstractElementLinkInt = abstractElementLinkInt;
		abstractElementLinkInt = newAbstractElementLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT, oldAbstractElementLinkInt, newAbstractElementLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractElementLinkInt(AbstractElementMemoryInformation newAbstractElementLinkInt) {
		if (newAbstractElementLinkInt != abstractElementLinkInt) {
			NotificationChain msgs = null;
			if (abstractElementLinkInt != null)
				msgs = ((InternalEObject)abstractElementLinkInt).eInverseRemove(this, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS, AbstractElementMemoryInformation.class, msgs);
			if (newAbstractElementLinkInt != null)
				msgs = ((InternalEObject)newAbstractElementLinkInt).eInverseAdd(this, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS, AbstractElementMemoryInformation.class, msgs);
			msgs = basicSetAbstractElementLinkInt(newAbstractElementLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT, newAbstractElementLinkInt, newAbstractElementLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT:
				if (abstractElementLinkInt != null)
					msgs = ((InternalEObject)abstractElementLinkInt).eInverseRemove(this, AmaltheaPackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION__MAPPINGS, AbstractElementMemoryInformation.class, msgs);
				return basicSetAbstractElementLinkInt((AbstractElementMemoryInformation)otherEnd, msgs);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT:
				return basicSetAbstractElementLinkInt(null, msgs);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				if (resolve) return getAbstractElement();
				return basicGetAbstractElement();
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT:
				if (resolve) return getAbstractElementLinkInt();
				return basicGetAbstractElementLinkInt();
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				setAbstractElement((AbstractElementMemoryInformation)newValue);
				return;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT:
				setAbstractElementLinkInt((AbstractElementMemoryInformation)newValue);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				setAbstractElement((AbstractElementMemoryInformation)null);
				return;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT:
				setAbstractElementLinkInt((AbstractElementMemoryInformation)null);
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
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT:
				return abstractElement != null;
			case AmaltheaPackage.ABSTRACT_ELEMENT_MAPPING__ABSTRACT_ELEMENT_LINK_INT:
				return abstractElementLinkInt != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractElementMappingImpl
