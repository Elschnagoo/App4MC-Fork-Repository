/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;

public class OutputPathParser {
	/**
	 * Default output
	 */
	public final static String DEFAULT_OUTPUT = "0";
	/**
	 * Relative output directory
	 */
	public final static String RELATIVE_OUTPUT = "1";
	/**
	 * Absolute output directory
	 */
	public final static String ABSOLUTE_OUTPUT = "2";
	/**
	 * Radio preference name 
	 */
	private String radioPreferenceName;
	/**
	 * Path string preference name
	 */
	private String pathPreferenceName;
	/**
	 * Preferences store
	 */
	private IPreferenceStore store;

	/**
	 * Constructor 
	 * @param name name of the console
	 */
	public OutputPathParser(String radioPreferenceName, 
			String pathPreferenceName, 
			IPreferenceStore store) {
		this.radioPreferenceName = radioPreferenceName;
		this.pathPreferenceName = pathPreferenceName;
		this.store = store;
		
	}

	/**
	 * Parse the output directory
	 * @param projectPath project path
	 * @return output directory
	 */
	public String parseOutputDirectory(String projectPath) {
		final String radioOutputDirectory = store.getString(radioPreferenceName);
		final String sOutputDirectory = store.getString(pathPreferenceName);


		switch (radioOutputDirectory) {
		case DEFAULT_OUTPUT:
			return projectPath + "/" + store.getDefaultString(pathPreferenceName) + "/";
		case RELATIVE_OUTPUT:
			return projectPath + "/" + sOutputDirectory + "/";
		case ABSOLUTE_OUTPUT:
			return sOutputDirectory + "/";
		default:
			return projectPath + "/";
		}
	}
	
	/**
	 * Parse the output directory in a generic format using {ProjectRoot} as placeholder
	 * @return output directory
	 */
	public String parseOutputDirectoryGeneric() {
		return parseOutputDirectory("{ProjectRoot}");
	}
	
	/**
	 * Parse output file URI based on preferences stored
	 * @param sorceFile original model file
	 * @param append string to append at the end of the file
	 * @return URI of the output file
	 */
	public URI parseOutputFileURI(IFile sorceFile, String append) {
		final String projectPath =  sorceFile.getProject().getFullPath().toString();
		final String radioOutputDirectory = store.getString(radioPreferenceName);
		final String newFileName = sorceFile.getName().replace(".amxmi", append+ ".amxmi");

		switch (radioOutputDirectory) {
		case DEFAULT_OUTPUT:
		case RELATIVE_OUTPUT:
			return URI.createPlatformResourceURI(parseOutputDirectory(projectPath) + newFileName, true);
		case ABSOLUTE_OUTPUT:
			return URI.createFileURI(parseOutputDirectory(projectPath) + newFileName);
		default:
			return URI.createFileURI(parseOutputDirectory(projectPath) + newFileName);
		}
	}

}
