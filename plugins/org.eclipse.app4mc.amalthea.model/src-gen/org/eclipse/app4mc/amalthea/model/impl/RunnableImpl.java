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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.CrossReferenceUtil;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getRunnableItems <em>Runnable Items</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#isCallback <em>Callback</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#isService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getAsilLevel <em>Asil Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getRunnableCalls <em>Runnable Calls</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getTaskRunnableCalls <em>Task Runnable Calls</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.RunnableImpl#getReferringComponents <em>Referring Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableImpl extends AbstractMemoryElementImpl implements org.eclipse.app4mc.amalthea.model.Runnable {
	/**
	 * The cached value of the '{@link #getRunnableItems() <em>Runnable Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnableItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RunnableItem> runnableItems;

	/**
	 * The cached value of the '{@link #getActivations() <em>Activations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<Activation> activations;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Time deadline;

	/**
	 * The default value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLBACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallback() <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallback()
	 * @generated
	 * @ordered
	 */
	protected boolean callback = CALLBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #isService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isService()
	 * @generated
	 * @ordered
	 */
	protected boolean service = SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsilLevel() <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ASILType ASIL_LEVEL_EDEFAULT = ASILType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAsilLevel() <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilLevel()
	 * @generated
	 * @ordered
	 */
	protected ASILType asilLevel = ASIL_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected Section section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getRunnable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableItem> getRunnableItems() {
		if (runnableItems == null) {
			runnableItems = new EObjectContainmentEList<RunnableItem>(RunnableItem.class, this, AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS);
		}
		return runnableItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activation> getActivations() {
		if (activations == null) {
			activations = new EObjectResolvingEList<Activation>(Activation.class, this, AmaltheaPackage.RUNNABLE__ACTIVATIONS);
		}
		return activations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadline(Time newDeadline, NotificationChain msgs) {
		Time oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__DEADLINE, oldDeadline, newDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Time newDeadline) {
		if (newDeadline != deadline) {
			NotificationChain msgs = null;
			if (deadline != null)
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.RUNNABLE__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__DEADLINE, newDeadline, newDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallback() {
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallback(boolean newCallback) {
		boolean oldCallback = callback;
		callback = newCallback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__CALLBACK, oldCallback, callback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(boolean newService) {
		boolean oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILType getAsilLevel() {
		return asilLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsilLevel(ASILType newAsilLevel) {
		ASILType oldAsilLevel = asilLevel;
		asilLevel = newAsilLevel == null ? ASIL_LEVEL_EDEFAULT : newAsilLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__ASIL_LEVEL, oldAsilLevel, asilLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getSection() {
		if (section != null && section.eIsProxy()) {
			InternalEObject oldSection = (InternalEObject)section;
			section = (Section)eResolveProxy(oldSection);
			if (section != oldSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.RUNNABLE__SECTION, oldSection, section));
			}
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(Section newSection) {
		Section oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.RUNNABLE__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunnableCall> getRunnableCalls() {
		return CrossReferenceUtil.<RunnableCall>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskRunnableCall> getTaskRunnableCalls() {
		return CrossReferenceUtil.<TaskRunnableCall>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getTaskRunnableCall_Runnable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getReferringComponents() {
		return CrossReferenceUtil.<Component>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getComponent_Runnables());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation getFirstActivation() {
		return IterableExtensions.<Activation>head(this.getActivations());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				return ((InternalEList<?>)getRunnableItems()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				return basicSetDeadline(null, msgs);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				return getRunnableItems();
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				return getActivations();
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				return getDeadline();
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				return isCallback();
			case AmaltheaPackage.RUNNABLE__SERVICE:
				return isService();
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				return getAsilLevel();
			case AmaltheaPackage.RUNNABLE__SECTION:
				if (resolve) return getSection();
				return basicGetSection();
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return getRunnableCalls();
			case AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS:
				return getTaskRunnableCalls();
			case AmaltheaPackage.RUNNABLE__REFERRING_COMPONENTS:
				return getReferringComponents();
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				getRunnableItems().clear();
				getRunnableItems().addAll((Collection<? extends RunnableItem>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				getActivations().clear();
				getActivations().addAll((Collection<? extends Activation>)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				setDeadline((Time)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				setCallback((Boolean)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				setService((Boolean)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				setAsilLevel((ASILType)newValue);
				return;
			case AmaltheaPackage.RUNNABLE__SECTION:
				setSection((Section)newValue);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				getRunnableItems().clear();
				return;
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				getActivations().clear();
				return;
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				setDeadline((Time)null);
				return;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				setCallback(CALLBACK_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				setAsilLevel(ASIL_LEVEL_EDEFAULT);
				return;
			case AmaltheaPackage.RUNNABLE__SECTION:
				setSection((Section)null);
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
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
				return runnableItems != null && !runnableItems.isEmpty();
			case AmaltheaPackage.RUNNABLE__ACTIVATIONS:
				return activations != null && !activations.isEmpty();
			case AmaltheaPackage.RUNNABLE__DEADLINE:
				return deadline != null;
			case AmaltheaPackage.RUNNABLE__CALLBACK:
				return callback != CALLBACK_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__SERVICE:
				return service != SERVICE_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				return asilLevel != ASIL_LEVEL_EDEFAULT;
			case AmaltheaPackage.RUNNABLE__SECTION:
				return section != null;
			case AmaltheaPackage.RUNNABLE__RUNNABLE_CALLS:
				return !getRunnableCalls().isEmpty();
			case AmaltheaPackage.RUNNABLE__TASK_RUNNABLE_CALLS:
				return !getTaskRunnableCalls().isEmpty();
			case AmaltheaPackage.RUNNABLE__REFERRING_COMPONENTS:
				return !getReferringComponents().isEmpty();
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
			case AmaltheaPackage.RUNNABLE___GET_FIRST_ACTIVATION:
				return getFirstActivation();
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
		result.append(" (callback: ");
		result.append(callback);
		result.append(", service: ");
		result.append(service);
		result.append(", asilLevel: ");
		result.append(asilLevel);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl
