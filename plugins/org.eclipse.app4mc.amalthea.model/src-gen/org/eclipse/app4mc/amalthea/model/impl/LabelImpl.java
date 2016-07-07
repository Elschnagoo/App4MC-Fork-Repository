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
import org.eclipse.app4mc.amalthea.model.DataType;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelBuffering;

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
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#isBVolatile <em>BVolatile</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getBuffered <em>Buffered</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getLabelAccesses <em>Label Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends AbstractElementMemoryInformationImpl implements Label {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBVolatile() <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BVOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBVolatile() <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean bVolatile = BVOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final LabelBuffering BUFFERED_EDEFAULT = LabelBuffering._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffered()
	 * @generated
	 * @ordered
	 */
	protected LabelBuffering buffered = BUFFERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabelAccesses() <em>Label Accesses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelAccess> labelAccesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBVolatile() {
		return bVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBVolatile(boolean newBVolatile) {
		boolean oldBVolatile = bVolatile;
		bVolatile = newBVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__BVOLATILE, oldBVolatile, bVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelBuffering getBuffered() {
		return buffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffered(LabelBuffering newBuffered) {
		LabelBuffering oldBuffered = buffered;
		buffered = newBuffered == null ? BUFFERED_EDEFAULT : newBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__BUFFERED, oldBuffered, buffered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelAccess> getLabelAccesses() {
		if (labelAccesses == null) {
			labelAccesses = new EObjectWithInverseResolvingEList<LabelAccess>(LabelAccess.class, this, AmaltheaPackage.LABEL__LABEL_ACCESSES, AmaltheaPackage.LABEL_ACCESS__DATA_LINK_INT);
		}
		return labelAccesses;
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
			case AmaltheaPackage.LABEL__LABEL_ACCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabelAccesses()).basicAdd(otherEnd, msgs);
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
			case AmaltheaPackage.LABEL__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case AmaltheaPackage.LABEL__LABEL_ACCESSES:
				return ((InternalEList<?>)getLabelAccesses()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.LABEL__DATA_TYPE:
				return getDataType();
			case AmaltheaPackage.LABEL__CONSTANT:
				return isConstant();
			case AmaltheaPackage.LABEL__BVOLATILE:
				return isBVolatile();
			case AmaltheaPackage.LABEL__BUFFERED:
				return getBuffered();
			case AmaltheaPackage.LABEL__LABEL_ACCESSES:
				return getLabelAccesses();
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
			case AmaltheaPackage.LABEL__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case AmaltheaPackage.LABEL__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case AmaltheaPackage.LABEL__BVOLATILE:
				setBVolatile((Boolean)newValue);
				return;
			case AmaltheaPackage.LABEL__BUFFERED:
				setBuffered((LabelBuffering)newValue);
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
			case AmaltheaPackage.LABEL__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case AmaltheaPackage.LABEL__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__BVOLATILE:
				setBVolatile(BVOLATILE_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__BUFFERED:
				setBuffered(BUFFERED_EDEFAULT);
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
			case AmaltheaPackage.LABEL__DATA_TYPE:
				return dataType != null;
			case AmaltheaPackage.LABEL__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case AmaltheaPackage.LABEL__BVOLATILE:
				return bVolatile != BVOLATILE_EDEFAULT;
			case AmaltheaPackage.LABEL__BUFFERED:
				return buffered != BUFFERED_EDEFAULT;
			case AmaltheaPackage.LABEL__LABEL_ACCESSES:
				return labelAccesses != null && !labelAccesses.isEmpty();
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
		result.append(" (constant: ");
		result.append(constant);
		result.append(", bVolatile: ");
		result.append(bVolatile);
		result.append(", buffered: ");
		result.append(buffered);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
