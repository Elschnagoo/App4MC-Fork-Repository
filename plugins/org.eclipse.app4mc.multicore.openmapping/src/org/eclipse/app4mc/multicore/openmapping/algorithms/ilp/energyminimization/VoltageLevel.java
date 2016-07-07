/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization;

public class VoltageLevel implements Comparable<VoltageLevel> {
	final private String name;
	private double scale;
	private double volt;

	VoltageLevel(final String n) {
		this.name = n;
	}

	public String getName() {
		return this.name;
	}

	public double getScale() {
		return this.scale;
	}

	public void setScale(final double scale) {
		this.scale = scale;
	}

	public double getVolt() {
		return this.volt;
	}

	public void setVolt(final double volt) {
		this.volt = volt;
	}

	@Override
	public int compareTo(final VoltageLevel arg0) {
		if (getScale() < arg0.getScale()) {
			return 1;
		}
		else if (getScale() > arg0.getScale()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
