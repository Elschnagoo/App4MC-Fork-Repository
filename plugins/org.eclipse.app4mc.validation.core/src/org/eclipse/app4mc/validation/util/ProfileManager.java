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

public class ProfileManager {
	private final Map<Class<? extends IProfile>, ProfileConfig> profileMap = new HashMap<>();

	public void clearProfiles() {
		profileMap.clear();
	}

	public void loadProfile(Class<? extends IProfile> profileClass) {
		if (profileClass == null) return;

		profileMap.put(profileClass, new ProfileConfig(profileClass));
	}
	

	public ProfileConfig getProfileConfig(Class<? extends IProfile> profileClass) {
		if (profileClass == null) return null;
		
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
		for (int i = 0; i < indent; i++) {in = in + "    ";}
		
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
			stream.println(in + "    " + conf.getMessageId()
				+ "(" + conf.getSeverity() + " - " + conf.getTargetClass().getSimpleName() + ")");
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
