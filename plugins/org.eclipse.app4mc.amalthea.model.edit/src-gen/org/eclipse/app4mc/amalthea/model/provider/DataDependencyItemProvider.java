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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.app4mc.amalthea.model.DataDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataDependencyItemProvider 
	extends BaseObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDependencyItemProvider(AdapterFactory adapterFactory) {
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

			addLabelsPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addCallArgumentsPropertyDescriptor(object);
			addContainingRunnablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataDependency_labels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataDependency_labels_feature", "_UI_DataDependency_type"),
				 AmaltheaPackage.eINSTANCE.getDataDependency_Labels(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataDependency_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataDependency_parameters_feature", "_UI_DataDependency_type"),
				 AmaltheaPackage.eINSTANCE.getDataDependency_Parameters(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * @generated NOT
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataDependency_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataDependency_parameters_feature", "_UI_DataDependency_type"),
				 AmaltheaPackage.eINSTANCE.getDataDependency_Parameters(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
				{
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return CustomPropertyDescriptorService.getDataDependencyValuesForParameters(object);
					}
				}
			);	
	}

	/**
	 * This adds a property descriptor for the Call Arguments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallArgumentsPropertyDescriptorGen(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataDependency_callArguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataDependency_callArguments_feature", "_UI_DataDependency_type"),
				 AmaltheaPackage.eINSTANCE.getDataDependency_CallArguments(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * @generated NOT
	 */
	protected void addCallArgumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataDependency_callArguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataDependency_callArguments_feature", "_UI_DataDependency_type"),
				 AmaltheaPackage.eINSTANCE.getDataDependency_CallArguments(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
				{
					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						return CustomPropertyDescriptorService.getDataDependencyValuesForCallArguments(object);
					}
				}
			);	
	}


	/**
	 * This adds a property descriptor for the Containing Runnable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingRunnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataDependency_containingRunnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataDependency_containingRunnable_feature", "_UI_DataDependency_type"),
				 AmaltheaPackage.eINSTANCE.getDataDependency_ContainingRunnable(),
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
	 * This returns DataDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataDependency"));
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
		return getString("_UI_DataDependency_type");
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
