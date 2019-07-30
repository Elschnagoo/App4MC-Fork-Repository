/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH.
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
import java.io.IOException;
import java.io.PrintStream;
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

public class NewValidationExample {

	public static void main(String[] args) {

		// example: absolute path
		// final File inputFile = new File("d:/temp/democar.amxmi");
		// final File outputFile = new File("d:/temp/democar_1.amxmi");

		// example: relative path
		final File inputFile = new File("model-input/democar.amxmi");
		final File resultFile = new File("output/validation/validation-results.txt");
		final File infoFile = new File("output/validation/validation-profile.txt");

		// ***** Load *****

		Amalthea model = AmaltheaLoader.loadFromFile(inputFile);

		if (model == null) {
			System.out.println("Error: No model loaded!");
			return;
		}

		// ***** Prepare file streams *****

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		PrintStream infoStream = null;
		try {
			Files.createDirectories(Paths.get(infoFile.getAbsoluteFile().getParent()));
			FileOutputStream out = new FileOutputStream(infoFile.getAbsoluteFile(), false);
			infoStream = new PrintStream(out);
		} catch (IOException e) {
			e.printStackTrace();
		}

		PrintStream resultStream = null;
		try {
			Files.createDirectories(Paths.get(resultFile.getAbsoluteFile().getParent()));
			FileOutputStream out = new FileOutputStream(resultFile.getAbsoluteFile(), false);
			resultStream = new PrintStream(out);
		} catch (IOException e) {
			e.printStackTrace();
		}


		System.out.println("\nWriting file: " + infoFile.getAbsoluteFile());
		
		infoStream.println(dateFormat.format(new Date()));
		
		// ***** Show single profile resolution *****

		infoStream.println("\n\n*** Validation Profiles ***");
		
		ProfileManager man = new ProfileManager();
		
		infoStream.println();
		man.dumpProfile(AmaltheaProfile.class, infoStream);

		infoStream.println();
		man.dumpProfile(EMFProfile.class, infoStream);

		// ***** Print (complex) profile info *****

		List<Class<? extends IProfile>> profileList = new ArrayList<>(
				Arrays.asList(AmaltheaProfile.class, EMFProfile.class));
		
		infoStream.println("\n\n*** Validation info ***");

		ValidationAggregator aggregator = new ValidationAggregator();
		aggregator.addProfiles(profileList);

		infoStream.println();
		infoStream.println("Compact validation map (map1)");
		infoStream.println("-----------------------------");
		infoStream.println();
		aggregator.dumpValidationMap1(infoStream);

		infoStream.println("\n");
		infoStream.println("Expanded validation map (map2)");
		infoStream.println("------------------------------");
		infoStream.println();
		aggregator.dumpValidationMap2(infoStream);

		infoStream.close();


		// ***** Validate *****

		ValidationExecutor executor = new ValidationExecutor(profileList);
		executor.validate(model);
		List<ValidationDiagnostic> results = executor.getResults();


		// ***** Print results *****

		resultStream.println("\nValidation results (" + dateFormat.format(new Date()) + ")");

		resultStream.println("\nNumber of results: " + results.size() + "\n");
		
		System.out.println("\nWriting file: " + resultFile.getAbsoluteFile());
		
		executor.dumpResultMap(resultStream);

		resultStream.close();

		System.out.println("\ndone");
	}

}
