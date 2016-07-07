/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import java.util.Collection;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracingOverheadContainerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl#getEventDescription <em>Event Description</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl#getTracingOverheadContainer <em>Tracing Overhead Container</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.SchedulingEntityTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulingEntityTypeImpl extends UniqueElementTypeImpl implements SchedulingEntityType {
	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected ClockType clock;

	/**
	 * The cached value of the '{@link #getEventDescription() <em>Event Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDescription()
	 * @generated
	 * @ordered
	 */
	protected EventDescriptionType eventDescription;

	/**
	 * The cached value of the '{@link #getTracingOverheadContainer() <em>Tracing Overhead Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracingOverheadContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<TracingOverheadContainerType> tracingOverheadContainer;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulingEntityElementType> element;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected TracesType traces;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.SCHEDULING_ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClock(ClockType newClock, NotificationChain msgs) {
		ClockType oldClock = clock;
		clock = newClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK, oldClock, newClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(ClockType newClock) {
		if (newClock != clock) {
			NotificationChain msgs = null;
			if (clock != null)
				msgs = ((InternalEObject)clock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK, null, msgs);
			if (newClock != null)
				msgs = ((InternalEObject)newClock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK, null, msgs);
			msgs = basicSetClock(newClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK, newClock, newClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDescriptionType getEventDescription() {
		return eventDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDescription(EventDescriptionType newEventDescription, NotificationChain msgs) {
		EventDescriptionType oldEventDescription = eventDescription;
		eventDescription = newEventDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION, oldEventDescription, newEventDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDescription(EventDescriptionType newEventDescription) {
		if (newEventDescription != eventDescription) {
			NotificationChain msgs = null;
			if (eventDescription != null)
				msgs = ((InternalEObject)eventDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION, null, msgs);
			if (newEventDescription != null)
				msgs = ((InternalEObject)newEventDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION, null, msgs);
			msgs = basicSetEventDescription(newEventDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION, newEventDescription, newEventDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracingOverheadContainerType> getTracingOverheadContainer() {
		if (tracingOverheadContainer == null) {
			tracingOverheadContainer = new EObjectContainmentEList<TracingOverheadContainerType>(TracingOverheadContainerType.class, this, OT1Package.SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER);
		}
		return tracingOverheadContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulingEntityElementType> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<SchedulingEntityElementType>(SchedulingEntityElementType.class, this, OT1Package.SCHEDULING_ENTITY_TYPE__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesType getTraces() {
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraces(TracesType newTraces, NotificationChain msgs) {
		TracesType oldTraces = traces;
		traces = newTraces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__TRACES, oldTraces, newTraces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraces(TracesType newTraces) {
		if (newTraces != traces) {
			NotificationChain msgs = null;
			if (traces != null)
				msgs = ((InternalEObject)traces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_TYPE__TRACES, null, msgs);
			if (newTraces != null)
				msgs = ((InternalEObject)newTraces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.SCHEDULING_ENTITY_TYPE__TRACES, null, msgs);
			msgs = basicSetTraces(newTraces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__TRACES, newTraces, newTraces));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.SCHEDULING_ENTITY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK:
				return basicSetClock(null, msgs);
			case OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION:
				return basicSetEventDescription(null, msgs);
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER:
				return ((InternalEList<?>)getTracingOverheadContainer()).basicRemove(otherEnd, msgs);
			case OT1Package.SCHEDULING_ENTITY_TYPE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACES:
				return basicSetTraces(null, msgs);
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
			case OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK:
				return getClock();
			case OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION:
				return getEventDescription();
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER:
				return getTracingOverheadContainer();
			case OT1Package.SCHEDULING_ENTITY_TYPE__ELEMENT:
				return getElement();
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACES:
				return getTraces();
			case OT1Package.SCHEDULING_ENTITY_TYPE__NAME:
				return getName();
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
			case OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK:
				setClock((ClockType)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION:
				setEventDescription((EventDescriptionType)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER:
				getTracingOverheadContainer().clear();
				getTracingOverheadContainer().addAll((Collection<? extends TracingOverheadContainerType>)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends SchedulingEntityElementType>)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACES:
				setTraces((TracesType)newValue);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__NAME:
				setName((String)newValue);
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
			case OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK:
				setClock((ClockType)null);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION:
				setEventDescription((EventDescriptionType)null);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER:
				getTracingOverheadContainer().clear();
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__ELEMENT:
				getElement().clear();
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACES:
				setTraces((TracesType)null);
				return;
			case OT1Package.SCHEDULING_ENTITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case OT1Package.SCHEDULING_ENTITY_TYPE__CLOCK:
				return clock != null;
			case OT1Package.SCHEDULING_ENTITY_TYPE__EVENT_DESCRIPTION:
				return eventDescription != null;
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACING_OVERHEAD_CONTAINER:
				return tracingOverheadContainer != null && !tracingOverheadContainer.isEmpty();
			case OT1Package.SCHEDULING_ENTITY_TYPE__ELEMENT:
				return element != null && !element.isEmpty();
			case OT1Package.SCHEDULING_ENTITY_TYPE__TRACES:
				return traces != null;
			case OT1Package.SCHEDULING_ENTITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchedulingEntityTypeImpl
