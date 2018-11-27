package org.eclipse.app4mc.amalthea.converters.common.utils;

public enum InputModelVersions {

	itea_103("itea.103"),
	itea_110("itea.110"),
	itea_111("itea.111"),
	_070("0.7.0"),
	_071("0.7.1"),
	_072("0.7.2"),
	_080("0.8.0"),
	_081("0.8.1"),
	_082("0.8.2"),
	_083("0.8.3"),
	_090("0.9.0"),
	_091("0.9.1"),
	_092("0.9.2");
	
	private String value;
	
	InputModelVersions(String value){
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String validModelVersions() {
		
		StringBuffer value=new StringBuffer();
		
		InputModelVersions[] values = InputModelVersions.values();
		
		for (InputModelVersions inputModelVersion : values) {
			value.append(inputModelVersion.getValue());
			value.append(System.getProperty("line.separator"));
		}

		return value.toString();
	}
	
	public boolean isVersionValid(String version) {

		 InputModelVersions[] values = InputModelVersions.values();
		
		 for (InputModelVersions inputModelVersions : values) {
			if( inputModelVersions.getValue().equals(version)) {
				return true;
			}
		}
		
		return false;
	}
}
