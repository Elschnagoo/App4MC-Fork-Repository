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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ReferableObject;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CallArgumentImpl#getContainingCall <em>Containing Call</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CallArgumentImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CallArgumentImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallArgumentImpl extends ReferableObjectImpl implements CallArgument {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected RunnableParameter parameter;

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
	protected CallArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCallArgument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableCall getContainingCall() {
		if (eContainerFeatureID() != AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL) return null;
		return (RunnableCall)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableCall basicGetContainingCall() {
		if (eContainerFeatureID() != AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL) return null;
		return (RunnableCall)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunnableParameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (RunnableParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.CALL_ARGUMENT__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableParameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(RunnableParameter newParameter) {
		RunnableParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CALL_ARGUMENT__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(DataDependency newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject)dependsOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON, null, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject)newDependsOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON, null, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON, newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		String _xifexpression = null;
		boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(super.getName());
		if (_isNullOrEmpty) {
			_xifexpression = "access.1";
		}
		else {
			_xifexpression = super.getName();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeUniqueName() {
		RunnableCall _containingCall = this.getContainingCall();
		org.eclipse.app4mc.amalthea.model.Runnable _containingRunnable = null;
		if (_containingCall!=null) {
			_containingRunnable=_containingCall.getContainingRunnable();
		}
		String _name = null;
		if (_containingRunnable!=null) {
			_name=_containingRunnable.getName();
		}
		String _encode = this.encode(_name);
		String _plus = (_encode + "/calls/");
		RunnableCall _containingCall_1 = this.getContainingCall();
		org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
		if (_containingCall_1!=null) {
			_runnable=_containingCall_1.getRunnable();
		}
		String _name_1 = null;
		if (_runnable!=null) {
			_name_1=_runnable.getName();
		}
		String _encode_1 = this.encode(_name_1);
		String _plus_1 = (_plus + _encode_1);
		String _plus_2 = (_plus_1 + "/param/");
		RunnableParameter _parameter = this.getParameter();
		String _name_2 = null;
		if (_parameter!=null) {
			_name_2=_parameter.getName();
		}
		String _encode_2 = this.encode(_name_2);
		String _plus_3 = (_plus_2 + _encode_2);
		String _plus_4 = (_plus_3 + "/");
		String _encode_3 = this.encode(this.getName());
		String _plus_5 = (_plus_4 + _encode_3);
		String _plus_6 = (_plus_5 + "?type=");
		String _name_3 = this.eClass().getName();
		return (_plus_6 + _name_3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL, msgs);
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
			case AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL:
				return eBasicSetContainer(null, AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL, msgs);
			case AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON:
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
			case AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.RUNNABLE_CALL__ARGUMENTS, RunnableCall.class, msgs);
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
			case AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL:
				if (resolve) return getContainingCall();
				return basicGetContainingCall();
			case AmaltheaPackage.CALL_ARGUMENT__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON:
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
			case AmaltheaPackage.CALL_ARGUMENT__PARAMETER:
				setParameter((RunnableParameter)newValue);
				return;
			case AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON:
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
			case AmaltheaPackage.CALL_ARGUMENT__PARAMETER:
				setParameter((RunnableParameter)null);
				return;
			case AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON:
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
			case AmaltheaPackage.CALL_ARGUMENT__CONTAINING_CALL:
				return basicGetContainingCall() != null;
			case AmaltheaPackage.CALL_ARGUMENT__PARAMETER:
				return parameter != null;
			case AmaltheaPackage.CALL_ARGUMENT__DEPENDS_ON:
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
				case AmaltheaPackage.IREFERABLE___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.CALL_ARGUMENT___COMPUTE_UNIQUE_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ReferableObject.class) {
			switch (baseOperationID) {
				case AmaltheaPackage.REFERABLE_OBJECT___COMPUTE_UNIQUE_NAME: return AmaltheaPackage.CALL_ARGUMENT___COMPUTE_UNIQUE_NAME;
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
			case AmaltheaPackage.CALL_ARGUMENT___GET_NAME:
				return getName();
			case AmaltheaPackage.CALL_ARGUMENT___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CallArgumentImpl
