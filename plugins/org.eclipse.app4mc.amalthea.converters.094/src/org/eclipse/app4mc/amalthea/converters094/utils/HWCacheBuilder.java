package org.eclipse.app4mc.amalthea.converters094.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Document;
import org.jdom2.Element;

public class HWCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_093_094 helper;
	protected Logger logger;

	public HWCacheBuilder() {
		this.helper = HelperUtils_093_094.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}


	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {

		final HashMap<String, Object> hashMap = new HashMap<String, Object>();


		for (final File targetFile : fileName_documentsMap.keySet()) {

			getCacheMap().put(targetFile, hashMap);

			final Document document1 = fileName_documentsMap.get(targetFile);

			if (document1 == null) {
				// log error message
				continue;
			}

			final Element rootElement = document1.getRootElement();


			// TODO:
		}

	}

	@Override
	public Map<File, Map<String, Object>> getCacheMap() {
		return this.map;
	}

	@Override
	public void clearCacheMap() {

		this.map.clear();
	}

}
