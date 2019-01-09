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
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionHandlerDefinitionItemProvider extends HwDefinitionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionHandlerDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addPolicyPropertyDescriptor(object);
			addMaxBurstSizePropertyDescriptor(object);
			addMaxConcurrentTransfersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionHandlerDefinition_policy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionHandlerDefinition_policy_feature", "_UI_ConnectionHandlerDefinition_type"),
				 AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_Policy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Burst Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBurstSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionHandlerDefinition_maxBurstSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionHandlerDefinition_maxBurstSize_feature", "_UI_ConnectionHandlerDefinition_type"),
				 AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_MaxBurstSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Concurrent Transfers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxConcurrentTransfersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectionHandlerDefinition_maxConcurrentTransfers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectionHandlerDefinition_maxConcurrentTransfers_feature", "_UI_ConnectionHandlerDefinition_type"),
				 AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_MaxConcurrentTransfers(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_DataRate());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConnectionHandlerDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectionHandlerDefinition"));
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
	@Override
	public String getText(Object object) {
		String label = ((ConnectionHandlerDefinition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConnectionHandlerDefinition_type") :
			getString("_UI_ConnectionHandlerDefinition_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConnectionHandlerDefinition.class)) {
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__POLICY:
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_BURST_SIZE:
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__MAX_CONCURRENT_TRANSFERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__READ_LATENCY:
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__WRITE_LATENCY:
			case AmaltheaPackage.CONNECTION_HANDLER_DEFINITION__DATA_RATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteStatistics()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteWeibullEstimatorsDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteBetaDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteConstant()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteBoundaries()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteStatistics()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteGaussDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteWeibullEstimatorsDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency(),
				 AmaltheaFactory.eINSTANCE.createDiscreteBetaDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_DataRate(),
				 AmaltheaFactory.eINSTANCE.createDataRate()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_ReadLatency() ||
			childFeature == AmaltheaPackage.eINSTANCE.getConnectionHandlerDefinition_WriteLatency();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
