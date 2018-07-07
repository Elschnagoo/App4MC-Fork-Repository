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

package org.eclipse.app4mc.multicore.execution.ui.traceview.view;


import java.util.concurrent.ExecutionException;

import org.eclipse.app4mc.multicore.execution.ui.widget.misc.FXUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import javafx.scene.Scene;
import javafx.embed.swt.FXCanvas;
import javafx.application.*;


public abstract class FXViewPart extends ViewPart {

	private FXCanvas view;
	

	@Override
	public void createPartControl(Composite parent) {
		Platform.setImplicitExit(false); // bug-solution: if the view is opened the second time it will not be shown
		view = new FXCanvas(parent, SWT.NONE);
		try {
			FXUtil.runLaterWait(new Runnable() {
				@Override
				public void run() {
					view.setScene(createFxScene());
					view.update();
				}
			});
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
	}

	protected abstract Scene createFxScene();

	@Override
	public void setFocus() {
		this.view.setFocus();
		setFxFocus();
	}

	protected abstract void setFxFocus();

}
