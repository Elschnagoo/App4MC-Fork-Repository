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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping;
import org.eclipse.app4mc.amalthea.model.DataUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.BaseTypeDefinitionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.BaseTypeDefinitionImpl#getDataMapping <em>Data Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseTypeDefinitionImpl extends TypeDefinitionImpl implements BaseTypeDefinition {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected DataUnit size;

	/**
	 * The cached value of the '{@link #getDataMapping() <em>Data Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPlatformMapping> dataMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getBaseTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnit getSize() {
		if (size != null && size.eIsProxy()) {
			InternalEObject oldSize = (InternalEObject)size;
			size = (DataUnit)eResolveProxy(oldSize);
			if (size != oldSize) {
				InternalEObject newSize = (InternalEObject)size;
				NotificationChain msgs = oldSize.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, null, null);
				if (newSize.eInternalContainer() == null) {
					msgs = newSize.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, oldSize, size));
			}
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnit basicGetSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(DataUnit newSize, NotificationChain msgs) {
		DataUnit oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(DataUnit newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPlatformMapping> getDataMapping() {
		if (dataMapping == null) {
			dataMapping = new EObjectContainmentEList.Resolving<DataPlatformMapping>(DataPlatformMapping.class, this, AmaltheaPackage.BASE_TYPE_DEFINITION__DATA_MAPPING);
		}
		return dataMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE:
				return basicSetSize(null, msgs);
			case AmaltheaPackage.BASE_TYPE_DEFINITION__DATA_MAPPING:
				return ((InternalEList<?>)getDataMapping()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE:
				if (resolve) return getSize();
				return basicGetSize();
			case AmaltheaPackage.BASE_TYPE_DEFINITION__DATA_MAPPING:
				return getDataMapping();
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
			case AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE:
				setSize((DataUnit)newValue);
				return;
			case AmaltheaPackage.BASE_TYPE_DEFINITION__DATA_MAPPING:
				getDataMapping().clear();
				getDataMapping().addAll((Collection<? extends DataPlatformMapping>)newValue);
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
			case AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE:
				setSize((DataUnit)null);
				return;
			case AmaltheaPackage.BASE_TYPE_DEFINITION__DATA_MAPPING:
				getDataMapping().clear();
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
			case AmaltheaPackage.BASE_TYPE_DEFINITION__SIZE:
				return size != null;
			case AmaltheaPackage.BASE_TYPE_DEFINITION__DATA_MAPPING:
				return dataMapping != null && !dataMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaseTypeDefinitionImpl
