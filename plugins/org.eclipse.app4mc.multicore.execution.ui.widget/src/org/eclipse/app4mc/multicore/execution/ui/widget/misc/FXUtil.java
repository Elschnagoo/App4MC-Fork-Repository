/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
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

package org.eclipse.app4mc.multicore.execution.ui.widget.misc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import javafx.application.Platform;

public class FXUtil {
	public static void runLaterWait(Runnable r) throws InterruptedException, ExecutionException{
		if(Platform.isFxApplicationThread()){
			r.run();
		}else{
			final FutureTask<Object> query = new FutureTask<>(new Callable<Object>() {
			    @Override
			    public Object call() throws Exception {
			        r.run();
			        return null;
			    }
			});
			Platform.runLater(query);
			query.get();
		}
	}
	
}
