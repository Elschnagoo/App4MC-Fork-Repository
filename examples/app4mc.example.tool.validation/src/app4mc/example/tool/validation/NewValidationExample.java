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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
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
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ProfileManager;
import org.eclipse.app4mc.validation.util.ValidationAggregator;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class NewValidationExample {

	public static void main(String[] args) {

		// example: absolute path
		// final File inputFile = new File("d:/temp/democar.amxmi");
		// final File outputFile = new File("d:/temp/democar_1.amxmi");

		// example: relative path
		final File inputFile = new File("model-input/democar.amxmi");
		final File resultFile = new File("model-output/validation/validation-results.txt");
		final File infoFile = new File("model-output/validation/validation-profile.txt");

		// ***** Load *****

		Amalthea model = AmaltheaLoader.loadFromFile(inputFile);

		if (model == null) {
			System.out.println("Error: No model loaded!");
			return;
		}

		// ***** Prepare file writer(s) and file stream(s) *****

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		PrintWriter printWriter1 = null;
		try {
			Files.createDirectories(Paths.get(resultFile.getAbsoluteFile().getParent()));
			FileWriter fileWriter = new FileWriter(resultFile.getAbsoluteFile(), false);
			printWriter1 = new PrintWriter(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}

		PrintStream printStream1 = null;
		try {
			Files.createDirectories(Paths.get(infoFile.getAbsoluteFile().getParent()));
			FileOutputStream fileStream = new FileOutputStream(infoFile.getAbsoluteFile(), false);
			printStream1 = new PrintStream(fileStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nWriting file: " + infoFile.getAbsoluteFile());
		
		printStream1.println(dateFormat.format(new Date()));
		
		// ***** Show single profile resolution *****

		printStream1.println("\n\n*** Validation Profiles ***");
		
		ProfileManager man = new ProfileManager();
		
		printStream1.println();
		man.dumpProfile(AmaltheaProfile.class, printStream1);

		printStream1.println();
		man.dumpProfile(EMFProfile.class, printStream1);

		// ***** Print (complex) profile info *****

		List<Class<? extends IProfile>> profileList = new ArrayList<>(
				Arrays.asList(AmaltheaProfile.class, EMFProfile.class));
		
		printStream1.println("\n\n*** Validation info ***");

		ValidationAggregator aggregator = new ValidationAggregator();
		aggregator.addProfiles(profileList);

		printStream1.println();
		printStream1.println("Compact validation map (map1)");
		printStream1.println("-----------------------------");
		printStream1.println();
		aggregator.dumpValidationMap1(printStream1);

		printStream1.println("\n");
		printStream1.println("Expanded validation map (map2)");
		printStream1.println("------------------------------");
		printStream1.println();
		aggregator.dumpValidationMap2(printStream1);

		printStream1.close();

		// ***** Validate *****

		ValidationExecutor executor = new ValidationExecutor(profileList);
		executor.validate(model, new NullProgressMonitor());
		List<ValidationDiagnostic> results = executor.getResults();

		// ***** Print results *****

		printWriter1.println("\nValidation results (" + dateFormat.format(new Date()) + ")\n");

		System.out.println("\nWriting file: " + resultFile.getAbsoluteFile());
		for (ValidationDiagnostic result : results) {
			printWriter1.println("    " + result.getValidationID() + " -- " + result.getSeverityLevel());
			printWriter1.println("    " + result.getMessage());
			printWriter1.println("    --------------------------------");
		}

		printWriter1.close();

		System.out.println("\ndone");
	}

}
