package org.eclipse.app4mc.amalthea.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class AmaltheaMerger {

	/**
	 * Add the contained elements of the input models to the main model.
	 * 
	 * 
	 * @param main
	 * @param inputs
	 */
	public static void addElements(Amalthea mainModel, Collection<Amalthea> inputs) {
		final Copier copier = new Copier(true, true);
		
		for (Amalthea model : inputs) {
			final Amalthea tmpModel = (Amalthea) copier.copy(model);
			
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
		if (main == null) {
			mainModel.setCommonElements(tmp);
		} else {
			addIfAbsent(main.getTags(), tmp.getTags());
		}	
	}

	private static void addSwModel(Amalthea mainModel, Amalthea tmpModel) {
		final SWModel main = mainModel.getSwModel();
		final SWModel tmp = tmpModel.getSwModel();
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
		if (main == null) {
			mainModel.setHwModel(tmp);
		} else {
			if (main.getSystem() == null) {
				main.setSystem(tmp.getSystem());
			}
			addIfAbsent(main.getSystemTypes(), tmp.getSystemTypes());
			addIfAbsent(main.getEcuTypes(), tmp.getEcuTypes());
			addIfAbsent(main.getMcTypes(), tmp.getMcTypes());
			addIfAbsent(main.getCoreTypes(), tmp.getCoreTypes());
			addIfAbsent(main.getMemoryTypes(), tmp.getMemoryTypes());
			addIfAbsent(main.getNetworkTypes(), tmp.getNetworkTypes());
			addIfAbsent(main.getAccessPaths(), tmp.getAccessPaths());
		}	
	}

	private static void addOsModel(Amalthea mainModel, Amalthea tmpModel) {
		final OSModel main = mainModel.getOsModel();
		final OSModel tmp = tmpModel.getOsModel();
		if (main == null) {
			mainModel.setOsModel(tmp);
		} else {
			if (main.getOsDataConsistency() == null) {
				main.setOsDataConsistency(tmp.getOsDataConsistency());
			}
			addIfAbsent(main.getSemaphores(), tmp.getSemaphores());
			addIfAbsent(main.getOsOverheads(), tmp.getOsOverheads());
			main.getOperatingSystems().addAll(tmp.getOperatingSystems());
		}	
	}

	private static void addStimuliModel(Amalthea mainModel, Amalthea tmpModel) {
		final StimuliModel main = mainModel.getStimuliModel();
		final StimuliModel tmp = tmpModel.getStimuliModel();
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
		if (main == null) {
			mainModel.setConstraintsModel(tmp);
		} else {
			addIfAbsent(main.getEventChains(), tmp.getEventChains());
			addIfAbsent(main.getTimingConstraints(), tmp.getTimingConstraints());
			addIfAbsent(main.getAffinityConstraints(), tmp.getAffinityConstraints());
			addIfAbsent(main.getRunnableSequencingConstraints(), tmp.getRunnableSequencingConstraints());
			addIfAbsent(main.getDataAgeConstraints(), tmp.getDataAgeConstraints());
			addIfAbsent(main.getDataCoherencyGroups(), tmp.getDataCoherencyGroups());
			addIfAbsent(main.getDataStabilityGroups(), tmp.getDataStabilityGroups());
			addIfAbsent(main.getPhysicalSectionConstraints(), tmp.getPhysicalSectionConstraints());
			main.getRequirements().addAll(tmp.getRequirements());
		}	
	}

	private static void addEventModel(Amalthea mainModel, Amalthea tmpModel) {
		final EventModel main = mainModel.getEventModel();
		final EventModel tmp = tmpModel.getEventModel();
		if (main == null) {
			mainModel.setEventModel(tmp);
		} else {
			addIfAbsent(main.getEvents(), tmp.getEvents());
		}	
	}

	private static void addPropertyConstraintsModel(Amalthea mainModel, Amalthea tmpModel) {
		// TODO Auto-generated method stub
		
	}

	private static void addMappingModel(Amalthea mainModel, Amalthea tmpModel) {
		final MappingModel main = mainModel.getMappingModel();
		final MappingModel tmp = tmpModel.getMappingModel();
		if (main == null) {
			mainModel.setMappingModel(tmp);
		} else {
			if (main.getAddressMappingType() == MemoryAddressMappingType._UNDEFINED_) {
				main.setAddressMappingType(tmp.getAddressMappingType());
			}
			main.getTaskAllocation().addAll(tmp.getTaskAllocation());
			main.getIsrAllocation().addAll(tmp.getIsrAllocation());
			main.getRunnableAllocation().addAll(tmp.getRunnableAllocation());
			main.getCoreAllocation().addAll(tmp.getCoreAllocation());
			main.getMapping().addAll(tmp.getMapping());
			main.getPhysicalSectionMapping().addAll(tmp.getPhysicalSectionMapping());
		}	
	}

	private static void addComponentsModel(Amalthea mainModel, Amalthea tmpModel) {
		final ComponentsModel main = mainModel.getComponentsModel();
		final ComponentsModel tmp = tmpModel.getComponentsModel();
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
		if (main == null) {
			mainModel.setConfigModel(tmp);
		} else {
			main.getEventsToTrace().addAll(tmp.getEventsToTrace());
		}	
	}

	
	private static void addPropertiesIfAbsent(IAnnotatable main, final IAnnotatable input) {
		for (Entry<String, Value> property : input.getCustomProperties()) {
			if (main.getCustomProperties().containsKey(property.getKey())) {
				// skip entry
			} else {
				// add entry
				main.getCustomProperties().add(property);
			}
		}
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
	
	
}
