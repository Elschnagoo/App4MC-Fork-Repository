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
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.ui.traceeditor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.EditorPart;

import javafx.application.Platform;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

public abstract class FXEditorPart extends EditorPart{
	
	private FXCanvas canvas;

	@Override
	public void createPartControl(Composite parent){
		Platform.setImplicitExit(false);
		this.canvas = new FXCanvas(parent, SWT.NONE);
		this.canvas.setScene(createFxScene());
	}

	protected abstract Scene createFxScene();
	
	@Override
	public void setFocus() {
		this.canvas.setFocus();
		setFxFocus();
	}

	protected abstract void setFxFocus();
}
