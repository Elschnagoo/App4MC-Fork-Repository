/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters.ui.log.utils;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;
import org.eclipse.app4mc.amalthea.converters.ui.Activator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;

public class CustomEclipseLogAppender extends AppenderSkeleton {


	private int getStatus(final LoggingEvent event) {
		final Level level = event.getLevel();

		int status = IStatus.INFO;

		if (level == Level.ERROR) {
			status = IStatus.ERROR;
		}
		else if (level == Level.INFO) {
			status = IStatus.INFO;
		}
		else if (level == Level.WARN) {
			status = IStatus.WARNING;
		}
		else if (level == Level.FATAL) {
			status = IStatus.ERROR;
		}
		return status;
	}


	@Override
	protected void append(final LoggingEvent event) {


		final Object messageObject = event.getMessage();

		final ThrowableInformation throwableInformation = event.getThrowableInformation();

		final int status = getStatus(event);

		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				if (throwableInformation != null) {
					Activator.getDefault().getLog()
							.log(new Status(status, Activator.PLUGIN_ID,
									messageObject != null ? messageObject.toString() : "",
									throwableInformation.getThrowable()));
				}
				else {
					Activator.getDefault().getLog().log(new Status(status, Activator.PLUGIN_ID,
							messageObject != null ? messageObject.toString() : ""));
				}

			}
		});


	}


	@Override
	public void close() {
		// TODO mez2rng Auto-generated method stub

	}


	@Override
	public boolean requiresLayout() {
		// TODO mez2rng Auto-generated method stub
		return false;
	}

}
