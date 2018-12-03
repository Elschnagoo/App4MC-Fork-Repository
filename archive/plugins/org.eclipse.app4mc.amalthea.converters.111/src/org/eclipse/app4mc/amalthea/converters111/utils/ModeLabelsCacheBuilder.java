package org.eclipse.app4mc.amalthea.converters111.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractAttributeRefCacheBuilder;
import org.jdom2.Document;

public class ModeLabelsCacheBuilder extends AbstractAttributeRefCacheBuilder {

	Map<File, Document> fileName_documentsMap;

	public ModeLabelsCacheBuilder() {

		this.helper = HelperUtils_110_111.getInstance();
	}

	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {

		this.fileName_documentsMap = fileName_documentsMap;

		for (final File targetFile : fileName_documentsMap.keySet()) {

			/*- Cache initialized */

			getCacheMap().put(targetFile, new HashMap<String, Object>());

			final Document rootDocument = fileName_documentsMap.get(targetFile);

			/*- Key is a UUID and value is Element  */

			populate_All_UUID_Elements(targetFile, rootDocument, ".//swModel/modeLabels|/sw:SWModel/modeLabels",
					CacheEnum.UUID_ELEMENT.name(), this.helper.getNS_110("sw"));

			populate_All_Elements_With_Name(targetFile, rootDocument, ".//swModel/modeLabels|/sw:SWModel/modeLabels",
					CacheEnum.ELEMENT_NAME.name(), this.helper.getNS_110("sw"));

		}


	}

	/**
	 * This method is used to update the ModeLabel cache for a specific file
	 *
	 * @param targetFile
	 */
	public void updateCache(final File targetFile) {

		final Document rootDocument = this.fileName_documentsMap.get(targetFile);

		/*- Key is a UUID and value is Element  */

		populate_All_UUID_Elements(targetFile, rootDocument, ".//swModel/modeLabels|/sw:SWModel/modeLabels",
				CacheEnum.UUID_ELEMENT.name(), this.helper.getNS_110("sw"));

		populate_All_Elements_With_Name(targetFile, rootDocument, ".//swModel/modeLabels|/sw:SWModel/modeLabels",
				CacheEnum.ELEMENT_NAME.name(), this.helper.getNS_110("sw"));
	}

}
