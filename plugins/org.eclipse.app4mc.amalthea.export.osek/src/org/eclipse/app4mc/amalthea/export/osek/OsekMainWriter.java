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
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Task;
//import org.eclipse.app4mc.amalthea.model.ProcessAllocation;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

public class OsekMainWriter {

	private FileReader main = null;
	private BufferedReader brMain = null;
	private FileOutputStream mainStream = null;

	public boolean generateOutputMain(final String filename, final EList<Task> osekTasks,
			final EList<TaskAllocation> taskAllocList, final SchedulerToCoreMap coreAlloc, final URI fileDir)
			throws IOException {

		String ausgabe = "";

		final String mainFileName = fileDir.toFileString() + "\\06_Target\\" + filename + ".c";

		final File theFile = new File(fileDir.toFileString() + "\\06_Target");
		theFile.mkdirs();

		try {
			this.main = new FileReader(fileDir.toFileString() + "\\.templates\\template.c");

			this.brMain = new BufferedReader(this.main);
			// this.mainStream = new FileOutputStream(fileDir.toFileString() +
			// "\\target\\" + filename + ".c");
			this.mainStream = new FileOutputStream(mainFileName);

			String mainZeile = "";
			String coreID = "";

			if (filename.toString() == "master") {
				coreID = "e200z6";
			}
			else {
				coreID = "e200z0";
			}

			System.out.println("Writing " + filename + ".c to location: " + fileDir.toFileString() + "\\06_Target\\");

			while ((mainZeile = this.brMain.readLine()) != null) {
				if (mainZeile.toString().equals("%%")) {

					final Iterator<TaskAllocation> declareExeAllocIter = taskAllocList.iterator();

					while (declareExeAllocIter.hasNext()) {
						final TaskAllocation currentExeAlloc = declareExeAllocIter.next();
						if (coreAlloc.isSchedulerMappedToCore(currentExeAlloc.getScheduler(), coreID)) {
							final Task taskAlloc = currentExeAlloc.getTask();
							ausgabe = ausgabe.concat("DeclareTask(" + taskAlloc.getName().toString() + ");\n");
						}
					}

					final Iterator<TaskAllocation> bodyExeAllocIter = taskAllocList.iterator();

					while (bodyExeAllocIter.hasNext()) {
						final TaskAllocation currentExeAlloc = bodyExeAllocIter.next();
						if (coreAlloc.isSchedulerMappedToCore(currentExeAlloc.getScheduler(), coreID)) {
							final Task taskAlloc = currentExeAlloc.getTask();
							ausgabe = ausgabe.concat("\nTASK(" + taskAlloc.getName() + ")\n{\n");
							final EList<GraphEntryBase> callGraphEntries = taskAlloc.getCallGraph().getGraphEntries();
							final Iterator<GraphEntryBase> entrieIter = callGraphEntries.iterator();
							while (entrieIter.hasNext()) {
								final GraphEntryBase singleGraphEntrie = entrieIter.next();
								final CallSequence taskCallSequence = (CallSequence) singleGraphEntrie;
								final EList<CallSequenceItem> callSequenceItem = taskCallSequence.getCalls();
								final Iterator<CallSequenceItem> callSequenceItemIterator = callSequenceItem.iterator();
								while (callSequenceItemIterator.hasNext()) {
									final CallSequenceItem runnableCall = callSequenceItemIterator.next();
									final TaskRunnableCall runnableAtThisTask = (TaskRunnableCall) runnableCall;
									ausgabe = ausgabe
											.concat("	" + runnableAtThisTask.getRunnable().getName() + "();\n");
								}
							}
							ausgabe = ausgabe.concat("\n	TerminateTask();\n}");
						}
					}
					ausgabe = ausgabe.concat("\n");
					ausgabe = ausgabe.concat("static void fixed_step_interrupt(void)\n{\n");

					final Iterator<TaskAllocation> activeExeAllocIter = taskAllocList.iterator();

					while (activeExeAllocIter.hasNext()) {
						final TaskAllocation currentExeAlloc = activeExeAllocIter.next();
						if (coreAlloc.isSchedulerMappedToCore(currentExeAlloc.getScheduler(), coreID)) {
							final Task taskAlloc = currentExeAlloc.getTask();
							ausgabe = ausgabe.concat("	ActivateTask(" + taskAlloc.getName() + ");\n");
						}
					}
					ausgabe = ausgabe.concat("\n	PIT.TFLG3.R = 0x00000001;\n}");
				}
				else if (mainZeile.toString().equals("%ISR")) {
					if (filename.toString().equals("master")) {
						ausgabe = ausgabe.concat("	InitSystemClock(FSYS_100MHz);\n\n");
						ausgabe = ausgabe.concat("	EE_mpc5668_start_z0((void (*)(void))0x40020000);\n\n");
						ausgabe = ausgabe.concat("	EE_e200z7_register_ISR(" + 168 + ", fixed_step_interrupt, 2);\n");
						ausgabe = ausgabe.concat("	/* Set up the PIT (Extern Interrupt Request) with the\n");
						ausgabe = ausgabe.concat("	 * COMPARE_VALUE, defined above */\n");
						ausgabe = ausgabe.concat("	InitPIT4(COMPARE_VALUE);");
					}
					else if (filename.toString().equals("slave")) {
						ausgabe = ausgabe.concat("	EE_e200z7_register_ISR(" + 167 + ", fixed_step_interrupt, 2);\n");
						ausgabe = ausgabe.concat("	/* Set up the PIT (Extern Interrupt Request) with the\n");
						ausgabe = ausgabe.concat("	 * COMPARE_VALUE, defined above */\n");
						ausgabe = ausgabe.concat("	InitPIT3(COMPARE_VALUE);");
					}
				}
				else {
					ausgabe = ausgabe.concat(mainZeile + "\n");
				}
			}
			/* File Writer */
			for (int j = 0; j < ausgabe.length(); j++) {
				this.mainStream.write((byte) ausgabe.charAt(j));
			}
			System.out.println(filename + " generation successful!" + "\n");
			return false;
		}
		catch (final FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("ERROR, template file not found!\n");
			return true;
		}
		finally {
			close(this.mainStream);
			close(this.main);
			close(this.brMain);
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
