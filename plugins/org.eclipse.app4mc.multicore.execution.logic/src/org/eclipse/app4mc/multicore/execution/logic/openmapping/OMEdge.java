/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.multicore.execution.logic.openmapping;

/**
 * Edge between two OMTask for pre and post relation (execute before/ after).
 */
public class OMEdge {
	private final OMTask pre;
	private final OMTask post;
	private final long releaseInstruction;
	private final long waitUntilReleaseInstruction;

	public OMEdge(OMTask pre,OMTask post, long releaseInstruction, long waitUntilReleaseInstruction) {
		super();
		this.pre = pre;
		this.post = post;
		this.releaseInstruction = releaseInstruction;
		this.waitUntilReleaseInstruction=waitUntilReleaseInstruction;
	}

	public OMTask getPre() {
		return pre;
	}
	
	public OMTask getPost(){
		return post;
	}
	

	public long getReleaseInstruction() {
		return releaseInstruction;
	}
	
	public long getWaitUntilReleaseInstruction(){
		return waitUntilReleaseInstruction;
	}

}
