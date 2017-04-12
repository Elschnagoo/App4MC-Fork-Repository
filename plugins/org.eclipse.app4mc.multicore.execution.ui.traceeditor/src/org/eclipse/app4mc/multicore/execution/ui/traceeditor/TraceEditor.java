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
package org.eclipse.app4mc.multicore.execution.ui.traceeditor;

import org.eclipse.app4mc.multicore.execution.logic.btf.BtfComputer;
import org.eclipse.app4mc.multicore.execution.logic.btf.BtfException;
import org.eclipse.app4mc.multicore.execution.logic.btf.BtfTraceParser;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfTrace;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.EMTraceWidget;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;

public class TraceEditor extends FXEditorPart {

	private IEditorInput input;

	private EMTraceWidget tw;

//	private BtfTrace trace;

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		this.input = input;
		setInput(input);
		setPartName("computing...");

		// IFile file = ResourceUtil.getFile(input);
		//
		// if (file!=null) {
		// System.out.println("Editor file: "+ file.getName());
		// } else {
		// System.out.println("Editor file not found");
		// }
	}

	private BtfTrace manageParsing() {
//		handleWarning("Starting Parse", "Start parsing file!");
		if (!(input instanceof IFileEditorInput)) {
			handleWarning("BTF-Parsing", "No file input for TraceEditor!");
			return null;
		}
		System.out.println("Is FileEditorInput");
		IFileEditorInput fei = (IFileEditorInput) input;
		System.out.println("File: " + fei.getFile().getName());

		IFile file = fei.getFile();
		IPath location = file.getLocation();
		if (location == null) {
			handleWarning("BTF-Parsing", "File location not found!");
			return null;
		}
		BtfTraceParser parser = new BtfTraceParser(location.toFile());

		try {
			parser.parseTrace();
		} catch (BtfException e) {
			handleWarning("BTF-Parsing", "Error while parsing! \n" + e.getMessage());
			e.printStackTrace();
		}
		setPartName(file.getName());
		return parser.getTrace();
	}

	@Override
	protected Scene createFxScene() {
		this.tw = new EMTraceWidget();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				final BtfTrace trace = manageParsing();
				
				ExecutionModel m = new ExecutionModel();
				
				BtfComputer com = new BtfComputer(trace,m);
				try {
					com.compute();
					tw.addExecutionModel(m);
				} catch (BtfException e) {
					handleWarning("Malformed BTF-Trace",e.getMessage());
				}
			}
		}).start();
		ScrollPane pane = new ScrollPane();

		pane.setContent(tw);
		// pane.setContent(new Button("TEST"));
		pane.setFitToWidth(true);
		return new Scene(pane);
	}

	private void handleWarning(String title, String msg) {
		System.err.println(title + ": " + msg);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openWarning(getSite().getShell(), title, msg);
			}
		});
		
	}

	@Override
	protected void setFxFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
