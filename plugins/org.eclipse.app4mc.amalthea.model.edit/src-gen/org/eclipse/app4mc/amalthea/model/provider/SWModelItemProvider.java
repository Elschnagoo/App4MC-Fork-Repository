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
import org.eclipse.app4mc.amalthea.model.SWModel;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.SWModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SWModelItemProvider extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Isrs());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Tasks());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Runnables());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Labels());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Channels());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_ProcessPrototypes());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Sections());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Activations());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Events());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_TypeDefinitions());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_CustomEntities());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_ProcessChains());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_Modes());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getSWModel_ModeLabels());
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
	 * This returns SWModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SWModel"));
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
		return getString("_UI_SWModel_type");
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

		switch (notification.getFeatureID(SWModel.class)) {
			case AmaltheaPackage.SW_MODEL__ISRS:
			case AmaltheaPackage.SW_MODEL__TASKS:
			case AmaltheaPackage.SW_MODEL__RUNNABLES:
			case AmaltheaPackage.SW_MODEL__LABELS:
			case AmaltheaPackage.SW_MODEL__CHANNELS:
			case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
			case AmaltheaPackage.SW_MODEL__SECTIONS:
			case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
			case AmaltheaPackage.SW_MODEL__EVENTS:
			case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
			case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
			case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
			case AmaltheaPackage.SW_MODEL__MODES:
			case AmaltheaPackage.SW_MODEL__MODE_LABELS:
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
				(AmaltheaPackage.eINSTANCE.getSWModel_Isrs(),
				 AmaltheaFactory.eINSTANCE.createISR()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Tasks(),
				 AmaltheaFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Runnables(),
				 AmaltheaFactory.eINSTANCE.createRunnable()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Labels(),
				 AmaltheaFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Channels(),
				 AmaltheaFactory.eINSTANCE.createChannel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_ProcessPrototypes(),
				 AmaltheaFactory.eINSTANCE.createProcessPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Sections(),
				 AmaltheaFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Activations(),
				 AmaltheaFactory.eINSTANCE.createPeriodicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Activations(),
				 AmaltheaFactory.eINSTANCE.createSporadicActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Activations(),
				 AmaltheaFactory.eINSTANCE.createSingleActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Activations(),
				 AmaltheaFactory.eINSTANCE.createCustomActivation()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Events(),
				 AmaltheaFactory.eINSTANCE.createOsEvent()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_TypeDefinitions(),
				 AmaltheaFactory.eINSTANCE.createDataTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_TypeDefinitions(),
				 AmaltheaFactory.eINSTANCE.createBaseTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_CustomEntities(),
				 AmaltheaFactory.eINSTANCE.createCustomEntity()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_ProcessChains(),
				 AmaltheaFactory.eINSTANCE.createProcessChain()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_Modes(),
				 AmaltheaFactory.eINSTANCE.createMode()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getSWModel_ModeLabels(),
				 AmaltheaFactory.eINSTANCE.createModeLabel()));
	}

}
