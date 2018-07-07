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
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.partitioning.handlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.sharelibs.SelectionUtil;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;

/**
 * writes a software model into a graphviz .dot file
 *
 */
public class WriteGraphvizHandler extends org.eclipse.core.commands.AbstractHandler {
	private IFile file = null;

	@SuppressWarnings("resource")
	public void write(final SWModel swm, final ConstraintsModel cm) {
		final boolean validRSCs = new Helper().AllRSCsHave2ValidEntries(cm.getRunnableSequencingConstraints());
		final Set<RunnableSequencingConstraint> writtenRSCs = new HashSet<RunnableSequencingConstraint>();
		final String filename = this.file.getName().substring(0, this.file.getName().lastIndexOf("."));
		Writer output = null;
		try {
			output = new BufferedWriter(new FileWriter(
					new File(this.file.getRawLocation().toString().substring(0, this.file.getRawLocation().toString().lastIndexOf("/")), filename + ".dot")));
			output.write("digraph G { \n");
			for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
				output.write("subgraph cluster_" + swm.getProcessPrototypes().indexOf(pp)
						+ " { \n style=filled; \n color=lightgrey; \n node [style=filled,color=white];\n");
				for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
					output.write(trc.getRunnable().getName() + ";\n");
				}
				if (validRSCs) {
					for (final RunnableSequencingConstraint rsc : cm.getRunnableSequencingConstraints()) {
						if (!writtenRSCs.contains(rsc) && new Helper().runnablesContainedinSamePP(rsc.getRunnableGroups().get(0).getRunnables().get(0),
								rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
							output.write(rsc.getRunnableGroups().get(0).getRunnables().get(0).getName() + " -> "
									+ rsc.getRunnableGroups().get(1).getRunnables().get(0).getName() + ";\n");
							writtenRSCs.add(rsc);
						}
					}
				}
				output.write(" label = " + '"' + pp.getName() + (null == pp.getActivation() ? '"' : ("; Activation: " + pp.getActivation().getName() + '"'))
						+ ";}\n");

			}
			if (swm.getProcessPrototypes().size() == 0) {
				for (final Runnable r : swm.getRunnables()) {
					output.write(r.getName() + ";\n");
				}
			}

			if (validRSCs) {
				for (final RunnableSequencingConstraint rsc : cm.getRunnableSequencingConstraints()) {
					if (!writtenRSCs.contains(rsc) && !new Helper().runnablesContainedinSamePP(rsc.getRunnableGroups().get(0).getRunnables().get(0),
							rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
						output.write(rsc.getRunnableGroups().get(0).getRunnables().get(0).getName() + " -> "
								+ rsc.getRunnableGroups().get(1).getRunnables().get(0).getName() + "[color=red];\n");
						writtenRSCs.add(rsc);
					}
				}
			}
			output.write("}");
			output.close();
			PartLog.getInstance().log("Graphviz saved: "
					+ this.file.getRawLocation().toString().substring(0, this.file.getRawLocation().toString().lastIndexOf("/")) + "/" + filename + ".dot");
			this.file.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);

		}
		catch (final Exception exception) {
			exception.printStackTrace();
			try {
				if (output != null) {
					output.close();
				}
			}
			catch (final IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final UniversalHandler uh = UniversalHandler.getInstance();
		uh.enableVerboseOutput();
		uh.dropCache();
		PartLog.getInstance().setEnableTargetConsoleLog(true);
		PartLog.getInstance().setLogName("WriteGraphviz");
		this.file = SelectionUtil.getSelectedFile(event);
		uh.dropCache();
		uh.readModels(URI.createPlatformResourceURI(this.file.getFullPath().toString(), true), true);
		write(UniversalHandler.getInstance().getSwModel(), UniversalHandler.getInstance().getConstraintsModel());
		return null;
	}
}
