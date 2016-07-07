/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.atdb;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.mutable.MutableInt;
import org.apache.commons.lang.mutable.MutableLong;
import org.eclipse.app4mc.tracing.converter.atdb.model.EntityType;
import org.eclipse.app4mc.tracing.converter.atdb.model.EventType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;

public class ATDBWriter {

	private static final String INSERT_INTO_META_INFORMATION = "INSERT INTO MetaInformation (Name, Value) VALUES (?,?)";
	private static final String UPDATE_META_INFORMATION = "UPDATE MetaInformation SET Value = ? WHERE Name = ? ";
	private static final String SELECT_FROM_META_INFORMATION = "SELECT Value FROM MetaInformation WHERE Name = ?";

	private Statement stat;
	private Connection conn;

	final Map<Long, String> mapEntityIdToEntityName = new HashMap<>();
	final Map<Long, String> mapEntityIdToTableName = new HashMap<>();
	final Map<Long, EventType> mapEntityIdLastEventType = new HashMap<>();
	final Map<Long, Long> mapEntityIdStartTime = new HashMap<>();

	final Map<Long, MutableLong> mapEntityIdInstanceCounter = new HashMap<>();
	final Map<Long, EntityType> mapEntityIdToEntityType = new HashMap<>();
	final Map<Long, EventType> mapEventTypeIdToEventType = new HashMap<>();
	final Map<EventType, Long> mapEventTypeToEventTypeId = new HashMap<>();
	Map<EntityType, Integer> mapEntityTypeId = new HashMap<>();

	long globalEventCounter = 0;
	long timestampZeroCounter = 0;

	private PreparedStatement insertIntoMetaInfo;
	private PreparedStatement updateMetaInfo;
	private PreparedStatement selectFromMetaInfo;
	private PreparedStatement prepInsertEntityInstance;
	private long counterPrepInsertEntityInstance = 0;
	private long bufCounterPrepInsertEntityInstance = 0;

	Map<String, PreparedStatement> mapTraceStatements = new HashMap<>();
	Map<String, org.apache.commons.lang.mutable.MutableLong> mapTraceStatementCounter = new HashMap<>();
	Map<String, org.apache.commons.lang.mutable.MutableInt> mapTraceStatementsBufferCnt = new HashMap<>();

	public void createATDB(final IFile atdbFile) {
		this.conn = null;
		try {
			Class.forName("org.sqlite.JDBC");

			final String name = atdbFile.getLocation().toOSString();
			final String connectionString = "jdbc:sqlite:" + name;

			this.conn = DriverManager.getConnection(connectionString);
			atdbFile.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());

			this.stat = this.conn.createStatement();

			createMetaInformationTable();
			createEntityInstanceTable();
			createEntitySourceTable();
			createEntitiesTable();
			createEntityTypeTable();
			createEventTypeTable();

			prepareGeneralStatements();
		}
		catch (final Exception ex) {
			ex.printStackTrace();
		}
	}

	private void prepareGeneralStatements() throws SQLException {
		this.insertIntoMetaInfo = this.conn.prepareStatement(INSERT_INTO_META_INFORMATION);
		this.selectFromMetaInfo = this.conn.prepareStatement(SELECT_FROM_META_INFORMATION);
		this.updateMetaInfo = this.conn.prepareStatement(UPDATE_META_INFORMATION);
	}

	public void close() {
		try {
			if (this.stat != null) {
				this.stat.close();
				this.stat = null;
			}
		}
		catch (final Exception ex) {
			ex.printStackTrace();
		}

		try {
			if (this.conn != null) {
				this.conn.close();
				this.conn = null;
			}
		}
		catch (final Exception ex) {
			ex.printStackTrace();
		}

	}

	private void createEntitiesTable() throws SQLException {
		executeUpdate("CREATE TABLE Entity	(Id INTEGER PRIMARY KEY ASC, Name TEXT, EntityTypeId INTEGER, HasEvents BOOLEAN, EventTableName TEXT);");
	}

	private void createEntityInstanceTable() throws SQLException {
		executeUpdate(
				"CREATE TABLE EntityInstance (Id INTEGER, EntityId INTEGER, EntityInstanceId INTEGER, TimeFrom INT8, TimeTo INT8, PRIMARY KEY(EntityId, EntityInstanceId));",
				"CREATE INDEX IndexEntityInstance ON EntityInstance (EntityId,TimeFrom,TimeTo);",
				"CREATE INDEX EntityInstanceInstanceIdIndex on EntityInstance(id);");
	}

	private void createEntitySourceTable() throws SQLException {
		executeUpdate(
				"CREATE TABLE EntitySource ( EntityId INT8, SourceEntityId INT8, PRIMARY KEY (EntityId, SourceEntityId) );",
				"CREATE INDEX EntitySourceIndex on EntitySource(EntityId, SourceEntityId);");
	}

	private void createEntityTypeTable() throws SQLException {
		executeUpdate("CREATE TABLE EntityType (Id INTEGER PRIMARY KEY ASC, Name TEXT);");
	}

	private void createEventTypeTable() throws SQLException {
		executeUpdate("CREATE TABLE EventType (Id INTEGER PRIMARY KEY ASC, Name TEXT);");
	}

	private void createMetaInformationTable() throws SQLException {
		executeUpdate("CREATE TABLE MetaInformation ( Name TEXT PRIMARY KEY, Value TEXT );");
	}


	public Long insertEntity(final SchedulingEntityType schedEntityType, final EntityType entityType) {
		try {
			long entityId = 0;
			while (this.mapEntityIdToEntityName.containsKey(entityId)) {
				entityId++;
			}
			final String entityName = correctEntityName(schedEntityType.getName());
			final int entityTypeId = getEntityTypeId(entityType);

			final PreparedStatement prep = this.conn
					.prepareStatement("insert into Entity values (?, ?, ?, null, null);");

			prep.setLong(1, entityId);
			prep.setString(2, entityName);
			prep.setInt(3, entityTypeId);
			prep.execute();

			try (ResultSet generatedKeys = prep.getGeneratedKeys()) {
				generatedKeys.next();
				final long id = generatedKeys.getLong(1);

				this.mapEntityIdToEntityName.put(id, entityName);
				this.mapEntityIdToEntityType.put(id, entityType);
				this.mapEntityIdInstanceCounter.put(entityId, new MutableLong(-1));
				return id;
			}
		}
		catch (final Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public void insertEntities(final SchedulingEntityType schedulingEntity,
			final Collection<SchedulingEntityElementType> elements) throws SQLException {

		try (PreparedStatement prep = this.conn.prepareStatement("insert into Entity values (?, ?, ?, null, null);")) {
			for (final SchedulingEntityElementType element : elements) {
				final Long entityId = element.getId().longValue();
				if (this.mapEntityIdToEntityName.containsKey(entityId)) {
					continue;
				}
				final String entityName = correctEntityName(element.getName());
				final EntityType entityType = EntityType.getEntityTypeForOT1Class(element);
				if (entityType == null || EntityType.getATDBAbbrev(entityType) == null) {
					System.out.println("Entity-Type [" + element.getClass().getSimpleName() + "] not supported.");
					continue;
				}
				final int entityTypeId = getEntityTypeId(entityType);
				this.mapEntityIdToEntityName.put(entityId, entityName);
				this.mapEntityIdInstanceCounter.put(entityId, new MutableLong(-1));
				this.mapEntityIdToEntityType.put(entityId, entityType);

				prep.setLong(1, entityId);
				prep.setString(2, entityName);
				prep.setInt(3, entityTypeId);
				prep.addBatch();

				final EList<SchedulingEntityElementType> subElements = element.getElement();
				insertEntities(schedulingEntity, subElements);
			}
			this.conn.setAutoCommit(false);
			prep.executeBatch();
			this.conn.setAutoCommit(true);
		}

	}


	private int getEntityTypeId(final EntityType entityType) throws SQLException {
		Integer entityTypeId = this.mapEntityTypeId.get(entityType);
		if (entityTypeId == null) {
			entityTypeId = insertEntityType(entityType);
			this.mapEntityTypeId.put(entityType, entityTypeId);
		}
		return entityTypeId;
	}

	private Integer insertEntityType(final EntityType entityType) throws SQLException {
		String atdbAbbrev = EntityType.getATDBAbbrev(entityType);
		if (atdbAbbrev == null) {
			atdbAbbrev = entityType.name();
		}
		this.stat.executeUpdate("insert into EntityType (Name) values ('" + atdbAbbrev + "')");
		try (ResultSet generatedKeys = this.stat.getGeneratedKeys()) {
			generatedKeys.next();
			final int id = generatedKeys.getInt(1);
			return id;
		}
	}

	private String correctEntityName(String name) {
		name = StringUtils.replaceChars(name, ": ^°!\"§$%&/()=?`´{[]}\\|<>,;#'+*~", "________________________________");
		return name;
	}

	private void executeUpdate(final String... sqls) throws SQLException {
		for (final String sql : sqls) {
			this.stat.executeUpdate(sql);
		}
	}

	public void insertEventTypes(final SchedulingEntityType schedEntityType) throws Exception {
		final EventDescriptionType eventDescription = schedEntityType.getEventDescription();
		final EList<EventIdMappingType> eventIdMappings = eventDescription.getEventIdMapping();

		try (PreparedStatement prep = this.conn.prepareStatement("insert into EventType values (?, ?);")) {
			for (final EventIdMappingType eventIdMapping : eventIdMappings) {
				final Long eventTypeId = eventIdMapping.getEventId().longValue();
				final EventTypeEnum ot1EventType = eventIdMapping.getEventType();
				final EventType eventType = EventType.getEventTypeForOT1(ot1EventType);
				if (eventType == null) {
					continue;
				}
				if (this.mapEventTypeIdToEventType.containsKey(eventTypeId)) {
					continue;
				}
				if (this.mapEventTypeToEventTypeId.containsKey(eventType)) {
					final Long eventTypeIdAlreadyPresent = this.mapEventTypeToEventTypeId.get(eventType);
					if (eventTypeIdAlreadyPresent != eventTypeId) {
						// throw new
						// Exception("Duplicate EventType in OT1-File: " +
						// eventType + " - "
						// + eventTypeIdAlreadyPresent + " - " + eventTypeId);
					}
				}

				this.mapEventTypeIdToEventType.put(eventTypeId, eventType);
				this.mapEventTypeToEventTypeId.put(eventType, eventTypeId);
				final String eventTypeName = eventType.name();
				prep.setLong(1, eventTypeId);
				prep.setString(2, eventTypeName);
				prep.addBatch();
			}
			this.conn.setAutoCommit(false);
			prep.executeBatch();
			this.conn.setAutoCommit(true);
		}
	}


	public void insertTraceEntries(final SchedulingEntityType schedEntityType, final long pSourceEntityId)
			throws SQLException {
		double factor = 1;

		final ClockType clock = schedEntityType.getClock();
		if (clock != null) {
			final TimeValueType tickduration = clock.getTickduration();
			if (tickduration != null) {
				final BigInteger biNominator = tickduration.getNominator();
				final BigInteger biDenominator = tickduration.getDenominator();
				if (biNominator != null && biDenominator != null) {
					final long nominator = biNominator.longValue();
					final long denominator = biDenominator.longValue();
					factor = nominator / (double) denominator;
				}
				factor = factor * getUnitFactorToNs(tickduration.getUnit());
			}
		}

		final TracesType traces = schedEntityType.getTraces();
		final EList<XmlTraceType> xmlTraces = traces.getXmlTrace();
		for (final XmlTraceType xmlTrace : xmlTraces) {
			final EList<TraceEntryType> traceEntries = xmlTrace.getTraceEntry();
			long lastTime = -1;
			int timeCounter = 0;
			for (final TraceEntryType traceEntry : traceEntries) {
				final long time = traceEntry.getTime().longValue();
				if (time == 0) {
					this.timestampZeroCounter++;
				}
				if (time != lastTime) {
					timeCounter = 0;
				}
				final long entityId = traceEntry.getElementRefId().longValue();
				final long eventId = traceEntry.getEventId().longValue();
				final long sourceEntityId = pSourceEntityId;


				// final long
				final EntityType entityType = this.mapEntityIdToEntityType.get(entityId);
				if (entityType == null) {
					continue;
				}
				try (final PreparedStatement prep = getPreparedStatementForEntity(entityId)) {
					final String tableName = this.mapEntityIdToTableName.get(entityId);
					final MutableLong tableCounter = this.mapTraceStatementCounter.get(tableName);
					final MutableLong lastEntityInstanceID = this.mapEntityIdInstanceCounter.get(entityId);

					final EventType eventType = this.mapEventTypeIdToEventType.get(eventId);
					if (lastEntityInstanceID.longValue() == -1 && eventType == EventType.START
							&& entityType == EntityType.PROCESS) {
						cacheEntitySource(entityId, sourceEntityId);
						insertZeroTimeActivation(entityId, sourceEntityId);
					}

					final double timestampDouble = time * factor;
					final long timestamp = (long) (timestampDouble);
					final long remainder = (long) (timestampDouble * 1000) % 1000;
					final long seqNr = timeCounter;
					final String value = null;
					final long sourceInstanceId = -1;

					if (eventType == EventType.ACTIVATE && entityType == EntityType.PROCESS) {
						lastEntityInstanceID.increment();
						this.mapEntityIdStartTime.put(entityId, timestamp);
					}

					final EventType lastEventType = this.mapEntityIdLastEventType.get(entityId);
					if (eventType == EventType.START && lastEventType != EventType.ACTIVATE
							&& (entityType == EntityType.PROCESS || entityType == EntityType.INTERRUPT)) {
						lastEntityInstanceID.increment();
						this.mapEntityIdStartTime.put(entityId, timestamp);
						final long id = tableCounter.longValue();
						final long entityInstanceId = lastEntityInstanceID.longValue();
						final long eventId2 = this.mapEventTypeToEventTypeId.get(EventType.ACTIVATE);
						prep.setLong(1, id);
						prep.setLong(2, timestamp);
						prep.setLong(3, remainder);
						prep.setLong(4, seqNr);
						prep.setLong(5, entityId);
						prep.setLong(6, entityInstanceId);
						prep.setLong(7, sourceEntityId);
						prep.setLong(8, sourceInstanceId);
						prep.setLong(9, eventId2);
						prep.setString(10, value);

						prep.addBatch();
						final MutableInt bufCounter = this.mapTraceStatementsBufferCnt.get(tableName);
						bufCounter.increment();
						tableCounter.increment();
						timeCounter++;
						this.globalEventCounter++;
					}

					final long entityInstanceId = lastEntityInstanceID.longValue();
					final long id = tableCounter.longValue();

					if (eventType == EventType.TERMINATE
							&& (entityType == EntityType.PROCESS || entityType == EntityType.INTERRUPT)) {
						Long startTime = this.mapEntityIdStartTime.get(entityId);
						if (startTime == null) {
							startTime = 0l;
						}
						final long endTime = timestamp;
						insertEntityInstance(entityId, entityInstanceId, startTime, endTime);
					}

					cacheEntitySource(entityId, sourceEntityId);

					prep.setLong(1, id);
					prep.setLong(2, timestamp);
					prep.setLong(3, remainder);
					prep.setLong(4, seqNr);
					prep.setLong(5, entityId);
					prep.setLong(6, entityInstanceId);
					prep.setLong(7, sourceEntityId);
					prep.setLong(8, sourceInstanceId);
					prep.setLong(9, eventId);
					prep.setString(10, value);

					prep.addBatch();
					final MutableInt bufCounter = this.mapTraceStatementsBufferCnt.get(tableName);
					bufCounter.increment();


					if (bufCounter.intValue() > 1000) {
						flushCache(entityId);
					}

					lastTime = time;
					tableCounter.increment();
					timeCounter++;
					this.globalEventCounter++;
					this.mapEntityIdLastEventType.put(entityId, eventType);
				}
			}
		}

		flushOpenTraceStatements();
		flushEntityInstance();
	}

	private void flushOpenTraceStatements() throws SQLException {
		// flush all statements
		for (final Entry<String, PreparedStatement> entry : this.mapTraceStatements.entrySet()) {
			final String tableName = entry.getKey();
			try (final PreparedStatement prep = entry.getValue()) {
				final MutableInt mutableInt = this.mapTraceStatementsBufferCnt.get(tableName);
				if (mutableInt.intValue() != 0) {
					this.conn.setAutoCommit(false);
					prep.executeBatch();
					this.conn.setAutoCommit(true);
				}
			}
		}
	}

	private void insertEntityInstance(final long entityId, final long entityInstanceId, final Long startTime,
			final long endTime) throws SQLException {
		if (this.prepInsertEntityInstance == null) {
			this.prepInsertEntityInstance = this.conn
					.prepareStatement("insert into EntityInstance (Id, EntityId, EntityInstanceId, TimeFrom, TimeTo) values (?, ?, ?, ?, ?);");
		}
		final PreparedStatement prep = this.prepInsertEntityInstance;

		prep.setLong(1, this.counterPrepInsertEntityInstance);
		prep.setLong(2, entityId);
		prep.setLong(3, entityInstanceId);
		prep.setLong(4, startTime);
		prep.setLong(5, endTime);
		prep.addBatch();
		this.bufCounterPrepInsertEntityInstance++;
		this.counterPrepInsertEntityInstance++;

		if (this.bufCounterPrepInsertEntityInstance > 1000) {
			flushEntityInstance();
		}
	}

	private void flushEntityInstance() throws SQLException {
		if (this.bufCounterPrepInsertEntityInstance > 0) {
			this.conn.setAutoCommit(false);
			this.prepInsertEntityInstance.executeBatch();
			this.conn.setAutoCommit(true);
			this.bufCounterPrepInsertEntityInstance = 0;
		}
	}

	Map<Long, Set<Long>> mapEntitySourceCache = new HashMap<>();

	private void cacheEntitySource(final long entityId, final long sourceEntityId) {
		Set<Long> set = this.mapEntitySourceCache.get(entityId);
		if (set == null) {
			set = new HashSet<>();
			this.mapEntitySourceCache.put(entityId, set);
		}
		set.add(sourceEntityId);
	}

	void fillEntitySource() throws SQLException {
		try (PreparedStatement prep = this.conn
				.prepareStatement("insert into EntitySource (EntityId, SourceEntityId) values (?, ?);")) {
			for (final Entry<Long, Set<Long>> entry : this.mapEntitySourceCache.entrySet()) {
				final Set<Long> sourceEntityIds = entry.getValue();
				for (final Long sourceEntityId : sourceEntityIds) {
					prep.setLong(1, entry.getKey());
					prep.setLong(2, sourceEntityId);
					prep.addBatch();
				}
			}
			this.conn.setAutoCommit(false);
			prep.executeBatch();
			this.conn.setAutoCommit(true);
		}
	}

	private void insertZeroTimeActivation(final long entityId, final long sourceEntityId) throws SQLException {
		flushCache(entityId);


		final String tableName = this.mapEntityIdToTableName.get(entityId);
		String sql = "select max(Id) from '" + tableName + "' where timestamp = 0;";
		long insertId;
		try (ResultSet executeQuery = this.stat.executeQuery(sql)) {
			if (executeQuery.next()) {
				insertId = executeQuery.getLong(1) + 1;
			}
			else {
				insertId = 1;
			}
			sql = "update '" + tableName + "' set Id = Id + 1 where Id >= " + insertId;
			this.stat.executeUpdate(sql);
		}

		final long id = insertId;
		final long timestamp = 0;
		final long remainder = 0;
		final long seqNr = this.timestampZeroCounter;
		final long entityInstanceId = 0;
		final long sourceInstanceId = -1;
		final String value = null;
		final long eventId = this.mapEventTypeToEventTypeId.get(EventType.ACTIVATE);

		try (final PreparedStatement prep = getPreparedStatementForEntity(entityId)) {
			prep.setLong(1, id);
			prep.setLong(2, timestamp);
			prep.setLong(3, remainder);
			prep.setLong(4, seqNr);
			prep.setLong(5, entityId);
			prep.setLong(6, entityInstanceId);
			prep.setLong(7, sourceEntityId);
			prep.setLong(8, sourceInstanceId);
			prep.setLong(9, eventId);
			prep.setString(10, value);

			prep.addBatch();
			final MutableInt bufCounter = this.mapTraceStatementsBufferCnt.get(tableName);
			bufCounter.increment();

			final MutableLong tableCounter = this.mapTraceStatementCounter.get(tableName);
			tableCounter.increment();
			this.mapEntityIdStartTime.put(entityId, 0l);
			this.timestampZeroCounter++;
			final MutableLong lastEntityInstanceID = this.mapEntityIdInstanceCounter.get(entityId);
			lastEntityInstanceID.increment();
			this.mapEntityIdStartTime.put(entityId, timestamp);
			final EventType eventType = this.mapEventTypeIdToEventType.get(eventId);
			this.mapEntityIdLastEventType.put(entityId, eventType);
		}
	}

	private void flushCache(final long entityId) throws SQLException {
		try (PreparedStatement prep = getPreparedStatementForEntity(entityId)) {
			final String tableNameForEntity = getTableNameForEntity(entityId);
			final MutableInt bufCounter = this.mapTraceStatementsBufferCnt.get(tableNameForEntity);
			if (bufCounter.longValue() > 0) {
				this.conn.setAutoCommit(false);
				prep.executeBatch();
				this.conn.setAutoCommit(true);
				bufCounter.setValue(0);
			}
		}
	}

	private double getUnitFactorToNs(final TimeBaseEnum unit) {
		if (unit == null) {
			return 1d;
		}
		switch (unit) {
			case MS:
				return 1000d;
			case NS:
				return 1d;
			case S:
				return 1000 * 1000;
			case US:
				return 0.001d;

		}
		return 1d;
	}

	@SuppressWarnings("resource")
	private PreparedStatement getPreparedStatementForEntity(final long targetEntityId) throws SQLException {
		final String entityTableName = this.mapEntityIdToTableName.get(targetEntityId);
		PreparedStatement preparedStatement = null;
		if (entityTableName != null) {
			preparedStatement = this.mapTraceStatements.get(entityTableName);
		}
		if (preparedStatement == null) {
			final String createEntityEventTable = createEntityEventTable(targetEntityId);
			//
			// 1 = Id
			// 2 = Timestamp in Nanoseconds
			// 3 = Remainder; Picosecond part of Timestamp, if available
			// 4 = SQCNR sequential number of event at same timestamp
			// (entity-independent)
			// 5 = EntityId
			// 6 = EntityInstanceId
			// 7 = SourceEntityId
			// 8 = SourceInstanceId
			// 9 = EventTypeId
			// 10 = Value
			//
			preparedStatement = this.conn
					.prepareStatement("insert into '"
							+ createEntityEventTable
							+ "' (Id, Timestamp, Remainder, SQCNR, EntityId, EntityInstanceId, SourceEntityId, SourceEntityInstanceId, EventTypeId, Value) "
							+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
			this.mapTraceStatements.put(createEntityEventTable, preparedStatement);
			this.mapTraceStatementCounter.put(createEntityEventTable, new MutableLong(1));
			this.mapTraceStatementsBufferCnt.put(createEntityEventTable, new MutableInt(0));
			this.mapEntityIdToTableName.put(targetEntityId, createEntityEventTable);
		}

		return preparedStatement;
	}

	private String createEntityEventTable(final long targetEntityId) throws SQLException {
		final String tableName = getTableNameForEntity(targetEntityId);
		final String sql1 = "CREATE TABLE '"
				+ tableName
				+ "' ( Id INTEGER PRIMARY KEY ASC, Timestamp INT8, Remainder INTEGER, SQCNR INTEGER, EntityId INTEGER, EntityInstanceId INTEGER, SourceEntityId INTEGER, SourceEntityInstanceId INTEGER, EventTypeId INTEGER, Value TEXT);";
		final String sql2 = "CREATE INDEX '" + tableName + "_SourceEntityIdIndex' ON '" + tableName
				+ "' (SourceEntityId, Timestamp);";
		final String sql3 = "CREATE INDEX '" + tableName + "_EntityInstanceIdIndex' ON '" + tableName
				+ "' (EntityId, EntityInstanceId, Timestamp);";
		final String sql4 = "update Entity set HasEvents=1, EventTableName='" + tableName + "' where Id = "
				+ targetEntityId;
		executeUpdate(sql1, sql2, sql3, sql4);
		return tableName;
	}

	private String getTableNameForEntity(final long targetEntityId) {
		final String name = this.mapEntityIdToEntityName.get(targetEntityId);
		final EntityType type = this.mapEntityIdToEntityType.get(targetEntityId);
		if (type == EntityType.SIGNAL) {
			return "Signal_Event";
		}
		return name + ":" + EntityType.getATDBAbbrev(type) + ":" + targetEntityId + "_Event";
	}

	// ////////////////////////////////////meta info

	public void setMetaInformation(final String name, final String value) {
		try {
			if (getMetaInformation(name) == null) {
				this.insertIntoMetaInfo.setString(1, name);
				this.insertIntoMetaInfo.setString(2, value);
				this.insertIntoMetaInfo.execute();
			}
			else {
				this.updateMetaInfo.setString(1, value);
				this.updateMetaInfo.setString(2, name);
				this.updateMetaInfo.execute();
			}
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public String getMetaInformation(final String name) {
		try {
			this.selectFromMetaInfo.setString(1, name);
			try (final ResultSet result = this.selectFromMetaInfo.executeQuery()) {
				String value = null;
				if (result.next()) {
					value = result.getString(1);
				}
				result.close();
				return value;
			}
		}
		catch (final Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void fillMetaInformation(final String input) {
		setMetaInformation("db_version", "v0.2.0");
		setMetaInformation("events_written", String.valueOf(this.globalEventCounter));
		setMetaInformation("input", input);
		setMetaInformation("time_base", "ns");
	}

}
