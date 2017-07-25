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
import org.eclipse.app4mc.amalthea.model.TaskScheduler;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.TaskScheduler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskSchedulerItemProvider extends SchedulerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulerItemProvider(AdapterFactory adapterFactory) {
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

			addChildAssociationsPropertyDescriptor(object);
			addParentSchedulerPropertyDescriptor(object);
			addChildSchedulersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Child Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskScheduler_childAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskScheduler_childAssociations_feature", "_UI_TaskScheduler_type"),
				 AmaltheaPackage.eINSTANCE.getTaskScheduler_ChildAssociations(),
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
	 * This adds a property descriptor for the Parent Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskScheduler_parentScheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskScheduler_parentScheduler_feature", "_UI_TaskScheduler_type"),
				 AmaltheaPackage.eINSTANCE.getTaskScheduler_ParentScheduler(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_ReadonlyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Schedulers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildSchedulersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskScheduler_childSchedulers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskScheduler_childSchedulers_feature", "_UI_TaskScheduler_type"),
				 AmaltheaPackage.eINSTANCE.getTaskScheduler_ChildSchedulers(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_ReadonlyPropertyCategory"),
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getTaskScheduler_ParentAssociation());
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
	 * This returns TaskScheduler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskScheduler"));
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
		String label = ((TaskScheduler)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskScheduler_type") :
			getString("_UI_TaskScheduler_type") + " " + label;
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

		switch (notification.getFeatureID(TaskScheduler.class)) {
			case AmaltheaPackage.TASK_SCHEDULER__SCHEDULING_ALGORITHM:
			case AmaltheaPackage.TASK_SCHEDULER__PARENT_ASSOCIATION:
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
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createFixedPriorityPreemptive()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createOSEK()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createDeadlineMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createRateMonotonic()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createPfairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createPartlyPFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createPartlyEarlyReleaseFairPD2()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createLeastLocalRemainingExecutionTimeFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createPriorityBasedRoundRobin()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createDeferrableServer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createPollingPeriodicServer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createSporadicServer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createConstantBandwidthServer()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createConstantBandwidthServerWithCASH()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createGrouping()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_SchedulingAlgorithm(),
				 AmaltheaFactory.eINSTANCE.createUserSpecificSchedulingAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getTaskScheduler_ParentAssociation(),
				 AmaltheaFactory.eINSTANCE.createSchedulerAssociation()));
	}

}
