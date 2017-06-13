/*******************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.app4mc.amalthea._import.atdb;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.amalthea._import.atdb.model.Model;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Single;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class AmaltheaExporter {

	private URI uri = null;
	private AmaltheaFactory factory = null;

	private final Map<String, Stimulus> stimuli = new HashMap<String, Stimulus>();
	private final Map<String, Runnable> runnables = new HashMap<String, Runnable>();

	public AmaltheaExporter(final URI uri) {
		this.uri = uri;
		// Initialize the model
		AmaltheaPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		this.factory = AmaltheaFactory.eINSTANCE;
	}

	public void serialise(final IProgressMonitor progressMonitor, final Model model) {
		// transform intermediate model to AMALTHEA
		final Amalthea documentRoot = transform(model);

		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.createResource(this.uri);

		resource.getContents().add(documentRoot);

		// Save the contents of the resource to the file system.
		//
		final Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		options.put(XMLResource.XML_SCHEMA_URI, AmaltheaPackage.eNS_PREFIX);

		try {
			resource.save(options);
		}
		catch (final IOException e) {
			e.printStackTrace();
		}

		resource.unload();
	}

	private Amalthea transform(final Model model) {
		final Amalthea amalthea = this.factory.createAmalthea();

		final StimuliModel stimuliModel = createStimuliModel(model);
		amalthea.setStimuliModel(stimuliModel);

		final SWModel swModel = createSwModel(model);
		amalthea.setSwModel(swModel);

		return amalthea;
	}

	private StimuliModel createStimuliModel(final Model model) {
		final StimuliModel stimuliModel = this.factory.createStimuliModel();

		final EList<Stimulus> stimuli = stimuliModel.getStimuli();
		transformStimuli(stimuli, model);

		return stimuliModel;
	}

	private void transformStimuli(final EList<Stimulus> stimuli, final Model model) {
		for (final org.eclipse.app4mc.amalthea._import.atdb.model.Stimulus myStimulus : model.getStimuli()) {
			final Single aStimulus = this.factory.createSingle();
			aStimulus.setName(myStimulus.getName());
			final Time time = this.factory.createTime();
			time.setValue(BigInteger.valueOf(myStimulus.getMoment()));
			time.setUnit(TimeUnit.get(myStimulus.getTimeBase()));
			aStimulus.setActivation(time);
			stimuli.add(aStimulus);
			this.stimuli.put(aStimulus.getName(), aStimulus);
		}
	}

	private SWModel createSwModel(final Model model) {
		final SWModel swModel = this.factory.createSWModel();

		// Runnables
		final EList<Runnable> runnables = swModel.getRunnables();
		transformRunnables(runnables, model);
		// tasks
		final EList<Task> tasks = swModel.getTasks();
		transformTasks(tasks, model);
		// isrs
		final EList<ISR> isrs = swModel.getIsrs();
		transformIsrs(isrs, model);
		// labels
		final EList<Label> labels = swModel.getLabels();
		transformLabels(labels, model);

		return swModel;
	}

	private void transformTasks(final EList<Task> tasks, final Model model) {
		for (final org.eclipse.app4mc.amalthea._import.atdb.model.Task myTask : model.getTasks()) {
			final Task aTask = this.factory.createTask();
			aTask.setName(myTask.getName());
			// add activating stimuli here
			final EList<Stimulus> stimuli = aTask.getStimuli();
			for (final String stimulus : myTask.getStimuli()) {
				stimuli.add(this.stimuli.get(stimulus));
			}
			// add runnable calls
			final CallGraph callGraph = this.factory.createCallGraph();
			final EList<GraphEntryBase> graphEntry = callGraph.getGraphEntries();
			final CallSequence callSequence = this.factory.createCallSequence();
			final EList<CallSequenceItem> callItemList = callSequence.getCalls();
			for (final String name : myTask.getRunnableCalls()) {
				final TaskRunnableCall runnableCall = this.factory.createTaskRunnableCall();
				runnableCall.setRunnable(this.runnables.get(name));
				callItemList.add(runnableCall);
			}
			graphEntry.add(callSequence);
			aTask.setCallGraph(callGraph);
			tasks.add(aTask);
		}
	}

	private void transformIsrs(final EList<ISR> isrs, final Model model) {
		for (final org.eclipse.app4mc.amalthea._import.atdb.model.Isr myIsr : model.getIsrs()) {
			final ISR aIsr = this.factory.createISR();
			aIsr.setName(myIsr.getName());
			isrs.add(aIsr);
		}
	}

	private void transformRunnables(final EList<Runnable> runnables, final Model model) {
		for (final org.eclipse.app4mc.amalthea._import.atdb.model.Runnable myRunnable : model.getRunnables()) {
			final Runnable aRunnable = this.factory.createRunnable();
			aRunnable.setName(myRunnable.getName());
			runnables.add(aRunnable);
			this.runnables.put(aRunnable.getName(), aRunnable);
		}
	}

	private void transformLabels(final EList<Label> labels, final Model model) {
		for (final org.eclipse.app4mc.amalthea._import.atdb.model.Signal mySignal : model.getSignals()) {
			final Label aLabel = this.factory.createLabel();
			aLabel.setName(mySignal.getName());
			labels.add(aLabel);
		}
	}
}
