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
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.multicore.partitioning.utils.CycleElimination;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.partitioning.utils.TopologicalCalculation;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Writes an Applet, that can be either startet from eclipse or loaded within a
 * webpage, in order to visualize and move the runnables as rectangles. Requires
 * constrainsmodel with RunnableSequencingConstraints (dependencies) referencing
 * runnables from a Softwaremodel
 */
public class WriteAppletHandler extends org.eclipse.core.commands.AbstractHandler {
	private ConstraintsModel cm;
	private SWModel swm;
	final int xdistance = 275;
	final int ydistance = 75;

	public WriteAppletHandler(final SWModel swm, final ConstraintsModel cm) {
		this.swm = swm;
		this.cm = cm;
	}

	public WriteAppletHandler() {
	}

	String className = "";

	@SuppressWarnings("resource")
	public void write(final SWModel swmi, final ConstraintsModel cmi, String file) {
		this.swm = swmi;
		this.cm = cmi;
		PartLog.getInstance().setEnableTargetConsoleLog(true);
		PartLog.getInstance().setEnableSourceConsoleLog(true);
		PartLog.getInstance().setLogName("Applet Writer");
		final StringBuffer output = new StringBuffer();
		this.className = "applet";
		if (file == null) {
			this.className = "applet";
			file = "applet.java";
		}
		else if (file.endsWith(".amxmi")) {
			file = file.replace(".amxmi", "_Applet.java");
			if (file.contains("\\")) {
				this.className = file.substring(file.lastIndexOf('\\') + 1, file.lastIndexOf("."));
			}
			else {
				this.className = file.substring(0, file.lastIndexOf("."));
			}
		}
		else if (!file.endsWith(".amxmi")) {
			PartLog.getInstance().log("Applet can only be generated for .amxmi files", null);
			return;
		}
		PartLog.getInstance().log("File: " + file + " Classname: " + this.className);
		try {
			output.append(initString());
			final CycleElimination ce = new CycleElimination(this.swm, this.cm);
			if (ce.containsCycles()) {
				ce.run(null);
			}
			if (this.cm.getRunnableSequencingConstraints().size() < 1 || this.swm.getRunnables().size() < 1) {
				// at least runnables and dependencies must be here
				PartLog.getInstance().log("No Runnables or Sequencing Constraints present. ABORTING", null);
				return;
			}
			for (final Runnable r : this.swm.getRunnables()) {
				try {
					output.append("		g.addVertex(\"" + r.getName() + "\");\n");
				}
				catch (final Exception e) {
					e.printStackTrace();
				}
			}
			output.append("\n");
			for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
				try {
					output.append("		g.addEdge(\""
							+ rsc.getRunnableGroups().get(0).getRunnables().get(0).getName() + "\",\""
							+ rsc.getRunnableGroups().get(1).getRunnables().get(0).getName() + "\");\n");
				}
				catch (final Exception e) {
					e.printStackTrace();
				}
			}
			int size = 0;
			try {
				final Runnable fr = new TopologicalCalculation(this.swm, this.cm).getFarthestNode(Integer.MAX_VALUE);
				size = new TopologicalCalculation(this.swm, this.cm).calcNodesToSink(fr);
			}
			catch (final Exception e1) {
				e1.printStackTrace();
				return;
			}
			final int[] x = new int[size + 1];
			for (int i = 0; i < size; i++) {
				x[i] = 0;
			}
			if (this.swm.getProcessPrototypes().size() <= 1) {
				for (final Runnable r : this.swm.getRunnables()) {
					try {
						final int temp = size - new TopologicalCalculation(this.swm, this.cm).calcNodesToSink(r);

						output.append("		positionVertexAt(\"" + r.getName() + "\", "
								+ Integer.toString(x[temp] * this.xdistance) + ", "
								+ Integer.toString(temp * this.ydistance) + ");\n");
						x[temp]++;
					}
					catch (final Exception e) {
						e.printStackTrace();
					}
				}
			}
			else {
				int xpos = 0;
				for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
					int ypos = 0;
					for (final RunnableCall trc : pp.getRunnableCalls()) {
						output.append("		positionVertexAt(\"" + trc.getRunnable().getName() + "\", "
								+ Integer.toString(xpos * this.xdistance) + ", "
								+ Integer.toString(ypos * this.ydistance) + ");\n");
						ypos++;
					}
					xpos++;
				}
			}
			output.append("\n } \n ");
			output.append(endString());
		}
		catch (final Exception exception) {
			exception.printStackTrace();
		}
		Writer w;
		try {
			w = new BufferedWriter(new FileWriter(file));
			w.write(output.toString());
			w.close();
			PartLog.getInstance().log("Applet written: " + file + " (please refresh Project / Model Explorer)");
		}
		catch (final IOException e) {
			PartLog.getInstance().log("Writing file aborted: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private String endString() {
		String str = "";
		str = "	private void adjustDisplaySettings(final JGraph jg) {\n"
				+ "		jg.setPreferredSize(DEFAULT_SIZE);\n" + "\n" + "		Color c = DEFAULT_BG_COLOR;\n"
				+ "		String colorStr = null;\n" + "\n" + "		try {\n"
				+ "			colorStr = getParameter(\"bgcolor\");\n" + "		}\n"
				+ "		catch (final Exception e) {\n" + "		}\n" + "\n" + "		if (colorStr != null) {\n"
				+ "			c = Color.decode(colorStr);\n" + "		}\n" + "\n" + "		jg.setBackground(c);\n" + "	}\n"
				+ "\n" + "\n" + "	private void positionVertexAt(final Object vertex, final int x, final int y) {\n"
				+ "		final DefaultGraphCell cell = this.m_jgAdapter.getVertexCell(vertex);\n"
				+ "		final Map attr = cell.getAttributes();\n"
				+ "		final Rectangle2D b = GraphConstants.getBounds(attr);\n"
				+ "		b.setRect(x, y, 250, b.getHeight());\n" + "		GraphConstants.setBounds(attr, b);\n" + "\n"
				+ "		final Map cellAttr = new HashMap();\n" + "		cellAttr.put(cell, attr);\n"
				+ "		this.m_jgAdapter.edit(cellAttr, null, null, null);\n" + "	}\n" + "}";
		return str;
	}

	private String initString() {
		int maxRcount = 0;
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			if (pp.getRunnableCalls().size() > maxRcount) {
				maxRcount = pp.getRunnableCalls().size();
			}
		}
		final String str = "package MyPackage;\n" + "\n" + "import java.awt.Color;\n" + "import java.awt.Dimension;\n"
				+ "import java.awt.geom.Rectangle2D;\n" + "import java.util.HashMap;\n" + "import java.util.Map;\n"
				+ "\n" + "import javax.swing.JApplet;\n" + "import javax.swing.JScrollPane;\n" + "\n"
				+ "import org.jgraph.JGraph;\n" + "import org.jgraph.graph.DefaultGraphCell;\n"
				+ "import org.jgraph.graph.GraphConstants;\n" + "import org.jgrapht.ListenableGraph;\n"
				+ "import org.jgrapht.ext.JGraphModelAdapter;\n" + "import org.jgrapht.graph.DefaultEdge;\n"
				+ "import org.jgrapht.graph.ListenableDirectedGraph;\n" + "\n" + "public class " + this.className
				+ " extends JApplet {\n"
				+ "	private static final Color DEFAULT_BG_COLOR = Color.decode(\"#FAFBFF\");\n"
				+ "	private static final Dimension DEFAULT_SIZE = new Dimension("
				+ this.swm.getProcessPrototypes().size() * this.xdistance + ", " + maxRcount * this.ydistance + ");\n"
				+ "	private JGraphModelAdapter m_jgAdapter;\n" + "\n" + "	@Override\n" + "	public void init() {\n"
				+ "		// create a JGraphT graph\n"
				+ "		final ListenableGraph g = new ListenableDirectedGraph(DefaultEdge.class);\n"
				+ "		// create a visualization using JGraph, via an adapter\n"
				+ "		this.m_jgAdapter = new JGraphModelAdapter(g);\n"
				+ "		final JGraph jgraph = new JGraph(this.m_jgAdapter);\n"
				+ "		adjustDisplaySettings(jgraph);\n" + "		getContentPane().add(jgraph);\n"
				+ "		JScrollPane sp = new JScrollPane(jgraph);\n" + "		sp.setPreferredSize(DEFAULT_SIZE);\n"
				+ "		getContentPane().add( sp);\n" + "		resize(new Dimension(1000,800));\n";
		return str;
	}

	public ConstraintsModel getCm() {
		return this.cm;
	}

	public void setCm(final ConstraintsModel cm) {
		this.cm = cm;
	}

	public SWModel getSwm() {
		return this.swm;
	}

	public void setSwm(final SWModel swm) {
		this.swm = swm;
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		PartLog.getInstance().setLogName("Applet Writer");
		PartLog.getInstance().setEnableSourceConsoleLog(true);
		PartLog.getInstance().setEnableTargetConsoleLog(true);
		PartLog.getInstance().log("Starting to generate an applet...");
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
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
					final IFile file = (IFile) element;
					try {
						perform(file);
					}
					catch (final Exception e) {
						PartLog.getInstance().log("File " + file.getFullPath().toString()
								+ " can not be visualized. File must provide label analysis!");
					}
				}
				catch (final Exception e) {
					PartLog.getInstance().log("Error during writing Applet");
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	private void perform(final IFile file) {
		final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		UniversalHandler.getInstance().dropCache();
		UniversalHandler.getInstance().readModels(uri, false);
		this.swm = UniversalHandler.getInstance().getSwModel();
		this.cm = UniversalHandler.getInstance().getConstraintsModel();
		if (this.swm == null || this.swm.getRunnables().isEmpty()) {
			PartLog.getInstance().log("Failed: Applet generation requires valid software model.\n");
			return;
		}
		if (this.cm == null || this.cm.getRunnableSequencingConstraints().isEmpty()) {
			PartLog.getInstance().log("Failed: Applet generation requires valid constraints model.\n");
			return;
		}

		try {
			write(this.swm, this.cm, file.getRawLocation().toOSString());
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
