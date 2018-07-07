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

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.tracing;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSchedulerTracer extends PrintStreamSchedulerTracer{

	String stringPath;
	String stringFile;
	
	public FileSchedulerTracer(String stringPath,String stringFile) {
		super(stringFile);
		this.stringFile=stringFile;
		this.stringPath=stringPath;
	}
	
	public void init() throws IOException{
		Path dir = FileSystems.getDefault().getPath(stringPath);
		Files.createDirectories(dir);
		Path path = FileSystems.getDefault().getPath(stringPath,stringFile);
		setPtrintStream(new PrintStream(Files.newOutputStream(path)));
	}

}
