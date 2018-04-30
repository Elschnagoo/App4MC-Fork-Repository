/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.model.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

public class DeleteElementsUtility {

	/**
	 * Performs bulk deletion of EMF model elements inside a specific resource
	 * @param eObjects	Collection of elements to be removed
	 * @param resource	Resource to which "elements to be removed" are belonging to 
	 */
	public static void deleteAll(Collection<? extends EObject> eObjects, Resource resource) {

		Map<EObject, Collection<Setting>> usageRefs = UsageCrossReferencer.findAll(eObjects, resource);

		for (Map.Entry<EObject, Collection<Setting>> mapEntry : usageRefs.entrySet()) {
			//fetching the key from Map.Entry
			EObject eObject = mapEntry.getKey();

			for (EStructuralFeature.Setting settingObject : mapEntry.getValue()) {

				if (settingObject.getEStructuralFeature().isChangeable() == true) {

					// remove the reference relation
					EcoreUtil.remove(settingObject, eObject);

				}
			}

			// remove the element
			EcoreUtil.remove(eObject);
		}

	}
	/**
	 * Performs bulk deletion of EMF model elements inside a specific EObject ( e.g: model root like AMALTHEA or SWModel or HWModel)
	 * @param eObjects	Collection of elements to be removed
	 * @param model		Model root 
	 */
	public static void deleteAll(Collection<? extends EObject> eObjects, EObject model) {

		Map<EObject, Collection<Setting>> usageRefs = UsageCrossReferencer.findAll(eObjects, model);

		if(usageRefs !=null && usageRefs.size()>0){

			for (Map.Entry<EObject, Collection<Setting>> mapEntry : usageRefs.entrySet()) {
				//fetching the key from Map.Entry
				EObject eObject = mapEntry.getKey();

				for (EStructuralFeature.Setting settingObject : mapEntry.getValue()) {

					if (settingObject.getEStructuralFeature().isChangeable() == true) {

						// remove the reference relation
						EcoreUtil.remove(settingObject, eObject);

					}
				}

				// remove the element
				EcoreUtil.remove(eObject);
			} 

		}
		

		Iterator<? extends EObject> iterator = new ArrayList(eObjects).iterator();
		
		while(iterator.hasNext()){
			EObject next = iterator.next();
			EcoreUtil.remove(next);
//			iterator.remove();
		}
	
	
		

	}
}
