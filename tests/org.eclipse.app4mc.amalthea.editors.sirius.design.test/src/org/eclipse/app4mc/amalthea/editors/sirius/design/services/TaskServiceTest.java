/*********************************************************************************
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

package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.app4mc.amalthea.model.util.ModelUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author daniel.kunz@de.bosch.com
 *
 */
public class TaskServiceTest {

	private TaskService taskS = null;

	@Before
	public void setUp() throws Exception {
		this.taskS = new TaskService();
	}

	@After
	public void tearDown() throws Exception {
		this.taskS = null;
	}

	@Test
	public void testCheckTaskPreemptiveNull() {
		boolean result = this.taskS.checkTaskPreemptive(null);
		assertThat(result, is(false));
	}

	@Test
	public void testCheckTaskPreemptiveUndefined() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setPreemption(Preemption._UNDEFINED_);
		boolean result = this.taskS.checkTaskPreemptive(task);
		assertThat(result, is(false));
	}

	@Test
	public void testCheckTaskPreemptivePreepmtive() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setPreemption(Preemption.PREEMPTIVE);
		boolean result = this.taskS.checkTaskPreemptive(task);
		assertThat(result, is(true));
	}

	@Test
	public void testCheckTaskPreemptiveCooperative() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setPreemption(Preemption.COOPERATIVE);
		boolean result = this.taskS.checkTaskPreemptive(task);
		assertThat(result, is(false));
	}


	@Test
	public void testCheckTaskPreemptionUnknownNull() {
		boolean result = this.taskS.checkTaskPreemptionUnknown(null);
		assertThat(result, is(false));
	}

	@Test
	public void testCheckTaskPreemptionUnknownUnknown() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setPreemption(Preemption._UNDEFINED_);
		boolean result = this.taskS.checkTaskPreemptionUnknown(task);
		assertThat(result, is(true));
	}

	@Test
	public void testCheckTaskPreemptionUnknownPremmptive() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		task.setPreemption(Preemption.PREEMPTIVE);
		boolean result = this.taskS.checkTaskPreemptionUnknown(task);
		assertThat(result, is(false));
	}

	@Test
	public void testGetRunnablesFromTaskNull() {
		List<Runnable> result = this.taskS.getRunnablesFromTask(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetRunnablesFromTaskEmptyTask() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		List<Runnable> result = this.taskS.getRunnablesFromTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetRunnablesFromTaskEmptyCallGraph() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		task.setCallGraph(cg);
		List<Runnable> result = this.taskS.getRunnablesFromTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetRunnablesFromTaskCallGraphOther() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		InterProcessTrigger ipt = AmaltheaFactory.eINSTANCE.createInterProcessTrigger();
		cs.getCalls().add(ipt);
		task.setCallGraph(cg);
		List<Runnable> result = this.taskS.getRunnablesFromTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetRunnablesFromTaskCallGraphEmptyTaskRunnableCall() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		cs.getCalls().add(trc);
		task.setCallGraph(cg);
		List<Runnable> result = this.taskS.getRunnablesFromTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetRunnablesFromTaskCallGraphTaskRunnableCall() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		cs.getCalls().add(trc);
		task.setCallGraph(cg);
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		trc.setRunnable(runn);
		List<Runnable> result = this.taskS.getRunnablesFromTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(false));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(runn));
	}

	@Test
	public void testGetAccessedLabelsOfTaskNull() {
		List<Label> result = this.taskS.getAccessedLabelsOfTask(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetAccessedLabelsOfTaskEmptyTask() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		List<Label> result = this.taskS.getAccessedLabelsOfTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetAccessedLabelsOfTaskEmptyRunnable() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		cs.getCalls().add(trc);
		task.setCallGraph(cg);
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		trc.setRunnable(runn);
		List<Label> result = this.taskS.getAccessedLabelsOfTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetAccessedLabelsOfTaskEmptyRunnableOtherRunnabelItem() {
		Amalthea root = AmaltheaFactory.eINSTANCE.createAmalthea();
		SWModel sw = ModelUtil.getOrCreateSwModel(root);
		Runnable run = AmaltheaFactory.eINSTANCE.createRunnable();
		sw.getRunnables().add(run);
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		sw.getTasks().add(task);
		
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		cs.getCalls().add(trc);
		task.setCallGraph(cg);
		
		ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeedConstant(25);
		run.getRunnableItems().add(execNeed);
		trc.setRunnable(run);
		List<Label> result = this.taskS.getAccessedLabelsOfTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetAccessedLabelsOfTaskEmptyRunnableEmptyLabelAccess() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		cs.getCalls().add(trc);
		task.setCallGraph(cg);
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		runn.getRunnableItems().add(la);
		trc.setRunnable(runn);
		List<Label> result = this.taskS.getAccessedLabelsOfTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	@Test
	public void testGetAccessedLabelsOfTaskEmptyRunnableLabelAccess() {
		Task task = AmaltheaFactory.eINSTANCE.createTask();
		CallGraph cg = AmaltheaFactory.eINSTANCE.createCallGraph();
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cg.getGraphEntries().add(cs);
		TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		cs.getCalls().add(trc);
		task.setCallGraph(cg);
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		runn.getRunnableItems().add(la);
		trc.setRunnable(runn);
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		la.setData(label);
		List<Label> result = this.taskS.getAccessedLabelsOfTask(task);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(false));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(label));
	}


}
