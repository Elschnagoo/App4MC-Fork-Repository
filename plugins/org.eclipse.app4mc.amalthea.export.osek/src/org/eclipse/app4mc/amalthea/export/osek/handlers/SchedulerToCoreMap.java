package org.eclipse.app4mc.amalthea.export.osek.handlers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.emf.common.util.EList;

public class SchedulerToCoreMap {

	private final Map<Scheduler, Set<String>> schedulerToCoreNames;

	public SchedulerToCoreMap(final EList<CoreAllocation> coreAllocationList) {
		this.schedulerToCoreNames = new HashMap<>();
		for (final CoreAllocation coreAllocation : coreAllocationList) {
			final Scheduler scheduler = coreAllocation.getScheduler();
			if (scheduler == null) {
				continue;
			}
			final EList<Core> coreList = coreAllocation.getCore();
			final Set<String> coreNames = new HashSet<>();
			this.schedulerToCoreNames.put(scheduler, coreNames);
			for (final Core core : coreList) {
				final String coreName = core.getName();
				if (coreName == null) {
					continue;
				}
				coreNames.add(coreName.toLowerCase());
			}
		}
	}

	public boolean isSchedulerMappedToCore(final Scheduler scheduler, final String coreName) {
		final Set<String> coreNames = this.schedulerToCoreNames.get(scheduler);
		if (coreNames == null) {
			return false;
		}
		return coreNames.contains(coreName.toLowerCase());
	}

}
