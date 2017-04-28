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
package org.eclipse.app4mc.multicore.execution.ui.traceview;

import org.eclipse.app4mc.multicore.execution.ui.traceview.view.IEMTraceWidgetProvider;
import org.eclipse.app4mc.multicore.execution.ui.traceview.view.ITraceWidgetProvider;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.IEMTraceWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.ITraceWidget;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class TraceViewUtil {
	
	/**
	 * Show up ME Trace-View. This have to be called from ui-thread.
	 * @return
	 */
	public static IEMTraceWidget showEMTraceView() {
		IViewPart p = getTraceViewPart();
		
		if(p!= null && p instanceof IEMTraceWidgetProvider){
			return ((IEMTraceWidgetProvider) p).getEMTraceWidget();
		}else{
			return null;
		}
	}
	
	public static ITraceWidget showTraceView() {
		IViewPart p = getTraceViewPart();
		
		if(p!= null && p instanceof ITraceWidgetProvider){
			return ((ITraceWidgetProvider) p).getTraceWidget();
		}else{
			return null;
		}
	}
	
	public static IViewPart getTraceViewPart() {
		try {
			IWorkbenchWindow wwin = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if(wwin==null){
				return null; //non ui
			}
			IViewPart p = wwin.getActivePage()
					.showView("org.eclipse.app4mc.multicore.execution.ui.widget.traceview.views.FXViewPartTraceView");
			return p;
		} catch (PartInitException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
