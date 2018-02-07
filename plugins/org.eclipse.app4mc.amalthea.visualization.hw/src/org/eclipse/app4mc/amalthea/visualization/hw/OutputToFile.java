/*******************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.visualization.hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputToFile {

	void createfile(CharSequence content, String path, String fileName) {
		try {
			System.out.println(path);

			FileWriter fileWriter = new FileWriter(path + "/" + fileName);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(content.toString());
			bufferedWriter.close();

			fileWriter.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
			// System.out.println("Error: Folder not found, refreshing the workspace may
			// help");
		}
	}
}
