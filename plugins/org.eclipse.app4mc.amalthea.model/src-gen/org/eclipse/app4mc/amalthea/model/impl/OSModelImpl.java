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
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.Semaphore;

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
 * An implementation of the model object '<em><b>OS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OSModelImpl#getOsDataConsistency <em>Os Data Consistency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OSModelImpl#getSemaphores <em>Semaphores</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OSModelImpl#getOperatingSystems <em>Operating Systems</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OSModelImpl#getOsOverheads <em>Os Overheads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSModelImpl extends BaseObjectImpl implements OSModel {
	/**
	 * The cached value of the '{@link #getOsDataConsistency() <em>Os Data Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsDataConsistency()
	 * @generated
	 * @ordered
	 */
	protected OsDataConsistency osDataConsistency;

	/**
	 * The cached value of the '{@link #getSemaphores() <em>Semaphores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphores()
	 * @generated
	 * @ordered
	 */
	protected EList<Semaphore> semaphores;

	/**
	 * The cached value of the '{@link #getOperatingSystems() <em>Operating Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingSystem> operatingSystems;

	/**
	 * The cached value of the '{@link #getOsOverheads() <em>Os Overheads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsOverheads()
	 * @generated
	 * @ordered
	 */
	protected EList<OsInstructions> osOverheads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOSModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsDataConsistency getOsDataConsistency() {
		return osDataConsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsDataConsistency(OsDataConsistency newOsDataConsistency, NotificationChain msgs) {
		OsDataConsistency oldOsDataConsistency = osDataConsistency;
		osDataConsistency = newOsDataConsistency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY, oldOsDataConsistency, newOsDataConsistency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsDataConsistency(OsDataConsistency newOsDataConsistency) {
		if (newOsDataConsistency != osDataConsistency) {
			NotificationChain msgs = null;
			if (osDataConsistency != null)
				msgs = ((InternalEObject)osDataConsistency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY, null, msgs);
			if (newOsDataConsistency != null)
				msgs = ((InternalEObject)newOsDataConsistency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY, null, msgs);
			msgs = basicSetOsDataConsistency(newOsDataConsistency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY, newOsDataConsistency, newOsDataConsistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semaphore> getSemaphores() {
		if (semaphores == null) {
			semaphores = new EObjectContainmentEList<Semaphore>(Semaphore.class, this, AmaltheaPackage.OS_MODEL__SEMAPHORES);
		}
		return semaphores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingSystem> getOperatingSystems() {
		if (operatingSystems == null) {
			operatingSystems = new EObjectContainmentEList<OperatingSystem>(OperatingSystem.class, this, AmaltheaPackage.OS_MODEL__OPERATING_SYSTEMS);
		}
		return operatingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsInstructions> getOsOverheads() {
		if (osOverheads == null) {
			osOverheads = new EObjectContainmentEList<OsInstructions>(OsInstructions.class, this, AmaltheaPackage.OS_MODEL__OS_OVERHEADS);
		}
		return osOverheads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY:
				return basicSetOsDataConsistency(null, msgs);
			case AmaltheaPackage.OS_MODEL__SEMAPHORES:
				return ((InternalEList<?>)getSemaphores()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.OS_MODEL__OPERATING_SYSTEMS:
				return ((InternalEList<?>)getOperatingSystems()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.OS_MODEL__OS_OVERHEADS:
				return ((InternalEList<?>)getOsOverheads()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY:
				return getOsDataConsistency();
			case AmaltheaPackage.OS_MODEL__SEMAPHORES:
				return getSemaphores();
			case AmaltheaPackage.OS_MODEL__OPERATING_SYSTEMS:
				return getOperatingSystems();
			case AmaltheaPackage.OS_MODEL__OS_OVERHEADS:
				return getOsOverheads();
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
			case AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY:
				setOsDataConsistency((OsDataConsistency)newValue);
				return;
			case AmaltheaPackage.OS_MODEL__SEMAPHORES:
				getSemaphores().clear();
				getSemaphores().addAll((Collection<? extends Semaphore>)newValue);
				return;
			case AmaltheaPackage.OS_MODEL__OPERATING_SYSTEMS:
				getOperatingSystems().clear();
				getOperatingSystems().addAll((Collection<? extends OperatingSystem>)newValue);
				return;
			case AmaltheaPackage.OS_MODEL__OS_OVERHEADS:
				getOsOverheads().clear();
				getOsOverheads().addAll((Collection<? extends OsInstructions>)newValue);
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
			case AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY:
				setOsDataConsistency((OsDataConsistency)null);
				return;
			case AmaltheaPackage.OS_MODEL__SEMAPHORES:
				getSemaphores().clear();
				return;
			case AmaltheaPackage.OS_MODEL__OPERATING_SYSTEMS:
				getOperatingSystems().clear();
				return;
			case AmaltheaPackage.OS_MODEL__OS_OVERHEADS:
				getOsOverheads().clear();
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
			case AmaltheaPackage.OS_MODEL__OS_DATA_CONSISTENCY:
				return osDataConsistency != null;
			case AmaltheaPackage.OS_MODEL__SEMAPHORES:
				return semaphores != null && !semaphores.isEmpty();
			case AmaltheaPackage.OS_MODEL__OPERATING_SYSTEMS:
				return operatingSystems != null && !operatingSystems.isEmpty();
			case AmaltheaPackage.OS_MODEL__OS_OVERHEADS:
				return osOverheads != null && !osOverheads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OSModelImpl
