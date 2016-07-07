package org.eclipse.app4mc.atdb.metrics;

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

import org.eclipse.core.resources.IFile;

public class DatabaseAccess {

	private Connection traceDbConnection;
	private Map<Integer, EventType> eventToIdMap;

	public void connectToDatabase(final IFile databaseFile) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC"); //$NON-NLS-1$
		String connectionStr = "jdbc:sqlite:"; //$NON-NLS-1$
		connectionStr += databaseFile.getLocation().toFile().toString();
		final Properties properties = new Properties();
		properties.put("open_mode", "1"); //$NON-NLS-1$ //$NON-NLS-2$
		this.traceDbConnection = DriverManager.getConnection(connectionStr, properties);
	}

	public void closeDatabaseConnection() throws SQLException {
		this.traceDbConnection.close();
	}

	public String readTimestampUnit() throws SQLException {
		String result = null;
		final String timeUnitSelection = "SELECT Value FROM MetaInformation WHERE Name LIKE 'time_base'"; //$NON-NLS-1$
		try (final Statement statement = this.traceDbConnection.createStatement();
				final ResultSet resultSet = statement.executeQuery(timeUnitSelection)) {
			if (resultSet.next()) {
				result = resultSet.getString(1);
			}
			resultSet.close();
			statement.close();
		}

		return result;
	}

	public List<Process> loadProcesses() throws SQLException {
		final List<Process> result = new ArrayList<>();
		final String processSelection = "SELECT a.Id, a.Name, a.HasEvents, a.EventTableName FROM Entity AS a JOIN EntityType AS b ON a.EntityTypeId = b.Id WHERE b.Name LIKE 'task' OR b.Name LIKE 'isr'"; //$NON-NLS-1$
		try (Statement statement = this.traceDbConnection.createStatement();
				ResultSet resultSet = statement.executeQuery(processSelection)) {
			while (resultSet.next()) {
				final int primaryKey = resultSet.getInt("Id"); //$NON-NLS-1$
				final String name = resultSet.getString("Name"); //$NON-NLS-1$
				final boolean hasEvents = resultSet.getBoolean("HasEvents"); //$NON-NLS-1$
				String databaseTableName = null;
				if (hasEvents) {
					databaseTableName = resultSet.getString("EventTableName"); //$NON-NLS-1$
				}
				final Process process = new Process(primaryKey, name, databaseTableName);
				result.add(process);
			}
			resultSet.close();
			statement.close();
		}

		return result;
	}

	private void loadEventToIdMap() throws SQLException {
		this.eventToIdMap = new HashMap<>();
		final String eventSelection = "SELECT Id, Name FROM EventType"; //$NON-NLS-1$
		try (final Statement statement = this.traceDbConnection.createStatement();
				final ResultSet resultSet = statement.executeQuery(eventSelection)) {
			while (resultSet.next()) {
				final Integer id = new Integer(resultSet.getInt("Id")); //$NON-NLS-1$
				final String eventName = resultSet.getString("Name"); //$NON-NLS-1$
				try {
					final EventType eventType = EventType.valueOf(eventName);
					this.eventToIdMap.put(id, eventType);
				}
				catch (final Exception e) {
					// ignore
				}
			}
			resultSet.close();
			statement.close();
		}
	}

	public List<Metric> calculateMetrcisForProcess(final Process process) throws SQLException {
		if (this.eventToIdMap == null) {
			loadEventToIdMap();
		}

		final String eventSelection = "SELECT TimeStamp, EntityInstanceId, EventTypeId FROM '" //$NON-NLS-1$
				+ process.databaseTableName + "' WHERE EntityId = " + process.primaryKey //$NON-NLS-1$
				+ " ORDER BY EntityInstanceId, TimeStamp"; //$NON-NLS-1$
		// response time
		int instancesResponeTime = 0;
		long minimumResponseTime = Long.MAX_VALUE;
		long maximumResponseTime = 0;
		long sumResponseTime = 0;

		// gross execution time
		int instancesGrossExecutionTime = 0;
		long minimumGrossExecutionTime = Long.MAX_VALUE;
		long maximumGrossExecutionTime = 0;
		long sumGrossExecution = 0;

		int currentInstanceId = -1;
		long timestampActivate = -1;
		long timestampStart = -1;
		long timestampTerminate = -1;

		try (final Statement statement = this.traceDbConnection.createStatement();
				final ResultSet resultSet = statement.executeQuery(eventSelection)) {
			while (resultSet.next()) {
				final long timestamp = resultSet.getLong(1);
				final int instanceId = resultSet.getInt(2);
				final int eventTypeId = resultSet.getInt(3);

				if (instanceId != currentInstanceId) {
					currentInstanceId = instanceId;

					timestampActivate = -1;
					timestampStart = -1;
					timestampTerminate = -1;
				}

				final EventType eventType = this.eventToIdMap.get(eventTypeId);
				if (eventType == null) {
					continue;
				}

				switch (eventType) {
				case activate:
					timestampActivate = timestamp;
					break;
				case start:
					timestampStart = timestamp;
					break;
				case terminate:
					timestampTerminate = timestamp;

					// response time
					if (timestampActivate > -1) {
						final long responseTime = timestampTerminate - timestampActivate;
						minimumResponseTime = Math.min(minimumResponseTime, responseTime);
						maximumResponseTime = Math.max(maximumResponseTime, responseTime);
						sumResponseTime += responseTime;

						instancesResponeTime++;
					}

					if (timestampStart > -1) {
						final long grossExecutionTime = timestampTerminate - timestampStart;
						minimumGrossExecutionTime = Math.min(minimumGrossExecutionTime, grossExecutionTime);
						maximumGrossExecutionTime = Math.max(maximumGrossExecutionTime, grossExecutionTime);
						sumGrossExecution += grossExecutionTime;

						instancesGrossExecutionTime++;
					}

					break;
				default:
					break;
				}
			}
			resultSet.close();
			statement.close();
		}

		final List<Metric> result = new ArrayList<>(2);
		if (instancesResponeTime > 0) {
			final long avg = sumResponseTime / instancesResponeTime;
			result.add(new Metric("Response Time", minimumResponseTime, avg, maximumResponseTime)); //$NON-NLS-1$
		}

		if (instancesGrossExecutionTime > 0) {
			final long avg = sumGrossExecution / instancesGrossExecutionTime;
			result.add(new Metric("Gross Execution Time", minimumGrossExecutionTime, avg, maximumGrossExecutionTime)); //$NON-NLS-1$
		}

		return result;
	}
}
