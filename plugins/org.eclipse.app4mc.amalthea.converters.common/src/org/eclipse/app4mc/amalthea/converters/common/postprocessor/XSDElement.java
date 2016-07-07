package org.eclipse.app4mc.amalthea.converters.common.postprocessor;

import java.util.HashSet;
import java.util.Set;

class XSDElement {

	private String name;
	private String type;

	final Set<XSDElement> parentRefs = new HashSet<XSDElement>();

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Set<XSDElement> getParentRefs() {
		return this.parentRefs;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}


}