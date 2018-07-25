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
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.INamed;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Access Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl#getContainingAccessElement <em>Containing Access Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwAccessPathImpl#getMemOffset <em>Mem Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwAccessPathImpl extends HwPathImpl implements HwAccessPath {
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
	 * The cached value of the '{@link #getPathElements() <em>Path Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HwPathElement> pathElements;

	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long START_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected long startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long END_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected long endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemOffset() <em>Mem Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemOffset()
	 * @generated
	 * @ordered
	 */
	protected static final long MEM_OFFSET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMemOffset() <em>Mem Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemOffset()
	 * @generated
	 * @ordered
	 */
	protected long memOffset = MEM_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwAccessPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwAccessPath();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_PATH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwAccessElement getContainingAccessElement() {
		if (eContainerFeatureID() != AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT) return null;
		return (HwAccessElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwAccessElement basicGetContainingAccessElement() {
		if (eContainerFeatureID() != AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT) return null;
		return (HwAccessElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwPathElement> getPathElements() {
		if (pathElements == null) {
			pathElements = new EObjectResolvingEList<HwPathElement>(HwPathElement.class, this, AmaltheaPackage.HW_ACCESS_PATH__PATH_ELEMENTS);
		}
		return pathElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(long newStartAddress) {
		long oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_PATH__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAddress(long newEndAddress) {
		long oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_PATH__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMemOffset() {
		return memOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemOffset(long newMemOffset) {
		long oldMemOffset = memOffset;
		memOffset = newMemOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_ACCESS_PATH__MEM_OFFSET, oldMemOffset, memOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT, msgs);
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
			case AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT:
				return eBasicSetContainer(null, AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.HW_ACCESS_ELEMENT__ACCESS_PATH, HwAccessElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.HW_ACCESS_PATH__NAME:
				return getName();
			case AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT:
				if (resolve) return getContainingAccessElement();
				return basicGetContainingAccessElement();
			case AmaltheaPackage.HW_ACCESS_PATH__PATH_ELEMENTS:
				return getPathElements();
			case AmaltheaPackage.HW_ACCESS_PATH__START_ADDRESS:
				return getStartAddress();
			case AmaltheaPackage.HW_ACCESS_PATH__END_ADDRESS:
				return getEndAddress();
			case AmaltheaPackage.HW_ACCESS_PATH__MEM_OFFSET:
				return getMemOffset();
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
			case AmaltheaPackage.HW_ACCESS_PATH__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__PATH_ELEMENTS:
				getPathElements().clear();
				getPathElements().addAll((Collection<? extends HwPathElement>)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__START_ADDRESS:
				setStartAddress((Long)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__END_ADDRESS:
				setEndAddress((Long)newValue);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__MEM_OFFSET:
				setMemOffset((Long)newValue);
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
			case AmaltheaPackage.HW_ACCESS_PATH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__PATH_ELEMENTS:
				getPathElements().clear();
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.HW_ACCESS_PATH__MEM_OFFSET:
				setMemOffset(MEM_OFFSET_EDEFAULT);
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
			case AmaltheaPackage.HW_ACCESS_PATH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.HW_ACCESS_PATH__CONTAINING_ACCESS_ELEMENT:
				return basicGetContainingAccessElement() != null;
			case AmaltheaPackage.HW_ACCESS_PATH__PATH_ELEMENTS:
				return pathElements != null && !pathElements.isEmpty();
			case AmaltheaPackage.HW_ACCESS_PATH__START_ADDRESS:
				return startAddress != START_ADDRESS_EDEFAULT;
			case AmaltheaPackage.HW_ACCESS_PATH__END_ADDRESS:
				return endAddress != END_ADDRESS_EDEFAULT;
			case AmaltheaPackage.HW_ACCESS_PATH__MEM_OFFSET:
				return memOffset != MEM_OFFSET_EDEFAULT;
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
				case AmaltheaPackage.HW_ACCESS_PATH__NAME: return AmaltheaPackage.INAMED__NAME;
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
				case AmaltheaPackage.INAMED__NAME: return AmaltheaPackage.HW_ACCESS_PATH__NAME;
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
		result.append(", startAddress: ");
		result.append(startAddress);
		result.append(", endAddress: ");
		result.append(endAddress);
		result.append(", memOffset: ");
		result.append(memOffset);
		result.append(')');
		return result.toString();
	}

} //HwAccessPathImpl
