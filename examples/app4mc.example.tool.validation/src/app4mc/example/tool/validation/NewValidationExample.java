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
 ********************************************************************************
 */

package app4mc.example.tool.validation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader;
import org.eclipse.app4mc.amalthea.validations.AmaltheaProfile;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class NewValidationExample {

	public static void main(String[] args) {

		// example: absolute path
		// final File inputFile = new File("d:/temp/democar.amxmi");
		// final File outputFile = new File("d:/temp/democar_1.amxmi");

		// example: relative path
		final File inputFile = new File("model-input/democar.amxmi");
		final File outputFile = new File("model-output/validation/issues.txt");

		// ***** Load *****

		Amalthea model = AmaltheaLoader.loadFromFile(inputFile);

		if (model == null) {
			System.out.println("Error: No model loaded!");
			return;
		}


		// ***** Validate *****

		List<Class<? extends IProfile>> profileList = new ArrayList<>(
				Arrays.asList(AmaltheaProfile.class, EMFProfile.class));

		ValidationExecutor executor = new ValidationExecutor(profileList);

		List<Result> results = executor.validate(model, new NullProgressMonitor());


		// ***** Print results *****

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		PrintWriter printWriter = null;
		try {
			Files.createDirectories(Paths.get(outputFile.getAbsoluteFile().getParent()));
			FileWriter fileWriter = new FileWriter(outputFile.getAbsoluteFile(), false);
			printWriter = new PrintWriter(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}

		printWriter.println("\nValidation results (" + dateFormat.format(new Date()) + ")\n\n");

		System.out.println("Writing file: " + outputFile.getAbsoluteFile());
		for (Result result : results) {
			printWriter.println("    " + result.getMessageId() + " -- " + result.getSeverityLevel());
			printWriter.println("    " + result.getMessage());
			printWriter.println("    --------------------------------");
		}

		printWriter.close();

		System.out.println("done");
	}

}
