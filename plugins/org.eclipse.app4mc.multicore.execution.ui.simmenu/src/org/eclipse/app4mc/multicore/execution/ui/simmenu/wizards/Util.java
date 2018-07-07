/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.ui.simmenu.wizards;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMEdge;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMTask;

public class Util {
	/**
	 * Filter the task edges that match the following 
	 * <ul>
	 * <li>No self-transition edge</li>
	 * <li>Pre and post have the same period</li>
	 * <li>If there are multiple edges between two tasks the edge with the highest instruction (release time) is chosen</li>
	 * </ul>
	 * @param tasklist
	 * @return
	 */
	public static Collection<OMEdge> getConsideredEdges(List<OMTask> tasklist){
		
		List<OMEdge> allEdges = tasklist.parallelStream()
				.map(OMTask::getPosts).flatMap(List::stream)
				.filter(x->x.getPre()!=x.getPost() && x.getPre().getPeriod()==x.getPost().getPeriod())
				.collect(Collectors.toList());
		
		Map<String,OMEdge> considered = new HashMap<>();
		
		for(OMEdge edge:allEdges){
			String name = edge.getPre().getTaskRef().getUniqueName()+"" + edge.getPost().getTaskRef().getUniqueName();
			if(considered.containsKey(name)){
				OMEdge oldedge=considered.get(name);
				if(oldedge.getReleaseInstruction()<edge.getReleaseInstruction()){
					considered.put(name, edge);
				}
			}else{
				considered.put(name,edge);
			}
		}
		return considered.values();
	}
}
