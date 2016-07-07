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
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.ProcessPrototype} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPrototypeItemProvider extends AbstractProcessItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPrototypeItemProvider(AdapterFactory adapterFactory) {
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

			addPreemptionPropertyDescriptor(object);
			addFirstRunnablePropertyDescriptor(object);
			addLastRunnablePropertyDescriptor(object);
			addActivationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Preemption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreemptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPrototype_preemption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPrototype_preemption_feature", "_UI_ProcessPrototype_type"),
				 AmaltheaPackage.eINSTANCE.getProcessPrototype_Preemption(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Runnable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstRunnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPrototype_firstRunnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPrototype_firstRunnable_feature", "_UI_ProcessPrototype_type"),
				 AmaltheaPackage.eINSTANCE.getProcessPrototype_FirstRunnable(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Runnable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastRunnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPrototype_lastRunnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPrototype_lastRunnable_feature", "_UI_ProcessPrototype_type"),
				 AmaltheaPackage.eINSTANCE.getProcessPrototype_LastRunnable(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessPrototype_activation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessPrototype_activation_feature", "_UI_ProcessPrototype_type"),
				 AmaltheaPackage.eINSTANCE.getProcessPrototype_Activation(),
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getProcessPrototype_AccessPrecedenceSpec());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getProcessPrototype_OrderPrecedenceSpec());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getProcessPrototype_ChainedPrototypes());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getProcessPrototype_RunnableCalls());
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
	 * This returns ProcessPrototype.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessPrototype"));
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
		String label = ((ProcessPrototype)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessPrototype_type") :
			getString("_UI_ProcessPrototype_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessPrototype.class)) {
			case AmaltheaPackage.PROCESS_PROTOTYPE__PREEMPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmaltheaPackage.PROCESS_PROTOTYPE__ACCESS_PRECEDENCE_SPEC:
			case AmaltheaPackage.PROCESS_PROTOTYPE__ORDER_PRECEDENCE_SPEC:
			case AmaltheaPackage.PROCESS_PROTOTYPE__CHAINED_PROTOTYPES:
			case AmaltheaPackage.PROCESS_PROTOTYPE__RUNNABLE_CALLS:
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
				(AmaltheaPackage.eINSTANCE.getProcessPrototype_AccessPrecedenceSpec(),
				 AmaltheaFactory.eINSTANCE.createAccessPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getProcessPrototype_OrderPrecedenceSpec(),
				 AmaltheaFactory.eINSTANCE.createOrderPrecedenceSpec()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getProcessPrototype_ChainedPrototypes(),
				 AmaltheaFactory.eINSTANCE.createChainedProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getProcessPrototype_RunnableCalls(),
				 AmaltheaFactory.eINSTANCE.createTaskRunnableCall()));
	}

}
