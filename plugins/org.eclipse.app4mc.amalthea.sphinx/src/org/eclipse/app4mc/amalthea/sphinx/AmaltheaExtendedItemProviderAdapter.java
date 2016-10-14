/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.command.InitializeCopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
		EStructuralFeature childFeature;
		Object childObject;

		if ((feature instanceof EStructuralFeature) && (child instanceof EObject)) {
			childFeature = (EStructuralFeature) feature;
			childObject = child;

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
			final String substring = childTypeText.substring(0, childTypeText.length() - 1);
			if (childFeature.isMany() && featureText.toLowerCase().startsWith(substring.toLowerCase())) {
				return childTypeText;
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

	/**
	 * This method is overridden to enhance the copy elements action -> so that "back reference" mechanism of AMALTHEA
	 * works in the same way as eOpposite is handled by standard EMF copy/paste action
	 *
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createInitializeCopyCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      org.eclipse.emf.ecore.EObject, org.eclipse.emf.edit.command.CopyCommand.Helper)
	 */
	@Override
	protected Command createInitializeCopyCommand(final EditingDomain domain, final EObject owner,
			final Helper helper) {


		return new InitializeCopyCommand(domain, owner, helper) {

			@Override
			protected void copyReferences() {

				/*-- This is the default copy references invocation */
				super.copyReferences();
				/*
				 * Below code is to unset the value of EStructuralFeature for which LinkInt is mapped (as per the back
				 * reference mechanism introduced in AMALTHEA)
				 */

				final EClass eClass = this.copy.eClass();

				if (eClass != null) {
					final EList<EStructuralFeature> eAllStructuralFeatures = eClass.getEAllStructuralFeatures();

					/*- EStructuralFeature's Map -> key is name of EStructuralFeature and value is EStructuralFeature object */

					final Map<String, EStructuralFeature> eFeaturesMap = new HashMap<String, EStructuralFeature>();

					/*- List of EStructuralFeature's which are  having eOpposite and are part of the "back reference mechanism introduced in AMALTHEA"*/

					final List<String> linkIntFeatures = new ArrayList<String>();

					for (final EStructuralFeature eStructuralFeature : eAllStructuralFeatures) {

						/*- In eFeaturesMap data belonging to EReference objects is added  */
						if (eStructuralFeature instanceof EReference) {

							final String name = eStructuralFeature.getName();

							eFeaturesMap.put(name, eStructuralFeature);

							if (name.endsWith("LinkInt")) {
								linkIntFeatures.add(name);
							}
						}


					}

					/*- loop through "LinkInt features" and find the matching features (e.g: In LabelAccess EClass -> EStructuralFeature "dataLinkInt" is the mapped to EStructualFeature "data"  */

					for (final String linkIntFeatureName : linkIntFeatures) {

						final int lastIndexOf = linkIntFeatureName.lastIndexOf("LinkInt");

						if (lastIndexOf != -1) {
							final String matchingFeatureName = linkIntFeatureName.substring(0, lastIndexOf);

							final EStructuralFeature eStructuralFeature = eFeaturesMap.get(matchingFeatureName);

							if (eStructuralFeature != null) {
								/*- unset the value for mapped EStructuralFeature  (e.g: data of LabelAccess eClass) of LinkInt EStructuralFeature (e.g: dataLinkInt of LabelAccess eclass) */
								this.copy.eSet(eStructuralFeature, null);
							}
						}

					}


				}


			}
		};
	}
}
