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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;

public class ProfileManager {
	private final Map<Class<? extends IProfile>, ProfileConfig> profileMap = new HashMap<>();

	/**
	 * Collects all profile classes that are registered via extension point
	 * "org.eclipse.app4mc.validation.profile"
	 * 
	 * @return Map of profile classes (identifier : class)
	 */
	public static Map<String, Class<? extends IProfile>> getRegisteredProfileClasses() {
		Map<String, Class<? extends IProfile>> result = new HashMap<>();

		final IExtensionRegistry registry = RegistryFactory.getRegistry();
		if (registry == null)
			return result;

		final IExtensionPoint extensionPoint = registry.getExtensionPoint("org.eclipse.app4mc.validation.profile");
		if (extensionPoint == null)
			return result;

		final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

		for (final IConfigurationElement iConfigurationElement : extensions) {
			final String id = iConfigurationElement.getAttribute("id");

			Class<?> cls = null;
			try {
				final Object obj = iConfigurationElement.createExecutableExtension("class");
				cls = obj.getClass();
			} catch (CoreException e) {
				// ignore if class is not available
			}

			if (cls != null && IProfile.class.isAssignableFrom(cls)) {
				Class<? extends IProfile> profileClass = cls.asSubclass(IProfile.class);
				result.put(id, profileClass);
			}
		}
		return result;
	}

	public void clearProfiles() {
		profileMap.clear();
	}

	public void loadProfile(Class<? extends IProfile> profileClass) {
		if (profileClass == null)
			return;

		profileMap.put(profileClass, new ProfileConfig(profileClass));
	}

	public ProfileConfig getProfileConfig(Class<? extends IProfile> profileClass) {
		if (profileClass == null)
			return null;

		if (!profileMap.containsKey(profileClass)) {
			loadProfile(profileClass);
		}

		return profileMap.get(profileClass);
	}

	// *** Some helper methods

	public void printProfile(Class<? extends IProfile> profileClass, PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;

		ProfileConfig config = getProfileConfig(profileClass);
		printProfile(config, 0, out);
	}

	private void printProfile(ProfileConfig profileConfig, int indent, PrintStream stream) {
		String in = "";
		for (int i = 0; i < indent; i++) {
			in = in + "    ";
		}

		// Profile data
		stream.println(in + "PROFILE " + profileConfig.getProfileClass().getSimpleName());
		stream.println(in + " - name: " + profileConfig.getName());
		if (!profileConfig.getDescription().isEmpty()) {
			stream.println(in + " - description: " + profileConfig.getDescription());
		}

		// Validations
		if (!profileConfig.getValidations().isEmpty()) {
			stream.println(in + " - validations:");
		}
		for (ValidatorConfig conf : profileConfig.getValidations().values()) {
			stream.println(in + "    " + conf.getValidationID() + "(" + conf.getSeverity() + " - "
					+ conf.getTargetClass().getSimpleName() + ")");
		}

		// Sub-Profiles
		if (!profileConfig.getProfiles().isEmpty()) {
			stream.println(in + " - profiles:");
		}
		for (ProfileConfig conf : profileConfig.getProfiles().values()) {
			printProfile(conf, 1, stream);
		}
	}

}
