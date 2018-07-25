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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.DirectionType;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableParameterImpl#getContainingRunnable <em>Containing Runnable</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableParameterImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableParameterImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableParameterImpl extends ReferableBaseObjectImpl implements RunnableParameter {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition dataType;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected DataDependency dependsOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnableParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable getContainingRunnable() {
		if (eContainerFeatureID() != AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE) return null;
		return (org.eclipse.app4mc.amalthea.model.Runnable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.app4mc.amalthea.model.Runnable basicGetContainingRunnable() {
		if (eContainerFeatureID() != AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE) return null;
		return (org.eclipse.app4mc.amalthea.model.Runnable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (TypeDefinition)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE_PARAMETER__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(TypeDefinition newDataType) {
		TypeDefinition oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PARAMETER__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDependency getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOn(DataDependency newDependsOn, NotificationChain msgs) {
		DataDependency oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(DataDependency newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject)dependsOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON, null, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject)newDependsOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON, null, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON, newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		org.eclipse.app4mc.amalthea.model.Runnable _containingRunnable = this.getContainingRunnable();
		String _name = null;
		if (_containingRunnable!=null) {
			_name=_containingRunnable.getName();
		}
		return this.basicComputeUniqueNameWithPrefix(_name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		org.eclipse.app4mc.amalthea.model.Runnable _containingRunnable = this.getContainingRunnable();
		String _name = null;
		if (_containingRunnable!=null) {
			_name=_containingRunnable.getName();
		}
		final String runName = _name;
		String _xifexpression = null;
		boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(runName);
		if (_isNullOrEmpty) {
			_xifexpression = "<runnable>";
		}
		else {
			_xifexpression = runName;
		}
		String _plus = (_xifexpression + "::");
		String _xifexpression_1 = null;
		boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(this.getName());
		if (_isNullOrEmpty_1) {
			_xifexpression_1 = "<parameter>";
		}
		else {
			_xifexpression_1 = this.getName();
		}
		return (_plus + _xifexpression_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE, msgs);
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
			case AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE:
				return eBasicSetContainer(null, AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE, msgs);
			case AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON:
				return basicSetDependsOn(null, msgs);
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
			case AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.RUNNABLE__PARAMETERS, org.eclipse.app4mc.amalthea.model.Runnable.class, msgs);
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
			case AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE:
				if (resolve) return getContainingRunnable();
				return basicGetContainingRunnable();
			case AmaltheaPackage.RUNNABLE_PARAMETER__DIRECTION:
				return getDirection();
			case AmaltheaPackage.RUNNABLE_PARAMETER__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON:
				return getDependsOn();
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
			case AmaltheaPackage.RUNNABLE_PARAMETER__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DATA_TYPE:
				setDataType((TypeDefinition)newValue);
				return;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON:
				setDependsOn((DataDependency)newValue);
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
			case AmaltheaPackage.RUNNABLE_PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DATA_TYPE:
				setDataType((TypeDefinition)null);
				return;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON:
				setDependsOn((DataDependency)null);
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
			case AmaltheaPackage.RUNNABLE_PARAMETER__CONTAINING_RUNNABLE:
				return basicGetContainingRunnable() != null;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DATA_TYPE:
				return dataType != null;
			case AmaltheaPackage.RUNNABLE_PARAMETER__DEPENDS_ON:
				return dependsOn != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IReferable.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.RUNNABLE_PARAMETER___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ReferableBaseObject.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.RUNNABLE_PARAMETER___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.RUNNABLE_PARAMETER___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.RUNNABLE_PARAMETER___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RunnableParameterImpl
