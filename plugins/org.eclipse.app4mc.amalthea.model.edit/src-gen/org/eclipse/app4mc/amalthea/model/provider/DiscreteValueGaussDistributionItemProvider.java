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
package org.eclipse.app4mc.amalthea.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteValueGaussDistributionItemProvider extends TruncatedDiscreteValueDistributionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteValueGaussDistributionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMeanPropertyDescriptor(object);
			addSdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteValueGaussDistribution_mean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteValueGaussDistribution_mean_feature", "_UI_DiscreteValueGaussDistribution_type"),
				 AmaltheaPackage.eINSTANCE.getDiscreteValueGaussDistribution_Mean(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiscreteValueGaussDistribution_sd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiscreteValueGaussDistribution_sd_feature", "_UI_DiscreteValueGaussDistribution_type"),
				 AmaltheaPackage.eINSTANCE.getDiscreteValueGaussDistribution_Sd(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DiscreteValueGaussDistribution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiscreteValueGaussDistribution"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		Long labelValue = ((DiscreteValueGaussDistribution)object).getLowerBound();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DiscreteValueGaussDistribution_type") :
			getString("_UI_DiscreteValueGaussDistribution_type") + " " + label;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomDeviationItemProviderService.getDiscreteValueGaussDistributionItemProviderText(object, getTextGen(object));
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DiscreteValueGaussDistribution.class)) {
			case AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__MEAN:
			case AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__SD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		// delegate to custom item provider and execute locally
		final List<ViewerNotification> notifications = CustomDeviationItemProviderService
				.getDiscreteValueGaussDistributionItemProviderNotifications(notification);
		if (!notifications.isEmpty()) {
			for (final ViewerNotification vn : notifications) {
				fireNotifyChanged(vn);
			}
			return;
		}

		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
