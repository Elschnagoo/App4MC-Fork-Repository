package org.eclipse.app4mc.atdb.metrics;

public class Metric {

	public final String name;
	public final long maximum;
	public final long average;
	public final long minimum;

	public Metric(final String name, final long min, final long avg, final long max) {
		this.name = name;
		this.average = avg;
		this.minimum = min;
		this.maximum = max;
	}
}
