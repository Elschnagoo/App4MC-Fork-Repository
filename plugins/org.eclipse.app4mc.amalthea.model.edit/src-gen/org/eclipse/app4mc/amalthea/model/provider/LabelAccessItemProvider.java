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

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.LabelAccess} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class LabelAccessItemProvider extends ComputationItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessItemProvider(AdapterFactory adapterFactory) {
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

			addTagsPropertyDescriptor(object);
			addDataPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addDataStabilityPropertyDescriptor(object);
			addImplementationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ITaggable_tags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ITaggable_tags_feature", "_UI_ITaggable_type"),
				 AmaltheaPackage.eINSTANCE.getITaggable_Tags(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelAccess_data_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelAccess_data_feature", "_UI_LabelAccess_type"),
				 AmaltheaPackage.eINSTANCE.getLabelAccess_Data(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelAccess_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelAccess_access_feature", "_UI_LabelAccess_type"),
				 AmaltheaPackage.eINSTANCE.getLabelAccess_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Stability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelAccess_dataStability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelAccess_dataStability_feature", "_UI_LabelAccess_type"),
				 AmaltheaPackage.eINSTANCE.getLabelAccess_DataStability(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelAccess_implementation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelAccess_implementation_feature", "_UI_LabelAccess_type"),
				 AmaltheaPackage.eINSTANCE.getLabelAccess_Implementation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getLabelAccess_Statistic());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getLabelAccess_TransmissionPolicy());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getLabelAccess_DependsOn());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LabelAccess.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LabelAccess"));
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
		LabelAccessEnum labelValue = ((LabelAccess)object).getAccess();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_LabelAccess_type") :
			getString("_UI_LabelAccess_type") + " " + label;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getLabelAccessItemProviderText(object, getTextGen(object));
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LabelAccess.class)) {
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
			case AmaltheaPackage.LABEL_ACCESS__IMPLEMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
			case AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
		final ViewerNotification vn = CustomItemProviderService
				.getLabelAccessItemProviderNotification(notification);
		if (vn != null) {
			fireNotifyChanged(vn);
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

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getLabelAccess_Statistic(),
				 AmaltheaFactory.eINSTANCE.createLabelAccessStatistic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getLabelAccess_TransmissionPolicy(),
				 AmaltheaFactory.eINSTANCE.createTransmissionPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getLabelAccess_DependsOn(),
				 AmaltheaFactory.eINSTANCE.createDataDependency()));
	}

}
