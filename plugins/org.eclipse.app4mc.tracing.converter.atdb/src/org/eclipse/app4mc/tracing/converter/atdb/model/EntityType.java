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
package org.eclipse.app4mc.tracing.converter.atdb.model;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.ApplicationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CodeBlockType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CommunicationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DataElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.DataRangeElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventChainElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventReferenceElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.FrameElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.FunctionType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.InterruptType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.MessageType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.PduType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ProcessType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.RunnableType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulableApplicationElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SchedulingEntityElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.SignalType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TaskType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.ThreadType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeRangeElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimeStampElementType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.VariableType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.VirtualElementType;

public enum EntityType {
	INSTRUCTION_BLOCK, RUNNABLE, INTERRUPT, PROCESS, SIGNAL, EVENT_CHAIN_ELEMENT, CORE;

	public static EntityType getEntityTypeForOT1Class(final SchedulingEntityElementType ot1element) {
		final SchedulingEntityElementType o = ot1element;
		if (o instanceof ApplicationElementType) {
			if (o instanceof CodeBlockType) {
				return INSTRUCTION_BLOCK;
			}
			else if (o instanceof FunctionType) {
				return RUNNABLE;
			}
			else if (o instanceof RunnableType) {
				return RUNNABLE;
			}
			else if (o instanceof SchedulableApplicationElementType) {
				if (o instanceof InterruptType) {
					return INTERRUPT;
				}
				else if (o instanceof ProcessType) {
					return PROCESS;
				}

				else if (o instanceof TaskType) {
					return PROCESS;
				}
				else if (o instanceof ThreadType) {
					return null;
				}
				else {
					return null;
				}

			}
		}
		else if (o instanceof CommunicationElementType) {
			if (o instanceof FrameElementType) {
				return null;
			}
			else if (o instanceof MessageType) {
				return null;
			}
			else if (o instanceof PduType) {
				return null;
			}
			else if (o instanceof SignalType) {
				return SIGNAL;
			}
		}
		else if (o instanceof DataElementType) {
			if (o instanceof DataRangeElementType) {
				return SIGNAL;
			}
			else if (o instanceof VariableType) {
				return SIGNAL;
			}
		}
		else if (o instanceof VirtualElementType) {
			if (o instanceof TimeRangeElementType) {
				if (o instanceof EventChainElementType) {
					return EVENT_CHAIN_ELEMENT;
				}
				return null;
			}
			else if (o instanceof TimeStampElementType) {
				if (o instanceof EventReferenceElementType) {
					return null;
				}
				return null;
			}
		}
		throw new IllegalArgumentException("Type of OT1-Element not supported by now.");
	}

	public static String getATDBAbbrev(final EntityType entityType) {
		switch (entityType) {
			case CORE:
				return "Core";
			case EVENT_CHAIN_ELEMENT:
				return "EventChain";
			case INTERRUPT:
				return "Interrupt";
			case INSTRUCTION_BLOCK:
				return "InstructionBlock";
			case PROCESS:
				return "Process";
			case RUNNABLE:
				return "Runnable";
			case SIGNAL:
				return "Signal";
			default:
				break;
		}
		return null;
	}
}
