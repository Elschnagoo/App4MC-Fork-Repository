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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.app4mc.validation.annotation.Profile;
import org.eclipse.app4mc.validation.annotation.ProfileGroup;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.IValidation;

/**
 * A configuration for a validation profile
 */
public class ProfileConfig {

	private final Class<? extends IProfile> profileClass;
	private final ProfileConfig parentConfig;
	
	private final String name;
	private final String description;
	private final Map<Class<? extends IProfile>, ProfileConfig> profiles = new HashMap<>();
	private final Map<Class<? extends IValidation>, ValidatorConfig> validations = new HashMap<>();
	

	public ProfileConfig(final Class<? extends IProfile> profileClass) {
		this(profileClass, null);
	}

	public ProfileConfig(final Class<? extends IProfile> profileClass, final ProfileConfig parent) {
		super();
		
		if (profileClass == null) {
			throw new IllegalArgumentException("Loading aborted - Undefined profile class");
		}
		
		this.profileClass = profileClass;
		this.parentConfig = parent;
		
		Profile profile = profileClass.getAnnotation(Profile.class);
		name = (profile != null) ? profile.name() : profileClass.getName();
		description = (profile != null) ? profile.description() : "";
		
		List<Class<? extends IProfile>> forbiddenClasses = forbiddenSubProfileClasses();
		
		ProfileGroup[] profileGroupList = profileClass.getAnnotationsByType(ProfileGroup.class);
		for (ProfileGroup pGroup : profileGroupList) {
			for (Class<? extends IProfile> pClass : pGroup.profiles()) {
				if (pClass == null) {
					throw new IllegalArgumentException(
							"Loading aborted - Undefined sub profile class");
				}
				if (forbiddenClasses.contains(pClass)) {
					throw new IllegalArgumentException(
							"Loading aborted - Cycle detected: " + pClass);
				}
				profiles.put(pClass, new ProfileConfig(pClass, this));
			}
		}

		ValidationGroup[] validationGroupList = profileClass.getAnnotationsByType(ValidationGroup.class);
		for (ValidationGroup vGroup : validationGroupList) {
			for (Class<? extends IValidation> vClass : vGroup.validations()) {
				if (vClass == null) {
					throw new IllegalArgumentException(
							"Loading aborted - Undefined validation class");
				}
				validations.put(vClass, new ValidatorConfig(vClass, vGroup.severity()));
			}
		}
	}

	private List<Class<? extends IProfile>> forbiddenSubProfileClasses() {
		List<Class<? extends IProfile>> classes = new ArrayList<>();
		
		for (ProfileConfig config = this; config != null; config = config.getParentConfig()) {
			Class<? extends IProfile> pc = config.getProfileClass();
			if (pc != null) classes.add(pc);
		}
		return classes;	
	}

	// *** public getters ***
	
	public ProfileConfig getParentConfig() {
		return parentConfig;
	}

	public Class<? extends IProfile> getProfileClass() {
		return profileClass;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Map<Class<? extends IProfile>, ProfileConfig> getProfiles() {
		return profiles;
	}

	public Map<Class<? extends IValidation>, ValidatorConfig> getValidations() {
		return validations;
	}

	public Map<Class<? extends IValidation>, ValidatorConfig> getAllValidations() {
		Map<Class<? extends IValidation>, ValidatorConfig> result = new HashMap<>();
		addAllValidations(this, result);
		return result;
	}
	
	private void addAllValidations(final ProfileConfig config, final Map<Class<? extends IValidation>, ValidatorConfig> resultMap) {
		// add validations
		for (ValidatorConfig currentConfig : config.getValidations().values()) {
			Class<? extends IValidation> validatorClass = currentConfig.getValidatorClass();
			
			ValidatorConfig previousConfig = resultMap.get(validatorClass);
			if (previousConfig == null || previousConfig.getSeverity().ordinal() < currentConfig.getSeverity().ordinal()) {
				// insert config with higher severity
				resultMap.put(validatorClass, currentConfig);
			}
		}
		// add validations of profiles (recursive)
		for (ProfileConfig pConfig : config.getProfiles().values()) {
			addAllValidations(pConfig, resultMap);
		}
	}
	
	public List<IValidation> getAllValidatorInstances() {
		return getAllValidations().values().stream().map(e -> e.getValidatorInstance()).collect(Collectors.toList());
	}

}