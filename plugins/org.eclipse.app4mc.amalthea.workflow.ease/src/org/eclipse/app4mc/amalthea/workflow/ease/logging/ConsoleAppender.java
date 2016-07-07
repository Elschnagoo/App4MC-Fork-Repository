/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.workflow.ease.logging;

import java.io.OutputStream;

import org.apache.log4j.Layout;
import org.apache.log4j.WriterAppender;

/**
 * Basic marker class to stream logging of Log4J to a dedicated {@link OutputStream}.
 *
 */
public class ConsoleAppender extends WriterAppender {

	/**
	 * Initialize with a {@link Layout} to use and the {@link OutputStream} to use for the output.
	 * 
	 * @param layout
	 * @param os
	 */
	public ConsoleAppender(Layout layout, OutputStream os) {
		super(layout, os);
	}
}
