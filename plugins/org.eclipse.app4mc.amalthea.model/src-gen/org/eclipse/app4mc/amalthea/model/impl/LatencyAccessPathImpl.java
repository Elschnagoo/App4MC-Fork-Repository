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

import java.lang.reflect.InvocationTargetException;

import java.net.URLEncoder;

import java.nio.charset.StandardCharsets;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency Access Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl#getUniqueName <em>Unique Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LatencyAccessPathImpl#getLatencies <em>Latencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyAccessPathImpl extends AmaltheaExtendedEObjectImpl implements LatencyAccessPath {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ComplexNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ComplexNode target;

	/**
	 * The cached value of the '{@link #getLatencies() <em>Latencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencies()
	 * @generated
	 * @ordered
	 */
	protected EList<LatencyAccessPathElement> latencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyAccessPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLatencyAccessPath();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_ACCESS_PATH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueName() {
		return this.computeUniqueName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ComplexNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ComplexNode newSource) {
		ComplexNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ComplexNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ComplexNode newTarget) {
		ComplexNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LatencyAccessPathElement> getLatencies() {
		if (latencies == null) {
			latencies = new EObjectContainmentEList<LatencyAccessPathElement>(LatencyAccessPathElement.class, this, AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES);
		}
		return latencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeUniqueName() {
		return this.basicComputeUniqueName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String basicComputeUniqueName() {
		String _encode = this.encode(this.getName());
		String _plus = (_encode + "?type=");
		String _name = this.eClass().getName();
		return (_plus + _name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String basicComputeUniqueNameWithPrefix(final String prefix) {
		String _encode = this.encode(prefix);
		String _plus = (_encode + "/");
		String _basicComputeUniqueName = this.basicComputeUniqueName();
		return (_plus + _basicComputeUniqueName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String encode(final String str) {
		try {
			String _xifexpression = null;
			boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(str);
			if (_isNullOrEmpty) {
				_xifexpression = "no-name";
			}
			else {
				_xifexpression = URLEncoder.encode(str, StandardCharsets.UTF_8.toString());
			}
			return _xifexpression;
		}
		catch (Throwable _e) {
			throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES:
				return ((InternalEList<?>)getLatencies()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.LATENCY_ACCESS_PATH__NAME:
				return getName();
			case AmaltheaPackage.LATENCY_ACCESS_PATH__UNIQUE_NAME:
				return getUniqueName();
			case AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES:
				return getLatencies();
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
			case AmaltheaPackage.LATENCY_ACCESS_PATH__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE:
				setSource((ComplexNode)newValue);
				return;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET:
				setTarget((ComplexNode)newValue);
				return;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES:
				getLatencies().clear();
				getLatencies().addAll((Collection<? extends LatencyAccessPathElement>)newValue);
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
			case AmaltheaPackage.LATENCY_ACCESS_PATH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE:
				setSource((ComplexNode)null);
				return;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET:
				setTarget((ComplexNode)null);
				return;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES:
				getLatencies().clear();
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
			case AmaltheaPackage.LATENCY_ACCESS_PATH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.LATENCY_ACCESS_PATH__UNIQUE_NAME:
				return UNIQUE_NAME_EDEFAULT == null ? getUniqueName() != null : !UNIQUE_NAME_EDEFAULT.equals(getUniqueName());
			case AmaltheaPackage.LATENCY_ACCESS_PATH__SOURCE:
				return source != null;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__TARGET:
				return target != null;
			case AmaltheaPackage.LATENCY_ACCESS_PATH__LATENCIES:
				return latencies != null && !latencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AmaltheaPackage.LATENCY_ACCESS_PATH___COMPUTE_UNIQUE_NAME:
				return computeUniqueName();
			case AmaltheaPackage.LATENCY_ACCESS_PATH___BASIC_COMPUTE_UNIQUE_NAME:
				return basicComputeUniqueName();
			case AmaltheaPackage.LATENCY_ACCESS_PATH___BASIC_COMPUTE_UNIQUE_NAME_WITH_PREFIX__STRING:
				return basicComputeUniqueNameWithPrefix((String)arguments.get(0));
			case AmaltheaPackage.LATENCY_ACCESS_PATH___ENCODE__STRING:
				return encode((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //LatencyAccessPathImpl
