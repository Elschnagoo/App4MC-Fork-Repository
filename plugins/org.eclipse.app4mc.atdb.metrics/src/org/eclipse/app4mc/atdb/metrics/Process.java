package org.eclipse.app4mc.atdb.metrics;

public class Process {

	public final String name;
	public final String databaseTableName;
	public final int primaryKey;

	public Process(final int primaryKey, final String name, final String databaseTableName) {
		this.name = name;
		this.primaryKey = primaryKey;
		this.databaseTableName = databaseTableName;
	}

	public boolean hasEvents() {
		return this.databaseTableName != null;
	}
}
