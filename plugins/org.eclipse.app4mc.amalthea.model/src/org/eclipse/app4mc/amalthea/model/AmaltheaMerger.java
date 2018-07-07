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

package org.eclipse.app4mc.amalthea.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

// TODO add reporting, e.g. list skipped elements

public class AmaltheaMerger {

	/**
	 * Add the contained elements of the input models to the main model.
	 * Only major elements of the model (with their containments) are added.
	 * In case of name conflicts the affected elements will be omitted.
	 * 
	 * @param mainModel
	 * @param inputs
	 */
	public static void addElements(Amalthea mainModel, Collection<Amalthea> inputs) {
		if (mainModel == null) return;
		if (inputs == null || inputs.size() == 0) return;
		
		final Copier copier = new Copier(true, true);
		
		for (Amalthea model : inputs) {
			final Amalthea tmpModel = (Amalthea) copier.copy(model);
			if (tmpModel == null) continue;
			
			addPropertiesIfAbsent(mainModel, tmpModel);
			
			addCommonElements(mainModel, tmpModel);
			addSwModel(mainModel, tmpModel);
			addHwModel(mainModel, tmpModel);
			addOsModel(mainModel, tmpModel);
			addStimuliModel(mainModel, tmpModel);
			addConstraintsModel(mainModel, tmpModel);
			addEventModel(mainModel, tmpModel);
			addPropertyConstraintsModel(mainModel, tmpModel);
			addMappingModel(mainModel, tmpModel);
			addComponentsModel(mainModel, tmpModel);
			addConfigModel(mainModel, tmpModel);
		}
		copier.copyReferences();
	}

	private static void addCommonElements(Amalthea mainModel, Amalthea tmpModel) {
		final CommonElements main = mainModel.getCommonElements();
		final CommonElements tmp = tmpModel.getCommonElements();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setCommonElements(tmp);
		} else {
			addIfAbsent(main.getTags(), tmp.getTags());
			addIfAbsent(main.getCoreClassifiers(), tmp.getCoreClassifiers());
			addIfAbsent(main.getMemoryClassifiers(), tmp.getMemoryClassifiers());
		}	
	}

	private static void addSwModel(Amalthea mainModel, Amalthea tmpModel) {
		final SWModel main = mainModel.getSwModel();
		final SWModel tmp = tmpModel.getSwModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setSwModel(tmp);
		} else {
			addIfAbsent(main.getRunnables(), tmp.getRunnables());
			addIfAbsent(main.getLabels(), tmp.getLabels());
			addIfAbsent(main.getTasks(), tmp.getTasks());
			addIfAbsent(main.getIsrs(), tmp.getIsrs());
			addIfAbsent(main.getEvents(), tmp.getEvents());
			addIfAbsent(main.getProcessChains(), tmp.getProcessChains());
			addIfAbsent(main.getProcessPrototypes(), tmp.getProcessPrototypes());
			addIfAbsent(main.getActivations(), tmp.getActivations());
			addIfAbsent(main.getSections(), tmp.getSections());
			addIfAbsent(main.getModes(), tmp.getModes());
			addIfAbsent(main.getModeLabels(), tmp.getModeLabels());
			addIfAbsent(main.getTypeDefinitions(), tmp.getTypeDefinitions());
			addIfAbsent(main.getChannels(), tmp.getChannels());
			addIfAbsent(main.getCustomEntities(), tmp.getCustomEntities());
		}	
	}

	private static void addHwModel(Amalthea mainModel, Amalthea tmpModel) {
		final HWModel main = mainModel.getHwModel();
		final HWModel tmp = tmpModel.getHwModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setHwModel(tmp);
		} else {
// TODO implement HW merger
//			if (main.getSystem() == null) {
//				main.setSystem(tmp.getSystem());
//			}
//			addIfAbsent(main.getSystemTypes(), tmp.getSystemTypes());
//			addIfAbsent(main.getEcuTypes(), tmp.getEcuTypes());
//			addIfAbsent(main.getMcTypes(), tmp.getMcTypes());
//			addIfAbsent(main.getCoreTypes(), tmp.getCoreTypes());
//			addIfAbsent(main.getMemoryTypes(), tmp.getMemoryTypes());
//			addIfAbsent(main.getNetworkTypes(), tmp.getNetworkTypes());
//			addIfAbsent(main.getAccessPaths(), tmp.getAccessPaths());
		}	
	}

	private static void addOsModel(Amalthea mainModel, Amalthea tmpModel) {
		final OSModel main = mainModel.getOsModel();
		final OSModel tmp = tmpModel.getOsModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setOsModel(tmp);
		} else {
			addAll(main.getOperatingSystems(), tmp.getOperatingSystems());
			addIfAbsent(main.getSemaphores(), tmp.getSemaphores());
			addIfAbsent(main.getOsOverheads(), tmp.getOsOverheads());
		}	
	}

	private static void addStimuliModel(Amalthea mainModel, Amalthea tmpModel) {
		final StimuliModel main = mainModel.getStimuliModel();
		final StimuliModel tmp = tmpModel.getStimuliModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setStimuliModel(tmp);
		} else {
			addIfAbsent(main.getStimuli(), tmp.getStimuli());
			addIfAbsent(main.getClocks(), tmp.getClocks());
		}	
	}

	private static void addConstraintsModel(Amalthea mainModel, Amalthea tmpModel) {
		final ConstraintsModel main = mainModel.getConstraintsModel();
		final ConstraintsModel tmp = tmpModel.getConstraintsModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setConstraintsModel(tmp);
		} else {
			addAll(main.getRequirements(), tmp.getRequirements());
			addIfAbsent(main.getEventChains(), tmp.getEventChains());
			addIfAbsent(main.getTimingConstraints(), tmp.getTimingConstraints());
			addIfAbsent(main.getAffinityConstraints(), tmp.getAffinityConstraints());
			addIfAbsent(main.getRunnableSequencingConstraints(), tmp.getRunnableSequencingConstraints());
			addIfAbsent(main.getDataAgeConstraints(), tmp.getDataAgeConstraints());
			addIfAbsent(main.getDataCoherencyGroups(), tmp.getDataCoherencyGroups());
			addIfAbsent(main.getDataStabilityGroups(), tmp.getDataStabilityGroups());
			addIfAbsent(main.getPhysicalSectionConstraints(), tmp.getPhysicalSectionConstraints());
		}	
	}

	private static void addEventModel(Amalthea mainModel, Amalthea tmpModel) {
		final EventModel main = mainModel.getEventModel();
		final EventModel tmp = tmpModel.getEventModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setEventModel(tmp);
		} else {
			addIfAbsent(main.getEvents(), tmp.getEvents());
		}	
	}

	private static void addPropertyConstraintsModel(Amalthea mainModel, Amalthea tmpModel) {
		final PropertyConstraintsModel main = mainModel.getPropertyConstraintsModel();
		final PropertyConstraintsModel tmp = tmpModel.getPropertyConstraintsModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setPropertyConstraintsModel(tmp);
		} else {
			addAll(main.getAllocationConstraints(), tmp.getAllocationConstraints());
			addAll(main.getMappingConstraints(), tmp.getMappingConstraints());
		}	
	}

	private static void addMappingModel(Amalthea mainModel, Amalthea tmpModel) {
		final MappingModel main = mainModel.getMappingModel();
		final MappingModel tmp = tmpModel.getMappingModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setMappingModel(tmp);
		} else {
			if (main.getAddressMappingType() == MemoryAddressMappingType._UNDEFINED_) {
				main.setAddressMappingType(tmp.getAddressMappingType());
			}
			addAll(main.getTaskAllocation(), tmp.getTaskAllocation());
			addAll(main.getIsrAllocation(), tmp.getIsrAllocation());
			addAll(main.getRunnableAllocation(), tmp.getRunnableAllocation());
			addAll(main.getSchedulerAllocation(), tmp.getSchedulerAllocation());
			addAll(main.getMemoryMapping(), tmp.getMemoryMapping());
			addIfAbsent(main.getPhysicalSectionMapping(), tmp.getPhysicalSectionMapping());
		}	
	}

	private static void addComponentsModel(Amalthea mainModel, Amalthea tmpModel) {
		final ComponentsModel main = mainModel.getComponentsModel();
		final ComponentsModel tmp = tmpModel.getComponentsModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setComponentsModel(tmp);
		} else {
			addIfAbsent(main.getComponents(), tmp.getComponents());
			addIfAbsent(main.getSystems(), tmp.getSystems());
		}	
	}

	private static void addConfigModel(Amalthea mainModel, Amalthea tmpModel) {
		final ConfigModel main = mainModel.getConfigModel();
		final ConfigModel tmp = tmpModel.getConfigModel();
		if (tmp == null) return;
		
		if (main == null) {
			mainModel.setConfigModel(tmp);
		} else {
			addAll(main.getEventsToTrace(), tmp.getEventsToTrace());
		}	
	}

	
	private static <T extends BaseObject> void addAll(EList<T> main, EList<T> input) {
		main.addAll(input);
	}

	private static <T extends IReferable> void addIfAbsent(EList<T> main, EList<T> input) {
		final HashSet<String> uniqueNames = new HashSet<String>();
		for (T object : main) {
			uniqueNames.add(object.getUniqueName());
		}
		
		final Collection<T> objectsToMove = new ArrayList<T>();
		for (T object : input) {
			if (uniqueNames.contains(object.getUniqueName())) {
				// skip entry
			} else {
				// add entry
				objectsToMove.add(object);
			}
		}
		
		// this part changes the containment of the objects
		main.addAll(objectsToMove);
	}

	private static void addPropertiesIfAbsent(IAnnotatable main, final IAnnotatable input) {
		if (main == null || input == null) return;
		
		for (Entry<String, Value> property : input.getCustomProperties()) {
			if (main.getCustomProperties().containsKey(property.getKey())) {
				// skip entry
			} else {
				// add entry
				main.getCustomProperties().add(property);
			}
		}
	}

}
