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
package org.eclipse.app4mc.multicore.execution.logic.btf;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEntityType;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEvent;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfTrace;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;

public class BtfTraceParser {

	private File file;

	private RandomAccessFile fileInput;

	private BtfTrace trace;

	/** Holds the file position from last line to go one line back. */
	long filePosBefore = 0;

	/** Counts the number of lines in the file */
	long lineCount = 0;

	public BtfTraceParser(File file) {
		this.file = file;
	}

	public void parseTrace() throws BtfException {
		lineCount = 0;
		filePosBefore = 0;
		trace = new BtfTrace();
		trace.setName(file.getName());
		try {
			fileInput = new RandomAccessFile(file, "r");
			parseHeader();
			parseBody();
		} catch (FileNotFoundException e) {
			throw new BtfException(e.getMessage());
		}
	}

	private String readLine() throws IOException {
		lineCount++;
		filePosBefore = fileInput.getFilePointer();
		return fileInput.readLine();
	}

	private void lineBack() throws IOException {
		if (lineCount > 0) {
			fileInput.seek(filePosBefore);
			lineCount--;
		}
	}

	private void parseHeader() throws BtfException {

		String line;

		try {
			while (true) {
				line = readLine();
				if (line == null) {
					// end of file while header
					throw new BtfException("Trace do not contain data!");
				}
				if (line.charAt(0) != '#') {
					// end of header
					lineBack(); // one line back
					break;
				}

				if (line.startsWith("#timeScale")) {
					String[] data = line.split(" ");
					if (data.length != 2) {
						throw new BtfException("#timeScale not well formed!");
					}
					EMTimeType tt = EMTimeType.valueOf(data[1].toUpperCase());
					if (tt == null) {
						throw new BtfException("#timeScale not well formed!");
					}
					trace.setTimeScale(tt);
				} else if (line.startsWith("#entityTypeTable")) {
					parseEntityTypeTable();
				}
				// TODO extract more header data

			}
		} catch (IOException e) {
			throw new BtfException(e.getMessage());
		}
	}

	private void parseEntityTypeTable() throws IOException, BtfException {
		String line = readLine();
		while (line.startsWith("#-")) {
			String[] data = line.split(" ");
			if (data.length != 2) {
				throw new BtfException("Entity type line not valid: " + line + " line-number: " + lineCount);
			}
			String type = data[0].substring(2); // cutoff #-
			BtfEntityType t = BtfEntityType.byTypeID(type.toUpperCase());
			if(t==null){
				throw new BtfException(type + " (line " + lineCount +") is no valid btf type!" );
			}
			trace.getEntityTypeTable().put(data[1], t);
			line = readLine();
		}
		lineBack();
	}

	private void parseBody() throws BtfException {
		String line;
		try {
			while (true) {
				line = readLine();
				if (line == null) {
					// end of file
					return;
				}
				parseEventLine(lineCount, line);
			}
		} catch (IOException e) {
			throw new BtfException(e.getMessage());
		}
	}

	private void parseEventLine(long lineNum, String line) throws BtfException {
		String[] data = line.split(",");

		if (data.length != 7 && data.length != 8) {
			throw new BtfException("Miss formed line: " + line);
		}

		BtfEvent e = new BtfEvent();
		try {
			e.setLineNum(lineNum);
			e.setTime(Long.parseLong(data[0]));
			e.setSource(data[1]);
			e.setSourceInstance(Integer.parseInt(data[2]));
			BtfEntityType et = BtfEntityType.byTypeID(data[3].toUpperCase());
			e.setTargetType(et);
			e.setTarget(data[4]);
			e.setTargetInstance(Integer.parseInt(data[5]));
			e.setEvent(data[6]);
			if (data.length == 8) {
				// optional notice
				e.setNote(data[7]);
			}
			trace.getEvents().add(e);
		} catch (Exception ex) {
			throw new BtfException(ex.getMessage());
		}
	}

	public BtfTrace getTrace() {
		return trace;
	}

}
