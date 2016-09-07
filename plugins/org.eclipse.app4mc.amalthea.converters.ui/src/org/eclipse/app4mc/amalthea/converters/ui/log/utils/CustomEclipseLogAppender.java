package org.eclipse.app4mc.amalthea.converters.ui.log.utils;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;
import org.eclipse.app4mc.amalthea.converters.ui.Activator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;

public class CustomEclipseLogAppender implements Appender {

	@Override
	public void addFilter(final Filter newFilter) {
		//
	}

	@Override
	public Filter getFilter() {
		return null;
	}

	@Override
	public void clearFilters() {
		//
	}

	@Override
	public void close() {
		//
	}

	@Override
	public void doAppend(final LoggingEvent event) {

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
	public String getName() {
		return "Model-Migration-Eclipse-Log-Appender";
	}

	@Override
	public void setErrorHandler(final ErrorHandler errorHandler) {
		//
	}

	@Override
	public ErrorHandler getErrorHandler() {
		return null;
	}

	@Override
	public void setLayout(final Layout layout) {
		//
	}

	@Override
	public Layout getLayout() {
		return null;
	}

	@Override
	public void setName(final String name) {
		//
	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

}
