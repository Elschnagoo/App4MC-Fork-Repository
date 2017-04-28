/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.handlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * writes a software model into a graphviz .dot file
 *
 */
public class WriteGraphvizHandler extends org.eclipse.core.commands.AbstractHandler {
	@SuppressWarnings("resource")
	public void write(final SWModel swm, final ConstraintsModel cm, final String file) {
		Writer output = null;
		try {
			final File file2 = new File(
					file.substring(0, file.lastIndexOf(".")).concat("(" + swm.getProcessPrototypes().size() + ").dot"));

			output = new BufferedWriter(new FileWriter(file2));
			output.write("digraph G { \n");
			for (int i = 0; i < swm.getProcessPrototypes().size(); i++) {
				try {
					output.write("subgraph cluster_" + i
							+ " { \n style=filled; \n color=lightgrey; \n node [style=filled,color=white];\n");
					output.write(" " + swm.getProcessPrototypes().get(i).getFirstRunnable().getName() + ";\n");

					for (int j = 0; j < cm.getRunnableSequencingConstraints().size(); j++) {
						for (int k = 0; k < cm.getRunnableSequencingConstraints().get(i).getRunnableGroups()
								.size(); k++) {
							if (cm.getRunnableSequencingConstraints().get(j).getProcessScope().get(0).equals(swm.getProcessPrototypes().get(i))) {
								output.write(" " + cm.getRunnableSequencingConstraints().get(j).getRunnableGroups()
										.get(k).getRunnables().get(0).getName() + ";\n");
							}
						}
					}
					output.write(" label = " + '"' + "ProcessPrototype" + i + '"' + ";}\n");
				}
				catch (final Exception e) {
					e.printStackTrace();
				}
			}
			for (int i = 0; i < swm.getProcessPrototypes().size(); i++) {
				for (int j = 0; j < swm.getProcessPrototypes().get(i).getOrderPrecedenceSpec().size(); j++) {
					output.write(" "
							+ swm.getProcessPrototypes().get(i).getOrderPrecedenceSpec().get(j).getOrigin().getName()
							+ "->"
							+ swm.getProcessPrototypes().get(i).getOrderPrecedenceSpec().get(j).getTarget().getName()
							+ ";\n");
				}
			}

			output.write("}");
			output.close();
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
		System.out.println("Graphviz saved.");
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		IFile file = null;
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object element = structuredSelection.getFirstElement();
			if (element instanceof IAdaptable) {
				final Object adapter = ((IAdaptable) element).getAdapter(IFile.class);
				if (adapter instanceof IFile) {
					element = adapter;
				}
			}
			if (element instanceof IFile) {
				try {
					file = (IFile) element;
				}
				catch (final Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (file != null) {
			write(UniversalHandler.getInstance().getSwModel(), UniversalHandler.getInstance().getConstraintsModel(),
					file.getLocation().toString());
		}
		return null;
	}
}
