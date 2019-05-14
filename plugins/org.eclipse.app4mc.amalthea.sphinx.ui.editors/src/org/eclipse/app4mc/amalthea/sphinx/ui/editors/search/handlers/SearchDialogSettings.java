/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search.handlers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.dialogs.IDialogSettings;

public class SearchDialogSettings {

	private final String KEY_NAME_PATTERN = "Search_NamePattern";
	private final String KEY_CLASS_NAME = "Search_ClassName";
	private final String KEY_CASE_SENSITIVE = "Search_CaseSensitive";
	private final String KEY_REGEX = "Search_RegularExpression";
	private final String KEY_FILE_SCOPE = "Search_FileScope";
	
	private final EClass FILTER_CLASS_DEFAULT = AmaltheaPackage.eINSTANCE.getINamed();
	private final Map<String, EClass> FILTER_CLASS_MAP = computeSubclassMap();

	boolean m_success = false;
	String m_namePattern = "";
	String m_filterClassName = FILTER_CLASS_DEFAULT.getName();
	boolean m_caseSensitive = false;
	boolean m_regularExpression = false;
	boolean m_restrictToFile = false;

	String[] getFilterClassNames() {
		return FILTER_CLASS_MAP.keySet().stream().sorted().toArray(String[]::new);
	}

	public boolean isSearchRestrictedToFile() {
		return m_restrictToFile;
	}
	
	@SuppressWarnings("unchecked")
	public Class<INamed> computeFilterClass() {
		EClass eClass = FILTER_CLASS_MAP.get(m_filterClassName);
		if (eClass == null) return null;
		
		return (Class<INamed>) eClass.getInstanceClass();
	}

	public Pattern computeSearchPattern() {
		if (m_success == false)
			return null;

		StringBuilder pattern = new StringBuilder();
		pattern.append((m_caseSensitive) ? "" : "(?i)");

		// regular expression
		if (m_regularExpression) {
			pattern.append(m_namePattern);
			try {
				return Pattern.compile(pattern.toString());
			} catch (PatternSyntaxException e) {
				return null;
			}
		}
		
		// simple pattern
		boolean quoted = false;
		StringBuilder buffer = new StringBuilder();
		for (Character ch : m_namePattern.toCharArray()) {
			if (quoted) {
				buffer.append(ch);
				quoted = false;
			} else if (ch == '\\') {
				quoted = true;
			} else if (ch == '*' || ch == '?') {
				if (buffer.length() > 0) {
					pattern.append(Pattern.quote(buffer.toString()));
					buffer.setLength(0); // reset
				}
				pattern.append((ch == '*') ? ".*" : ".");
			} else {
				buffer.append(ch);
			}
		}
		if (buffer.length() > 0) {
			pattern.append(Pattern.quote(buffer.toString()));
		}
		return Pattern.compile(pattern.toString());
	}

	public void saveTo(IDialogSettings store) {
		if (store == null) return;
		
		store.put(KEY_NAME_PATTERN, m_namePattern);
		store.put(KEY_CLASS_NAME, m_filterClassName);
		store.put(KEY_CASE_SENSITIVE, m_caseSensitive);
		store.put(KEY_REGEX, m_regularExpression);
		store.put(KEY_FILE_SCOPE, m_restrictToFile);
	}

	public void loadFrom(IDialogSettings store) {
		if (store == null) return;
		
		if (store.get(KEY_NAME_PATTERN) != null) m_namePattern = store.get(KEY_NAME_PATTERN);
		if (store.get(KEY_CLASS_NAME) != null) m_filterClassName = store.get(KEY_CLASS_NAME);
		if (store.get(KEY_CASE_SENSITIVE) != null) m_caseSensitive = store.getBoolean(KEY_CASE_SENSITIVE);
		if (store.get(KEY_REGEX) != null) m_regularExpression = store.getBoolean(KEY_REGEX);
		if (store.get(KEY_FILE_SCOPE) != null) m_restrictToFile = store.getBoolean(KEY_FILE_SCOPE);
	}

	private Map<String, EClass> computeSubclassMap() {
		return computeSubclassMap(FILTER_CLASS_DEFAULT);
	}

	private Map<String, EClass> computeSubclassMap(EClass superClass) {
		final Map<String, EClass> classMap = new HashMap<String, EClass>();
		for (final EClassifier classifier : AmaltheaPackage.eINSTANCE.getEClassifiers()) {
			if (classifier instanceof EClass) {
				EClass subClass = (EClass) classifier;
				if (superClass.isSuperTypeOf(subClass)) {
					classMap.put(subClass.getName(), subClass);
				}
			}
		}
		return Collections.unmodifiableMap(classMap);
	}
	
}
