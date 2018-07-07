/**
 ********************************************************************************
 * Copyright (c) 2013 C-LAB (University of Paderborn) and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     C-LAB (University of Paderborn) - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.ClockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventDescriptionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventIdMappingType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Factory;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeBaseEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeValueType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.VersionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1FactoryImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * Converts trace data given by a HTF file to an OT1 model (according to OT1
 * ecore model)
 */
public class Htf2Ot1Converter {

	/** Keywords of general HTF header that are read by the converter */
	public enum HeaderKey {
		FORMAT, VERSION, URL, PROJECT, TARGETSYSTEM, DESCRIPTION, CREATIONDATE, TIMESCALE, TIMESCALENUMERATOR, TIMESCALEDENOMINATOR, TIMESTAMPLENGTH, ENTITYLENGTH, EVENTLENGTH
	}

	/** Keyword that opens map of HTF entity type ids and HTF entity types */
	final private String KEY_TYPE_TABLE = "TypeTable";

	/** Names of HTF entity types */
	public enum EntityType {
		TASK, ISR, RUNNABLE, CODEBLOCK, SIGNAL, SEMAPHORE
	}

	/** Keyword that opens map of HTF task event ids and HTF task events */
	final private String KEY_TASK_EVENT = "TaskEventTable";

	/** Names of HTF task events */
	public enum TaskEvent {
		ACTIVATE, START, RESUME, PREEMPT, TERMINATE, WAIT, RELEASE, POLL, RUN_POLLING, PARK, POLL_PARKING, RELEASE_PARKING
	}

	/** Keyword that opens map of HTF ISR event ids and HTF ISR events */
	final private String KEY_INTERRPUT_EVENT = "ISREventTable";

	/** Names of HTF ISR events */
	public enum InterruptEvent {
		START, RESUME, PREEMPT, TERMINATE
	}

	/** Keyword that opens map of HTF runnable event ids and HTF runnable events */
	final private String KEY_RUNNABLE_EVENT = "RunnableEventTable";

	/** Names of HTF runnable events */
	public enum RunnableEvent {
		START, SUSPEND, RESUME, TERMINATE
	}

	/**
	 * Keyword that opens map of HTF code block event ids and HTF code block
	 * events
	 */
	final private String KEY_CODEBLOCK_EVENT = "CodeBlockEventTable";

	/** Names of HTF signal events */
	public enum CodeBlockEvent {
		START, STOP
	}

	/** Keyword that opens map of HTF signal event ids and HTF signal events */
	final private String KEY_SIGNAL_EVENT = "SignalEventTable";

	/** Names of HTF signal events */
	public enum SignalEvent {
		READ, WRITE
	}

	/**
	 * Keyword that opens map of HTF semaphore event ids and HTF semaphore
	 * events
	 */
	final private String KEY_SEMAPHORE_EVENT = "SemaphoreEventTable";

	/** Names of HTF semaphore events */
	public enum SemaphoreEvent {
		LOCK, UNLOCK
	}

	/** Keyword that opens map of HTF entity ids and entity labels/names */
	final private String KEY_ENTITY_TABLE = "EntityTable";
	/** Keyword that opens map of HTF entity ids and HTF type ids */
	final private String KEY_ENTITY_TYPE_TABLE = "EntityTypeTable";
	/** Keyword that opens section of trace data */
	final private String KEY_TRACEDATA = "Tracedata";

	/**
	 * Map containing content of general HTF header (content mapped to
	 * corresponding keyword defined in <code>HeaderKey</code>)
	 * 
	 * @see HeaderKey
	 */
	private Map<String, String> headerContent;

	/** Mapping of HTF type ids to HTF type names */
	private Map<Integer, EntityType> typeTable;
	/** Mapping of HTF task event ids to HTF task event names */
	private Map<Integer, TaskEvent> taskEventTable;
	/** Mapping of HTF ISR event ids to HTF ISR event names */
	private Map<Integer, InterruptEvent> interruptEventTable;
	/** Mapping of HTF runnable event ids to HTF runnable event names */
	private Map<Integer, RunnableEvent> runnableEventTable;
	/** Mapping of HTF signal event ids to HTF code block event names */
	private Map<Integer, CodeBlockEvent> codeBlockEventTable;
	/** Mapping of HTF semaphore event ids to HTF semaphore event names */
	private Map<Integer, SignalEvent> signalEventTable;
	/** Mapping of HTF semaphore event ids to HTF semaphore event names */
	private Map<Integer, SemaphoreEvent> semaphoreEventTable;
	/** Mapping of HTF entity ids to HTF entity names/labels */
	private Map<Integer, String> entityTable;
	/** Mapping of HTF entity ids to HTF type names of corresponding entity type */
	private Map<Integer, EntityType> entityTypeTable;

	/** prefix of keywords in HTF file */
	final private String PREFIX_KEY = "#";
	/** prefix of table/map entries in HTF file */
	final private String PREFIX_TABLE = "#-";

	// number of hex digits to encode 1 byte
	final private int NUM_HEX_DIGITS_PER_BYTE = 2;

	final private int HEX_RADIX = 16;

	// Factory to create elements of OT1 model
	final private OT1Factory ot1Factory = OT1FactoryImpl.init();

	final private Htf2OT1Mapping htf2OT1mapping = new Htf2OT1Mapping();

	private long uuid = 0;

	// Root of an OT1 model
	private DocumentRoot ot1Model;

	/**
	 * Constructor calls <code>init()</code>.
	 * 
	 * @see Htf2Ot1Converter#init()
	 */
	Htf2Ot1Converter() {
		init();
	}

	/**
	 * Initialize class variables and set version of OT1 model
	 */
	private void init() {
		this.uuid = 0;

		this.headerContent = new HashMap<String, String>();

		this.entityTable = new HashMap<Integer, String>();
		this.entityTypeTable = new HashMap<Integer, EntityType>();

		// initilize root of OT1 model with version of OT1 specification
		this.ot1Model = this.ot1Factory.createDocumentRoot();
		final OT1Type1 ot1Version = this.ot1Factory.createOT1Type1();
		ot1Version.setVersion(VersionType._02);
		this.ot1Model.setOT1(ot1Version);
	}

	/**
	 * Set all class variables to <code>null</code>
	 */
	private void reset() {
		this.headerContent = null;

		this.typeTable = null;
		this.taskEventTable = null;
		this.interruptEventTable = null;
		this.runnableEventTable = null;
		this.codeBlockEventTable = null;
		this.signalEventTable = null;
		this.semaphoreEventTable = null;
		this.entityTable = null;
		this.entityTypeTable = null;

		this.ot1Model = null;
	}

	/**
	 * Help method to generate keyword used within htf, i.e. return
	 * <code>key</code> parameter with prefix {@value #PREFIX_KEY}
	 * 
	 * @param key
	 *            keyword without prefix
	 * @return keyword key with prefix specified in class variable
	 *         {@link #PREFIX_KEY}
	 */
	private String getHtfKeyword(final String key) {
		return this.PREFIX_KEY + key;
	}

	/**
	 * Creates a unique id by incrementing the global variable {@link #uuid}
	 * 
	 * @return Incremented value of Uuid
	 */
	private long createUuid() {
		return this.uuid++;
	}

	/**
	 * Put general header data of a htf trace file to class variable. Extracts
	 * only data corresponding to appropriate keywords that are specified within
	 * {@link HeaderKey}
	 * 
	 * @param header
	 *            general header content of a htf trace file (i.e. without table
	 *            definitions)
	 * @see HeaderKey
	 */
	private void readHeader(final Scanner header) {
		final HeaderKey[] headerKeys = HeaderKey.values();

		String keyword = "";
		String content = "";

		while (header.hasNext()) {
			keyword = header.next();
			// Scanner.nextLine() returns rest of line including delimiters; to
			// get beginning of content, the first delimiter is skipped
			header.skip(header.delimiter());
			content = header.nextLine();

			for (int i = 0; i < headerKeys.length; i++) {
				if (keyword.equalsIgnoreCase(this.PREFIX_KEY + headerKeys[i].toString())) {
					this.headerContent.put(headerKeys[i].toString(), content);
				}
			}
		}
	}

	/**
	 * Puts each table section of the htf file to a separate Scanner object and
	 * fills the table-map by calling the appropriate method This method assumes
	 * that look-up tables are ordered as follows:
	 * <ul>
	 * <li> {@link #KEY_TYPE_TABLE}
	 * <li> {@link #KEY_TASK_EVENT}
	 * <li> {@link #KEY_INTERRPUT_EVENT}
	 * <li> {@link #KEY_RUNNABLE_EVENT}
	 * <li> {@link #KEY_CODEBLOCK_EVENT}
	 * <li> {@link #KEY_SIGNAL_EVENT}
	 * <li> {@link #KEY_SEMAPHORE_EVENT}
	 * <li> {@link #KEY_ENTITY_TABLE}
	 * <li> {@link #KEY_ENTITY_TYPE_TABLE}
	 * </ul>
	 * 
	 * @param lookUpTables
	 *            Scanner object containing only table sections of htf file,
	 *            i.e. the content between end of general header and start of
	 *            tracedata
	 */
	private void readLookUpTables(final Scanner lookUpTables) {
		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_TASK_EVENT));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.typeTable = readTable(table, getHtfKeyword(this.KEY_TYPE_TABLE), EntityType.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_INTERRPUT_EVENT));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.taskEventTable = readTable(table, getHtfKeyword(this.KEY_TASK_EVENT), TaskEvent.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_RUNNABLE_EVENT));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.interruptEventTable = readTable(table, getHtfKeyword(this.KEY_INTERRPUT_EVENT), InterruptEvent.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_CODEBLOCK_EVENT));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.runnableEventTable = readTable(table, getHtfKeyword(this.KEY_RUNNABLE_EVENT), RunnableEvent.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_SIGNAL_EVENT));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.codeBlockEventTable = readTable(table, getHtfKeyword(this.KEY_CODEBLOCK_EVENT), CodeBlockEvent.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_SEMAPHORE_EVENT));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.signalEventTable = readTable(table, getHtfKeyword(this.KEY_SIGNAL_EVENT), SignalEvent.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_ENTITY_TABLE));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			this.semaphoreEventTable = readTable(table, getHtfKeyword(this.KEY_SEMAPHORE_EVENT), SemaphoreEvent.class);
		}

		lookUpTables.useDelimiter(getHtfKeyword(this.KEY_ENTITY_TYPE_TABLE));
		try (Scanner table = new Scanner(lookUpTables.next())) {
			readEntityTable(table);
		}

		try (Scanner table = new Scanner(lookUpTables.next())) {
			readEntityTypeTable(table);
		}
	}

	/**
	 * Put look-up table data of a htf trace file to class variable. Extracts
	 * only IDs corresponding to appropriate keywords that are specified within
	 * the enum of <code>enumClass</code>
	 * 
	 * @param scanner
	 *            Scanner containing only content of the wanted table (optional:
	 *            beginning with keyword <code>tableKey</code> of the table
	 * @param tableKey
	 *            Name of the table; this name is allowed to be at the beginning
	 *            of <code>scanner</code>
	 * @param enumClass
	 *            Class of an enum whose values correspond to the keywords that
	 *            can be looked up in the table contained by
	 *            <code>scanner</code>
	 * @return <code>HashMap<Integer,T> map</code> containing a map of ID-keys
	 *         and corresponding values of enum <code>T</code>
	 */
	private <T extends Enum<T>> Map<Integer, T> readTable(final Scanner scanner, final String tableKey,
			final Class<T> enumClass) {
		final Pattern entityIDPrefix = Pattern.compile(this.PREFIX_TABLE);
		final Map<Integer, T> map = new HashMap<Integer, T>();

		String id = "";
		String value = "";

		// if keyword of this table is at the beginning of the Scanner object,
		// skip this line
		if (scanner.hasNext(tableKey)) {
			scanner.nextLine();
		}

		while (scanner.hasNext()) {
			scanner.skip(entityIDPrefix);
			id = scanner.next();
			// Scanner.nextLine() returns rest of line including delimiters; to
			// get beginning of content, the first delimiter is skipped
			scanner.skip(scanner.delimiter());
			value = scanner.nextLine();

			for (final T key : java.util.EnumSet.allOf(enumClass)) {
				if (value.equalsIgnoreCase(key.toString())) {
					map.put(Integer.valueOf(id, this.HEX_RADIX), key);
				}
			}
		}

		return map;
	}

	/**
	 * Writes entity table from given <code>Scanner table</code> to the class
	 * member <code>entityTable</code>
	 * 
	 * @param table
	 *            Scanner instance containing entity table according to HTF
	 *            specification
	 */
	private void readEntityTable(final Scanner table) {
		final Pattern entityIDPrefix = Pattern.compile(this.PREFIX_TABLE);
		final String tableKey = getHtfKeyword(this.KEY_ENTITY_TABLE);
		String entityID = "";
		String entityName = "";

		if (table.hasNext(tableKey)) {
			table.nextLine();
		}

		while (table.hasNext()) {
			table.skip(entityIDPrefix);
			entityID = table.next();
			// Scanner.nextLine() returns rest of line including delimiters; to
			// get beginning of content, the first delimiter is skipped
			table.skip(table.delimiter());
			entityName = table.nextLine();

			this.entityTable.put(Integer.parseInt(entityID, this.HEX_RADIX), entityName);
		}
	}

	/**
	 * Writes entity type table from given <code>Scanner table</code> to the
	 * class member <code>entityTypeTable</code>. Entity type id is decoded to
	 * the corresponding entity type name
	 * 
	 * @param table
	 *            Scanner instance containing entity table according to HTF
	 *            specification
	 * @see Htf2Ot1Converter#typeTable
	 */
	private void readEntityTypeTable(final Scanner table) {
		final Pattern entityIDPrefix = Pattern.compile(this.PREFIX_TABLE);
		final String tableKey = getHtfKeyword(this.KEY_ENTITY_TYPE_TABLE);
		EntityType entityType;
		String entityID = "";
		String typeID = "";

		if (table.hasNext(tableKey)) {
			table.nextLine();
		}

		table.nextLine();
		while (table.hasNext()) {
			table.skip(entityIDPrefix);
			entityID = table.next();
			// Scanner.nextLine() returns rest of line including delimiters; to
			// get beginning of content, the first delimiter is skipped
			table.skip(table.delimiter());
			typeID = table.nextLine();

			entityType = this.typeTable.get(Integer.parseInt(typeID, this.HEX_RADIX));

			this.entityTypeTable.put(Integer.parseInt(entityID, this.HEX_RADIX), entityType);
		}
	}

	/**
	 * Help method used during preparation of OT1 SchedulingEntity. Since HTF
	 * event ids are starting from 0 for each type of events (e.g. task events,
	 * runnable events, etc.) and OT1 events are numbered consecutively
	 * independent of entity type, this method must be called for each mapping
	 * of HTF event ids to HTF events. Therefore, this method is implemented by
	 * means of templates
	 * 
	 * @param map
	 *            Mapping of HTF event ids to HTF event names
	 * @return Map containing mapping of OT1 event IDs to HTF event types
	 * 
	 * @see Htf2Ot1Converter#prepareSchedulingEntity(long)
	 */
	private <T extends Enum<T>> EList<EventIdMappingType> getOT1EventTypes(final Map<Integer, T> map) {
		final EList<EventIdMappingType> mapping = new BasicEList<EventIdMappingType>();
		EventIdMappingType eventIDMapping;
		EventTypeEnum ot1Event = null;

		for (final T htfEvent : map.values()) {
			if ((ot1Event = this.htf2OT1mapping.getOT1Event(htfEvent)) != null) {
				eventIDMapping = this.ot1Factory.createEventIdMappingType();
				eventIDMapping.setEventId(BigInteger.valueOf(this.htf2OT1mapping.getOT1EventID(htfEvent)));
				eventIDMapping.setEventType(ot1Event);
				mapping.add(eventIDMapping);
			}
		}
		return mapping;
	}

	/**
	 * Add only those entries of <code>additionalMappings</code> to
	 * <code>registeredMappings</code> whose <code>EventID</code> is not already
	 * available in <code>registeredMappings</code>
	 * 
	 * @param registeredMappings
	 *            List of {@link EventIdMappingType} elements that shall be
	 *            extended by <code>additionalMappings</code>
	 * @param additionalMappings
	 *            List of {@link EventIdMappingType} elements that shall be
	 *            added to <code>registeredMappings</code> list without adding
	 *            entries that have an EventID already existing in
	 *            <code>registeredMappings</code>
	 */
	private void addUnregisteredIDMappings(final EList<EventIdMappingType> registeredMappings,
			final EList<EventIdMappingType> additionalMappings) {
		final EList<EventIdMappingType> newMappings = new BasicEList<EventIdMappingType>();
		boolean mappingUnregistered = true;

		for (final EventIdMappingType newEventIDMapping : additionalMappings) {
			for (final EventIdMappingType registeredEventIDMapping : registeredMappings) {
				if (registeredEventIDMapping.getEventId().equals(newEventIDMapping.getEventId())) {
					mappingUnregistered = false;
				}
			}
			if (mappingUnregistered) {
				newMappings.add(newEventIDMapping);
			}
			mappingUnregistered = true;
		}
		registeredMappings.addAll(newMappings);
	}

	/**
	 * Help method to prepare OT1 SchedulingEntity instance. Currently, an
	 * AUTOSAR OS scheduler is instanciated and all registered events are added
	 * to this scheduler instance.
	 * 
	 * @param uuid
	 *            Unique id of the prepared OT1 scheduling entity
	 * @return AUTOSAR OS scheduler instance according to OT1 specification
	 */
	private SchedulingEntityType prepareSchedulingEntity(final long uuid) {
		final SchedulingEntityType scheduler = this.ot1Factory.createAutosarOsType();
		final EventDescriptionType eventDescription = this.ot1Factory.createEventDescriptionType();
		SchedulingEntityElementType schedulingElement;

		scheduler.setUuid(uuid);
		scheduler.setEventDescription(eventDescription);

		// ToDo: omit adding unnecessary ot1-events
		eventDescription.getEventIdMapping().addAll(getOT1EventTypes(this.taskEventTable));

		addUnregisteredIDMappings(eventDescription.getEventIdMapping(), getOT1EventTypes(this.interruptEventTable));
		addUnregisteredIDMappings(eventDescription.getEventIdMapping(), getOT1EventTypes(this.runnableEventTable));
		addUnregisteredIDMappings(eventDescription.getEventIdMapping(), getOT1EventTypes(this.codeBlockEventTable));
		addUnregisteredIDMappings(eventDescription.getEventIdMapping(), getOT1EventTypes(this.signalEventTable));
		addUnregisteredIDMappings(eventDescription.getEventIdMapping(), getOT1EventTypes(this.semaphoreEventTable));

		for (final Integer key : this.entityTypeTable.keySet()) {
			schedulingElement = this.htf2OT1mapping.getOT1SchedulingEntityElement(this.entityTypeTable.get(key));
			schedulingElement.setId(BigInteger.valueOf(key));
			schedulingElement.setName(this.entityTable.get(key));
			schedulingElement.setTimingConstraints(this.ot1Factory.createTimingConstraintsType());
			schedulingElement.setTimingValues(this.ot1Factory.createTimingValuesType());

			scheduler.getElement().add(schedulingElement);
		}

		return scheduler;
	}

	/**
	 * Converts each entry of the trace data section from HTF to OT1 and adds
	 * these new OT1 elements to the class member <code>ot1Model</code>.
	 * 
	 * @param trace
	 *            Scanner instance containing complete section of trace data in
	 *            HTF
	 */
	private void convertTraceEntries(final Scanner trace) {
		// using this delimiter divides the Scanner object into trace sets per
		// core
		trace.useDelimiter(this.PREFIX_TABLE);
		trace.next();
		Scanner coreTrace;

		// compute length of substrings of trace entry
		// each trace entry consists of timestamp, entityID, and eventID
		final int timestampLength = Integer.parseInt((this.headerContent.get(HeaderKey.TIMESTAMPLENGTH.toString())))
				* this.NUM_HEX_DIGITS_PER_BYTE;
		final int entityLength = Integer.parseInt((this.headerContent.get(HeaderKey.ENTITYLENGTH.toString())))
				* this.NUM_HEX_DIGITS_PER_BYTE;
		final int eventLength = Integer.parseInt((this.headerContent.get(HeaderKey.EVENTLENGTH.toString())))
				* this.NUM_HEX_DIGITS_PER_BYTE;

		// compute indices of substring endings
		final int entryLength = timestampLength + eventLength + entityLength;
		final int firstEventIdx = entryLength - eventLength;
		final int firstEntityIdx = firstEventIdx - entityLength;

		// declaration of local variables used within the following nested loops
		int coreID;
		String htfTraceEntry;
		int htfEventID;
		int htfEntityID;
		long timestamp;
		long ot1EventID;

		// OT1 model elements
		SchedulingEntityType scheduler;
		ClockType clock;
		TimeValueType tickduration;
		TraceEntryType ot1TraceEntry;

		while (trace.hasNext()) {
			coreTrace = new Scanner(trace.next());

			// extract id of the core
			coreID = Integer.parseInt(coreTrace.next(), this.HEX_RADIX);

			// each core is associated to one separate OT1-schedulingEntity
			scheduler = prepareSchedulingEntity(createUuid());
			final TracesType traceType = this.ot1Factory.createTracesType();
			final XmlTraceType xmlTraceType = this.ot1Factory.createXmlTraceType();
			clock = this.ot1Factory.createClockType();
			tickduration = this.ot1Factory.createTimeValueType();

			// Todo: get TimeBase from headerContent
			tickduration.setUnit(TimeBaseEnum.NS);
			tickduration.setNominator(new BigInteger(this.headerContent.get(HeaderKey.TIMESCALENUMERATOR.toString())));
			tickduration.setDenominator(new BigInteger(
					this.headerContent.get(HeaderKey.TIMESCALEDENOMINATOR.toString())));

			clock.setTickduration(tickduration);
			clock.setMaxAbsTime(BigInteger.valueOf(Integer.MAX_VALUE));

			scheduler.setClock(clock);
			scheduler.setName("Core" + coreID);
			scheduler.setTraces(traceType);

			xmlTraceType.setUuid(createUuid());
			traceType.getXmlTrace().add(xmlTraceType);

			// iterate all trace entries of core with id coreID
			while (coreTrace.hasNext()) {
				htfTraceEntry = coreTrace.next();
				if (!htfTraceEntry.isEmpty()) {
					// trace entry is a hex number and contains timestamp,
					// entity id, and event id
					// extract these data by splitting the hex number according
					// to the precomputed indices
					htfEventID = Integer.valueOf(htfTraceEntry.substring(firstEventIdx, entryLength), this.HEX_RADIX);
					htfEntityID = Integer.valueOf(htfTraceEntry.substring(firstEntityIdx, firstEventIdx),
							this.HEX_RADIX);
					timestamp = Integer.valueOf(htfTraceEntry.substring(0, firstEntityIdx), this.HEX_RADIX);

					ot1TraceEntry = this.ot1Factory.createTraceEntryType();
					ot1TraceEntry.setTime(BigInteger.valueOf(timestamp));
					ot1TraceEntry.setElementRefId(BigInteger.valueOf(htfEntityID));
					// look-up eventID
					final EntityType htfType = this.entityTypeTable.get(new Integer(htfEntityID));
					switch (htfType) {
						case TASK:
							ot1EventID = this.htf2OT1mapping.getOT1EventID(this.taskEventTable.get(htfEventID));
							break;
						case ISR:
							ot1EventID = this.htf2OT1mapping.getOT1EventID(this.interruptEventTable.get(htfEventID));
							break;
						case RUNNABLE:
							ot1EventID = this.htf2OT1mapping.getOT1EventID(this.runnableEventTable.get(htfEventID));
							break;
						case CODEBLOCK:
							ot1EventID = this.htf2OT1mapping.getOT1EventID(this.codeBlockEventTable.get(htfEventID));
							break;
						case SIGNAL:
							ot1EventID = this.htf2OT1mapping.getOT1EventID(this.signalEventTable.get(htfEventID));
							break;
						case SEMAPHORE:
							ot1EventID = this.htf2OT1mapping.getOT1EventID(this.semaphoreEventTable.get(htfEventID));
							break;
						default:
							ot1EventID = -1;
					}
					ot1TraceEntry.setEventId(BigInteger.valueOf(ot1EventID));

					xmlTraceType.getTraceEntry().add(ot1TraceEntry);
				}
			}

			this.ot1Model.getOT1().getSchedulingEntity().add(scheduler);
			coreTrace.close();
		}
	}

	/**
	 * Method is invoked to convert trace data given by a HTF file to OT1 model.
	 * 
	 * @param filename
	 *            Full path filename of a file in HTF format
	 * @return DocumentRoot element of an OT1 model containing all trace data
	 *         from HTF file
	 */
	public DocumentRoot convertHtf2Ot1(final String filename) {
		init();
		// keep local reference to ot1Model; this way, global ot1Model reference
		// can be reset before returning created OT1 model
		final DocumentRoot model = this.ot1Model;

		try (final Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
			// read general header data
			scanner.useDelimiter(getHtfKeyword(this.KEY_TYPE_TABLE));
			try (Scanner htfPart = new Scanner(scanner.next())) {
				readHeader(htfPart);
			}

			// work on table definitions from htf file
			scanner.useDelimiter(getHtfKeyword(this.KEY_TRACEDATA));
			try (Scanner htfPart = new Scanner(scanner.next())) {
				readLookUpTables(htfPart);
			}

			// read trace entries from htf file and convert them to OT1
			// xml-trace format
			try (Scanner htfPart = new Scanner(scanner.next())) {
				convertTraceEntries(htfPart);
			}

			scanner.close();
		}
		catch (final Exception e) {
			e.printStackTrace();
		}

		reset();

		return model;
	}
}
