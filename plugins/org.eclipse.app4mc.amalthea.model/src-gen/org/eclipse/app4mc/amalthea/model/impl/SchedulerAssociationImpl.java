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
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation;
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAssociationImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAssociationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAssociationImpl#getSchedulingParameters <em>Scheduling Parameters</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SchedulerAssociationImpl#getParameterExtensions <em>Parameter Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerAssociationImpl extends AmaltheaExtendedEObjectImpl implements SchedulerAssociation {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected TaskScheduler parent;

	/**
	 * The cached value of the '{@link #getSchedulingParameters() <em>Scheduling Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingParameters()
	 * @generated
	 * @ordered
	 */
	protected SchedulingParameters schedulingParameters;

	/**
	 * The cached value of the '{@link #getParameterExtensions() <em>Parameter Extensions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterExtensions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameterExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSchedulerAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler getChild() {
		if (eContainerFeatureID() != AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD) return null;
		return (TaskScheduler)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler basicGetChild() {
		if (eContainerFeatureID() != AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD) return null;
		return (TaskScheduler)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (TaskScheduler)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.SCHEDULER_ASSOCIATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TaskScheduler newParent) {
		TaskScheduler oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_ASSOCIATION__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingParameters getSchedulingParameters() {
		return schedulingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulingParameters(SchedulingParameters newSchedulingParameters, NotificationChain msgs) {
		SchedulingParameters oldSchedulingParameters = schedulingParameters;
		schedulingParameters = newSchedulingParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS, oldSchedulingParameters, newSchedulingParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingParameters(SchedulingParameters newSchedulingParameters) {
		if (newSchedulingParameters != schedulingParameters) {
			NotificationChain msgs = null;
			if (schedulingParameters != null)
				msgs = ((InternalEObject)schedulingParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS, null, msgs);
			if (newSchedulingParameters != null)
				msgs = ((InternalEObject)newSchedulingParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS, null, msgs);
			msgs = basicSetSchedulingParameters(newSchedulingParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS, newSchedulingParameters, newSchedulingParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameterExtensions() {
		if (parameterExtensions == null) {
			parameterExtensions = new EcoreEMap<String,String>(AmaltheaPackage.eINSTANCE.getParameterExtension(), ParameterExtensionImpl.class, this, AmaltheaPackage.SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS);
		}
		return parameterExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD, msgs);
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
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD:
				return eBasicSetContainer(null, AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD, msgs);
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS:
				return basicSetSchedulingParameters(null, msgs);
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS:
				return ((InternalEList<?>)getParameterExtensions()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD:
				return eInternalContainer().eInverseRemove(this, AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION, TaskScheduler.class, msgs);
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
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS:
				return getSchedulingParameters();
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS:
				if (coreType) return getParameterExtensions();
				else return getParameterExtensions().map();
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
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARENT:
				setParent((TaskScheduler)newValue);
				return;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS:
				setSchedulingParameters((SchedulingParameters)newValue);
				return;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS:
				((EStructuralFeature.Setting)getParameterExtensions()).set(newValue);
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
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARENT:
				setParent((TaskScheduler)null);
				return;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS:
				setSchedulingParameters((SchedulingParameters)null);
				return;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS:
				getParameterExtensions().clear();
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
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__CHILD:
				return basicGetChild() != null;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARENT:
				return parent != null;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__SCHEDULING_PARAMETERS:
				return schedulingParameters != null;
			case AmaltheaPackage.SCHEDULER_ASSOCIATION__PARAMETER_EXTENSIONS:
				return parameterExtensions != null && !parameterExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchedulerAssociationImpl
