package org.eclipse.app4mc.amalthea.converters.ui.log.utils;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;
import org.eclipse.app4mc.amalthea.converters.ui.Activator;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;

public class CustomEclipseLogAppender implements Appender{

	@Override
	public void addFilter(Filter newFilter) {
	}

	@Override
	public Filter getFilter() {
		return null;
	}

	@Override
	public void clearFilters() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void doAppend(LoggingEvent event) {
	 
		Object messageObject = event.getMessage();
		
		ThrowableInformation throwableInformation = event.getThrowableInformation();

		int status = getStatus(event);
		
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				if(throwableInformation!=null){
					Activator.getDefault().getLog().log(new Status(status, Activator.PLUGIN_ID,messageObject!=null ? messageObject.toString():"", throwableInformation.getThrowable() ));
				}else{
					Activator.getDefault().getLog().log(new Status(status, Activator.PLUGIN_ID,messageObject!=null ? messageObject.toString():"" ));
				}
				
			}
		});
		
	}

	private int getStatus(LoggingEvent event) {
		Level level = event.getLevel();
		
		int status=Status.INFO;
		
		if(level == Level.ERROR){
			status=Status.ERROR;
		}else if(level == Level.INFO){
			status=Status.INFO;
		}else if(level == Level.WARN){
			status=Status.WARNING;
		}else if(level == Level.FATAL){
			status=Status.ERROR;
		}
		return status;
	}

	@Override
	public String getName() {
		return "Model-Migration-Eclipse-Log-Appender";
	}

	@Override
	public void setErrorHandler(ErrorHandler errorHandler) {
		
	}

	@Override
	public ErrorHandler getErrorHandler() {
		return null;
	}

	@Override
	public void setLayout(Layout layout) {
		
	}

	@Override
	public Layout getLayout() {
		return null;
	}

	@Override
	public void setName(String name) {
		
	}

	@Override
	public boolean requiresLayout() {
		return false;
	}

}
