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

import org.eclipse.app4mc.validation.annotation.Profile;
import org.eclipse.app4mc.validation.annotation.ProfileGroup;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Severity;

/**
 * A cache object for a validation profile
 */
public class CachedProfile {

	private final Class<? extends IProfile> profileClass;
	private final CachedProfile parentProfile;
	
	private final String name;
	private final String description;
	private final Map<Class<? extends IProfile>, CachedProfile> profiles = new HashMap<>();
	private final Map<Class<? extends IValidation>, CachedValidator> validations = new HashMap<>();
	

	public CachedProfile(final Class<? extends IProfile> profileClass) {
		this(profileClass, null);
	}

	public CachedProfile(final Class<? extends IProfile> profileClass, final CachedProfile parent) {
		super();
		
		if (profileClass == null) {
			throw new IllegalArgumentException("Loading aborted - Undefined profile class (null)");
		}
		
		this.profileClass = profileClass;
		this.parentProfile = parent;
		
		Profile profile = profileClass.getAnnotation(Profile.class);
		name = (profile != null) ? profile.name() : profileClass.getName();
		description = (profile != null) ? profile.description() : "";
		
		List<Class<? extends IProfile>> forbiddenClasses = forbiddenSubProfileClasses();
		
		ProfileGroup[] profileGroupList = profileClass.getAnnotationsByType(ProfileGroup.class);
		for (ProfileGroup pGroup : profileGroupList) {
			for (Class<? extends IProfile> pClass : pGroup.profiles()) {
				if (pClass == null) {
					throw new IllegalArgumentException(
							"Loading aborted - Undefined sub profile class (null)");
				}
				if (forbiddenClasses.contains(pClass)) {
					throw new IllegalArgumentException(
							"Loading aborted - Cycle detected: " + pClass);
				}
				profiles.put(pClass, new CachedProfile(pClass, this));
			}
		}

		ValidationGroup[] validationGroupList = profileClass.getAnnotationsByType(ValidationGroup.class);
		for (ValidationGroup vGroup : validationGroupList) {
			for (Class<? extends IValidation> vClass : vGroup.validations()) {
				if (vClass == null) {
					throw new IllegalArgumentException(
							"Loading aborted - Undefined validation class (null)");
				}
				validations.put(vClass, new CachedValidator(vClass, vGroup.severity()));
			}
		}
	}

	private List<Class<? extends IProfile>> forbiddenSubProfileClasses() {
		List<Class<? extends IProfile>> classes = new ArrayList<>();
		
		for (CachedProfile profile = this; profile != null; profile = profile.getParentProfile()) {
			Class<? extends IProfile> pc = profile.getProfileClass();
			if (pc != null) classes.add(pc);
		}
		return classes;	
	}

	// *** public getters ***
	
	public CachedProfile getParentProfile() {
		return parentProfile;
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

	public Map<Class<? extends IProfile>, CachedProfile> getCachedProfiles() {
		return profiles;
	}

	public Map<Class<? extends IValidation>, CachedValidator> getCachedValidations() {
		return validations;
	}

	public Map<Class<? extends IValidation>, Severity> getAllValidations() {
		Map<Class<? extends IValidation>, Severity> resultMap = new HashMap<>();
		addAllValidations(this, resultMap);
		return resultMap;
	}
	
	private void addAllValidations(final CachedProfile profile, final Map<Class<? extends IValidation>, Severity> resultMap) {
		// add contained validations
		for (CachedValidator cachedValidator : profile.getCachedValidations().values()) {
			Class<? extends IValidation> validatorClass = cachedValidator.getValidatorClass();
			Severity validatorSeverity = cachedValidator.getSeverity();
			
			Severity oldSeverity = resultMap.get(validatorClass);
			if (oldSeverity == null || oldSeverity.ordinal() < validatorSeverity.ordinal()) {
				// insert: class -> higher severity
				resultMap.put(validatorClass, validatorSeverity);
			}
		}
		
		// add validations of contained profiles (recursive)
		for (CachedProfile subProfile : profile.getCachedProfiles().values()) {
			addAllValidations(subProfile, resultMap);
		}
	}

}