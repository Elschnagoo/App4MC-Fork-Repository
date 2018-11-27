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
import org.eclipse.app4mc.amalthea.model.OsAPIOverhead;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.OsAPIOverhead} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OsAPIOverheadItemProvider extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OsAPIOverheadItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSendMessage());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiTerminateTask());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSchedule());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiRequestResource());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiReleaseResource());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSetEvent());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiWaitEvent());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiClearEvent());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiActivateTask());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiEnforcedMigration());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSuspendOsInterrupts());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiResumeOsInterrupts());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiRequestSpinlock());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiReleaseSpinlock());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSenderReceiverRead());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSenderReceiverWrite());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSynchronousServerCallPoint());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiIocRead());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiIocWrite());
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
	 * This returns OsAPIOverhead.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OsAPIOverhead"));
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
		return getString("_UI_OsAPIOverhead_type");
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getOsAPIOverheadItemProviderText(object, getTextGen(object));
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

		switch (notification.getFeatureID(OsAPIOverhead.class)) {
			case AmaltheaPackage.OS_API_OVERHEAD__API_SEND_MESSAGE:
			case AmaltheaPackage.OS_API_OVERHEAD__API_TERMINATE_TASK:
			case AmaltheaPackage.OS_API_OVERHEAD__API_SCHEDULE:
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_RESOURCE:
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_RESOURCE:
			case AmaltheaPackage.OS_API_OVERHEAD__API_SET_EVENT:
			case AmaltheaPackage.OS_API_OVERHEAD__API_WAIT_EVENT:
			case AmaltheaPackage.OS_API_OVERHEAD__API_CLEAR_EVENT:
			case AmaltheaPackage.OS_API_OVERHEAD__API_ACTIVATE_TASK:
			case AmaltheaPackage.OS_API_OVERHEAD__API_ENFORCED_MIGRATION:
			case AmaltheaPackage.OS_API_OVERHEAD__API_SUSPEND_OS_INTERRUPTS:
			case AmaltheaPackage.OS_API_OVERHEAD__API_RESUME_OS_INTERRUPTS:
			case AmaltheaPackage.OS_API_OVERHEAD__API_REQUEST_SPINLOCK:
			case AmaltheaPackage.OS_API_OVERHEAD__API_RELEASE_SPINLOCK:
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_READ:
			case AmaltheaPackage.OS_API_OVERHEAD__API_SENDER_RECEIVER_WRITE:
			case AmaltheaPackage.OS_API_OVERHEAD__API_SYNCHRONOUS_SERVER_CALL_POINT:
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_READ:
			case AmaltheaPackage.OS_API_OVERHEAD__API_IOC_WRITE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSendMessage(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiTerminateTask(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSchedule(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiRequestResource(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiReleaseResource(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSetEvent(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiWaitEvent(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiClearEvent(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiActivateTask(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiEnforcedMigration(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSuspendOsInterrupts(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiResumeOsInterrupts(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiRequestSpinlock(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiReleaseSpinlock(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSenderReceiverRead(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSenderReceiverWrite(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSynchronousServerCallPoint(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiIocRead(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiIocWrite(),
				 AmaltheaFactory.eINSTANCE.createExecutionTicks()));
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
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSendMessage() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiTerminateTask() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSchedule() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiRequestResource() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiReleaseResource() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSetEvent() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiWaitEvent() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiClearEvent() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiActivateTask() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiEnforcedMigration() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSuspendOsInterrupts() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiResumeOsInterrupts() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiRequestSpinlock() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiReleaseSpinlock() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSenderReceiverRead() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSenderReceiverWrite() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiSynchronousServerCallPoint() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiIocRead() ||
			childFeature == AmaltheaPackage.eINSTANCE.getOsAPIOverhead_ApiIocWrite();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
