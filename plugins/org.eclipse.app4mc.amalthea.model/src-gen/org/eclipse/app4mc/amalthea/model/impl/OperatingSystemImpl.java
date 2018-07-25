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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsInstructions;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;

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
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl#getOverhead <em>Overhead</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl#getTaskSchedulers <em>Task Schedulers</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl#getInterruptControllers <em>Interrupt Controllers</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OperatingSystemImpl#getOsDataConsistency <em>Os Data Consistency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemImpl extends BaseObjectImpl implements OperatingSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverhead() <em>Overhead</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead()
	 * @generated
	 * @ordered
	 */
	protected OsInstructions overhead;

	/**
	 * The cached value of the '{@link #getTaskSchedulers() <em>Task Schedulers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSchedulers()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskScheduler> taskSchedulers;

	/**
	 * The cached value of the '{@link #getInterruptControllers() <em>Interrupt Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<InterruptController> interruptControllers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOperatingSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OPERATING_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsInstructions getOverhead() {
		if (overhead != null && overhead.eIsProxy()) {
			InternalEObject oldOverhead = (InternalEObject)overhead;
			overhead = (OsInstructions)eResolveProxy(oldOverhead);
			if (overhead != oldOverhead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OPERATING_SYSTEM__OVERHEAD, oldOverhead, overhead));
			}
		}
		return overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsInstructions basicGetOverhead() {
		return overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverhead(OsInstructions newOverhead) {
		OsInstructions oldOverhead = overhead;
		overhead = newOverhead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OPERATING_SYSTEM__OVERHEAD, oldOverhead, overhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskScheduler> getTaskSchedulers() {
		if (taskSchedulers == null) {
			taskSchedulers = new EObjectContainmentEList<TaskScheduler>(TaskScheduler.class, this, AmaltheaPackage.OPERATING_SYSTEM__TASK_SCHEDULERS);
		}
		return taskSchedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptController> getInterruptControllers() {
		if (interruptControllers == null) {
			interruptControllers = new EObjectContainmentEList<InterruptController>(InterruptController.class, this, AmaltheaPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS);
		}
		return interruptControllers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY, oldOsDataConsistency, newOsDataConsistency);
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
				msgs = ((InternalEObject)osDataConsistency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY, null, msgs);
			if (newOsDataConsistency != null)
				msgs = ((InternalEObject)newOsDataConsistency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY, null, msgs);
			msgs = basicSetOsDataConsistency(newOsDataConsistency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY, newOsDataConsistency, newOsDataConsistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				return ((InternalEList<?>)getTaskSchedulers()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				return ((InternalEList<?>)getInterruptControllers()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY:
				return basicSetOsDataConsistency(null, msgs);
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
			case AmaltheaPackage.OPERATING_SYSTEM__NAME:
				return getName();
			case AmaltheaPackage.OPERATING_SYSTEM__OVERHEAD:
				if (resolve) return getOverhead();
				return basicGetOverhead();
			case AmaltheaPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				return getTaskSchedulers();
			case AmaltheaPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				return getInterruptControllers();
			case AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY:
				return getOsDataConsistency();
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
			case AmaltheaPackage.OPERATING_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__OVERHEAD:
				setOverhead((OsInstructions)newValue);
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				getTaskSchedulers().clear();
				getTaskSchedulers().addAll((Collection<? extends TaskScheduler>)newValue);
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				getInterruptControllers().clear();
				getInterruptControllers().addAll((Collection<? extends InterruptController>)newValue);
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY:
				setOsDataConsistency((OsDataConsistency)newValue);
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
			case AmaltheaPackage.OPERATING_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__OVERHEAD:
				setOverhead((OsInstructions)null);
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				getTaskSchedulers().clear();
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				getInterruptControllers().clear();
				return;
			case AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY:
				setOsDataConsistency((OsDataConsistency)null);
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
			case AmaltheaPackage.OPERATING_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.OPERATING_SYSTEM__OVERHEAD:
				return overhead != null;
			case AmaltheaPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				return taskSchedulers != null && !taskSchedulers.isEmpty();
			case AmaltheaPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				return interruptControllers != null && !interruptControllers.isEmpty();
			case AmaltheaPackage.OPERATING_SYSTEM__OS_DATA_CONSISTENCY:
				return osDataConsistency != null;
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
		if (baseClass == INamed.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.OPERATING_SYSTEM__NAME: return AmaltheaPackage.INAMED__NAME;
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
		if (baseClass == INamed.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.INAMED__NAME: return AmaltheaPackage.OPERATING_SYSTEM__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperatingSystemImpl
