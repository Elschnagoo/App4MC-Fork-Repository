/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PartLog;
import org.eclipse.app4mc.multicore.partitioning.handlers.WriteAppletHandler;

public class GenerateApplet extends WorkflowComponent {

	private final boolean enableLog = false;
	private String outputDir;

	@Override
	protected void runInternal(Context ctx) {
		final Amalthea modelCopy = getAmaltheaModelCopy(ctx);
		assert null != modelCopy.getSwModel() && null != modelCopy.getConstraintsModel();
		PartLog.getInstance().setLogName("Applet generation");
		if (modelCopy.getSwModel().getRunnables().size() < 1
				|| modelCopy.getConstraintsModel().getRunnableSequencingConstraints().size() < 1) {
			PartLog.getInstance().log("Applet Input is not correct. No Runnables / Sequencing Constraints available!!",
					null);
			return;
		}
		if (isEnableLog()) {
			PartLog.getInstance().setEnableSourceConsoleLog(true);
		}
		final WriteAppletHandler wa = new WriteAppletHandler();
		wa.write(modelCopy.getSwModel(), modelCopy.getConstraintsModel(), this.outputDir);
		if (this.outputDir == null) {
			this.outputDir = "-Project folder-";
		}
		PartLog.getInstance()
				.log("No result slot needed for Applet generation. Applet has been saved at " + this.outputDir + ".");
		PartLog.getInstance().logSimple("Applet generation finished");
	}

	private boolean isEnableLog() {
		return this.enableLog;
	}

	public String getOutputDir() {
		return this.outputDir;
	}

	public void setOutputDir(final String outputDir) {
		this.outputDir = outputDir;
	}
}
