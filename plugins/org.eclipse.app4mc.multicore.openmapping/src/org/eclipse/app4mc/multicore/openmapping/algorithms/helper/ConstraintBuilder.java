package org.eclipse.app4mc.multicore.openmapping.algorithms.helper;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.app4mc.multicore.openmapping.model.OMAnnotationElement;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;

import com.google.common.collect.HashMultimap;

public class ConstraintBuilder {
	private HashMultimap<OMAnnotationElement, OMCore> mTagToCore = HashMultimap.create();
	private HashMultimap<OMTask, OMCore> mTaskToCore = HashMultimap.create();
	
	public boolean fetchAllocationConstraints(List<OMTask> taskList, List<OMCore> coreList) {
		// Gather all tags and core classifiers which are referred to by a core
		for(OMCore c : coreList) {
			if(c.getAnnotationElement().size() > 0) {
				Stream<OMAnnotationElement> sTags = c.getAnnotationElement().stream();
				sTags.forEach(item -> mTagToCore.put(item, c));
			}
		}
		
		// Gather all tags which are referred to by a task
		for(OMTask t : taskList) {
			// Step 1: If set, add whitelisted cores, otherwise all cores.
			if(t.getValidAnnotationElements().size() > 0) {
				t.getValidAnnotationElements().forEach(tag -> {
					Set<OMCore> cores = getCoresByAnnotationElement(tag);
					this.mTaskToCore.putAll(t, cores);
				});
			} else {
				this.mTaskToCore.putAll(t, coreList);
			}
			// Step 2: If set, remove all blacklisted cores
			if(t.getInvalidAnnotationElements().size() > 0) {
				t.getInvalidAnnotationElements().forEach(tag -> {
					Set<OMCore> cores = getCoresByAnnotationElement(tag);
					if(null != cores && cores.size() > 0) {
						cores.forEach(core -> this.mTaskToCore.remove(t, core));
					}
				});
			}
			System.out.println("---- VALID CORES FOR " + t.getTaskRef().getName() + " ----");
			mTaskToCore.get(t).forEach(core -> System.out.print("|" + core + "|\n"));
		}
		
		return true;
	}
	
	private Set<OMCore> getCoresByAnnotationElement(OMAnnotationElement element) {
		return this.mTagToCore.get(element);	
	}
	
	public HashMultimap<OMTask, OMCore> getValidAllocationMap() {
		return this.mTaskToCore;
	}
	
	public Set<OMCore> getValidAlocationTargets(OMTask task) {
		return this.mTaskToCore.get(task);
	}
}
