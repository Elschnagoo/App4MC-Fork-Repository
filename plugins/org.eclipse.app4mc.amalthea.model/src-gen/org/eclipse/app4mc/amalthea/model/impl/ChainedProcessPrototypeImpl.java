/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chained Process Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChainedProcessPrototypeImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChainedProcessPrototypeImpl#getApply <em>Apply</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChainedProcessPrototypeImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainedProcessPrototypeImpl extends BaseObjectImpl implements ChainedProcessPrototype {
	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected ProcessPrototype prototype;

	/**
	 * The default value of the '{@link #getApply() <em>Apply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply()
	 * @generated
	 * @ordered
	 */
	protected static final int APPLY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getApply() <em>Apply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply()
	 * @generated
	 * @ordered
	 */
	protected int apply = APPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainedProcessPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getChainedProcessPrototype();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessPrototype getPrototype() {
		if (prototype != null && prototype.eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (ProcessPrototype)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPrototype basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrototype(ProcessPrototype newPrototype) {
		ProcessPrototype oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE, oldPrototype, prototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getApply() {
		return apply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApply(int newApply) {
		int oldApply = apply;
		apply = newApply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__APPLY, oldApply, apply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__APPLY:
				return getApply();
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__OFFSET:
				return getOffset();
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
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE:
				setPrototype((ProcessPrototype)newValue);
				return;
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__APPLY:
				setApply((Integer)newValue);
				return;
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__OFFSET:
				setOffset((Integer)newValue);
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
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE:
				setPrototype((ProcessPrototype)null);
				return;
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__APPLY:
				setApply(APPLY_EDEFAULT);
				return;
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__PROTOTYPE:
				return prototype != null;
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__APPLY:
				return apply != APPLY_EDEFAULT;
			case AmaltheaPackage.CHAINED_PROCESS_PROTOTYPE__OFFSET:
				return offset != OFFSET_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (apply: ");
		result.append(apply);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //ChainedProcessPrototypeImpl
