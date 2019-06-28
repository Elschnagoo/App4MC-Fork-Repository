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
import org.eclipse.app4mc.validation.core.Severity;
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

	private boolean rebuildValidationMaps = false;
	
	public ValidationAggregator() {
		super();
	}
	
	public void addProfiles(final Collection<Class<? extends IProfile>> profileClasses) {
		if (profileClasses == null || profileClasses.isEmpty()) return;
		
		// store profiles in cache
		for (Class<? extends IProfile> pClass : profileClasses) {
			addProfile(pClass);
		}
	}

	public void addProfile(final Class<? extends IProfile> profileClass) {
		if (profileClass == null) return;

		if (!this.profileCache.containsKey(profileClass)) {
			// create new profile and add to cache
			CachedProfile profile = new CachedProfile(profileClass);
			this.profileCache.put(profileClass, profile);
			
			// add validations of profile to cache
			addValidations(profile.getAllValidations());
		}
	}

	public void addValidations(final Map<Class<? extends IValidation>, Severity> map) {
		if (map == null || map.isEmpty()) return;
		
		for (Entry<Class<? extends IValidation>, Severity> entry : map.entrySet()) {
			addValidation(entry.getKey(), entry.getValue());
		}
	}
	
	public void addValidation(final Class<? extends IValidation> validatorClass, Severity validatorSeverity) {
		if (validatorClass == null) return;
		
		CachedValidator cachedValidator = this.validatorCache.get(validatorClass);
		if (cachedValidator == null) {
			// create new validator and add to cache
			CachedValidator newValidator = new CachedValidator(validatorClass, validatorSeverity);
			this.validatorCache.put(validatorClass, newValidator);
			this.rebuildValidationMaps = true;
			
			// store affected Ecore package
			EPackage ePackage = newValidator.getValidatorInstance().getEPackage();
			if (ePackage != null && !this.ePackageSet.contains(ePackage)) {
				this.ePackageSet.add(ePackage);
				
				// store all concrete Ecore classes of packages
				for (final EClassifier classifier : ePackage.getEClassifiers()) {
					if (classifier instanceof EClass) {
						EClass eClass = (EClass) classifier;
						if (!eClass.isAbstract() && !eClass.isInterface())
							this.eClassSet.add(eClass);
					}
				}
			}
		} else {
			// check existing validator and set higher severity
			if (cachedValidator.getSeverity().ordinal() < validatorSeverity.ordinal()) {
				cachedValidator.setSeverity(validatorSeverity);
			}
		}
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
		
		this.rebuildValidationMaps = false;
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
		if (this.rebuildValidationMaps) rebuildValidationMaps();
		
		Set<CachedValidator> result = validationMap2.get(targetClass);
		if (result == null) {
			return Collections.emptySet();
		} else {
			return Collections.unmodifiableSet(result);
		}
	}

	public ConcurrentHashMap<EClassifier, CopyOnWriteArraySet<CachedValidator>> getConcurrentValidationMap() {
		if (this.rebuildValidationMaps) rebuildValidationMaps();
		
		ConcurrentHashMap<EClassifier, CopyOnWriteArraySet<CachedValidator>> map = new ConcurrentHashMap<>();
		
		for (Entry<EClassifier, Set<CachedValidator>> entry : validationMap2.entrySet()) {
			map.put(entry.getKey(), new CopyOnWriteArraySet<CachedValidator>(entry.getValue()));
		}
		return map;
	}


	// *** Some helper methods

	public void dumpValidationMap1(PrintStream stream) {
		if (this.rebuildValidationMaps) rebuildValidationMaps();
		
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap1.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println(cl.getName() + ":");
			for (CachedValidator vConf : validationMap1.get(cl)) {
				out.println("    " + vConf.getValidationID() + " -> " + vConf.getSeverity());
			}
		}
	}

	public void dumpValidationMap2(PrintStream stream) {
		if (this.rebuildValidationMaps) rebuildValidationMaps();
		
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap2.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println(cl.getName() + ":");
			for (CachedValidator vConf : validationMap2.get(cl)) {
				out.println("    " + vConf.getValidationID() + " -> " + vConf.getSeverity());
			}
		}
	}

}
