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

public class SearchDialogSettings {

	final EClass FILTER_CLASS_DEFAULT = AmaltheaPackage.eINSTANCE.getINamed();
	final Map<String, EClass> FILTER_CLASS_MAP = computeSubclassMap();

	boolean m_success = false;
	String m_namePattern = "";
	String m_filterClassName = FILTER_CLASS_DEFAULT.getName();
	boolean m_caseSensitive = false;
	boolean m_regularExpression = false;
	boolean m_restrictToFile = false;

	String[] getFilterClassNames() {
		return FILTER_CLASS_MAP.keySet().stream().sorted().toArray(String[]::new);
	}

	@SuppressWarnings("unchecked")
	Class<INamed> computeFilterClass() {
		EClass eClass = FILTER_CLASS_MAP.get(m_filterClassName);
		if (eClass == null) return null;
		
		return (Class<INamed>) eClass.getInstanceClass();
	}

	Pattern computeSearchPattern() {
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
