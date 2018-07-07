/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
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
