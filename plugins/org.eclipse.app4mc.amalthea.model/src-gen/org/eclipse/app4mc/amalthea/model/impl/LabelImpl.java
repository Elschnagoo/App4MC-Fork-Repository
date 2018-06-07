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
import org.eclipse.app4mc.amalthea.model.CrossReferenceUtil;
import org.eclipse.app4mc.amalthea.model.DataStabilityLevel;
import org.eclipse.app4mc.amalthea.model.DataType;
import org.eclipse.app4mc.amalthea.model.IDisplayName;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelDataStability;
import org.eclipse.app4mc.amalthea.model.Section;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#isBVolatile <em>BVolatile</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getStabilityLevel <em>Stability Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelImpl#getLabelAccesses <em>Label Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends AbstractMemoryElementImpl implements Label {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBVolatile() <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BVOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBVolatile() <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean bVolatile = BVOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataStability() <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected static final LabelDataStability DATA_STABILITY_EDEFAULT = LabelDataStability._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getDataStability() <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected LabelDataStability dataStability = DATA_STABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStabilityLevel() <em>Stability Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DataStabilityLevel STABILITY_LEVEL_EDEFAULT = DataStabilityLevel._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getStabilityLevel() <em>Stability Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilityLevel()
	 * @generated
	 * @ordered
	 */
	protected DataStabilityLevel stabilityLevel = STABILITY_LEVEL_EDEFAULT;

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
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLabel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBVolatile() {
		return bVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBVolatile(boolean newBVolatile) {
		boolean oldBVolatile = bVolatile;
		bVolatile = newBVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__BVOLATILE, oldBVolatile, bVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDataStability getDataStability() {
		return dataStability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStability(LabelDataStability newDataStability) {
		LabelDataStability oldDataStability = dataStability;
		dataStability = newDataStability == null ? DATA_STABILITY_EDEFAULT : newDataStability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__DATA_STABILITY, oldDataStability, dataStability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStabilityLevel getStabilityLevel() {
		return stabilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStabilityLevel(DataStabilityLevel newStabilityLevel) {
		DataStabilityLevel oldStabilityLevel = stabilityLevel;
		stabilityLevel = newStabilityLevel == null ? STABILITY_LEVEL_EDEFAULT : newStabilityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__STABILITY_LEVEL, oldStabilityLevel, stabilityLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL__SECTION, oldSection, section));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelAccess> getLabelAccesses() {
		return CrossReferenceUtil.<LabelAccess>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getLabelAccess_Data());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LABEL__DATA_TYPE:
				return basicSetDataType(null, msgs);
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
			case AmaltheaPackage.LABEL__DISPLAY_NAME:
				return getDisplayName();
			case AmaltheaPackage.LABEL__DATA_TYPE:
				return getDataType();
			case AmaltheaPackage.LABEL__CONSTANT:
				return isConstant();
			case AmaltheaPackage.LABEL__BVOLATILE:
				return isBVolatile();
			case AmaltheaPackage.LABEL__DATA_STABILITY:
				return getDataStability();
			case AmaltheaPackage.LABEL__STABILITY_LEVEL:
				return getStabilityLevel();
			case AmaltheaPackage.LABEL__SECTION:
				if (resolve) return getSection();
				return basicGetSection();
			case AmaltheaPackage.LABEL__LABEL_ACCESSES:
				return getLabelAccesses();
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
			case AmaltheaPackage.LABEL__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case AmaltheaPackage.LABEL__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case AmaltheaPackage.LABEL__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case AmaltheaPackage.LABEL__BVOLATILE:
				setBVolatile((Boolean)newValue);
				return;
			case AmaltheaPackage.LABEL__DATA_STABILITY:
				setDataStability((LabelDataStability)newValue);
				return;
			case AmaltheaPackage.LABEL__STABILITY_LEVEL:
				setStabilityLevel((DataStabilityLevel)newValue);
				return;
			case AmaltheaPackage.LABEL__SECTION:
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
			case AmaltheaPackage.LABEL__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case AmaltheaPackage.LABEL__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__BVOLATILE:
				setBVolatile(BVOLATILE_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__DATA_STABILITY:
				setDataStability(DATA_STABILITY_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__STABILITY_LEVEL:
				setStabilityLevel(STABILITY_LEVEL_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL__SECTION:
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
			case AmaltheaPackage.LABEL__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case AmaltheaPackage.LABEL__DATA_TYPE:
				return dataType != null;
			case AmaltheaPackage.LABEL__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case AmaltheaPackage.LABEL__BVOLATILE:
				return bVolatile != BVOLATILE_EDEFAULT;
			case AmaltheaPackage.LABEL__DATA_STABILITY:
				return dataStability != DATA_STABILITY_EDEFAULT;
			case AmaltheaPackage.LABEL__STABILITY_LEVEL:
				return stabilityLevel != STABILITY_LEVEL_EDEFAULT;
			case AmaltheaPackage.LABEL__SECTION:
				return section != null;
			case AmaltheaPackage.LABEL__LABEL_ACCESSES:
				return !getLabelAccesses().isEmpty();
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
		if (baseClass == IDisplayName.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.LABEL__DISPLAY_NAME: return AmaltheaPackage.IDISPLAY_NAME__DISPLAY_NAME;
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
		if (baseClass == IDisplayName.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.IDISPLAY_NAME__DISPLAY_NAME: return AmaltheaPackage.LABEL__DISPLAY_NAME;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", constant: ");
		result.append(constant);
		result.append(", bVolatile: ");
		result.append(bVolatile);
		result.append(", dataStability: ");
		result.append(dataStability);
		result.append(", stabilityLevel: ");
		result.append(stabilityLevel);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
