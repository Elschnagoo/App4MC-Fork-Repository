/**
 ********************************************************************************
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsAPIOverhead;
import org.eclipse.app4mc.amalthea.model.OsDataConsistency;
import org.eclipse.app4mc.amalthea.model.OsISROverhead;
import org.eclipse.app4mc.amalthea.model.OsOverhead;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAssociation;
import org.eclipse.app4mc.amalthea.model.SchedulingParameters;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.VendorOperatingSystem;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class OperatingSystemBuilder {

	public OSModel osModelRoot(final Procedure1<OSModel> initializer) {
		final OSModel obj = AmaltheaFactory.eINSTANCE.createOSModel();
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void operatingSystem(final OSModel container, final Procedure1<OperatingSystem> initializer) {
		final OperatingSystem obj = AmaltheaFactory.eINSTANCE.createOperatingSystem();
		container.getOperatingSystems().add(obj);
		initializer.apply(obj);
	}

	public void operatingSystem_Vendor(final OSModel container, final Procedure1<VendorOperatingSystem> initializer) {
		final VendorOperatingSystem obj = AmaltheaFactory.eINSTANCE.createVendorOperatingSystem();
		container.getOperatingSystems().add(obj);
		initializer.apply(obj);
	}

	public void semaphore(final OSModel container, final Procedure1<Semaphore> initializer) {
		final Semaphore obj = AmaltheaFactory.eINSTANCE.createSemaphore();
		container.getSemaphores().add(obj);
		initializer.apply(obj);
	}

	public void osOverhead(final OSModel container, final Procedure1<OsOverhead> initializer) {
		final OsOverhead obj = AmaltheaFactory.eINSTANCE.createOsOverhead();
		container.getOsOverheads().add(obj);
		initializer.apply(obj);
	}

	// ********** Operating system **********

	public void taskScheduler(final OperatingSystem container, final Procedure1<TaskScheduler> initializer) {
		final TaskScheduler obj = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		container.getTaskSchedulers().add(obj);
		initializer.apply(obj);
	}

	public void interruptController(final OperatingSystem container,
			final Procedure1<InterruptController> initializer) {
		final InterruptController obj = AmaltheaFactory.eINSTANCE.createInterruptController();
		container.getInterruptControllers().add(obj);
		initializer.apply(obj);
	}

	public void dataConsistency(final OperatingSystem container, final Procedure1<OsDataConsistency> initializer) {
		final OsDataConsistency obj = AmaltheaFactory.eINSTANCE.createOsDataConsistency();
		container.setOsDataConsistency(obj);
		initializer.apply(obj);
	}

	public void labelAccess(final Scheduler container, final Procedure1<LabelAccess> initializer) {
		final LabelAccess obj = AmaltheaFactory.eINSTANCE.createLabelAccess();
		container.getComputationItems().add(obj);
		initializer.apply(obj);
	}

	public void parentAssociation(final TaskScheduler container, final Procedure1<SchedulerAssociation> initializer) {
		final SchedulerAssociation obj = AmaltheaFactory.eINSTANCE.createSchedulerAssociation();
		container.setParentAssociation(obj);
		initializer.apply(obj);
	}

	public void schedulingParameters(final SchedulerAssociation container,
			final Procedure1<SchedulingParameters> initializer) {
		final SchedulingParameters obj = AmaltheaFactory.eINSTANCE.createSchedulingParameters();
		container.setSchedulingParameters(obj);
		initializer.apply(obj);
	}

	public void parameter_extension(final SchedulerAssociation container, final String key, final String value) {
		container.getParameterExtensions().put(key, value);
	}

	// ********** OS instructions (overhead) **********

	public void apiOverhead(final OsOverhead container, final Procedure1<OsAPIOverhead> initializer) {
		final OsAPIOverhead obj = AmaltheaFactory.eINSTANCE.createOsAPIOverhead();
		container.setApiOverhead(obj);
		initializer.apply(obj);
	}

	public void isrOverheadCat1(final OsOverhead container, final Procedure1<OsISROverhead> initializer) {
		final OsISROverhead obj = AmaltheaFactory.eINSTANCE.createOsISROverhead();
		container.setIsrCategory1Overhead(obj);
		initializer.apply(obj);
	}

	public void isrOverheadCat2(final OsOverhead container, final Procedure1<OsISROverhead> initializer) {
		final OsISROverhead obj = AmaltheaFactory.eINSTANCE.createOsISROverhead();
		container.setIsrCategory2Overhead(obj);
		initializer.apply(obj);
	}

}
