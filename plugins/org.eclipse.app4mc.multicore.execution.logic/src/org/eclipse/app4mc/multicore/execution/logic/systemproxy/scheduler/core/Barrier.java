/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core;


/**
 * Represents a barrier which can be locked or unlocked. 
 * e.g. it is used for implement task precedence.
 */
public class Barrier {
	
	private String name;
	
	private String holder;
	
	private boolean locked = false;
	
	/**
	 * Try to lock barrier.
	 * @param requester Name of the requesting task.
	 * @see
	 * #unlock()
	 * @return 
	 * <ul>
	 * <li>true if barrier is unlocked and is now held by the requester</li>
	 * <li>false if it is locked</li>
	 * </ul>
	 */
	public boolean tryLock(String requester){
		if(locked){
			return false;
		}else {
			locked=true;
			holder = requester;
			return true;
		}
	}
	
	/**
	 * Unlock barrier and reset the current holder.
	 */
	public void unlock(){
		locked=false;
		holder="";
	}
	
	/**
	 * Check if barrier is currently locked.
	 * @return
	 * <ul>
	 * <li>true if is locked</li>
	 * <li>false if it is unlocked</li>
	 * </ul>
	 * @see #tryLock(String)
	 * @see #unlock()
	 */
	public boolean isLocked(){
		return locked;
	}

	/**
	 * Get the name of the barrier. e.g. "mux_task_precedence_C1T1->C2T1"
	 * @see #setName(String)
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the barrier.
	 * @see #getName()
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * If barrier is locked this method returns the name of the task which holds the task currently.
	 * @return
	 */
	public String getHolder(){
		return holder;
	}
	
}
