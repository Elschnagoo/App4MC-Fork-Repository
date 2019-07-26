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

package org.eclipse.app4mc.amalthea.validations.misc;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.EventChainItem;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of event chains
 * 
 * <ul>
 * <li>The stimulus of the first segment has to be the same as the stimulus of the event chain</li>
 * <li>The stimulus of other segments have to be equal to the response of the previous segment.</li>
 * <li>The response of the last segment has to be the same as the response of the event chain</li>
 * </ul>
 */

@Validation(id = "AM-Constraints-EventChain")


public class AmConstraintsEventChain extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getAbstractEventChain();
	}

	@Override
	public void validate(EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof AbstractEventChain) {
			AbstractEventChain chain = (AbstractEventChain) object;
			
			checkChainConsistency(chain, results);
		}
	}

	private void checkChainConsistency(final AbstractEventChain eventChain, List<ValidationDiagnostic> results) {
		if (eventChain == null) return;

		checkSegments(eventChain, eventChain.getSegments(), results);
		// checkStrands(eventChain, eventChain.getStrands(), results);
	}

	private void checkSegments(final AbstractEventChain eventChain, final EList<EventChainItem> eventChainItems, List<ValidationDiagnostic> results) {

		if (eventChainItems == null || eventChainItems.isEmpty()) return;

		if (eventChainItems.contains(null)) {
			addIssue(results, eventChain,
					AmaltheaPackage.eINSTANCE.getAbstractEventChain_Segments(),
					"Event Chain " + name(eventChain) + ": segment list contains null reference");
		}

		List<AbstractEventChain> subEventChains = eventChainItems.stream()
				.map(item -> item.getEventChain())
				.filter(Objects::nonNull)
				.collect(Collectors.toList());

		AbstractEventChain first = subEventChains.get(0);
		AbstractEventChain last = subEventChains.get(subEventChains.size() - 1);

		if (eventChain.getStimulus() != first.getStimulus()) {
			addIssue(results, eventChain,
					AmaltheaPackage.eINSTANCE.getAbstractEventChain_Segments(),
					"Event Chain " + name(eventChain) + ": stimulus of first segment <> stimulus of event chain");
		}

		if (eventChain.getResponse() != last.getResponse()) {
			addIssue(results, eventChain,
					AmaltheaPackage.eINSTANCE.getAbstractEventChain_Segments(),
					"Event Chain " + name(eventChain) + ": response of last segment <> response of event chain");
		}

		for (int i = 0; i < subEventChains.size() - 1; i++) {
			AbstractEventChain current = subEventChains.get(i);
			AbstractEventChain next = subEventChains.get(i + 1);
			
			if (current.getResponse() != next.getStimulus()) {
				addIssue(results, eventChain,
						AmaltheaPackage.eINSTANCE.getAbstractEventChain_Segments(),
						"Event Chain " + name(eventChain) + ": response of segment " + i + " <> stimulus of segment " + (i+1));
			}
		}
	}

}
