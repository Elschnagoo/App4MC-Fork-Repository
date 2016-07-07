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
package org.eclipse.app4mc.amalthea.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class CPUPercentageRequirementLimitItemProvider extends RequirementLimitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CPUPercentageRequirementLimitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMetricPropertyDescriptor(object);
			addLimitValuePropertyDescriptor(object);
			addHardwareContextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Metric feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CPUPercentageRequirementLimit_metric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CPUPercentageRequirementLimit_metric_feature", "_UI_CPUPercentageRequirementLimit_type"),
				 AmaltheaPackage.eINSTANCE.getCPUPercentageRequirementLimit_Metric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Limit Value feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CPUPercentageRequirementLimit_limitValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CPUPercentageRequirementLimit_limitValue_feature", "_UI_CPUPercentageRequirementLimit_type"),
				 AmaltheaPackage.eINSTANCE.getCPUPercentageRequirementLimit_LimitValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hardware Context feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardwareContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CPUPercentageRequirementLimit_hardwareContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CPUPercentageRequirementLimit_hardwareContext_feature", "_UI_CPUPercentageRequirementLimit_type"),
				 AmaltheaPackage.eINSTANCE.getCPUPercentageRequirementLimit_HardwareContext(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CPUPercentageRequirementLimit.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CPUPercentageRequirementLimit"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		LimitType labelValue = ((CPUPercentageRequirementLimit)object).getLimitType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CPUPercentageRequirementLimit_type") :
			getString("_UI_CPUPercentageRequirementLimit_type") + " " + label;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getCPUPercentageRequirementLimitItemProviderText(object, getTextGen(object));
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CPUPercentageRequirementLimit.class)) {
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__METRIC:
			case AmaltheaPackage.CPU_PERCENTAGE_REQUIREMENT_LIMIT__LIMIT_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
