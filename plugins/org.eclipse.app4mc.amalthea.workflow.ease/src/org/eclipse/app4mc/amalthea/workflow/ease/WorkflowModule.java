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

package org.eclipse.app4mc.amalthea.workflow.ease;

import java.util.Enumeration;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.app4mc.amalthea.workflow.ease.logging.ConsoleAppender;
import org.eclipse.ease.modules.AbstractScriptModule;
import org.eclipse.ease.modules.WrapToScript;

/**
 * Basic workflow module helpers for AMALTHEA.
 *
 */
public class WorkflowModule extends AbstractScriptModule {

	public WorkflowModule() {

	}

	/**
	 * Adds a Log4J logger to the output of the current used output of the EASE script engine.
	 * 
	 * @param loggerName
	 *            {@link String} to be added
	 */
	@WrapToScript
	public void addLoggerToConsole(String loggerName) {
		addLoggerToConsole(loggerName, "%d{ISO8601} %-5p [%c]: %m%n");
	}

	/**
	 * Adds a Log4J logger to the output of the current used output of the EASE script engine.
	 * 
	 * @param loggerName
	 *            loggerName {@link String} to be added
	 * @param pattern
	 *            {@link String} to be used, see {@link PatternLayout} for more details
	 */
	@WrapToScript
	public void addLoggerToConsole(String loggerName, String pattern) {
		Logger rootLogger = Logger.getRootLogger();
		Logger logger = rootLogger.getLoggerRepository().getLogger(loggerName);
		@SuppressWarnings("unchecked")
		Enumeration<Appender> elemAppender = logger.getAllAppenders();
		boolean hasConsoleAppender = false;
		while (elemAppender.hasMoreElements()) {
			Appender appender = elemAppender.nextElement();
			if (appender instanceof ConsoleAppender) {
				hasConsoleAppender = true;
			}
		}
		if (!hasConsoleAppender) {
			Layout layout = new PatternLayout(pattern);
			ConsoleAppender consoleAppender = new ConsoleAppender(layout, getScriptEngine().getOutputStream());
			logger.addAppender(consoleAppender);
			logger.setLevel(Level.INFO);
		}
	}

	/**
	 * Basic finish actions to be performed:
	 * <ul>
	 * <li> Removes all previous configured logger appenders for the current EASE console </li>
	 * </ul>
	 */
	@WrapToScript
	public void endWorkflow() {
		removeConsoleAppenders();
	}

	private void removeConsoleAppenders() {
		@SuppressWarnings("unchecked")
		Enumeration<Logger> elementLogger = LogManager.getCurrentLoggers();
		while (elementLogger.hasMoreElements()) {
			Logger logger = elementLogger.nextElement();
			@SuppressWarnings("unchecked")
			Enumeration<Appender> elemAppender = logger.getAllAppenders();
			while (elemAppender.hasMoreElements()) {
				Appender appender = elemAppender.nextElement();
				if (appender instanceof ConsoleAppender) {
					logger.removeAppender(appender);
				}
			}
		}
	}

}
