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
	private final Map<Class<? extends IProfile>, CachedProfile> profileMap = new HashMap<>();

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

		profileMap.put(profileClass, new CachedProfile(profileClass));
	}

	public CachedProfile getCachedProfile(Class<? extends IProfile> profileClass) {
		if (profileClass == null)
			return null;

		if (!profileMap.containsKey(profileClass)) {
			loadProfile(profileClass);
		}

		return profileMap.get(profileClass);
	}

	// *** Some helper methods

	public void dumpProfile(Class<? extends IProfile> profileClass, PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;

		CachedProfile profile = getCachedProfile(profileClass);
		dumpProfile(profile, 0, out);
	}

	private void dumpProfile(CachedProfile profile, int indent, PrintStream stream) {
		if (profile == null) return;

		String in = "";
		for (int i = 0; i < indent; i++) {
			in = in + "    ";
		}

		// Profile data
		stream.println(in + "PROFILE " + profile.getProfileClass().getSimpleName());
		stream.println(in + " - name: " + profile.getName());
		if (!profile.getDescription().isEmpty()) {
			stream.println(in + " - description: " + profile.getDescription());
		}

		// Validations
		if (!profile.getValidations().isEmpty()) {
			stream.println(in + " - validations:");
		}
		for (CachedValidator conf : profile.getValidations().values()) {
			stream.println(in + "    " + conf.getValidationID() + "(" + conf.getSeverity() + " - "
					+ conf.getTargetClass().getSimpleName() + ")");
		}

		// Sub-Profiles
		if (!profile.getProfiles().isEmpty()) {
			stream.println(in + " - profiles:");
		}
		for (CachedProfile conf : profile.getProfiles().values()) {
			dumpProfile(conf, 1, stream);
		}
	}

}
