/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH.
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

package org.eclipse.app4mc.amalthea.sphinx;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.sphinx.emf.edit.ExtendedItemProviderAdapter;


public class AmaltheaExtendedItemProviderAdapter extends ExtendedItemProviderAdapter {

	public AmaltheaExtendedItemProviderAdapter(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.sphinx.emf.edit.ExtendedItemProviderAdapter#getCreateChildText(java.lang.Object,
	 *      java.lang.Object, java.lang.Object, java.util.Collection, boolean)
	 */
	@Override
	public String getCreateChildText(final Object owner, final Object feature, final Object child,
			final Collection<?> selection, final boolean qualified) {

		if ((feature instanceof EStructuralFeature) && (child instanceof EObject)) {
			EStructuralFeature childFeature = (EStructuralFeature) feature;
			Object childObject = child;

			// Handle FeatureMaps
			if (FeatureMapUtil.isFeatureMap(childFeature)) {
				final FeatureMap.Entry entry = (FeatureMap.Entry) child;
				childFeature = entry.getEStructuralFeature();
				childObject = entry.getValue();
			}

			final String featureText = getFeatureText(childFeature);
			final String childTypeText = getTypeText(childObject);

			// Attribute => Use feature name as action text
			if (childFeature instanceof EAttribute) {
				return getTypeText((EAttribute) childFeature);
			}

			// More than one action ==> Use Submenu
			if (qualified && menuHasManyActions(childFeature, owner)) {
				return featureText + " | " + childTypeText; //$NON-NLS-1$
			}

			// Use flat action text (without prefix)

			// (Feature name == Type name) ==> Use name as action text
			if (featureText.equals(childTypeText)) {
				return childTypeText;
			}

			// Plural+Singular ==> Use type name as action text
			String trimmedType = childTypeText;
			if (childTypeText.toUpperCase().startsWith("HW ") || childTypeText.toUpperCase().startsWith("OS ")) {
				trimmedType = childTypeText.substring(3);
			}
			String substring = trimmedType.substring(0, trimmedType.length() - 1);
			if (childFeature.isMany() && featureText.toLowerCase().startsWith(substring.toLowerCase())) {
				return trimmedType;
			}

			// flat default
			return featureText;
		}

		// fallback
		return super.getCreateChildText(owner, feature, child, selection, qualified);
	}


	private boolean menuHasManyActions(final EStructuralFeature feature, final Object owner) {
		final EList<Object> newChildDescriptors = new BasicEList<Object>();
		collectNewChildDescriptors(newChildDescriptors, owner);

		int counter = 0;
		for (final Object obj : newChildDescriptors) {
			if (obj instanceof CommandParameter) {
				if (feature.equals(((CommandParameter) obj).getEStructuralFeature())) {
					counter++;
					if (counter > 1) {
						return true;
					}
				}
			}
		}

		return false;
	}

}
