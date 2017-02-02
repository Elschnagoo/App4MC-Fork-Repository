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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.Port;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.Tag;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getSemaphores <em>Semaphores</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ComponentImpl#getOsEvents <em>Os Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ReferableBaseObjectImpl implements Component {
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractProcess> tasks;

	/**
	 * The cached value of the '{@link #getRunnables() <em>Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.app4mc.amalthea.model.Runnable> runnables;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getSemaphores() <em>Semaphores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemaphores()
	 * @generated
	 * @ordered
	 */
	protected EList<Semaphore> semaphores;

	/**
	 * The cached value of the '{@link #getOsEvents() <em>Os Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEvent> osEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.COMPONENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, AmaltheaPackage.COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractProcess> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<AbstractProcess>(AbstractProcess.class, this, AmaltheaPackage.COMPONENT__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables() {
		if (runnables == null) {
			runnables = new EObjectResolvingEList<org.eclipse.app4mc.amalthea.model.Runnable>(org.eclipse.app4mc.amalthea.model.Runnable.class, this, AmaltheaPackage.COMPONENT__RUNNABLES);
		}
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectResolvingEList<Label>(Label.class, this, AmaltheaPackage.COMPONENT__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semaphore> getSemaphores() {
		if (semaphores == null) {
			semaphores = new EObjectResolvingEList<Semaphore>(Semaphore.class, this, AmaltheaPackage.COMPONENT__SEMAPHORES);
		}
		return semaphores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEvent> getOsEvents() {
		if (osEvents == null) {
			osEvents = new EObjectResolvingEList<OsEvent>(OsEvent.class, this, AmaltheaPackage.COMPONENT__OS_EVENTS);
		}
		return osEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.COMPONENT__TAGS:
				return getTags();
			case AmaltheaPackage.COMPONENT__PORTS:
				return getPorts();
			case AmaltheaPackage.COMPONENT__TASKS:
				return getTasks();
			case AmaltheaPackage.COMPONENT__RUNNABLES:
				return getRunnables();
			case AmaltheaPackage.COMPONENT__LABELS:
				return getLabels();
			case AmaltheaPackage.COMPONENT__SEMAPHORES:
				return getSemaphores();
			case AmaltheaPackage.COMPONENT__OS_EVENTS:
				return getOsEvents();
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
			case AmaltheaPackage.COMPONENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case AmaltheaPackage.COMPONENT__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends AbstractProcess>)newValue);
				return;
			case AmaltheaPackage.COMPONENT__RUNNABLES:
				getRunnables().clear();
				getRunnables().addAll((Collection<? extends org.eclipse.app4mc.amalthea.model.Runnable>)newValue);
				return;
			case AmaltheaPackage.COMPONENT__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case AmaltheaPackage.COMPONENT__SEMAPHORES:
				getSemaphores().clear();
				getSemaphores().addAll((Collection<? extends Semaphore>)newValue);
				return;
			case AmaltheaPackage.COMPONENT__OS_EVENTS:
				getOsEvents().clear();
				getOsEvents().addAll((Collection<? extends OsEvent>)newValue);
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
			case AmaltheaPackage.COMPONENT__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
			case AmaltheaPackage.COMPONENT__TASKS:
				getTasks().clear();
				return;
			case AmaltheaPackage.COMPONENT__RUNNABLES:
				getRunnables().clear();
				return;
			case AmaltheaPackage.COMPONENT__LABELS:
				getLabels().clear();
				return;
			case AmaltheaPackage.COMPONENT__SEMAPHORES:
				getSemaphores().clear();
				return;
			case AmaltheaPackage.COMPONENT__OS_EVENTS:
				getOsEvents().clear();
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
			case AmaltheaPackage.COMPONENT__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case AmaltheaPackage.COMPONENT__TASKS:
				return tasks != null && !tasks.isEmpty();
			case AmaltheaPackage.COMPONENT__RUNNABLES:
				return runnables != null && !runnables.isEmpty();
			case AmaltheaPackage.COMPONENT__LABELS:
				return labels != null && !labels.isEmpty();
			case AmaltheaPackage.COMPONENT__SEMAPHORES:
				return semaphores != null && !semaphores.isEmpty();
			case AmaltheaPackage.COMPONENT__OS_EVENTS:
				return osEvents != null && !osEvents.isEmpty();
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
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.COMPONENT__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.COMPONENT__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentImpl
