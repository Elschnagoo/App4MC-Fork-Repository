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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.RunEntityCallStatistic;
import org.eclipse.app4mc.amalthea.model.RunnableCall;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableCallImpl#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableCallImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableCallImpl#getRunnableLinkInt <em>Runnable Link Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableCallImpl extends RunnableItemImpl implements RunnableCall {
	/**
	 * The cached value of the '{@link #getRunnable() <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable runnable;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected RunEntityCallStatistic statistic;

	/**
	 * The cached value of the '{@link #getRunnableLinkInt() <em>Runnable Link Int</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableLinkInt()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.app4mc.amalthea.model.Runnable runnableLinkInt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnableCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getRunnable() {
		if (runnable != null && runnable.eIsProxy()) {
			InternalEObject oldRunnable = (InternalEObject)runnable;
			runnable = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldRunnable);
			if (runnable != oldRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE, oldRunnable, runnable));
			}
		}
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetRunnable() {
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnable(org.eclipse.app4mc.amalthea.model.Runnable newRunnable) {
		org.eclipse.app4mc.amalthea.model.Runnable oldRunnable = runnable;
		runnable = newRunnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE, oldRunnable, runnable));
 		//Additional setting transient value for transient bi-directional reference
 		setRunnableLinkInt(newRunnable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunEntityCallStatistic getStatistic() {
		if (statistic != null && statistic.eIsProxy()) {
			InternalEObject oldStatistic = (InternalEObject)statistic;
			statistic = (RunEntityCallStatistic)eResolveProxy(oldStatistic);
			if (statistic != oldStatistic) {
				InternalEObject newStatistic = (InternalEObject)statistic;
				NotificationChain msgs = oldStatistic.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_CALL__STATISTIC, null, null);
				if (newStatistic.eInternalContainer() == null) {
					msgs = newStatistic.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_CALL__STATISTIC, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_CALL__STATISTIC, oldStatistic, statistic));
			}
		}
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunEntityCallStatistic basicGetStatistic() {
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistic(RunEntityCallStatistic newStatistic, NotificationChain msgs) {
		RunEntityCallStatistic oldStatistic = statistic;
		statistic = newStatistic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_CALL__STATISTIC, oldStatistic, newStatistic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistic(RunEntityCallStatistic newStatistic) {
		if (newStatistic != statistic) {
			NotificationChain msgs = null;
			if (statistic != null)
				msgs = ((InternalEObject)statistic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_CALL__STATISTIC, null, msgs);
			if (newStatistic != null)
				msgs = ((InternalEObject)newStatistic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_CALL__STATISTIC, null, msgs);
			msgs = basicSetStatistic(newStatistic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_CALL__STATISTIC, newStatistic, newStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getRunnableLinkInt() {
		if (runnableLinkInt != null && runnableLinkInt.eIsProxy()) {
			InternalEObject oldRunnableLinkInt = (InternalEObject)runnableLinkInt;
			runnableLinkInt = (org.eclipse.app4mc.amalthea.model.Runnable)eResolveProxy(oldRunnableLinkInt);
			if (runnableLinkInt != oldRunnableLinkInt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT, oldRunnableLinkInt, runnableLinkInt));
			}
		}
		return runnableLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetRunnableLinkInt() {
		return runnableLinkInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunnableLinkInt(org.eclipse.app4mc.amalthea.model.Runnable newRunnableLinkInt, NotificationChain msgs) {
		org.eclipse.app4mc.amalthea.model.Runnable oldRunnableLinkInt = runnableLinkInt;
		runnableLinkInt = newRunnableLinkInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT, oldRunnableLinkInt, newRunnableLinkInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnableLinkInt(org.eclipse.app4mc.amalthea.model.Runnable newRunnableLinkInt) {
		if (newRunnableLinkInt != runnableLinkInt) {
			NotificationChain msgs = null;
			if (runnableLinkInt != null)
				msgs = ((InternalEObject)runnableLinkInt).eInverseRemove(this, AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS, org.eclipse.app4mc.amalthea.model.Runnable.class, msgs);
			if (newRunnableLinkInt != null)
				msgs = ((InternalEObject)newRunnableLinkInt).eInverseAdd(this, AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS, org.eclipse.app4mc.amalthea.model.Runnable.class, msgs);
			msgs = basicSetRunnableLinkInt(newRunnableLinkInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT, newRunnableLinkInt, newRunnableLinkInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT:
				if (runnableLinkInt != null)
					msgs = ((InternalEObject)runnableLinkInt).eInverseRemove(this, AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS, org.eclipse.app4mc.amalthea.model.Runnable.class, msgs);
				return basicSetRunnableLinkInt((org.eclipse.app4mc.amalthea.model.Runnable)otherEnd, msgs);
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
			case AmaltheaPackage.RUNNABLE_CALL__STATISTIC:
				return basicSetStatistic(null, msgs);
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT:
				return basicSetRunnableLinkInt(null, msgs);
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
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE:
				if (resolve) return getRunnable();
				return basicGetRunnable();
			case AmaltheaPackage.RUNNABLE_CALL__STATISTIC:
				if (resolve) return getStatistic();
				return basicGetStatistic();
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT:
				if (resolve) return getRunnableLinkInt();
				return basicGetRunnableLinkInt();
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
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_CALL__STATISTIC:
				setStatistic((RunEntityCallStatistic)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT:
				setRunnableLinkInt((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
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
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.RUNNABLE_CALL__STATISTIC:
				setStatistic((RunEntityCallStatistic)null);
				return;
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT:
				setRunnableLinkInt((org.eclipse.app4mc.amalthea.model.Runnable)null);
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
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE:
				return runnable != null;
			case AmaltheaPackage.RUNNABLE_CALL__STATISTIC:
				return statistic != null;
			case AmaltheaPackage.RUNNABLE_CALL__RUNNABLE_LINK_INT:
				return runnableLinkInt != null;
		}
		return super.eIsSet(featureID);
	}

} //RunnableCallImpl
