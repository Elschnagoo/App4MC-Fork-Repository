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
import org.eclipse.app4mc.amalthea.model.Semaphore;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.Semaphore} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SemaphoreItemProvider extends ReferableBaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreItemProvider(AdapterFactory adapterFactory) {
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

			addSemaphoreTypePropertyDescriptor(object);
			addInitialValuePropertyDescriptor(object);
			addMaxValuePropertyDescriptor(object);
			addPriorityCeilingProtocolPropertyDescriptor(object);
			addSemaphoreAccessesPropertyDescriptor(object);
			addReferringComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Semaphore Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemaphoreTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Semaphore_semaphoreType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Semaphore_semaphoreType_feature", "_UI_Semaphore_type"),
				 AmaltheaPackage.eINSTANCE.getSemaphore_SemaphoreType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Semaphore_initialValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Semaphore_initialValue_feature", "_UI_Semaphore_type"),
				 AmaltheaPackage.eINSTANCE.getSemaphore_InitialValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Semaphore_maxValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Semaphore_maxValue_feature", "_UI_Semaphore_type"),
				 AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority Ceiling Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityCeilingProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Semaphore_priorityCeilingProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Semaphore_priorityCeilingProtocol_feature", "_UI_Semaphore_type"),
				 AmaltheaPackage.eINSTANCE.getSemaphore_PriorityCeilingProtocol(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Semaphore Accesses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemaphoreAccessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Semaphore_semaphoreAccesses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Semaphore_semaphoreAccesses_feature", "_UI_Semaphore_type"),
				 AmaltheaPackage.eINSTANCE.getSemaphore_SemaphoreAccesses(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_ReadonlyPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Referring Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferringComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Semaphore_referringComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Semaphore_referringComponents_feature", "_UI_Semaphore_type"),
				 AmaltheaPackage.eINSTANCE.getSemaphore_ReferringComponents(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_ReadonlyPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This returns Semaphore.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Semaphore"));
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
		String label = ((Semaphore)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Semaphore_type") :
			getString("_UI_Semaphore_type") + " " + label;
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

		switch (notification.getFeatureID(Semaphore.class)) {
			case AmaltheaPackage.SEMAPHORE__SEMAPHORE_TYPE:
			case AmaltheaPackage.SEMAPHORE__INITIAL_VALUE:
			case AmaltheaPackage.SEMAPHORE__MAX_VALUE:
			case AmaltheaPackage.SEMAPHORE__PRIORITY_CEILING_PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
