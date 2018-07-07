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

import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.tracing.converter.Htf2Ot1Converter.CodeBlockEvent;
import org.eclipse.app4mc.tracing.converter.Htf2Ot1Converter.EntityType;
import org.eclipse.app4mc.tracing.converter.Htf2Ot1Converter.InterruptEvent;
import org.eclipse.app4mc.tracing.converter.Htf2Ot1Converter.RunnableEvent;
import org.eclipse.app4mc.tracing.converter.Htf2Ot1Converter.SignalEvent;
import org.eclipse.app4mc.tracing.converter.Htf2Ot1Converter.TaskEvent;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Factory;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType;

/**
 * Mapping of HTF elements (entities and events) to the corresponding OT1
 * elements. Mapping of entities as well as events are defined by means of
 * <code>private final HashMap</code>s and can be querried by public methods.
 * 
 * @author Jan Jatzkowski
 */
public class Htf2OT1Mapping {
	private final String PREFIX_FACTORY_CREATE = "create";
	private final OT1Factory ot1Factory = OT1Factory.eINSTANCE;

	/**
	 * This map contains mapping of HTF events to OT1 events. Events are related
	 * to tasks, interrupts, runnables, and signals. Semaphores are currently
	 * not considered because they are not covered by the current OT1 version
	 */
	private final Map<Object, EventTypeEnum> eventMapping = new HashMap<Object, EventTypeEnum>() {

		private static final long serialVersionUID = 1L;

		{
			// task events
			put(TaskEvent.ACTIVATE, EventTypeEnum.SCHED_ACTIVATION);
			put(TaskEvent.START, EventTypeEnum.SCHED_START);
			put(TaskEvent.PREEMPT, EventTypeEnum.SCHED_PREEMPT);
			put(TaskEvent.RELEASE, EventTypeEnum.SCHED_RELEASE);
			put(TaskEvent.RESUME, EventTypeEnum.SCHED_RESUME);
			put(TaskEvent.PARK, EventTypeEnum.SCHED_STOP);
			put(TaskEvent.TERMINATE, EventTypeEnum.SCHED_TERMINATE);
			put(TaskEvent.WAIT, EventTypeEnum.SCHED_WAIT);
			// put(TaskEvent.POLL, EventTypeEnum.);
			// put(TaskEvent.RUN_POLLING, EventTypeEnum.);
			// put(TaskEvent.POLL_PARKING, EventTypeEnum.);
			// put(TaskEvent.RELEASE_PARKING, EventTypeEnum.);

			// interrupt events
			put(InterruptEvent.START, EventTypeEnum.SCHED_START);
			put(InterruptEvent.PREEMPT, EventTypeEnum.SCHED_PREEMPT);
			put(InterruptEvent.RESUME, EventTypeEnum.SCHED_RESUME);
			put(InterruptEvent.TERMINATE, EventTypeEnum.SCHED_TERMINATE);

			// runnable events
			put(RunnableEvent.START, EventTypeEnum.RUNNABLE_START);
			put(RunnableEvent.TERMINATE, EventTypeEnum.RUNNABLE_STOP);
			// put(RunnableEvent.SUSPEND, EventTypeEnum.);
			// put(RunnableEvent.RESUME, EventTypeEnum.);

			// code block events
			put(CodeBlockEvent.START, EventTypeEnum.CODEBLOCK_START);
			put(CodeBlockEvent.STOP, EventTypeEnum.CODEBLOCK_STOP);

			// signal events
			put(SignalEvent.READ, EventTypeEnum.SIG_RECEIVE);
			put(SignalEvent.WRITE, EventTypeEnum.SIG_TRANSMIT);

			// semaphore events
			// put(SemaphoreEvent.LOCK, EventTypeEnum.);
			// put(SemaphoreEvent.UNLOCK, EventTypeEnum.);
		}
	};

	/**
	 * This map contains mapping of HTF entity types to OT1 scheduling entity
	 * types. Currently covered by this mapping are tasks, ISRs, runnables, and
	 * stimulus
	 */
	private final Map<EntityType, String> entityTypeMapping = new EnumMap<EntityType, String>(EntityType.class) {
		private static final long serialVersionUID = 1L;

		{
			put(EntityType.TASK, TaskType.class.getSimpleName());
			put(EntityType.ISR, InterruptType.class.getSimpleName());
			put(EntityType.RUNNABLE, RunnableType.class.getSimpleName());
			put(EntityType.CODEBLOCK, CodeBlockType.class.getSimpleName());
			put(EntityType.SIGNAL, SignalType.class.getSimpleName());
			// put(EntityType.SEMAPHORE, Type.class.getSimpleName());

		}
	};

	/**
	 * This template method returns the OT1 event corresponding to the given HTF
	 * event based on the mapping provided by the <code>eventMapping</code>
	 * 
	 * @param htfEventType
	 *            An Enum providing HTF event types (i.e. Enum values are
	 *            labeled according to HTF event types)
	 * @return OT1 event type that corresponds to the HTF event type according
	 *         to the mapping provided by the private class member
	 *         <code>eventMapping</code>
	 * @see Htf2OT1Mapping#eventMapping
	 */
	public <T extends Enum<T>> EventTypeEnum getOT1Event(final T htfEventType) {
		return this.eventMapping.get(htfEventType);
	}

	/**
	 * This template method returns the OT1 event id corresponding to the given
	 * HTF event based on the mapping provided by the <code>eventMapping</code>
	 * 
	 * @param htfEventType
	 *            An Enum providing HTF event types (i.e. Enum values are
	 *            labeled according to HTF event types)
	 * @return OT1 event type id that corresponds to the HTF event type
	 *         according to the mapping provided by the private class member
	 *         <code>eventMapping</code>
	 * @see Htf2OT1Mapping#eventMapping
	 */
	public <T extends Enum<T>> int getOT1EventID(final T htfEventType) {
		return this.eventMapping.get(htfEventType).getValue();
	}

	/**
	 * Creates an OT1 SchedulingEntityElement instance that corresponds to the
	 * given HTF entity type according to the mapping provided by the private
	 * class member <code>entityTypeMapping</code>
	 * 
	 * @param htfEntityType
	 *            HTF entity type that shall be mapped to the corresponding OT1
	 *            SchedulingEntityElement (e.g. task, ISR)
	 * @return Instance of a subclass of the OT1 SchedulingEntityElement class
	 *         that corresponds to the given HTF entity type
	 * @see Htf2OT1Mapping#entityTypeMapping
	 */
	@SuppressWarnings("rawtypes")
	public SchedulingEntityElementType getOT1SchedulingEntityElement(final EntityType htfEntityType) {
		final String methodName = this.PREFIX_FACTORY_CREATE + this.entityTypeMapping.get(htfEntityType);
		final Class[] paramGetMethod = null;
		final Object[] paramInvoke = null;
		SchedulingEntityElementType entity = null;
		try {
			entity = (SchedulingEntityElementType) this.ot1Factory.getClass().getMethod(methodName, paramGetMethod)
					.invoke(this.ot1Factory, paramInvoke);
		}
		catch (final IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (final IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (final InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (final NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (final SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}
}
