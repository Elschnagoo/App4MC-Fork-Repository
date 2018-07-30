/**
 ********************************************************************************
 * Copyright (c) 2015-2018 itemis AG and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     itemis AG, Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.provider.SWModelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ActivationsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ChannelsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.CustomEntitiesContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.EventsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ISRsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.LabelsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ModeLabelsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ModesContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ProcessChainsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.ProcessPrototypesContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.RunnablesContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.SectionsContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.TasksContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.TypeDefinitionsContainerIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedSWModelItemProvider extends SWModelItemProvider {

	protected RunnablesContainerIP runnablesCIP;
	protected LabelsContainerIP labelsCIP;
	protected ModesContainerIP modesCIP;
	protected ModeLabelsContainerIP modeLabelsCIP;
	protected TasksContainerIP tasksCIP;
	protected EventsContainerIP eventsCIP;
	protected SectionsContainerIP sectionsCIP;
	protected ProcessChainsContainerIP processChainsCIP;
	protected ProcessPrototypesContainerIP prototypesCIP;
	protected ISRsContainerIP isrsCIP;
	protected ActivationsContainerIP activationsCIP;
	protected TypeDefinitionsContainerIP typesCIP;
	protected ChannelsContainerIP channelsCIP;
	protected CustomEntitiesContainerIP entitiesCIP;

	public ExtendedSWModelItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public RunnablesContainerIP getRunnablesContainerIP(final SWModel swModel) {
		if (this.runnablesCIP == null) {
			this.runnablesCIP = new RunnablesContainerIP(this.adapterFactory, swModel);
		}
		return this.runnablesCIP;
	}

	public LabelsContainerIP getLabelsContainerIP(final SWModel swModel) {
		if (this.labelsCIP == null) {
			this.labelsCIP = new LabelsContainerIP(this.adapterFactory, swModel);
		}
		return this.labelsCIP;
	}

	public ModesContainerIP getModesContainerIP(final SWModel swModel) {
		if (this.modesCIP == null) {
			this.modesCIP = new ModesContainerIP(this.adapterFactory, swModel);
		}
		return this.modesCIP;
	}

	public ModeLabelsContainerIP getModeLabelsContainerIP(final SWModel swModel) {
		if (this.modeLabelsCIP == null) {
			this.modeLabelsCIP = new ModeLabelsContainerIP(this.adapterFactory, swModel);
		}
		return this.modeLabelsCIP;
	}

	public TasksContainerIP getTasksContainerIP(final SWModel swModel) {
		if (this.tasksCIP == null) {
			this.tasksCIP = new TasksContainerIP(this.adapterFactory, swModel);
		}
		return this.tasksCIP;
	}

	public EventsContainerIP getEventsContainerIP(final SWModel swModel) {
		if (this.eventsCIP == null) {
			this.eventsCIP = new EventsContainerIP(this.adapterFactory, swModel);
		}
		return this.eventsCIP;
	}

	public SectionsContainerIP getSectionsContainerIP(final SWModel swModel) {
		if (this.sectionsCIP == null) {
			this.sectionsCIP = new SectionsContainerIP(this.adapterFactory, swModel);
		}
		return this.sectionsCIP;
	}

	public ProcessPrototypesContainerIP getPrototypesContainerIP(final SWModel swModel) {
		if (this.prototypesCIP == null) {
			this.prototypesCIP = new ProcessPrototypesContainerIP(this.adapterFactory, swModel);
		}
		return this.prototypesCIP;
	}

	public ProcessChainsContainerIP getProcessChainsContainerIP(final SWModel swModel) {
		if (this.processChainsCIP == null) {
			this.processChainsCIP = new ProcessChainsContainerIP(this.adapterFactory, swModel);
		}
		return this.processChainsCIP;
	}

	public ISRsContainerIP getISRsContainerIP(final SWModel swModel) {
		if (this.isrsCIP == null) {
			this.isrsCIP = new ISRsContainerIP(this.adapterFactory, swModel);
		}
		return this.isrsCIP;
	}

	public ActivationsContainerIP getActivationsContainerIP(final SWModel swModel) {
		if (this.activationsCIP == null) {
			this.activationsCIP = new ActivationsContainerIP(this.adapterFactory, swModel);
		}
		return this.activationsCIP;
	}
	
	public TypeDefinitionsContainerIP getTypeDefinitionsContainerIP(final SWModel swModel) {
		if (this.typesCIP == null) {
			this.typesCIP = new TypeDefinitionsContainerIP(this.adapterFactory, swModel);
		}
		return this.typesCIP;
	}

	public ChannelsContainerIP getChannelsContainerIP(final SWModel swModel) {
		if (this.channelsCIP == null) {
			this.channelsCIP = new ChannelsContainerIP(this.adapterFactory, swModel);
		}
		return this.channelsCIP;
	}

	public CustomEntitiesContainerIP getEntitiesContainerIP(final SWModel swModel) {
		if (this.entitiesCIP == null) {
			this.entitiesCIP = new CustomEntitiesContainerIP(this.adapterFactory, swModel);
		}
		return this.entitiesCIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Runnables()); // SW_MODEL__RUNNABLES
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Labels()); // SW_MODEL__LABELS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Tasks()); // SW_MODEL__TASKS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Isrs()); // SW_MODEL__ISRS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Events()); // SW_MODEL__EVENTS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_ProcessChains()); // SW_MODEL__PROCESS_CHAINS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_ProcessPrototypes()); // SW_MODEL__PROCESS_PROTOTYPES
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Activations()); // SW_MODEL__ACTIVATIONS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Sections()); // SW_MODEL__SECTIONS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Modes()); // SW_MODEL__MODES
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_ModeLabels()); // SW_MODEL__MODE_LABELS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_TypeDefinitions()); // SW_MODEL__TYPE_DEFINITIONS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_Channels()); // SW_MODEL__CHANNELS
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getSWModel_CustomEntities()); // SW_MODEL__CUSTOM_ENTITIES
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		final SWModel swModel = (SWModel) object;
		
		// only display virtual folders if not empty
		if (!swModel.getRunnables().isEmpty())
			children.add(getRunnablesContainerIP(swModel));
		if (!swModel.getLabels().isEmpty())
			children.add(getLabelsContainerIP(swModel));
		if (!swModel.getTasks().isEmpty())
			children.add(getTasksContainerIP(swModel));
		if (!swModel.getIsrs().isEmpty())
			children.add(getISRsContainerIP(swModel));
		if (!swModel.getEvents().isEmpty())
			children.add(getEventsContainerIP(swModel));
		if (!swModel.getProcessChains().isEmpty())
			children.add(getProcessChainsContainerIP(swModel));
		if (!swModel.getProcessPrototypes().isEmpty())
			children.add(getPrototypesContainerIP(swModel));
		if (!swModel.getActivations().isEmpty())
			children.add(getActivationsContainerIP(swModel));
		if (!swModel.getSections().isEmpty())
			children.add(getSectionsContainerIP(swModel));
		if (!swModel.getModes().isEmpty())
			children.add(getModesContainerIP(swModel));
		if (!swModel.getModeLabels().isEmpty())
			children.add(getModeLabelsContainerIP(swModel));
		if (!swModel.getTypeDefinitions().isEmpty())
			children.add(getTypeDefinitionsContainerIP(swModel));
		if (!swModel.getChannels().isEmpty())
			children.add(getChannelsContainerIP(swModel));
		if (!swModel.getCustomEntities().isEmpty())
			children.add(getEntitiesContainerIP(swModel));
		return children;
	}

	@Override
	protected Command createAddCommand(final EditingDomain domain, final EObject owner,
			final EStructuralFeature feature, final Collection<?> collection, final int index) {
		return createWrappedCommand(super.createAddCommand(domain, owner, feature, collection, index), owner, feature);
	}

	@Override
	protected Command createRemoveCommand(final EditingDomain domain, final EObject owner,
			final EStructuralFeature feature, final Collection<?> collection) {
		return createWrappedCommand(super.createRemoveCommand(domain, owner, feature, collection), owner, feature);
	}

	protected Command createWrappedCommand(final Command command, final EObject owner,
			final EStructuralFeature feature) {
		int featureID = feature.getFeatureID();
		if (featureID == AmaltheaPackage.SW_MODEL__RUNNABLES
				|| featureID == AmaltheaPackage.SW_MODEL__LABELS
				|| featureID == AmaltheaPackage.SW_MODEL__MODES
				|| featureID == AmaltheaPackage.SW_MODEL__MODE_LABELS
				|| featureID == AmaltheaPackage.SW_MODEL__TASKS
				|| featureID == AmaltheaPackage.SW_MODEL__EVENTS
				|| featureID == AmaltheaPackage.SW_MODEL__SECTIONS
				|| featureID == AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES
				|| featureID == AmaltheaPackage.SW_MODEL__PROCESS_CHAINS
				|| featureID == AmaltheaPackage.SW_MODEL__ISRS
				|| featureID == AmaltheaPackage.SW_MODEL__ACTIVATIONS
				|| featureID == AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS
				|| featureID == AmaltheaPackage.SW_MODEL__CHANNELS
				|| featureID == AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (featureID == AmaltheaPackage.SW_MODEL__RUNNABLES) {
							affected = Collections.singleton(getRunnablesContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__LABELS) {
							affected = Collections.singleton(getLabelsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__MODES) {
							affected = Collections.singleton(getModesContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__MODE_LABELS) {
							affected = Collections.singleton(getModeLabelsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__TASKS) {
							affected = Collections.singleton(getTasksContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__EVENTS) {
							affected = Collections.singleton(getEventsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__SECTIONS) {
							affected = Collections.singleton(getSectionsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES) {
							affected = Collections.singleton(getPrototypesContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__PROCESS_CHAINS) {
							affected = Collections.singleton(getProcessChainsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__ISRS) {
							affected = Collections.singleton(getISRsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__ACTIVATIONS) {
							affected = Collections.singleton(getActivationsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS) {
							affected = Collections.singleton(getTypeDefinitionsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__CHANNELS) {
							affected = Collections.singleton(getChannelsContainerIP((SWModel) owner));
						}
						else if (featureID == AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES) {
							affected = Collections.singleton(getEntitiesContainerIP((SWModel) owner));
						}
					}
					return affected;
				}
			};
		}
		return command;
	}

	@Override
	public void dispose() {
		if (this.runnablesCIP != null) {
			this.runnablesCIP.dispose();
		}
		if (this.labelsCIP != null) {
			this.labelsCIP.dispose();
		}
		if (this.modesCIP != null) {
			this.modesCIP.dispose();
		}
		if (this.modeLabelsCIP != null) {
			this.modeLabelsCIP.dispose();
		}
		if (this.tasksCIP != null) {
			this.tasksCIP.dispose();
		}
		if (this.eventsCIP != null) {
			this.eventsCIP.dispose();
		}
		if (this.sectionsCIP != null) {
			this.sectionsCIP.dispose();
		}
		if (this.prototypesCIP != null) {
			this.prototypesCIP.dispose();
		}
		if (this.processChainsCIP != null) {
			this.processChainsCIP.dispose();
		}
		if (this.isrsCIP != null) {
			this.isrsCIP.dispose();
		}
		if (this.activationsCIP != null) {
			this.activationsCIP.dispose();
		}
		if (this.typesCIP != null) {
			this.typesCIP.dispose();
		}
		if (this.channelsCIP != null) {
			this.channelsCIP.dispose();
		}
		if (this.entitiesCIP != null) {
			this.entitiesCIP.dispose();
		}
		super.dispose();
	}


	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SWModel.class)) {
		case AmaltheaPackage.SW_MODEL__ISRS:
		case AmaltheaPackage.SW_MODEL__TASKS:
		case AmaltheaPackage.SW_MODEL__RUNNABLES:
		case AmaltheaPackage.SW_MODEL__LABELS:
		case AmaltheaPackage.SW_MODEL__MODES:
		case AmaltheaPackage.SW_MODEL__MODE_LABELS:
		case AmaltheaPackage.SW_MODEL__PROCESS_PROTOTYPES:
		case AmaltheaPackage.SW_MODEL__PROCESS_CHAINS:
		case AmaltheaPackage.SW_MODEL__SECTIONS:
		case AmaltheaPackage.SW_MODEL__ACTIVATIONS:
		case AmaltheaPackage.SW_MODEL__EVENTS:
		case AmaltheaPackage.SW_MODEL__TYPE_DEFINITIONS:
		case AmaltheaPackage.SW_MODEL__CHANNELS:
		case AmaltheaPackage.SW_MODEL__CUSTOM_ENTITIES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}
}
