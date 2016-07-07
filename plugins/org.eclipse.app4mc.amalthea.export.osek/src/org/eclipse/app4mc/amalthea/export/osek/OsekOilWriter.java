package org.eclipse.app4mc.amalthea.export.osek;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.app4mc.amalthea.export.osek.handlers.SchedulerToCoreMap;
import org.eclipse.app4mc.amalthea.model.Task;
//import org.eclipse.app4mc.amalthea.model.ProcessAllocation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

public class OsekOilWriter {

	FileReader oil = null;
	FileOutputStream outputFileStream = null;

	public boolean generateOutputOil(final EList<Task> osekTasks, final EList<TaskAllocation> taskAllocList,
			final SchedulerToCoreMap coreAlloc, final URI fileDir) throws IOException {

		final String oilFileName = fileDir.toFileString() + "\\06_Target\\conf.oil";

		final File theFile = new File(fileDir.toFileString() + "\\06_Target");
		theFile.mkdirs();

		String ausgabe = "";
		String coreID = "";
		BufferedReader brOil = null;

		try {
			this.oil = new FileReader(fileDir.toFileString() + "\\.templates\\confTemplate.oil");
			this.outputFileStream = new FileOutputStream(oilFileName);
			brOil = new BufferedReader(this.oil);

			System.out.println("Writing oil to location: " + oilFileName);
			String oilZeile = "";

			while ((oilZeile = brOil.readLine()) != null) {
				if (oilZeile.toString().equals("%%")) {

					final Iterator<TaskAllocation> bodyExeAllocIter = taskAllocList.iterator();

					while (bodyExeAllocIter.hasNext()) {
						final TaskAllocation currentExeAlloc = bodyExeAllocIter.next();
						final Task taskAlloc = currentExeAlloc.getTask();

						if (coreAlloc.isSchedulerMappedToCore(currentExeAlloc.getScheduler(), "e200z0")) {
							coreID = "slave";
						}
						else if (coreAlloc.isSchedulerMappedToCore(currentExeAlloc.getScheduler(), "e200z6")) {
							coreID = "master";
						}

						ausgabe = ausgabe.concat("	TASK " + taskAlloc.getName().toString() + " {\n");
						ausgabe = ausgabe.concat("		CPU_ID = \"" + coreID + "\";\n");
						ausgabe = ausgabe
								.concat("		PRIORITY = " + Integer.toString(taskAlloc.getPriority()) + ";\n");
						ausgabe = ausgabe.concat("		AUTOSTART = FALSE;\n");
						ausgabe = ausgabe.concat("		STACK = SHARED;\n");
						ausgabe = ausgabe.concat("		ACTIVATION = 1;\n");
						ausgabe = ausgabe.concat("		SCHEDULE = FULL;\n");
						ausgabe = ausgabe.concat("	};\n");

					}

				}
				else {
					ausgabe = ausgabe.concat(oilZeile + "\n");
				}
			}
			/*-----------------------------File Writer---------------------------------------------*/
			for (int j = 0; j < ausgabe.length(); j++) {
				this.outputFileStream.write((byte) ausgabe.charAt(j));
			}
			System.out.println("config.oil generation successful!" + "\n");
			return false;
		}
		catch (final FileNotFoundException e) {
			System.out.println("ERROR, oil template file not found!\n");
			return true;
		}
		finally {
			close(this.oil);
			close(this.outputFileStream);
			close(brOil);
		}
	}

	private static void close(final Closeable closable) {
		if (closable != null) {
			try {
				closable.close();
			}
			catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}
}
