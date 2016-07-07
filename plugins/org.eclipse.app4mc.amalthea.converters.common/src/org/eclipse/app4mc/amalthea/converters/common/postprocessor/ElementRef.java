package org.eclipse.app4mc.amalthea.converters.common.postprocessor;

class ElementRef {

	private String name;
	private String type;

	ElementRef parentRef;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}


	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public ElementRef getParentRef() {
		return this.parentRef;
	}

	public void setParentRef(final ElementRef parentRef) {
		this.parentRef = parentRef;
	}


}