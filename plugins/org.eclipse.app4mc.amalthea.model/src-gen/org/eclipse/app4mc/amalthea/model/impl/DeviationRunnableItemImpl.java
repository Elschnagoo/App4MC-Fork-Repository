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
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.DeviationRunnableItem;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.RunnableItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviation Runnable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DeviationRunnableItemImpl#getRunnableItem <em>Runnable Item</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DeviationRunnableItemImpl#getDeviation <em>Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviationRunnableItemImpl extends BaseObjectImpl implements DeviationRunnableItem {
	/**
	 * The cached value of the '{@link #getRunnableItem() <em>Runnable Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableItem()
	 * @generated
	 * @ordered
	 */
	protected RunnableItem runnableItem;

	/**
	 * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviation()
	 * @generated
	 * @ordered
	 */
	protected Deviation<LongObject> deviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviationRunnableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDeviationRunnableItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableItem getRunnableItem() {
		if (runnableItem != null && runnableItem.eIsProxy()) {
			InternalEObject oldRunnableItem = (InternalEObject)runnableItem;
			runnableItem = (RunnableItem)eResolveProxy(oldRunnableItem);
			if (runnableItem != oldRunnableItem) {
				InternalEObject newRunnableItem = (InternalEObject)runnableItem;
				NotificationChain msgs = oldRunnableItem.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, null, null);
				if (newRunnableItem.eInternalContainer() == null) {
					msgs = newRunnableItem.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, oldRunnableItem, runnableItem));
			}
		}
		return runnableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableItem basicGetRunnableItem() {
		return runnableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunnableItem(RunnableItem newRunnableItem, NotificationChain msgs) {
		RunnableItem oldRunnableItem = runnableItem;
		runnableItem = newRunnableItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, oldRunnableItem, newRunnableItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnableItem(RunnableItem newRunnableItem) {
		if (newRunnableItem != runnableItem) {
			NotificationChain msgs = null;
			if (runnableItem != null)
				msgs = ((InternalEObject)runnableItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, null, msgs);
			if (newRunnableItem != null)
				msgs = ((InternalEObject)newRunnableItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, null, msgs);
			msgs = basicSetRunnableItem(newRunnableItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM, newRunnableItem, newRunnableItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Deviation<LongObject> getDeviation() {
		if (deviation != null && deviation.eIsProxy()) {
			InternalEObject oldDeviation = (InternalEObject)deviation;
			deviation = (Deviation<LongObject>)eResolveProxy(oldDeviation);
			if (deviation != oldDeviation) {
				InternalEObject newDeviation = (InternalEObject)deviation;
				NotificationChain msgs = oldDeviation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, null, null);
				if (newDeviation.eInternalContainer() == null) {
					msgs = newDeviation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, oldDeviation, deviation));
			}
		}
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation<LongObject> basicGetDeviation() {
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviation(Deviation<LongObject> newDeviation, NotificationChain msgs) {
		Deviation<LongObject> oldDeviation = deviation;
		deviation = newDeviation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, oldDeviation, newDeviation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviation(Deviation<LongObject> newDeviation) {
		if (newDeviation != deviation) {
			NotificationChain msgs = null;
			if (deviation != null)
				msgs = ((InternalEObject)deviation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, null, msgs);
			if (newDeviation != null)
				msgs = ((InternalEObject)newDeviation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, null, msgs);
			msgs = basicSetDeviation(newDeviation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION, newDeviation, newDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM:
				return basicSetRunnableItem(null, msgs);
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION:
				return basicSetDeviation(null, msgs);
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
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM:
				if (resolve) return getRunnableItem();
				return basicGetRunnableItem();
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION:
				if (resolve) return getDeviation();
				return basicGetDeviation();
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
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM:
				setRunnableItem((RunnableItem)newValue);
				return;
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION:
				setDeviation((Deviation<LongObject>)newValue);
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
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM:
				setRunnableItem((RunnableItem)null);
				return;
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION:
				setDeviation((Deviation<LongObject>)null);
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
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__RUNNABLE_ITEM:
				return runnableItem != null;
			case AmaltheaPackage.DEVIATION_RUNNABLE_ITEM__DEVIATION:
				return deviation != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviationRunnableItemImpl
