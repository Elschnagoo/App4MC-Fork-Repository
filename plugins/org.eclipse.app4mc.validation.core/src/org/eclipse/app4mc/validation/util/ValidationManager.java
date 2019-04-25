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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

public class ValidationManager {
	private final Map<Class<? extends IProfile>, ProfileConfig> profileMap = new HashMap<>();
	private final Map<Class<? extends IValidation>, ValidatorConfig> validationMap = new HashMap<>();
	private final Set<EPackage> ePackageSet = new HashSet<>();
	private final Set<EClass> eClassSet = new HashSet<>();
	private final Map<EClassifier, List<ValidatorConfig>> validationMap1 = new HashMap<>();
	private final Map<EClassifier, Set<ValidatorConfig>> validationMap2 = new HashMap<>();	


	public ValidationManager(Class<? extends IProfile> profileClass) {
		this(Collections.singletonList(profileClass));
	}
	
	public ValidationManager(final List<Class<? extends IProfile>> profileClassList) {
		super();

		// Store profiles (without duplicates)
		if (profileClassList != null) {
			for (Class<? extends IProfile> profileClass : profileClassList) {
				if (profileClass != null) {
					if (!this.profileMap.containsKey(profileClass))
					this.profileMap.put(profileClass, new ProfileConfig(profileClass));
				}
			}
		}
		
		// Store validations (without duplicates)
		for (ProfileConfig pConfig : this.profileMap.values()) {
			for (Entry<Class<? extends IValidation>, ValidatorConfig> entry : pConfig.getAllValidations().entrySet()) {
				Class<? extends IValidation> validatorClass = entry.getKey();
				ValidatorConfig newConfig = entry.getValue();
				
				ValidatorConfig previousConfig = this.validationMap.get(validatorClass);
				if (previousConfig == null || previousConfig.getSeverity().ordinal() < newConfig.getSeverity().ordinal()) {
					// insert config with higher severity
					this.validationMap.put(validatorClass, newConfig);
				}
			}
		}
		
		// Store affected Ecore packages
		for (ValidatorConfig vConfig : this.validationMap.values()) {
			this.ePackageSet.add(vConfig.getValidatorInstance().getEPackage());
		}
		
		// Store all concrete Ecore classes of packages
		for (EPackage ePackage : this.ePackageSet) {	
			for (final EClassifier classifier : ePackage.getEClassifiers()) {
				if (classifier instanceof EClass) {
					EClass eClass = (EClass) classifier;
					if (!eClass.isAbstract() && !eClass.isInterface())
						this.eClassSet.add(eClass);
				}
			}
		}
		
		// Collect validations in Map 1
		for (ValidatorConfig vConfig : this.validationMap.values()) {
			EClassifier eClassifier = vConfig.getTargetEClassifier();
			
			this.validationMap1
				.computeIfAbsent(eClassifier, k -> new ArrayList<ValidatorConfig>())
				.add(vConfig);
		}
		
		// Reuse validations of Map1 in Map2
		for (Entry<EClassifier, List<ValidatorConfig>> entry : validationMap1.entrySet()) {
			addValidationsToMap2(entry.getKey(), entry.getValue());
		}
	}

	private void addValidationsToMap2(final EClassifier eClassifier, final List<ValidatorConfig> validatorConfigList) {
		if (eClassifier instanceof EDataType) {
			// Add entry for data type
			basicAddValidationsToMap2(eClassifier, validatorConfigList);
			
		} else if (eClassifier instanceof EClass) {
			// Add entry for concrete target class
			EClass eClass = (EClass) eClassifier;
			if (!eClass.isAbstract() && !eClass.isInterface()) {
				basicAddValidationsToMap2(eClass, validatorConfigList);
			}
			
			// Add entries for sub classes of target class
			for (EClass potentialSubclass : this.eClassSet) {
				// Hint: Do not use eClass.isSuperTypeOf(potentialSubclass)
				// because has a different result for EObject
				if (eClass.getInstanceClass().isAssignableFrom(potentialSubclass.getInstanceClass())) {
					basicAddValidationsToMap2(potentialSubclass, validatorConfigList);
				}
			}
		}
	}

	private void basicAddValidationsToMap2(final EClassifier eClassifier, final List<ValidatorConfig> validatorConfigList) {
		// only add entries for elements of the concerned packages
		if (this.ePackageSet.contains(eClassifier.eContainer())) {
			this.validationMap2
				.computeIfAbsent(eClassifier, k -> new HashSet<ValidatorConfig>())
				.addAll(validatorConfigList);
		}
	}


	// *** public getters ***

	public List<Class<? extends IProfile>> getProfiles() {
		return this.profileMap.values().stream().map(e -> e.getProfileClass()).collect(Collectors.toList());
	}

	public Set<EPackage> getEPackages() {
		return  Collections.unmodifiableSet(ePackageSet);
	}

	public Set<ValidatorConfig> getValidations(final EClass targetClass) {
		Set<ValidatorConfig> result = validationMap2.get(targetClass);
		if (result == null) {
			return Collections.emptySet();
		} else {
			return Collections.unmodifiableSet(result);
		}
	}

	public List<IValidation> getAllValidatorInstances() {
		return this.validationMap.values().stream().map(e -> e.getValidatorInstance()).collect(Collectors.toList());
	}


	// *** Some helper methods

	public void printValidationMap1(PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap1.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println("Validations for " + cl.getName() + ":");
			for (ValidatorConfig vConf : validationMap1.get(cl)) {
				out.println("    " + vConf.getSeverity() + " - " + vConf.getMessageId());
			}
		}
	}

	public void printValidationMap2(PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap2.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println("Validations for " + cl.getName() + ":");
			for (ValidatorConfig vConf : validationMap2.get(cl)) {
				out.println("    " + vConf.getSeverity() + " - " + vConf.getMessageId());
			}
		}
	}

}
