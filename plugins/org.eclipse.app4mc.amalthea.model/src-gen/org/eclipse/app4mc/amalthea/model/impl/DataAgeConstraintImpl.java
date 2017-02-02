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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataAge;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.Label;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Age Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeConstraintImpl#getRunnable <em>Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeConstraintImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.DataAgeConstraintImpl#getDataAge <em>Data Age</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAgeConstraintImpl extends ReferableBaseObjectImpl implements DataAgeConstraint {
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
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The cached value of the '{@link #getDataAge() <em>Data Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataAge()
	 * @generated
	 * @ordered
	 */
	protected DataAge dataAge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAgeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getDataAgeConstraint();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DATA_AGE_CONSTRAINT__RUNNABLE, oldRunnable, runnable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_CONSTRAINT__RUNNABLE, oldRunnable, runnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (Label)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.DATA_AGE_CONSTRAINT__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_CONSTRAINT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAge getDataAge() {
		return dataAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAge(DataAge newDataAge, NotificationChain msgs) {
		DataAge oldDataAge = dataAge;
		dataAge = newDataAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE, oldDataAge, newDataAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataAge(DataAge newDataAge) {
		if (newDataAge != dataAge) {
			NotificationChain msgs = null;
			if (dataAge != null)
				msgs = ((InternalEObject)dataAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE, null, msgs);
			if (newDataAge != null)
				msgs = ((InternalEObject)newDataAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE, null, msgs);
			msgs = basicSetDataAge(newDataAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE, newDataAge, newDataAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE:
				return basicSetDataAge(null, msgs);
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
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__RUNNABLE:
				if (resolve) return getRunnable();
				return basicGetRunnable();
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE:
				return getDataAge();
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
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)newValue);
				return;
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__LABEL:
				setLabel((Label)newValue);
				return;
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE:
				setDataAge((DataAge)newValue);
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
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__RUNNABLE:
				setRunnable((org.eclipse.app4mc.amalthea.model.Runnable)null);
				return;
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__LABEL:
				setLabel((Label)null);
				return;
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE:
				setDataAge((DataAge)null);
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
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__RUNNABLE:
				return runnable != null;
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__LABEL:
				return label != null;
			case AmaltheaPackage.DATA_AGE_CONSTRAINT__DATA_AGE:
				return dataAge != null;
		}
		return super.eIsSet(featureID);
	}

} //DataAgeConstraintImpl
