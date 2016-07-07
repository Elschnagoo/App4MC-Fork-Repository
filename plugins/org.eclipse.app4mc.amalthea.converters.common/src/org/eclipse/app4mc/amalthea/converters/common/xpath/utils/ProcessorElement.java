package org.eclipse.app4mc.amalthea.converters.common.xpath.utils;

public class ProcessorElement<A, B, C> {

	private A configurationElement;
	private B inputVersions;
	private C outputVersions;

	public ProcessorElement(final A element1, final B element2, final C element3) {
		this.configurationElement = element1;
		this.inputVersions = element2;
		this.outputVersions = element3;
	}

	public A getConfigurationElement() {
		return this.configurationElement;
	}

	public void setConfigurationElement(final A element1) {
		this.configurationElement = element1;
	}

	public B getInputVersions() {
		return this.inputVersions;
	}

	public void setInputVersions(final B element2) {
		this.inputVersions = element2;
	}

	public C getOutputVersions() {
		return this.outputVersions;
	}

	public void setOutputVersions(final C element3) {
		this.outputVersions = element3;
	}


}
