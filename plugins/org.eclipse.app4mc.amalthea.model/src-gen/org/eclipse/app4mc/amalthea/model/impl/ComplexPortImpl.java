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
import org.eclipse.app4mc.amalthea.model.ComplexPort;
import org.eclipse.app4mc.amalthea.model.Network;
import org.eclipse.app4mc.amalthea.model.RWType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#isMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getAddressRange <em>Address Range</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getWriteCycles <em>Write Cycles</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getReadCycles <em>Read Cycles</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComplexPortImpl#getSchedValue <em>Sched Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexPortImpl extends HwPortImpl implements ComplexPort {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The default value of the '{@link #isMaster() <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaster() <em>Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean master = MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected int bitWidth = BIT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long BASE_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected long baseAddress = BASE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressRange() <em>Address Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressRange()
	 * @generated
	 * @ordered
	 */
	protected static final long ADDRESS_RANGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAddressRange() <em>Address Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressRange()
	 * @generated
	 * @ordered
	 */
	protected long addressRange = ADDRESS_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final RWType DIRECTION_EDEFAULT = RWType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected RWType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteCycles() <em>Write Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteCycles()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITE_CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWriteCycles() <em>Write Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteCycles()
	 * @generated
	 * @ordered
	 */
	protected int writeCycles = WRITE_CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadCycles() <em>Read Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCycles()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReadCycles() <em>Read Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadCycles()
	 * @generated
	 * @ordered
	 */
	protected int readCycles = READ_CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedValue() <em>Sched Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedValue()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHED_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSchedValue() <em>Sched Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedValue()
	 * @generated
	 * @ordered
	 */
	protected int schedValue = SCHED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getComplexPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.COMPLEX_PORT__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaster() {
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(boolean newMaster) {
		boolean oldMaster = master;
		master = newMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__MASTER, oldMaster, master));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitWidth() {
		return bitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitWidth(int newBitWidth) {
		int oldBitWidth = bitWidth;
		bitWidth = newBitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__BIT_WIDTH, oldBitWidth, bitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getBaseAddress() {
		return baseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddress(long newBaseAddress) {
		long oldBaseAddress = baseAddress;
		baseAddress = newBaseAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__BASE_ADDRESS, oldBaseAddress, baseAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAddressRange() {
		return addressRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressRange(long newAddressRange) {
		long oldAddressRange = addressRange;
		addressRange = newAddressRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__ADDRESS_RANGE, oldAddressRange, addressRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(RWType newDirection) {
		RWType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWriteCycles() {
		return writeCycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteCycles(int newWriteCycles) {
		int oldWriteCycles = writeCycles;
		writeCycles = newWriteCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__WRITE_CYCLES, oldWriteCycles, writeCycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReadCycles() {
		return readCycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadCycles(int newReadCycles) {
		int oldReadCycles = readCycles;
		readCycles = newReadCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__READ_CYCLES, oldReadCycles, readCycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSchedValue() {
		return schedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedValue(int newSchedValue) {
		int oldSchedValue = schedValue;
		schedValue = newSchedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.COMPLEX_PORT__SCHED_VALUE, oldSchedValue, schedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.COMPLEX_PORT__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case AmaltheaPackage.COMPLEX_PORT__MASTER:
				return isMaster();
			case AmaltheaPackage.COMPLEX_PORT__BIT_WIDTH:
				return getBitWidth();
			case AmaltheaPackage.COMPLEX_PORT__BASE_ADDRESS:
				return getBaseAddress();
			case AmaltheaPackage.COMPLEX_PORT__ADDRESS_RANGE:
				return getAddressRange();
			case AmaltheaPackage.COMPLEX_PORT__DIRECTION:
				return getDirection();
			case AmaltheaPackage.COMPLEX_PORT__WRITE_CYCLES:
				return getWriteCycles();
			case AmaltheaPackage.COMPLEX_PORT__READ_CYCLES:
				return getReadCycles();
			case AmaltheaPackage.COMPLEX_PORT__SCHED_VALUE:
				return getSchedValue();
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
			case AmaltheaPackage.COMPLEX_PORT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__MASTER:
				setMaster((Boolean)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__BIT_WIDTH:
				setBitWidth((Integer)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__BASE_ADDRESS:
				setBaseAddress((Long)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__ADDRESS_RANGE:
				setAddressRange((Long)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__DIRECTION:
				setDirection((RWType)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__WRITE_CYCLES:
				setWriteCycles((Integer)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__READ_CYCLES:
				setReadCycles((Integer)newValue);
				return;
			case AmaltheaPackage.COMPLEX_PORT__SCHED_VALUE:
				setSchedValue((Integer)newValue);
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
			case AmaltheaPackage.COMPLEX_PORT__NETWORK:
				setNetwork((Network)null);
				return;
			case AmaltheaPackage.COMPLEX_PORT__MASTER:
				setMaster(MASTER_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__BIT_WIDTH:
				setBitWidth(BIT_WIDTH_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__BASE_ADDRESS:
				setBaseAddress(BASE_ADDRESS_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__ADDRESS_RANGE:
				setAddressRange(ADDRESS_RANGE_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__WRITE_CYCLES:
				setWriteCycles(WRITE_CYCLES_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__READ_CYCLES:
				setReadCycles(READ_CYCLES_EDEFAULT);
				return;
			case AmaltheaPackage.COMPLEX_PORT__SCHED_VALUE:
				setSchedValue(SCHED_VALUE_EDEFAULT);
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
			case AmaltheaPackage.COMPLEX_PORT__NETWORK:
				return network != null;
			case AmaltheaPackage.COMPLEX_PORT__MASTER:
				return master != MASTER_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__BIT_WIDTH:
				return bitWidth != BIT_WIDTH_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__BASE_ADDRESS:
				return baseAddress != BASE_ADDRESS_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__ADDRESS_RANGE:
				return addressRange != ADDRESS_RANGE_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__WRITE_CYCLES:
				return writeCycles != WRITE_CYCLES_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__READ_CYCLES:
				return readCycles != READ_CYCLES_EDEFAULT;
			case AmaltheaPackage.COMPLEX_PORT__SCHED_VALUE:
				return schedValue != SCHED_VALUE_EDEFAULT;
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
		result.append(" (master: ");
		result.append(master);
		result.append(", bitWidth: ");
		result.append(bitWidth);
		result.append(", baseAddress: ");
		result.append(baseAddress);
		result.append(", addressRange: ");
		result.append(addressRange);
		result.append(", direction: ");
		result.append(direction);
		result.append(", writeCycles: ");
		result.append(writeCycles);
		result.append(", readCycles: ");
		result.append(readCycles);
		result.append(", schedValue: ");
		result.append(schedValue);
		result.append(')');
		return result.toString();
	}

} //ComplexPortImpl
