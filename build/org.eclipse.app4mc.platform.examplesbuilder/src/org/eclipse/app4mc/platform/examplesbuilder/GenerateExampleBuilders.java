/**
 ********************************************************************************
 * Copyright (c) 2012 Eclipse contributors and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * *******************************************************************************
 */

package org.eclipse.app4mc.platform.examplesbuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GenerateExampleBuilders {
	private static final String TOKEN_EXAMPLE_PROJECT = "#EXAMPLE_PROJECT#";

	private static final String TOKEN_INSTALLER_PROJECT = "#INSTALLER_PROJECT#";

	private static final String TOKEN_RELEVANT_RESOURCES = "#RELEVANT_RESOURCES#";

	private static final String TOKEN_REFRESH_RESOURCES = "#REFRESH_RESOURCES#";

	private static final String NL = System.getProperty("line.separator");

	public static void main(final String[] args) throws Exception {
		final File relengProject = new File(args[0]).getCanonicalFile();
		final File installerPoject = new File(args[1]).getCanonicalFile();
		final File pluginXML = new File(installerPoject, "plugin.xml");
		System.out.println("Analyzing " + pluginXML);

		final SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		final XMLHandler handler = new XMLHandler(relengProject, installerPoject);

		try (InputStream in = new FileInputStream(pluginXML)) {
			parser.parse(in, handler);
		}
	}

	static void processProjectDescriptor(final File exampleProject, final File relengProject,
			final File installerProject, final String targetFolder) throws Exception {
		final String exampleProjectName = exampleProject.getName();
		final String targetPath = installerProject.getName() + "/" + targetFolder;

		final StringBuilder relevantResources = new StringBuilder();
		relevantResources.append(getItemPath(targetPath, 2));

		for (final File file : exampleProject.listFiles()) {
			final String name = file.getName();
			final int type = file.isDirectory() ? 2 : 1;

			if (!"bin".equals(name)) {
				final String path = exampleProjectName + "/" + name;
				relevantResources.append(getItemPath(path, type));
			}
		}

		final Map<String, String> substitutes = new HashMap<String, String>();
		addSubtitute(substitutes, TOKEN_EXAMPLE_PROJECT, exampleProject.getName());
		addSubtitute(substitutes, TOKEN_INSTALLER_PROJECT, installerProject.getName());
		addSubtitute(substitutes, TOKEN_RELEVANT_RESOURCES, relevantResources.toString());
		addSubtitute(substitutes, TOKEN_REFRESH_RESOURCES, getItemPath(new File(targetPath).getParent(), 2));

		copy(exampleProject, relengProject, substitutes, "copyExample.ant", ".externalToolBuilders/copyExample.ant");
		copy(exampleProject, relengProject, substitutes, "template.launch",
				".externalToolBuilders/" + exampleProjectName + ".launch");

		updateProjectDescription(exampleProject, relengProject, substitutes);
	}

	private static void copy(final File targetProject, final File relengProject, final Map<String, String> substitutes,
			final String template, final String targetPath) throws IOException {
		final File source = getTemplate(relengProject, template);
		final String content = substitute(readFile(source), substitutes);

		final File target = new File(targetProject, targetPath);
		System.out.println("      Generating " + target.getCanonicalPath());
		target.getParentFile().mkdir();
		writeFile(target, content);
	}

	private static void updateProjectDescription(final File targetProject, final File relengProject,
			final Map<String, String> substitutes) throws IOException {
		final File snippetTemplate = getTemplate(relengProject, "template.project");
		final String snippet = substitute(readFile(snippetTemplate), substitutes);

		final File descriptionFile = new File(targetProject, ".project");
		final String description = readFile(descriptionFile);
		System.out.println("      Updating " + descriptionFile.getCanonicalPath());

		if (description.indexOf(snippet) != -1) {
			// Nothing to update
			return;
		}

		String newDescription = description;

		final Pattern pattern = Pattern.compile(
				"(\\s*<buildCommand>.*?</buildCommand>)*(\\s*<buildCommand>.*?<value>&lt;project&gt;/\\.externalToolBuilders/"
						+ targetProject.getName().replace(".", "\\.") + "\\.launch</value>.*?</buildCommand>)",
				Pattern.DOTALL);
		final Matcher matcher = pattern.matcher(description);
		if (matcher.find()) {
			final String remove = matcher.group(2);
			newDescription = newDescription.replace(remove, "");
		}

		newDescription = newDescription.replaceFirst("[ \\t]*</buildSpec>", snippet + "\t</buildSpec>");
		if (!newDescription.equals(description)) {
			writeFile(descriptionFile, newDescription);
		}
	}

	private static String readFile(final File file) throws IOException {
		final StringBuilder result = new StringBuilder();

		try (FileReader in = new FileReader(file); BufferedReader reader = new BufferedReader(in)) {
			String line;
			while ((line = reader.readLine()) != null) {
				result.append(line);
				result.append(NL);
			}

			return result.toString();
		}
	}

	private static void writeFile(final File file, final String content) throws IOException {
		try (FileWriter out = new FileWriter(file); BufferedWriter writer = new BufferedWriter(out)) {
			writer.write(content);
			writer.flush();
		}
	}

	private static String getItemPath(final String resource, final int type) {
		return "&lt;item path=&quot;/" + resource.replace('\\', '/') + "&quot; type=&quot;" + type
				+ "&quot;/&gt;&#13;&#10;";
	}

	private static File getTemplate(final File root, final String template) {
		return new File(root, "exampleBuilderTemplates/" + template);
	}

	private static void addSubtitute(final Map<String, String> substitutes, final String token,
			final String substitute) {
		System.out.println("      " + token + " = " + substitute);
		substitutes.put(token, substitute);
	}

	private static String substitute(String content, final Map<String, String> substitutes) {
		for (final Entry<String, String> entry : substitutes.entrySet()) {
			content = content.replace(entry.getKey(), entry.getValue());
		}

		return content;
	}

	private static class XMLHandler extends DefaultHandler {
		private final File relengProject;
		private final File installerPoject;

		public XMLHandler(final File relengProject, final File installerPoject) {
			this.relengProject = relengProject;
			this.installerPoject = installerPoject;
		}

		@Override
		public void startElement(final String uri, final String localName, final String qName,
				final Attributes attributes) throws SAXException {
			if ("projectDescriptor".equalsIgnoreCase(qName)) {
				try {
					final String name = attributes.getValue("name");
					final String contentURI = attributes.getValue("contentURI");
					final File exampleProject = new File(this.installerPoject, "../../examples/" + name)
							.getCanonicalFile();

					System.out.println("   Processing " + name + " --> " + contentURI);
					System.out.println("   exampleProject: " + exampleProject);
					System.out.println("   installerProject: " + this.installerPoject);

					processProjectDescriptor(exampleProject, this.relengProject, this.installerPoject, contentURI);
				}
				catch (final Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
