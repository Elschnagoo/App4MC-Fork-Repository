/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainItem;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class TODO_ConstraintsModelCheck {

	/*
	 * Checks for the AMALTHEA Constraints model if the EventChains are consistent (complete and correct sub event
	 * chains). Therefore, stimulus/response pairs are checked if there are existent and linked properly. A missing or
	 * wrong information in the event chain will be handled as an error.
	 */
	public void checkEventChains(final ConstraintsModel constraintsModel) {
		// Traverse collection of independent event chains
		if (constraintsModel != null) {
			for (final EventChain eventChain : constraintsModel.getEventChains()) {
				checkChainConsistency(eventChain);
				// System.out.println();
			}
		}
	}


	private void checkChainConsistency(final AbstractEventChain eventChain) {

		if (eventChain == null) {
			return;
		}

		checkChainConsistency(eventChain, eventChain.getSegments());
		checkChainConsistency(eventChain, eventChain.getStrands());
	}

	private void checkChainConsistency(final AbstractEventChain pEventChain, final EList<EventChainItem> pSubEventChains) {
		/**
		 * All SubEventChains can be described directly (EventChainContainer) or per reference
		 * (EventChainReference). Because of this we have to distinguish between this cases.
		 */

		// Collect all SubEventChains to a list of EventChains
		final List<AbstractEventChain> subEventChains = new ArrayList<AbstractEventChain>();
		for (final EventChainItem subEventChainItem : pSubEventChains) {
			AbstractEventChain subChain = subEventChainItem.getEventChain();

			if (subChain != null) {
				subEventChains.add(subChain);

				// Do the same for INNER SubEventChains recursively
				if (subChain instanceof SubEventChain) checkChainConsistency(subChain);
			}
		}

		if (subEventChains.isEmpty()) {
			return;
		}

		// Here we have all SubEventChains related to one specific EventChain (i.e. eventChain)
		// Is it possible to have more than one matching starting event in sub chain?

		/**
		 * Assumptions:
		 *
		 * - Only one stimulus event of the SubEventChain matches to stimulus of the parent EventChain
		 *
		 * - Only one response event of the SubEventChain matches to stimulus of the parent EventChain
		 */


		int chainnedEventsCnt = -1;
		for (final AbstractEventChain subEventChain : subEventChains) {
			if (subEventChain.getStimulus() == pEventChain.getStimulus()) {
				// Found the beginning of subEventChain
				chainnedEventsCnt = 0;
				AbstractEventChain chainingEvent = subEventChain;
				final StringBuilder completeChainBuilder = new StringBuilder();
				completeChainBuilder.append("EventChain: [ --> {" + getStimulusEvent(pEventChain) + "}"
						+ pEventChain.getName() + "{" + getResponseEvent(pEventChain) + "} --> ]\n");
				completeChainBuilder.append("  SubEventChain: (");


				while (chainingEvent.getResponse() != pEventChain.getResponse()) {
					boolean hasChained = false;

					// Try to chain next EventChain
					for (final AbstractEventChain subEvent : subEventChains) {
						if (chainingEvent.getResponse() == subEvent.getStimulus()) {

							completeChainBuilder.append(" --> " + "{" + getStimulusEvent(chainingEvent) + "}"
									+ chainingEvent.getName() + "{" + getResponseEvent(chainingEvent) + "}");

							chainingEvent = subEvent;
							++chainnedEventsCnt;
							hasChained = true;
						}
					}

					// (chainingEvent.getResponse() != eventChain.getResponse()) => End not reached
					if (!hasChained && chainingEvent.getResponse() != pEventChain.getResponse()) {
						issue(chainingEvent,
								AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
								"No successor found for EventChain '" + chainingEvent.getName() + "'");
						break;
					}
				}

				completeChainBuilder.append(" --> " + "{" + getStimulusEvent(chainingEvent) + "}"
						+ chainingEvent.getName() + "{" + getResponseEvent(chainingEvent) + "}" + " --> )");
				// System.out.println(completeChainBuilder);

				if (chainingEvent.getResponse() == pEventChain.getResponse()) {
					if (chainnedEventsCnt < subEventChains.size() - 1) {
						// Leftover detected(chain is consistent, but there are still unconnected SubEventChains)
						issue(pEventChain,
								AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
								"SubChain complete BUT unconnected SubEventChains left for EventChain "
										+ pEventChain.getName());
					}
					// Cycles detected
					if (chainnedEventsCnt > subEventChains.size()) {
						issue(pEventChain,
								AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
								"Cycle found for EventChain " + pEventChain.getName());
					}
				}
			}
		}
		// Beginning SubEventChain not found (stimulus event does not match)
		if (chainnedEventsCnt == -1) {
			issue(pEventChain, AmaltheaPackage.eINSTANCE.getEventChainContainer_EventChain(),
					"Beginning SubEventChain not found; EventChain's stimulus does not match with SubEventChain's stimulus "
							+ pEventChain.getName());
		}
	}

	// private void printOutEventChain(final AbstractEventChain ec, final String prefix) {
	// System.out.println(prefix + "EventChain [Stimulus -> Response]: " + ec.getName() + " ["
	// + ec.getStimulus().getName() + " -> " + ec.getResponse().getName() + "]");
	// }

	private String getResponseEvent(final AbstractEventChain eventChain) {
		if (eventChain == null || eventChain.getResponse() == null) {
			return "MISSING";
		}
		return eventChain.getResponse().getName();
	}

	private String getStimulusEvent(final AbstractEventChain eventChain) {
		if (eventChain == null || eventChain.getStimulus() == null) {
			return "MISSING";
		}
		return eventChain.getStimulus().getName();
	}

	private void issue(EObject object, EStructuralFeature feature, Object... messageArguments) {
		// dummy to mock old API
	}

}
