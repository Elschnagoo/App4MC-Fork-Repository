/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.edit.command.CommandParameter;

public class EcoreGenericsHelper {

	/**
	 * Finds the EClassifier objects for the generic parameters of the class of 'object', depending on the position of
	 * 'object' in the model. This function only checks the parent elements of the EMF tree to find the expected
	 * EClassifier for a generic parameter. So references to the object (that are not containment reference) with
	 * generic parameters are ignored.
	 *
	 * @param object
	 * @return A map where the generic parameters are mapped to the expected type, the map can be incomplete or null if
	 *         there are no generic parameters or no values for the parameters.
	 */
	public static Map<ETypeParameter, EClassifier> generateGenericParameterMap(final Object object) {
		// create generic parameter map
		Map<ETypeParameter, EClassifier> result = null;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			final EClass eClass = eObject.eClass();
			// generic type parameters of the class
			final List<ETypeParameter> typeParameters = eClass.getETypeParameters();
			if (typeParameters != null && typeParameters.size() > 0) {

				// generic type arguments for the generic type parameters of the
				// class, got from the containing feature
				final EStructuralFeature containingFeature = eObject.eContainingFeature();
				final EGenericType genericType = containingFeature.getEGenericType();
				final List<EGenericType> genericTypeArguments = genericType.getETypeArguments();

				if (genericTypeArguments != null && genericTypeArguments.size() > 0) {
					// map name of type parameters to type arguments (by index)
					result = new HashMap<>();
					final int size = Math.min(typeParameters.size(), genericTypeArguments.size());
					for (int i = 0; i < size; i++) {
						// local class generic type parameter
						final ETypeParameter typeParameter = typeParameters.get(i);
						// type of parent feature
						final EGenericType type = genericTypeArguments.get(i);
						EClassifier typeClassifier = type.getEClassifier();

						if (typeClassifier == null) {
							final EObject eContainer = eObject.eContainer();
							final ETypeParameter parentTypeParameter = type.getETypeParameter();
							if (eContainer != null && parentTypeParameter != null) {
								final Map<ETypeParameter, EClassifier> parentGenericParameterMap = generateGenericParameterMap(
										eContainer);
								if (parentGenericParameterMap != null) {
									typeClassifier = parentGenericParameterMap.get(parentTypeParameter);
								}
							}
						}

						if (typeClassifier != null) {
							result.put(typeParameter, typeClassifier);
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * Corrects the child descriptors of an EMF-generated item provider. It removes all child descriptors
	 * that are not allowed because of the restriction of a generic type.
	 *
	 * @param object
	 * @param newChildDescriptors
	 *            The list of child descriptors to modify
	 */
	public static void correctChildDescriptorListForGenericTypes(final Object object,
			final Collection<Object> newChildDescriptors) {
		final Map<ETypeParameter, EClassifier> genericParameterMap = generateGenericParameterMap(object);
		if (genericParameterMap != null) {
			correctChildDescriptorListForGenericTypes(genericParameterMap, newChildDescriptors);
		}
	}

	/**
	 * Corrects the child descriptors of an EMF-generated item provider. It removes all child descriptors
	 * that are not allowed because of the restriction of a generic type.
	 *
	 * @param genericParameterMap
	 *            The parameter map that defines which EClassifier is expected for which generic type
	 * @param newChildDescriptors
	 *            The list of child descriptors to modify
	 */
	public static void correctChildDescriptorListForGenericTypes(
			final Map<ETypeParameter, EClassifier> genericParameterMap, final Collection<Object> newChildDescriptors) {
		final List<Object> childDescriptorsToRemove = new ArrayList<>();
		// check child descriptors
		for (final Object cd : newChildDescriptors) {
			if (cd instanceof CommandParameter) {
				final CommandParameter cp = (CommandParameter) cd;
				if (cp.getFeature() instanceof EReference) {
					final EReference reference = (EReference) cp.getFeature();
					final EGenericType genericType = reference.getEGenericType();
					final ETypeParameter typeParameter = genericType.getETypeParameter();
					if (typeParameter == null) {
						continue;
					}
					final EClassifier expectedTypeOfValue = genericParameterMap.get(typeParameter);
					final Object value = cp.getValue();
					if (expectedTypeOfValue != null && expectedTypeOfValue.isInstance(value) == false) {
						childDescriptorsToRemove.add(cd);
					}
				}
			}
		}

		newChildDescriptors.removeAll(childDescriptorsToRemove);
	}
	
	
	
	/**
	 * Collects the superset of child descriptors for the following objects:
	 * ModeSwitchDefault, ModeSwitchEntry and ProbabilitySwitchEntry.
	 * 
	 * @param feature
	 * @param newChildDescriptors
	 */
	public static void collectNewChildDescriptorsForSwitchEntry(Object feature, Collection<Object> newChildDescriptors) {
		ArrayList<EObject> childObjects = new ArrayList<EObject>();
		AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		
		// see RunnableItemProvider
		childObjects.add(factory.createGroup());
		childObjects.add(factory.createRunnableInstructions());
		childObjects.add(factory.createLabelAccess());
		childObjects.add(factory.createModeLabelAccess());
		childObjects.add(factory.createRunnableCall());
		childObjects.add(factory.createRunnableModeSwitch());
		childObjects.add(factory.createRunnableProbabilitySwitch());
		childObjects.add(factory.createSemaphoreAccess());
		childObjects.add(factory.createSenderReceiverRead());
		childObjects.add(factory.createSenderReceiverWrite());
		childObjects.add(factory.createAsynchronousServerCall());
		childObjects.add(factory.createSynchronousServerCall());

		// see CallGraphItemProvider
		childObjects.add(factory.createCallSequence());
		childObjects.add(factory.createModeSwitch());
		childObjects.add(factory.createProbabiltitySwitch());
	
		for (EObject child : childObjects) {
			newChildDescriptors.add(new CommandParameter(null, feature, child));			
		}
	}

	/**
	 * Collects the superset of child descriptors for the following features:
	 * - Deviation: distribution
	 * 
	 * @param feature
	 * @param newChildDescriptors
	 */
	public static void collectNewChildDescriptorsForDeviation(Object feature, Collection<Object> newChildDescriptors) {
		ArrayList<EObject> childObjects = new ArrayList<EObject>();
		AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		
		childObjects.add(factory.createBoundaries());
		childObjects.add(factory.createUniformDistribution());
		childObjects.add(factory.createGaussDistribution());
		childObjects.add(factory.createWeibullParameters());
		childObjects.add(factory.createWeibullEstimators());
		childObjects.add(factory.createBetaDistribution());

		for (EObject child : childObjects) {
			newChildDescriptors.add(new CommandParameter(null, feature, child));			
		}
	}
	
	/**
	 * Collects the superset of child descriptors for the following features:
	 * - Deviation: upperBound, lowerBound
	 * - WeibullEstimators: mean
	 * - GaussDistribution: mean, sd
	 * 
	 * @param feature
	 * @param newChildDescriptors
	 */
	public static void collectNewChildDescriptorsForDistribution(Object feature, Collection<Object> newChildDescriptors) {
		ArrayList<EObject> childObjects = new ArrayList<EObject>();
		AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		
		
		childObjects.add(factory.createLongObject());
		childObjects.add(factory.createSignedTime());
		
		for (EObject child : childObjects) {
			newChildDescriptors.add(new CommandParameter(null, feature, child));			
		}
	}
	
}
