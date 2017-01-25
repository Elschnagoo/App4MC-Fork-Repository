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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.Amalthea} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AmaltheaItemProvider extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmaltheaItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_CommonElements());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_SwModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_HwModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_OsModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_StimuliModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_EventModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_ConstraintsModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_PropertyConstraintsModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_MappingModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_ComponentsModel());
			childrenFeatures.add(AmaltheaPackage.eINSTANCE.getAmalthea_ConfigModel());
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
	 * This returns Amalthea.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Amalthea"));
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
		return getString("_UI_Amalthea_type");
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

		switch (notification.getFeatureID(Amalthea.class)) {
			case AmaltheaPackage.AMALTHEA__COMMON_ELEMENTS:
			case AmaltheaPackage.AMALTHEA__SW_MODEL:
			case AmaltheaPackage.AMALTHEA__HW_MODEL:
			case AmaltheaPackage.AMALTHEA__OS_MODEL:
			case AmaltheaPackage.AMALTHEA__STIMULI_MODEL:
			case AmaltheaPackage.AMALTHEA__EVENT_MODEL:
			case AmaltheaPackage.AMALTHEA__CONSTRAINTS_MODEL:
			case AmaltheaPackage.AMALTHEA__PROPERTY_CONSTRAINTS_MODEL:
			case AmaltheaPackage.AMALTHEA__MAPPING_MODEL:
			case AmaltheaPackage.AMALTHEA__COMPONENTS_MODEL:
			case AmaltheaPackage.AMALTHEA__CONFIG_MODEL:
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
				(AmaltheaPackage.eINSTANCE.getAmalthea_CommonElements(),
				 AmaltheaFactory.eINSTANCE.createCommonElements()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_SwModel(),
				 AmaltheaFactory.eINSTANCE.createSWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_HwModel(),
				 AmaltheaFactory.eINSTANCE.createHWModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_OsModel(),
				 AmaltheaFactory.eINSTANCE.createOSModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_StimuliModel(),
				 AmaltheaFactory.eINSTANCE.createStimuliModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_EventModel(),
				 AmaltheaFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_ConstraintsModel(),
				 AmaltheaFactory.eINSTANCE.createConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_PropertyConstraintsModel(),
				 AmaltheaFactory.eINSTANCE.createPropertyConstraintsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_MappingModel(),
				 AmaltheaFactory.eINSTANCE.createMappingModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_ComponentsModel(),
				 AmaltheaFactory.eINSTANCE.createComponentsModel()));

		newChildDescriptors.add
			(createChildParameter
				(AmaltheaPackage.eINSTANCE.getAmalthea_ConfigModel(),
				 AmaltheaFactory.eINSTANCE.createConfigModel()));
	}

}
