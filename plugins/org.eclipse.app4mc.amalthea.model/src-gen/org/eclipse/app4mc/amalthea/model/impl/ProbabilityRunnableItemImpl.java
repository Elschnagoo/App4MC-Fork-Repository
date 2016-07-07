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
import org.eclipse.app4mc.amalthea.model.ProbabilityRunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probability Runnable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProbabilityRunnableItemImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProbabilityRunnableItemImpl#getRunnableItem <em>Runnable Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilityRunnableItemImpl extends BaseObjectImpl implements ProbabilityRunnableItem {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected int probability = PROBABILITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityRunnableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProbabilityRunnableItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(int newProbability) {
		int oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__PROBABILITY, oldProbability, probability));
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
				NotificationChain msgs = oldRunnableItem.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, null, null);
				if (newRunnableItem.eInternalContainer() == null) {
					msgs = newRunnableItem.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, oldRunnableItem, runnableItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, oldRunnableItem, newRunnableItem);
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
				msgs = ((InternalEObject)runnableItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, null, msgs);
			if (newRunnableItem != null)
				msgs = ((InternalEObject)newRunnableItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, null, msgs);
			msgs = basicSetRunnableItem(newRunnableItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM, newRunnableItem, newRunnableItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM:
				return basicSetRunnableItem(null, msgs);
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
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__PROBABILITY:
				return getProbability();
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM:
				if (resolve) return getRunnableItem();
				return basicGetRunnableItem();
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
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__PROBABILITY:
				setProbability((Integer)newValue);
				return;
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM:
				setRunnableItem((RunnableItem)newValue);
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
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM:
				setRunnableItem((RunnableItem)null);
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
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case AmaltheaPackage.PROBABILITY_RUNNABLE_ITEM__RUNNABLE_ITEM:
				return runnableItem != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //ProbabilityRunnableItemImpl
