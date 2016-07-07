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
import org.eclipse.app4mc.amalthea.model.EventConfigElement;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.EventConfigElement} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EventConfigElementItemProvider extends EventConfigItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EventConfigElementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event());
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
	 * This returns EventConfigElement.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EventConfigElement"));
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
		String label = ((EventConfigElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EventConfigElement_type") :
			getString("_UI_EventConfigElement_type") + " " + label;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		// delegate to custom item provider
		return CustomItemProviderService.getEventConfigElementItemProviderText(object, getTextGen(object),
				getRootAdapterFactory());
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

		switch (notification.getFeatureID(EventConfigElement.class)) {
			case AmaltheaPackage.EVENT_CONFIG_ELEMENT__EVENT:
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
		final List<ViewerNotification> notifications = CustomItemProviderService
				.getEventConfigElementItemProviderNotifications(notification);
		for (final ViewerNotification vn : notifications) {
			fireNotifyChanged(vn);
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
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createCustomEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createStimulusEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createProcessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createProcessChainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createRunnableEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createLabelEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getEventConfigElement_Event(),
				 AmaltheaFactory.eINSTANCE.createSemaphoreEvent()));
	}

}
