/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainItem;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.EList;

public class ConstraintsModelCheckValidatorImpl extends AbstractValidatorImpl {

	public ConstraintsModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public ConstraintsModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks for the AMALTHEA Constraints model if the EventChains are consistent (complete and correct sub event
	 * chains). Therefore, stimulus/response pairs are checked if there are existent and linked properly. A missing or
	 * wrong information in the event chain will be handled as an error.
	 */
	public void eventChainConstraint(final ConstraintsModel constraintsModel) {
		// Traverse collection of independent event chains
		if (constraintsModel != null) {
			for (final EventChain eventChain : constraintsModel.getEventChains()) {
				checkChainConsistency(eventChain);
				// System.out.println();
			}
		}
	}


	private void checkChainConsistency(final EventChain eventChain) {

		if (eventChain == null) {
			return;
		}

		checkChainConsistency(eventChain, eventChain.getSegments());
		checkChainConsistency(eventChain, eventChain.getStrands());
	}

	private void checkChainConsistency(final EventChain pEventChain, final EList<EventChainItem> pSubEventChains) {
		/**
		 * All SubEventChains can be described directly (SubEventChain) or per reference
		 * (EventChainReference.getEventChain()). Because of this we have to distinguish between this cases
		 */

		// Collect all SubEventChains to a list of EventChains
		final List<EventChain> subEventChains = new ArrayList<EventChain>();
		for (final EventChainItem subEventChainItem : pSubEventChains) {
			EventChain subEventChain = null;
			if (subEventChainItem instanceof SubEventChain) {
				subEventChain = ((SubEventChain) subEventChainItem).getEventChain();
			}
			if (subEventChainItem instanceof EventChainReference) {
				subEventChain = ((EventChainReference) subEventChainItem).getEventChain();
				if (subEventChain == null) {
					// TODO: Create Error ... Missing Reference to (Sub)EventChain ... not specified by user
				}
			}

			if (subEventChain != null) {
				subEventChains.add(subEventChain);

				// Do the same for further inner SubEventChains recursively
				checkChainConsistency(subEventChain);
				// checkChainConsistency(subEventChain);
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
		for (final EventChain subEventChain : subEventChains) {
			if (subEventChain.getStimulus() == pEventChain.getStimulus()) {
				// Found the beginning of subEventChain
				chainnedEventsCnt = 0;
				EventChain chainingEvent = subEventChain;
				final StringBuilder completeChainBuilder = new StringBuilder();
				completeChainBuilder.append("EventChain: [ --> {" + getStimulusEvent(pEventChain) + "}"
						+ pEventChain.getName() + "{" + getResponseEvent(pEventChain) + "} --> ]\n");
				completeChainBuilder.append("  SubEventChain: (");


				while (chainingEvent.getResponse() != pEventChain.getResponse()) {
					boolean hasChained = false;

					// Try to chain next EventChain
					for (final EventChain subEvent : subEventChains) {
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
						this.issueCreator.issue(chainingEvent,
								AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
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
						this.issueCreator.issue(pEventChain,
								AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
								"SubChain complete BUT unconnected SubEventChains left for EventChain "
										+ pEventChain.getName());
					}
					// Cycles detected
					if (chainnedEventsCnt > subEventChains.size()) {
						this.issueCreator.issue(pEventChain,
								AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
								"Cycle found for EventChain " + pEventChain.getName());
					}
				}
			}
		}
		// Beginning SubEventChain not found (stimulus event does not match)
		if (chainnedEventsCnt == -1) {
			this.issueCreator.issue(pEventChain, AmaltheaPackage.eINSTANCE.getEventChainReference_EventChain(),
					"Beginning SubEventChain not found; EventChain's stimulus does not match with any SubEventChain's stimulus "
							+ pEventChain.getName());
		}
	}

	// private void printOutEventChain(final EventChain ec, final String prefix) {
	// System.out.println(prefix + "EventChain [Stimulus -> Response]: " + ec.getName() + " ["
	// + ec.getStimulus().getName() + " -> " + ec.getResponse().getName() + "]");
	// }

	private String getResponseEvent(final EventChain chainingEvent) {
		if (chainingEvent == null || chainingEvent.getResponse() == null) {
			return "MISSING";
		}
		return chainingEvent.getResponse().getName();
	}

	private String getStimulusEvent(final EventChain chainingEvent) {
		if (chainingEvent == null || chainingEvent.getStimulus() == null) {
			return "MISSING";
		}
		return chainingEvent.getStimulus().getName();
	}
}
