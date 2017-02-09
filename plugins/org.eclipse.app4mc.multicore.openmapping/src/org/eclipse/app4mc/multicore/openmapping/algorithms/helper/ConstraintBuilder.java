package org.eclipse.app4mc.multicore.openmapping.algorithms.helper;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMTag;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;

import com.google.common.collect.HashMultimap;

public class ConstraintBuilder {
	private HashMultimap<OMTag, OMCore> mTagToCore = HashMultimap.create();
	private HashMultimap<OMTask, OMCore> mTaskToCore = HashMultimap.create();
	
	public boolean fetchAllocationConstraints(List<OMTask> taskList, List<OMCore> coreList) {
		for(OMCore c : coreList) {
			if(c.getTags().size() > 0) {
				Stream<OMTag> sTags = c.getTags().stream();
				sTags.forEach(item -> mTagToCore.put(item, c));
			}
		}
		
		for(OMTask t : taskList) {
			System.out.println(t.getValidTags());
			System.out.println(t.getInvalidTags());
			if(t.getValidTags().size() > 0) {
				t.getValidTags().forEach(tag -> {
					mTagToCore.get(tag);
				});
			} else if(t.getInvalidTags().size() > 0) {
				// Blacklist
			} else {
				// Dont care
			}
		}
		
		System.out.println("DEBUG_OUT:");
		mTagToCore.entries().stream().forEach(System.out::println);
		
		return true;
	}

	public HashMap<OMTask, OMCore> getValidCores() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<OMTask, OMCore> getInvalidCores() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the mTagToCore
	 */
	public HashMultimap<OMTag, OMCore> getTagToCore() {
		return mTagToCore;
	}
}
