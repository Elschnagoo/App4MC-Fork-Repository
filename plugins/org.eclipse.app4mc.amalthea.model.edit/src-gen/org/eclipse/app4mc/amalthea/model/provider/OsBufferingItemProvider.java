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
import org.eclipse.app4mc.amalthea.model.OsBuffering;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.OsBuffering} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OsBufferingItemProvider extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OsBufferingItemProvider(AdapterFactory adapterFactory) {
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

			addRunnableLevelPropertyDescriptor(object);
			addProcessLevelPropertyDescriptor(object);
			addScheduleSectionLevelPropertyDescriptor(object);
			addBufferingAlgorithmPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Runnable Level feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunnableLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsBuffering_runnableLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsBuffering_runnableLevel_feature", "_UI_OsBuffering_type"),
				 AmaltheaPackage.eINSTANCE.getOsBuffering_RunnableLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process Level feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsBuffering_processLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsBuffering_processLevel_feature", "_UI_OsBuffering_type"),
				 AmaltheaPackage.eINSTANCE.getOsBuffering_ProcessLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Section Level feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addScheduleSectionLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsBuffering_scheduleSectionLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsBuffering_scheduleSectionLevel_feature", "_UI_OsBuffering_type"),
				 AmaltheaPackage.eINSTANCE.getOsBuffering_ScheduleSectionLevel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Buffering Algorithm feature. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected void addBufferingAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsBuffering_bufferingAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsBuffering_bufferingAlgorithm_feature", "_UI_OsBuffering_type"),
				 AmaltheaPackage.eINSTANCE.getOsBuffering_BufferingAlgorithm(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OsBuffering.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OsBuffering"));
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
		OsBuffering osBuffering = (OsBuffering)object;
		return getString("_UI_OsBuffering_type") + " " + osBuffering.isRunnableLevel();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getOsBufferingItemProviderText(object, getTextGen(object));
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

		switch (notification.getFeatureID(OsBuffering.class)) {
			case AmaltheaPackage.OS_BUFFERING__RUNNABLE_LEVEL:
			case AmaltheaPackage.OS_BUFFERING__PROCESS_LEVEL:
			case AmaltheaPackage.OS_BUFFERING__SCHEDULE_SECTION_LEVEL:
			case AmaltheaPackage.OS_BUFFERING__BUFFERING_ALGORITHM:
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
