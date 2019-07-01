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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MeasurementModel;
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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getCommonElements <em>Common Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getSwModel <em>Sw Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getHwModel <em>Hw Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getOsModel <em>Os Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getStimuliModel <em>Stimuli Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getEventModel <em>Event Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getConstraintsModel <em>Constraints Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getPropertyConstraintsModel <em>Property Constraints Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getMappingModel <em>Mapping Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getComponentsModel <em>Components Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getConfigModel <em>Config Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.AmaltheaImpl#getMeasurementModel <em>Measurement Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmaltheaImpl extends BaseObjectImpl implements Amalthea {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommonElements() <em>Common Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonElements()
	 * @generated
	 * @ordered
	 */
	protected CommonElements commonElements;

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
	 * The cached value of the '{@link #getEventModel() <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventModel()
	 * @generated
	 * @ordered
	 */
	protected EventModel eventModel;

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
	 * The cached value of the '{@link #getComponentsModel() <em>Components Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsModel()
	 * @generated
	 * @ordered
	 */
	protected ComponentsModel componentsModel;

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
	 * The cached value of the '{@link #getMeasurementModel() <em>Measurement Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementModel()
	 * @generated
	 * @ordered
	 */
	protected MeasurementModel measurementModel;

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
	@Override
	public String getVersion() {
		return "0.9.5";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonElements getCommonElements() {
		return commonElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonElements(CommonElements newCommonElements, NotificationChain msgs) {
		CommonElements oldCommonElements = commonElements;
		commonElements = newCommonElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS, oldCommonElements, newCommonElements);
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
	public void setCommonElements(CommonElements newCommonElements) {
		if (newCommonElements != commonElements) {
			NotificationChain msgs = null;
			if (commonElements != null)
				msgs = ((InternalEObject)commonElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS, null, msgs);
			if (newCommonElements != null)
				msgs = ((InternalEObject)newCommonElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS, null, msgs);
			msgs = basicSetCommonElements(newCommonElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS, newCommonElements, newCommonElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SWModel getSwModel() {
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
	@Override
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
	@Override
	public HWModel getHwModel() {
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
	@Override
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
	@Override
	public OSModel getOsModel() {
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
	@Override
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
	@Override
	public StimuliModel getStimuliModel() {
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
	@Override
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
	@Override
	public EventModel getEventModel() {
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
	@Override
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
	@Override
	public ConstraintsModel getConstraintsModel() {
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
	@Override
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
	@Override
	public PropertyConstraintsModel getPropertyConstraintsModel() {
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
	@Override
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
	@Override
	public MappingModel getMappingModel() {
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
	@Override
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
	@Override
	public ComponentsModel getComponentsModel() {
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
	@Override
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
	public ConfigModel getConfigModel() {
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
	@Override
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
	@Override
	public MeasurementModel getMeasurementModel() {
		return measurementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementModel(MeasurementModel newMeasurementModel, NotificationChain msgs) {
		MeasurementModel oldMeasurementModel = measurementModel;
		measurementModel = newMeasurementModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL, oldMeasurementModel, newMeasurementModel);
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
	public void setMeasurementModel(MeasurementModel newMeasurementModel) {
		if (newMeasurementModel != measurementModel) {
			NotificationChain msgs = null;
			if (measurementModel != null)
				msgs = ((InternalEObject)measurementModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL, null, msgs);
			if (newMeasurementModel != null)
				msgs = ((InternalEObject)newMeasurementModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL, null, msgs);
			msgs = basicSetMeasurementModel(newMeasurementModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL, newMeasurementModel, newMeasurementModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS:
				return basicSetCommonElements(null, msgs);
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				return basicSetSwModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				return basicSetHwModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				return basicSetOsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				return basicSetStimuliModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				return basicSetEventModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				return basicSetConstraintsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				return basicSetPropertyConstraintsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				return basicSetMappingModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				return basicSetComponentsModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				return basicSetConfigModel(null, msgs);
			case AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL:
				return basicSetMeasurementModel(null, msgs);
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
			case AmaltheaPackage.AMALTHEA__VERSION:
				return getVersion();
			case AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS:
				return getCommonElements();
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				return getSwModel();
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				return getHwModel();
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				return getOsModel();
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				return getStimuliModel();
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				return getEventModel();
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				return getConstraintsModel();
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				return getPropertyConstraintsModel();
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				return getMappingModel();
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				return getComponentsModel();
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				return getConfigModel();
			case AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL:
				return getMeasurementModel();
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
			case AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS:
				setCommonElements((CommonElements)newValue);
				return;
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
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				setEventModel((EventModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				setConstraintsModel((ConstraintsModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				setPropertyConstraintsModel((PropertyConstraintsModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				setMappingModel((MappingModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				setComponentsModel((ComponentsModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				setConfigModel((ConfigModel)newValue);
				return;
			case AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL:
				setMeasurementModel((MeasurementModel)newValue);
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
			case AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS:
				setCommonElements((CommonElements)null);
				return;
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
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				setEventModel((EventModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				setConstraintsModel((ConstraintsModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				setPropertyConstraintsModel((PropertyConstraintsModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				setMappingModel((MappingModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				setComponentsModel((ComponentsModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				setConfigModel((ConfigModel)null);
				return;
			case AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL:
				setMeasurementModel((MeasurementModel)null);
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
			case AmaltheaPackage.AMALTHEA__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS:
				return commonElements != null;
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
				return swModel != null;
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
				return hwModel != null;
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
				return osModel != null;
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
				return stimuliModel != null;
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
				return eventModel != null;
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
				return constraintsModel != null;
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
				return propertyConstraintsModel != null;
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
				return mappingModel != null;
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
				return componentsModel != null;
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
				return configModel != null;
			case AmaltheaPackage.AMALTHEA__MEASUREMENT_MODEL:
				return measurementModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AmaltheaImpl
