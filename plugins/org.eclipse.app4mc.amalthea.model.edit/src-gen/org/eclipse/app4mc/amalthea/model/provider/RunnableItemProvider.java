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

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.Runnable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunnableItemProvider extends AbstractMemoryElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableItemProvider(AdapterFactory adapterFactory) {
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

			addActivationsPropertyDescriptor(object);
			addCallbackPropertyDescriptor(object);
			addServicePropertyDescriptor(object);
			addAsilLevelPropertyDescriptor(object);
			addRunnableCallsPropertyDescriptor(object);
			addTaskRunnableCallsPropertyDescriptor(object);
			addSectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_activations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_activations_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_Activations(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Callback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_callback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_callback_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_Callback(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_service_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_service_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_Service(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Asil Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsilLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_asilLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_asilLevel_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_AsilLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Runnable Calls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunnableCallsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_runnableCalls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_runnableCalls_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_RunnableCalls(),
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ReadonlyPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Task Runnable Calls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskRunnableCallsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_taskRunnableCalls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_taskRunnableCalls_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_TaskRunnableCalls(),
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ReadonlyPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Section feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Runnable_section_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Runnable_section_feature", "_UI_Runnable_type"),
				 AmaltheaPackage.eINSTANCE.getRunnable_Section(),
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getRunnable_Deadline());
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
	 * This returns Runnable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Runnable"));
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
		String label = ((org.eclipse.app4mc.amalthea.model.Runnable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Runnable_type") :
			getString("_UI_Runnable_type") + " " + label;
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

		switch (notification.getFeatureID(org.eclipse.app4mc.amalthea.model.Runnable.class)) {
			case AmaltheaPackage.RUNNABLE__CALLBACK:
			case AmaltheaPackage.RUNNABLE__SERVICE:
			case AmaltheaPackage.RUNNABLE__ASIL_LEVEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmaltheaPackage.RUNNABLE__RUNNABLE_ITEMS:
			case AmaltheaPackage.RUNNABLE__DEADLINE:
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
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createRunnableInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createExecutionCost()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createModeLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createRunnableModeSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createLabelAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createChannelSend()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createChannelReceive()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreAccess()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverRead()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createSenderReceiverWrite()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createSynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createAsynchronousServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createGetResultServerCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createRunnableProbabilitySwitch()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createRunnableCall()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
				 AmaltheaFactory.eINSTANCE.createCustomEventTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getRunnable_Deadline(),
				 AmaltheaFactory.eINSTANCE.createTime()));
	}

}
