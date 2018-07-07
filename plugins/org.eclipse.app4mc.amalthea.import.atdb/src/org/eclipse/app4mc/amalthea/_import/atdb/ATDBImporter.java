/**
 ********************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea._import.atdb;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.app4mc.amalthea._import.atdb.model.Isr;
import org.eclipse.app4mc.amalthea._import.atdb.model.Model;
import org.eclipse.app4mc.amalthea._import.atdb.model.Runnable;
import org.eclipse.app4mc.amalthea._import.atdb.model.Signal;
import org.eclipse.app4mc.amalthea._import.atdb.model.Stimulus;
import org.eclipse.app4mc.amalthea._import.atdb.model.Task;
import org.eclipse.core.runtime.IProgressMonitor;

public class ATDBImporter implements IImporter {

	private String filePath = null;
	private Connection traceDbConnection;
	private int timeBase = 0;

	public ATDBImporter(final String filePath) {
		this.filePath = filePath;
	}

	@Override
	public Model run(final IProgressMonitor progressMonitor) {
		final Model model = new Model();

		progressMonitor.beginTask("Importing AMALTHEA database...", 100);
		final File databaseFile = new File(this.filePath);
		// connect to database
		try {
			connectToDatabase(databaseFile);

			// general
			determineTimeUnit();

			// elements
			final List<Task> tasks = determineTasks();
			final List<Isr> isrs = determineISRs();
			final List<Runnable> runnables = determineRunnables();
			final List<Signal> signals = determineSignals();
			final List<Stimulus> stimuli = determineStimuli();

			// set elements
			model.setTasks(tasks);
			model.setIsrs(isrs);
			model.setRunnables(runnables);
			model.setSignals(signals);
			model.setStimuli(stimuli);

			closeDatabaseConnection();
		}
		catch (final Exception e) {
			e.printStackTrace();
		}

		progressMonitor.done();

		return model;
	}

	private void determineTimeUnit() throws SQLException {
		// determine time unit
		final String selection = "SELECT Value FROM MetaInformation WHERE Name LIKE 'time_base'";
		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(selection)) {

			while (resultSet.next()) {
				final String value = resultSet.getString("Value");
				switch (value.toLowerCase()) {
				case "ps":
					this.timeBase = 0;
					break;
				case "ns":
					this.timeBase = 1;
					break;
				case "us":
					this.timeBase = 2;
					break;
				case "ms":
					this.timeBase = 3;
					break;
				case "s":
					this.timeBase = 4;
					break;
				}
			}
		}
	}

	public void connectToDatabase(final File databaseFile) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC"); //$NON-NLS-1$
		String connectionStr = "jdbc:sqlite:"; //$NON-NLS-1$
		connectionStr += databaseFile.toString();
		final Properties properties = new Properties();
		properties.put("open_mode", "1"); //$NON-NLS-1$ //$NON-NLS-2$
		this.traceDbConnection = DriverManager.getConnection(connectionStr, properties);
	}

	public void closeDatabaseConnection() throws SQLException {
		this.traceDbConnection.close();
	}

	public List<Task> determineTasks() throws SQLException {
		final List<Task> result = new ArrayList<>();

		final Map<Task, String> map = new HashMap<Task, String>();
		final String selection = "SELECT a.Name, a.EventTableName FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'task'"; //$NON-NLS-1$

		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(selection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name");
				final String table = resultSet.getString("EventTableName");
				final Task task = new Task(name);
				map.put(task, table);
			}
		}

		// map task activations
		final Map<String, Task> tasks = new HashMap<String, Task>();
		for (final Task task : map.keySet()) {
			determineTaskActivations(task, map.get(task));
			tasks.put(task.getName(), task);
		}
		// find runnable calls within task
		determineTaskRunnableCalls(tasks);

		result.addAll(map.keySet());

		return result;
	}

	private void determineTaskRunnableCalls(final Map<String, Task> tasks) throws SQLException {

		final Map<String, String> runnables = new HashMap<String, String>();
		String selection = "SELECT a.Name, a.EventTableName FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'runnable'"; //$NON-NLS-1$
		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(selection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name"); //$NON-NLS-1$
				final String table = resultSet.getString("EventTableName");
				runnables.put(name, table);
			}
		}

		for (final String runnable : runnables.keySet()) {
			selection = "SELECT c.Name FROM '" + runnables.get(runnable) //$NON-NLS-1$
					+ "' AS a JOIN EventType AS b JOIN Entity AS c ON a.EventTypeId = b.Id AND a.SourceEntityId = c.Id WHERE b.Name Like 'start'";
			try (final Statement stmt = this.traceDbConnection.createStatement();
					final ResultSet resultSet = stmt.executeQuery(selection)) {

				while (resultSet.next()) {
					final String source = resultSet.getString("Name");
					tasks.get(source).addRunnableCall(runnable);
				}
			}
		}
	}

	public void determineTaskActivations(final Task task, final String table) throws SQLException {
		final String selection = "SELECT c.Name, a.SourceEntityInstanceId FROM '" + table
				+ "' AS a JOIN EventType AS b JOIN Entity AS c ON a.EventTypeId = b.Id AND a.SourceEntityId = c.Id WHERE b.Name Like 'activate'";
		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(selection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name");
				final long sourceEntityInstanceId = resultSet.getLong("SourceEntityInstanceId");
				task.addStimulus(name + "_" + sourceEntityInstanceId);
			}
		}
	}

	public List<Isr> determineISRs() throws SQLException {
		final List<Isr> result = new ArrayList<>();

		final String processSelection = "SELECT a.Name FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'isr'"; //$NON-NLS-1$
		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(processSelection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name"); //$NON-NLS-1$
				final Isr isr = new Isr(name);
				result.add(isr);
			}
		}

		return result;
	}

	public List<Runnable> determineRunnables() throws SQLException {
		final List<Runnable> result = new ArrayList<>();

		final String processSelection = "SELECT a.Name FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'runnable'"; //$NON-NLS-1$
		try (final Statement statement = this.traceDbConnection.createStatement();
				final ResultSet resultSet = statement.executeQuery(processSelection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name"); //$NON-NLS-1$
				final Runnable runnable = new Runnable(name);
				result.add(runnable);
			}
		}

		return result;
	}

	public List<Signal> determineSignals() throws SQLException {
		final List<Signal> result = new ArrayList<>();

		final String processSelection = "SELECT a.Name FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'signal'"; //$NON-NLS-1$
		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(processSelection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name"); //$NON-NLS-1$
				final Signal signal = new Signal(name);
				result.add(signal);
			}
		}

		return result;
	}

	public List<Stimulus> determineStimuli() throws SQLException {
		final List<Stimulus> result = new ArrayList<>();

		final Map<String, String> map = new HashMap<String, String>();
		String selection = "SELECT a.Name, a.EventTableName FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'stimulus'"; //$NON-NLS-1$
		try (final Statement stmt = this.traceDbConnection.createStatement();
				final ResultSet resultSet = stmt.executeQuery(selection)) {

			while (resultSet.next()) {
				final String name = resultSet.getString("Name");
				final String table = resultSet.getString("EventTableName");
				map.put(name, table);
			}
		}

		for (final String name : map.keySet()) {
			selection = "SELECT TimeStamp, EntityInstanceId FROM '" + map.get(name) + "'";
			try (final Statement stmt = this.traceDbConnection.createStatement();
					final ResultSet resultSet = stmt.executeQuery(selection)) {

				while (resultSet.next()) {
					final long timeStamp = resultSet.getLong("TimeStamp"); //$NON-NLS-1$
					final long entityInstanceId = resultSet.getLong("EntityInstanceId");
					final Stimulus stimulus = new Stimulus(name + "_" + entityInstanceId);
					stimulus.setMoment(timeStamp);
					stimulus.setTimeBase(this.timeBase);
					result.add(stimulus);
				}
			}
		}

		return result;
	}
}
