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
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl#getSemaphoreType <em>Semaphore Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SemaphoreImpl#getSemaphoreAccesses <em>Semaphore Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemaphoreImpl extends ReferableBaseObjectImpl implements Semaphore {
	/**
	 * The default value of the '{@link #getSemaphoreType() <em>Semaphore Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphoreType()
	 * @generated
	 * @ordered
	 */
	protected static final SemaphoreType SEMAPHORE_TYPE_EDEFAULT = SemaphoreType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getSemaphoreType() <em>Semaphore Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphoreType()
	 * @generated
	 * @ordered
	 */
	protected SemaphoreType semaphoreType = SEMAPHORE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected int initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPriorityCeilingProtocol() <em>Priority Ceiling Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriorityCeilingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIORITY_CEILING_PROTOCOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPriorityCeilingProtocol() <em>Priority Ceiling Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriorityCeilingProtocol()
	 * @generated
	 * @ordered
	 */
	protected boolean priorityCeilingProtocol = PRIORITY_CEILING_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemaphoreAccesses() <em>Semaphore Accesses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphoreAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<SemaphoreAccess> semaphoreAccesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSemaphore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreType getSemaphoreType() {
		return semaphoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemaphoreType(SemaphoreType newSemaphoreType) {
		SemaphoreType oldSemaphoreType = semaphoreType;
		semaphoreType = newSemaphoreType == null ? SEMAPHORE_TYPE_EDEFAULT : newSemaphoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE__SEMAPHORE_TYPE, oldSemaphoreType, semaphoreType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(int newInitialValue) {
		int oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPriorityCeilingProtocol() {
		return priorityCeilingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityCeilingProtocol(boolean newPriorityCeilingProtocol) {
		boolean oldPriorityCeilingProtocol = priorityCeilingProtocol;
		priorityCeilingProtocol = newPriorityCeilingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SEMAPHORE__PRIORITY_CEILING_PROTOCOL, oldPriorityCeilingProtocol, priorityCeilingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemaphoreAccess> getSemaphoreAccesses() {
		if (semaphoreAccesses == null) {
			semaphoreAccesses = new EObjectWithInverseResolvingEList<SemaphoreAccess>(SemaphoreAccess.class, this, AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES, AmaltheaPackage.SEMAPHORE_ACCESS__SEMAPHORE_LINK_INT);
		}
		return semaphoreAccesses;
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
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemaphoreAccesses()).basicAdd(otherEnd, msgs);
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
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES:
				return ((InternalEList<?>)getSemaphoreAccesses()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_TYPE:
				return getSemaphoreType();
			case AmaltheaPackage.SEMAPHORE__INITIAL_VALUE:
				return getInitialValue();
			case AmaltheaPackage.SEMAPHORE__MAX_VALUE:
				return getMaxValue();
			case AmaltheaPackage.SEMAPHORE__PRIORITY_CEILING_PROTOCOL:
				return isPriorityCeilingProtocol();
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES:
				return getSemaphoreAccesses();
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
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_TYPE:
				setSemaphoreType((SemaphoreType)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE__INITIAL_VALUE:
				setInitialValue((Integer)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE__MAX_VALUE:
				setMaxValue((Integer)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE__PRIORITY_CEILING_PROTOCOL:
				setPriorityCeilingProtocol((Boolean)newValue);
				return;
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES:
				getSemaphoreAccesses().clear();
				getSemaphoreAccesses().addAll((Collection<? extends SemaphoreAccess>)newValue);
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
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_TYPE:
				setSemaphoreType(SEMAPHORE_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.SEMAPHORE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case AmaltheaPackage.SEMAPHORE__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case AmaltheaPackage.SEMAPHORE__PRIORITY_CEILING_PROTOCOL:
				setPriorityCeilingProtocol(PRIORITY_CEILING_PROTOCOL_EDEFAULT);
				return;
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES:
				getSemaphoreAccesses().clear();
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
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_TYPE:
				return semaphoreType != SEMAPHORE_TYPE_EDEFAULT;
			case AmaltheaPackage.SEMAPHORE__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
			case AmaltheaPackage.SEMAPHORE__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case AmaltheaPackage.SEMAPHORE__PRIORITY_CEILING_PROTOCOL:
				return priorityCeilingProtocol != PRIORITY_CEILING_PROTOCOL_EDEFAULT;
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_ACCESSES:
				return semaphoreAccesses != null && !semaphoreAccesses.isEmpty();
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
		result.append(" (semaphoreType: ");
		result.append(semaphoreType);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", priorityCeilingProtocol: ");
		result.append(priorityCeilingProtocol);
		result.append(')');
		return result.toString();
	}

} //SemaphoreImpl
