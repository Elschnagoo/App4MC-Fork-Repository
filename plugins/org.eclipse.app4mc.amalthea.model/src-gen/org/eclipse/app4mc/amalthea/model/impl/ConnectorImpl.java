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
import org.eclipse.app4mc.amalthea.model.Connector;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.QualifiedPort;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectorImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectorImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ConnectorImpl#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends BaseObjectImpl implements Connector {
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
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected QualifiedPort sourcePort;

	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected QualifiedPort targetPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getConnector();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.CONNECTOR__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort getSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcePort(QualifiedPort newSourcePort, NotificationChain msgs) {
		QualifiedPort oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTOR__SOURCE_PORT, oldSourcePort, newSourcePort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(QualifiedPort newSourcePort) {
		if (newSourcePort != sourcePort) {
			NotificationChain msgs = null;
			if (sourcePort != null)
				msgs = ((InternalEObject)sourcePort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTOR__SOURCE_PORT, null, msgs);
			if (newSourcePort != null)
				msgs = ((InternalEObject)newSourcePort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTOR__SOURCE_PORT, null, msgs);
			msgs = basicSetSourcePort(newSourcePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTOR__SOURCE_PORT, newSourcePort, newSourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort getTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPort(QualifiedPort newTargetPort, NotificationChain msgs) {
		QualifiedPort oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTOR__TARGET_PORT, oldTargetPort, newTargetPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(QualifiedPort newTargetPort) {
		if (newTargetPort != targetPort) {
			NotificationChain msgs = null;
			if (targetPort != null)
				msgs = ((InternalEObject)targetPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTOR__TARGET_PORT, null, msgs);
			if (newTargetPort != null)
				msgs = ((InternalEObject)newTargetPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CONNECTOR__TARGET_PORT, null, msgs);
			msgs = basicSetTargetPort(newTargetPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CONNECTOR__TARGET_PORT, newTargetPort, newTargetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CONNECTOR__SOURCE_PORT:
				return basicSetSourcePort(null, msgs);
			case AmaltheaPackage.CONNECTOR__TARGET_PORT:
				return basicSetTargetPort(null, msgs);
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
			case AmaltheaPackage.CONNECTOR__NAME:
				return getName();
			case AmaltheaPackage.CONNECTOR__TAGS:
				return getTags();
			case AmaltheaPackage.CONNECTOR__SOURCE_PORT:
				return getSourcePort();
			case AmaltheaPackage.CONNECTOR__TARGET_PORT:
				return getTargetPort();
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
			case AmaltheaPackage.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.CONNECTOR__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.CONNECTOR__SOURCE_PORT:
				setSourcePort((QualifiedPort)newValue);
				return;
			case AmaltheaPackage.CONNECTOR__TARGET_PORT:
				setTargetPort((QualifiedPort)newValue);
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
			case AmaltheaPackage.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.CONNECTOR__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.CONNECTOR__SOURCE_PORT:
				setSourcePort((QualifiedPort)null);
				return;
			case AmaltheaPackage.CONNECTOR__TARGET_PORT:
				setTargetPort((QualifiedPort)null);
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
			case AmaltheaPackage.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.CONNECTOR__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.CONNECTOR__SOURCE_PORT:
				return sourcePort != null;
			case AmaltheaPackage.CONNECTOR__TARGET_PORT:
				return targetPort != null;
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
				case AmaltheaPackage.CONNECTOR__NAME: return AmaltheaPackage.INAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.CONNECTOR__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
				case AmaltheaPackage.INAMED__NAME: return AmaltheaPackage.CONNECTOR__NAME;
				default: return -1;
			}
		}
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.CONNECTOR__TAGS;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
