/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.emf.util.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;


public class ProviderUtil {

	/**
	 * @param source
	 *            The {@link EObject} which should get updated
	 * @param target
	 *            The target {@link EObject} to listen for changes
	 * @param targetItemProviderClass
	 *            The {@link ItemProvider} class of the target {@link EObject}
	 * @param sourceItemProviderAdapter
	 *            {@link ItemProviderAdapter} of the source {@link EObject}
	 */
	public void registerForElementUpdates(final EObject source, final EObject target,
			final Class<?> targetItemProviderClass, final ItemProviderAdapter sourceItemProviderAdapter) {
		final IChangeNotifier changeNotifier = (IChangeNotifier) sourceItemProviderAdapter.getAdapterFactory().adapt(
				target, targetItemProviderClass);
		changeNotifier.addListener(new INotifyChangedListener() {

			@Override
			public void notifyChanged(final Notification notification) {
				if (notification.getNotifier() == target) {
					sourceItemProviderAdapter.fireNotifyChanged(new ViewerNotification(notification, source, false,
							true));
				}

			}
		});
	}

	/**
	 *
	 * @param element
	 *            {@link EObject} to get text for
	 * @param adapterFactory
	 * @return {@link String} created by found {@link IItemLabelProvider}, empty {@link String} otherwise
	 */
	public String getTextForElementByLabelProvider(final EObject element, final AdapterFactory adapterFactory) {
		final Object plainAdapter = adapterFactory.adapt(element, IItemLabelProvider.class);
		if (plainAdapter instanceof IItemLabelProvider) {
			return ((IItemLabelProvider) plainAdapter).getText(element);
		}
		return ""; //$NON-NLS-1$
	}

}
