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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amalthea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getSwModel <em>Sw Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getHwModel <em>Hw Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getOsModel <em>Os Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getStimuliModel <em>Stimuli Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getConstraintsModel <em>Constraints Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getEventModel <em>Event Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getPropertyConstraintsModel <em>Property Constraints Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getMappingModel <em>Mapping Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getConfigModel <em>Config Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getComponentsModel <em>Components Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmaltheaImpl extends BaseObjectImpl implements Amalthea {
	/**
	 * The cached value of the '{@link #getSwModel() <em>Sw Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwModel()
	 * @generated
	 * @ordered
	 */
	protected SWModel swModel;

	/**
	 * The cached value of the '{@link #getHwModel() <em>Hw Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwModel()
	 * @generated
	 * @ordered
	 */
	protected HWModel hwModel;

	/**
	 * The cached value of the '{@link #getOsModel() <em>Os Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsModel()
	 * @generated
	 * @ordered
	 */
	protected OSModel osModel;

	/**
	 * The cached value of the '{@link #getStimuliModel() <em>Stimuli Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimuliModel()
	 * @generated
	 * @ordered
	 */
	protected StimuliModel stimuliModel;

	/**
	 * The cached value of the '{@link #getConstraintsModel() <em>Constraints Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsModel()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsModel constraintsModel;

	/**
	 * The cached value of the '{@link #getEventModel() <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventModel()
	 * @generated
	 * @ordered
	 */
	protected EventModel eventModel;

	/**
	 * The cached value of the '{@link #getPropertyConstraintsModel() <em>Property Constraints Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyConstraintsModel()
	 * @generated
	 * @ordered
	 */
	protected PropertyConstraintsModel propertyConstraintsModel;

	/**
	 * The cached value of the '{@link #getMappingModel() <em>Mapping Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingModel()
	 * @generated
	 * @ordered
	 */
	protected MappingModel mappingModel;

	/**
	 * The cached value of the '{@link #getConfigModel() <em>Config Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigModel()
	 * @generated
	 * @ordered
	 */
	protected ConfigModel configModel;

	/**
	 * The cached value of the '{@link #getComponentsModel() <em>Components Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsModel()
	 * @generated
	 * @ordered
	 */
	protected ComponentsModel componentsModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmaltheaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getAmalthea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModel getSwModel() {
		if (swModel != null && swModel.eIsProxy()) {
			InternalEObject oldSwModel = (InternalEObject)swModel;
			swModel = (SWModel)eResolveProxy(oldSwModel);
			if (swModel != oldSwModel) {
				InternalEObject newSwModel = (InternalEObject)swModel;
				NotificationChain msgs = oldSwModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__SW_MODEL, null, null);
				if (newSwModel.eInternalContainer() == null) {
					msgs = newSwModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__SW_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__SW_MODEL, oldSwModel, swModel));
			}
		}
		return swModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModel basicGetSwModel() {
		return swModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwModel(SWModel newSwModel, NotificationChain msgs) {
		SWModel oldSwModel = swModel;
		swModel = newSwModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__SW_MODEL, oldSwModel, newSwModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwModel(SWModel newSwModel) {
		if (newSwModel != swModel) {
			NotificationChain msgs = null;
			if (swModel != null)
				msgs = ((InternalEObject)swModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__SW_MODEL, null, msgs);
			if (newSwModel != null)
				msgs = ((InternalEObject)newSwModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__SW_MODEL, null, msgs);
			msgs = basicSetSwModel(newSwModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__SW_MODEL, newSwModel, newSwModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWModel getHwModel() {
		if (hwModel != null && hwModel.eIsProxy()) {
			InternalEObject oldHwModel = (InternalEObject)hwModel;
			hwModel = (HWModel)eResolveProxy(oldHwModel);
			if (hwModel != oldHwModel) {
				InternalEObject newHwModel = (InternalEObject)hwModel;
				NotificationChain msgs = oldHwModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__HW_MODEL, null, null);
				if (newHwModel.eInternalContainer() == null) {
					msgs = newHwModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__HW_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__HW_MODEL, oldHwModel, hwModel));
			}
		}
		return hwModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWModel basicGetHwModel() {
		return hwModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwModel(HWModel newHwModel, NotificationChain msgs) {
		HWModel oldHwModel = hwModel;
		hwModel = newHwModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__HW_MODEL, oldHwModel, newHwModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwModel(HWModel newHwModel) {
		if (newHwModel != hwModel) {
			NotificationChain msgs = null;
			if (hwModel != null)
				msgs = ((InternalEObject)hwModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__HW_MODEL, null, msgs);
			if (newHwModel != null)
				msgs = ((InternalEObject)newHwModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__HW_MODEL, null, msgs);
			msgs = basicSetHwModel(newHwModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__HW_MODEL, newHwModel, newHwModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSModel getOsModel() {
		if (osModel != null && osModel.eIsProxy()) {
			InternalEObject oldOsModel = (InternalEObject)osModel;
			osModel = (OSModel)eResolveProxy(oldOsModel);
			if (osModel != oldOsModel) {
				InternalEObject newOsModel = (InternalEObject)osModel;
				NotificationChain msgs = oldOsModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__OS_MODEL, null, null);
				if (newOsModel.eInternalContainer() == null) {
					msgs = newOsModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__OS_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__OS_MODEL, oldOsModel, osModel));
			}
		}
		return osModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSModel basicGetOsModel() {
		return osModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOsModel(OSModel newOsModel, NotificationChain msgs) {
		OSModel oldOsModel = osModel;
		osModel = newOsModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__OS_MODEL, oldOsModel, newOsModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsModel(OSModel newOsModel) {
		if (newOsModel != osModel) {
			NotificationChain msgs = null;
			if (osModel != null)
				msgs = ((InternalEObject)osModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__OS_MODEL, null, msgs);
			if (newOsModel != null)
				msgs = ((InternalEObject)newOsModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__OS_MODEL, null, msgs);
			msgs = basicSetOsModel(newOsModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__OS_MODEL, newOsModel, newOsModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliModel getStimuliModel() {
		if (stimuliModel != null && stimuliModel.eIsProxy()) {
			InternalEObject oldStimuliModel = (InternalEObject)stimuliModel;
			stimuliModel = (StimuliModel)eResolveProxy(oldStimuliModel);
			if (stimuliModel != oldStimuliModel) {
				InternalEObject newStimuliModel = (InternalEObject)stimuliModel;
				NotificationChain msgs = oldStimuliModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__STIMULI_MODEL, null, null);
				if (newStimuliModel.eInternalContainer() == null) {
					msgs = newStimuliModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__STIMULI_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__STIMULI_MODEL, oldStimuliModel, stimuliModel));
			}
		}
		return stimuliModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliModel basicGetStimuliModel() {
		return stimuliModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimuliModel(StimuliModel newStimuliModel, NotificationChain msgs) {
		StimuliModel oldStimuliModel = stimuliModel;
		stimuliModel = newStimuliModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__STIMULI_MODEL, oldStimuliModel, newStimuliModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimuliModel(StimuliModel newStimuliModel) {
		if (newStimuliModel != stimuliModel) {
			NotificationChain msgs = null;
			if (stimuliModel != null)
				msgs = ((InternalEObject)stimuliModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__STIMULI_MODEL, null, msgs);
			if (newStimuliModel != null)
				msgs = ((InternalEObject)newStimuliModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__STIMULI_MODEL, null, msgs);
			msgs = basicSetStimuliModel(newStimuliModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__STIMULI_MODEL, newStimuliModel, newStimuliModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModel getConstraintsModel() {
		if (constraintsModel != null && constraintsModel.eIsProxy()) {
			InternalEObject oldConstraintsModel = (InternalEObject)constraintsModel;
			constraintsModel = (ConstraintsModel)eResolveProxy(oldConstraintsModel);
			if (constraintsModel != oldConstraintsModel) {
				InternalEObject newConstraintsModel = (InternalEObject)constraintsModel;
				NotificationChain msgs = oldConstraintsModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, null, null);
				if (newConstraintsModel.eInternalContainer() == null) {
					msgs = newConstraintsModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, oldConstraintsModel, constraintsModel));
			}
		}
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModel basicGetConstraintsModel() {
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintsModel(ConstraintsModel newConstraintsModel, NotificationChain msgs) {
		ConstraintsModel oldConstraintsModel = constraintsModel;
		constraintsModel = newConstraintsModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, oldConstraintsModel, newConstraintsModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintsModel(ConstraintsModel newConstraintsModel) {
		if (newConstraintsModel != constraintsModel) {
			NotificationChain msgs = null;
			if (constraintsModel != null)
				msgs = ((InternalEObject)constraintsModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, null, msgs);
			if (newConstraintsModel != null)
				msgs = ((InternalEObject)newConstraintsModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, null, msgs);
			msgs = basicSetConstraintsModel(newConstraintsModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL, newConstraintsModel, newConstraintsModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModel getEventModel() {
		if (eventModel != null && eventModel.eIsProxy()) {
			InternalEObject oldEventModel = (InternalEObject)eventModel;
			eventModel = (EventModel)eResolveProxy(oldEventModel);
			if (eventModel != oldEventModel) {
				InternalEObject newEventModel = (InternalEObject)eventModel;
				NotificationChain msgs = oldEventModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__EVENT_MODEL, null, null);
				if (newEventModel.eInternalContainer() == null) {
					msgs = newEventModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__EVENT_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__EVENT_MODEL, oldEventModel, eventModel));
			}
		}
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventModel basicGetEventModel() {
		return eventModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventModel(EventModel newEventModel, NotificationChain msgs) {
		EventModel oldEventModel = eventModel;
		eventModel = newEventModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__EVENT_MODEL, oldEventModel, newEventModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventModel(EventModel newEventModel) {
		if (newEventModel != eventModel) {
			NotificationChain msgs = null;
			if (eventModel != null)
				msgs = ((InternalEObject)eventModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__EVENT_MODEL, null, msgs);
			if (newEventModel != null)
				msgs = ((InternalEObject)newEventModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__EVENT_MODEL, null, msgs);
			msgs = basicSetEventModel(newEventModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__EVENT_MODEL, newEventModel, newEventModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsModel getPropertyConstraintsModel() {
		if (propertyConstraintsModel != null && propertyConstraintsModel.eIsProxy()) {
			InternalEObject oldPropertyConstraintsModel = (InternalEObject)propertyConstraintsModel;
			propertyConstraintsModel = (PropertyConstraintsModel)eResolveProxy(oldPropertyConstraintsModel);
			if (propertyConstraintsModel != oldPropertyConstraintsModel) {
				InternalEObject newPropertyConstraintsModel = (InternalEObject)propertyConstraintsModel;
				NotificationChain msgs = oldPropertyConstraintsModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, null, null);
				if (newPropertyConstraintsModel.eInternalContainer() == null) {
					msgs = newPropertyConstraintsModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, oldPropertyConstraintsModel, propertyConstraintsModel));
			}
		}
		return propertyConstraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsModel basicGetPropertyConstraintsModel() {
		return propertyConstraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyConstraintsModel(PropertyConstraintsModel newPropertyConstraintsModel, NotificationChain msgs) {
		PropertyConstraintsModel oldPropertyConstraintsModel = propertyConstraintsModel;
		propertyConstraintsModel = newPropertyConstraintsModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, oldPropertyConstraintsModel, newPropertyConstraintsModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyConstraintsModel(PropertyConstraintsModel newPropertyConstraintsModel) {
		if (newPropertyConstraintsModel != propertyConstraintsModel) {
			NotificationChain msgs = null;
			if (propertyConstraintsModel != null)
				msgs = ((InternalEObject)propertyConstraintsModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, null, msgs);
			if (newPropertyConstraintsModel != null)
				msgs = ((InternalEObject)newPropertyConstraintsModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, null, msgs);
			msgs = basicSetPropertyConstraintsModel(newPropertyConstraintsModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL, newPropertyConstraintsModel, newPropertyConstraintsModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel getMappingModel() {
		if (mappingModel != null && mappingModel.eIsProxy()) {
			InternalEObject oldMappingModel = (InternalEObject)mappingModel;
			mappingModel = (MappingModel)eResolveProxy(oldMappingModel);
			if (mappingModel != oldMappingModel) {
				InternalEObject newMappingModel = (InternalEObject)mappingModel;
				NotificationChain msgs = oldMappingModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__MAPPING_MODEL, null, null);
				if (newMappingModel.eInternalContainer() == null) {
					msgs = newMappingModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__MAPPING_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__MAPPING_MODEL, oldMappingModel, mappingModel));
			}
		}
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel basicGetMappingModel() {
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingModel(MappingModel newMappingModel, NotificationChain msgs) {
		MappingModel oldMappingModel = mappingModel;
		mappingModel = newMappingModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__MAPPING_MODEL, oldMappingModel, newMappingModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingModel(MappingModel newMappingModel) {
		if (newMappingModel != mappingModel) {
			NotificationChain msgs = null;
			if (mappingModel != null)
				msgs = ((InternalEObject)mappingModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__MAPPING_MODEL, null, msgs);
			if (newMappingModel != null)
				msgs = ((InternalEObject)newMappingModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__MAPPING_MODEL, null, msgs);
			msgs = basicSetMappingModel(newMappingModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__MAPPING_MODEL, newMappingModel, newMappingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigModel getConfigModel() {
		if (configModel != null && configModel.eIsProxy()) {
			InternalEObject oldConfigModel = (InternalEObject)configModel;
			configModel = (ConfigModel)eResolveProxy(oldConfigModel);
			if (configModel != oldConfigModel) {
				InternalEObject newConfigModel = (InternalEObject)configModel;
				NotificationChain msgs = oldConfigModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONFIG_MODEL, null, null);
				if (newConfigModel.eInternalContainer() == null) {
					msgs = newConfigModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONFIG_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__CONFIG_MODEL, oldConfigModel, configModel));
			}
		}
		return configModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigModel basicGetConfigModel() {
		return configModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigModel(ConfigModel newConfigModel, NotificationChain msgs) {
		ConfigModel oldConfigModel = configModel;
		configModel = newConfigModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__CONFIG_MODEL, oldConfigModel, newConfigModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigModel(ConfigModel newConfigModel) {
		if (newConfigModel != configModel) {
			NotificationChain msgs = null;
			if (configModel != null)
				msgs = ((InternalEObject)configModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONFIG_MODEL, null, msgs);
			if (newConfigModel != null)
				msgs = ((InternalEObject)newConfigModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__CONFIG_MODEL, null, msgs);
			msgs = basicSetConfigModel(newConfigModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__CONFIG_MODEL, newConfigModel, newConfigModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsModel getComponentsModel() {
		if (componentsModel != null && componentsModel.eIsProxy()) {
			InternalEObject oldComponentsModel = (InternalEObject)componentsModel;
			componentsModel = (ComponentsModel)eResolveProxy(oldComponentsModel);
			if (componentsModel != oldComponentsModel) {
				InternalEObject newComponentsModel = (InternalEObject)componentsModel;
				NotificationChain msgs = oldComponentsModel.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, null, null);
				if (newComponentsModel.eInternalContainer() == null) {
					msgs = newComponentsModel.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, oldComponentsModel, componentsModel));
			}
		}
		return componentsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsModel basicGetComponentsModel() {
		return componentsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentsModel(ComponentsModel newComponentsModel, NotificationChain msgs) {
		ComponentsModel oldComponentsModel = componentsModel;
		componentsModel = newComponentsModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, oldComponentsModel, newComponentsModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentsModel(ComponentsModel newComponentsModel) {
		if (newComponentsModel != componentsModel) {
			NotificationChain msgs = null;
			if (componentsModel != null)
				msgs = ((InternalEObject)componentsModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, null, msgs);
			if (newComponentsModel != null)
				msgs = ((InternalEObject)newComponentsModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, null, msgs);
			msgs = basicSetComponentsModel(newComponentsModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL, newComponentsModel, newComponentsModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				return basicSetSwModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				return basicSetHwModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				return basicSetOsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				return basicSetStimuliModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				return basicSetConstraintsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				return basicSetEventModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				return basicSetPropertyConstraintsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				return basicSetMappingModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				return basicSetConfigModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				return basicSetComponentsModel(null, msgs);
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
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				if (resolve) return getSwModel();
				return basicGetSwModel();
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				if (resolve) return getHwModel();
				return basicGetHwModel();
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				if (resolve) return getOsModel();
				return basicGetOsModel();
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				if (resolve) return getStimuliModel();
				return basicGetStimuliModel();
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				if (resolve) return getConstraintsModel();
				return basicGetConstraintsModel();
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				if (resolve) return getEventModel();
				return basicGetEventModel();
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				if (resolve) return getPropertyConstraintsModel();
				return basicGetPropertyConstraintsModel();
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				if (resolve) return getMappingModel();
				return basicGetMappingModel();
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				if (resolve) return getConfigModel();
				return basicGetConfigModel();
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				if (resolve) return getComponentsModel();
				return basicGetComponentsModel();
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
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				setSwModel((SWModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				setHwModel((HWModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				setOsModel((OSModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				setStimuliModel((StimuliModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				setConstraintsModel((ConstraintsModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				setEventModel((EventModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				setPropertyConstraintsModel((PropertyConstraintsModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				setMappingModel((MappingModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				setConfigModel((ConfigModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				setComponentsModel((ComponentsModel)newValue);
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
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				setSwModel((SWModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				setHwModel((HWModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				setOsModel((OSModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				setStimuliModel((StimuliModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				setConstraintsModel((ConstraintsModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				setEventModel((EventModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				setPropertyConstraintsModel((PropertyConstraintsModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				setMappingModel((MappingModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				setConfigModel((ConfigModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				setComponentsModel((ComponentsModel)null);
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
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				return swModel != null;
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				return hwModel != null;
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				return osModel != null;
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				return stimuliModel != null;
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				return constraintsModel != null;
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				return eventModel != null;
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				return propertyConstraintsModel != null;
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				return mappingModel != null;
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				return configModel != null;
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				return componentsModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AmaltheaImpl
