/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.atdb.model;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.EventTypeEnum;


public enum EventType {
	ACTIVATE, START, SUSPEND, TERMINATE, RESUME, PREEMPT, WAIT, RELEASE, RELEASE_PARKING, PARK, POLL_PARKING, POLL, RUN, READ, WRITE;

	public static EventType getEventTypeForOT1(final EventTypeEnum ot1EventType) {
		switch (ot1EventType) {
			case FUNCTION_START:
			case RUNNABLE_START:
			case SCHED_START:
				return START;

			case FUNCTION_STOP:
			case RUNNABLE_STOP:
				return SUSPEND;

			case CODEBLOCK_START:
			case CODEBLOCK_STOP:

			case FRAME_RECEIVE:
			case PDU_RECEIVE:
			case MSG_RECEIVE:
			case SIG_RECEIVE:
				return READ;

			case FRAME_TRANSMIT:
			case MSG_TRANSMIT:
			case PDU_TRANSMIT:
			case SIG_TRANSMIT:
				return WRITE;

			case SCHED_ACTIVATION:
				return ACTIVATE;

			case SCHED_PREEMPT:
				return PREEMPT;

			case SCHED_RELEASE:
				return RELEASE;

			case SCHED_RESUME:
				return RESUME;

			case SCHED_TERMINATE:
			case SCHED_STOP:
				return TERMINATE;

			case SCHED_WAIT:
				return WAIT;

			case SYNC:
			case TIMERANGE_START:
			case TIMERANGE_STOP:
			case TIMESTAMP:
			case TIMESTAMP_DATA:
			case ERROR:
			case SCHED_ACTIVATION_FAILED:
				break;

		}
		return null;
	}
}
