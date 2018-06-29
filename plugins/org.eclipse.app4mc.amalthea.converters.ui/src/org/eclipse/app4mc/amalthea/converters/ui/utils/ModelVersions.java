package org.eclipse.app4mc.amalthea.converters.ui.utils;

import java.util.ArrayList;
import java.util.List;

public class ModelVersions {

	
	public static List<String> get(){
		
		List<String> allSupportedVersions=new ArrayList<String>();
		
		allSupportedVersions.add("itea.103");
		allSupportedVersions.add("itea.110");
		allSupportedVersions.add("itea.111");
		allSupportedVersions.add("0.7.0");
		allSupportedVersions.add("0.7.1");
		allSupportedVersions.add("0.7.2");
		allSupportedVersions.add("0.8.0");
		allSupportedVersions.add("0.8.1");
		allSupportedVersions.add("0.8.2");
		allSupportedVersions.add("0.8.3");
		allSupportedVersions.add("0.9.0");
		allSupportedVersions.add("0.9.1");

		return allSupportedVersions;
	}
}
