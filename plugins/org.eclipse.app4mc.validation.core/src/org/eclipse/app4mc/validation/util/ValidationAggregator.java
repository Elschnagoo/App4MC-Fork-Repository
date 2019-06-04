/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.validation.util;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

public class ValidationAggregator {
	private final Map<Class<? extends IProfile>, CachedProfile> profileCache = new HashMap<>();
	private final Map<Class<? extends IValidation>, CachedValidator> validatorCache = new HashMap<>();
	private final Set<EPackage> ePackageSet = new HashSet<>();
	private final Set<EClass> eClassSet = new HashSet<>();
	private final Map<EClassifier, List<CachedValidator>> validationMap1 = new HashMap<>();
	private final Map<EClassifier, Set<CachedValidator>> validationMap2 = new HashMap<>();	

	public ValidationAggregator(Class<? extends IProfile> profileClass) {
		this(Collections.singletonList(profileClass));
	}
	
	public ValidationAggregator(final Collection<Class<? extends IProfile>> profileClasses) {
		super();

		addProfiles(profileClasses);
	}

	public void addProfiles(final Collection<Class<? extends IProfile>> profileClasses) {
		if (profileClasses == null || profileClasses.isEmpty()) return;

		Map<Class<? extends IValidation>, CachedValidator> newValidations = new HashMap<>();
		
		// Store profiles in cache (without duplicates)
		
		for (Class<? extends IProfile> pClass : profileClasses) {
			if (pClass != null) {
				if (!this.profileCache.containsKey(pClass)) {
					CachedProfile profile = new CachedProfile(pClass);
					this.profileCache.put(pClass, profile);
					
					newValidations.putAll(profile.getAllValidations());
				}
			}
		}
		
		addValidations(newValidations);
	}

	public void addValidations(final Map<Class<? extends IValidation>, CachedValidator> map) {
		if (map == null || map.isEmpty()) return;
		
		// Store validations in cache (without duplicates)
		
		for (Entry<Class<? extends IValidation>, CachedValidator> entry : map.entrySet()) {
			Class<? extends IValidation> validatorClass = entry.getKey();
			CachedValidator newValidator = entry.getValue();
			
			CachedValidator previousValidator = this.validatorCache.get(validatorClass);
			if (previousValidator == null) {
				// insert new validator
				this.validatorCache.put(validatorClass, newValidator);
				
				// store affected Ecore package
				EPackage ePackage = newValidator.getValidatorInstance().getEPackage();
				boolean isNewPackage = this.ePackageSet.add(ePackage);
				
				// store all concrete Ecore classes of packages
				if (isNewPackage) {
					for (final EClassifier classifier : ePackage.getEClassifiers()) {
						if (classifier instanceof EClass) {
							EClass eClass = (EClass) classifier;
							if (!eClass.isAbstract() && !eClass.isInterface())
								this.eClassSet.add(eClass);
						}
					}
				}
			} else if (previousValidator.getSeverity().ordinal() < newValidator.getSeverity().ordinal()) {
				// insert validator with higher severity
				this.validatorCache.put(validatorClass, newValidator);
			}
		}

		rebuildValidationMaps();
	}

	private void rebuildValidationMaps() {
		
		// Collect validations in Map 1
		
		this.validationMap1.clear();
		
		for (CachedValidator validator : this.validatorCache.values()) {
			EClassifier eClassifier = validator.getTargetEClassifier();
			
			this.validationMap1
				.computeIfAbsent(eClassifier, k -> new ArrayList<CachedValidator>())
				.add(validator);
		}
		
		// Reuse validations of Map1 in Map2
		
		this.validationMap2.clear();
		
		for (Entry<EClassifier, List<CachedValidator>> entry : validationMap1.entrySet()) {
			addValidationsToMap2(entry.getKey(), entry.getValue());
		}
	}
	
	private void addValidationsToMap2(final EClassifier eClassifier, final List<CachedValidator> validatorList) {
		if (eClassifier instanceof EDataType) {
			// Add entry for data type
			basicAddValidationsToMap2(eClassifier, validatorList);
			
		} else if (eClassifier instanceof EClass) {
			// Add entry for concrete target class
			EClass eClass = (EClass) eClassifier;
			if (!eClass.isAbstract() && !eClass.isInterface()) {
				basicAddValidationsToMap2(eClass, validatorList);
			}
			
			// Add entries for sub classes of target class
			for (EClass potentialSubclass : this.eClassSet) {
				// Hint: Do not use eClass.isSuperTypeOf(potentialSubclass)
				// because has a different result for EObject
				// TODO check CustomProperty
				if (eClass.getInstanceClass().isAssignableFrom(potentialSubclass.getInstanceClass())) {
					basicAddValidationsToMap2(potentialSubclass, validatorList);
				}
			}
		}
	}

	private void basicAddValidationsToMap2(final EClassifier eClassifier, final List<CachedValidator> validatorList) {
		// only add entries for elements of the concerned packages
		if (this.ePackageSet.contains(eClassifier.eContainer())) {
			this.validationMap2
				.computeIfAbsent(eClassifier, k -> new HashSet<CachedValidator>())
				.addAll(validatorList);
		}
	}


	// *** public getters ***

	public List<Class<? extends IProfile>> getProfiles() {
		return this.profileCache.values().stream().map(e -> e.getProfileClass()).collect(Collectors.toList());
	}

	public Set<EPackage> getEPackages() {
		return  Collections.unmodifiableSet(ePackageSet);
	}

	public Set<CachedValidator> getValidations(final EClass targetClass) {
		Set<CachedValidator> result = validationMap2.get(targetClass);
		if (result == null) {
			return Collections.emptySet();
		} else {
			return Collections.unmodifiableSet(result);
		}
	}

	public List<IValidation> getAllValidatorInstances() {
		return this.validatorCache.values().stream().map(e -> e.getValidatorInstance()).collect(Collectors.toList());
	}

	public ConcurrentHashMap<EClassifier, CopyOnWriteArraySet<CachedValidator>> getConcurrentValidationMap() {
		ConcurrentHashMap<EClassifier, CopyOnWriteArraySet<CachedValidator>> map = new ConcurrentHashMap<>();
		
		for (Entry<EClassifier, Set<CachedValidator>> entry : validationMap2.entrySet()) {
			map.put(entry.getKey(), new CopyOnWriteArraySet<CachedValidator>(entry.getValue()));
		}
		return map;
	}


	// *** Some helper methods

	public void dumpValidationMap1(PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap1.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println("Validations for " + cl.getName() + ":");
			for (CachedValidator vConf : validationMap1.get(cl)) {
				out.println("    " + vConf.getSeverity() + " - " + vConf.getValidationID());
			}
		}
	}

	public void dumpValidationMap2(PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap2.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println("Validations for " + cl.getName() + ":");
			for (CachedValidator vConf : validationMap2.get(cl)) {
				out.println("    " + vConf.getSeverity() + " - " + vConf.getValidationID());
			}
		}
	}

}
