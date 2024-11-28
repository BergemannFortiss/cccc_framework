/*-------------------------------------------------------------------------+
| Copyright 2024 fortiss GmbH                                              |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
+--------------------------------------------------------------------------*/
package org.fortiss.consistency.configuration;

import static javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING;
import static org.fortiss.consistency.model.ClearanceBasis.ALL;
import static org.fortiss.consistency.model.ClearanceBasis.NONE;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createAbstractElementRelation;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createClearance;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createConfidentialityStatus;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createConsistencyRule;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createExceptionAttribute;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createExceptionEntry;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createFeedbackLevelClearance;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createFullBasicElementInformation;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createRelationTargetInformation;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createRuleElement;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.createToolAdapterRegistrationEntry;
import static org.fortiss.consistency.model.ConsistencyModelElementFactory.generateUniqueIdentifierBasedOnElemInfo;
import static org.fortiss.consistency.model.MatchType.IDENTICAL;
import static org.fortiss.consistency.model.MatchType.MAXIMUM;
import static org.fortiss.consistency.model.MatchType.MINIMUM;
import static org.w3c.dom.Node.ELEMENT_NODE;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.fortiss.consistency.model.AbstractElementRelation;
import org.fortiss.consistency.model.BasicElementInformation;
import org.fortiss.consistency.model.Clearance;
import org.fortiss.consistency.model.ClearanceBasis;
import org.fortiss.consistency.model.ConfidentialityStatus;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ExceptionAttribute;
import org.fortiss.consistency.model.ExceptionEntry;
import org.fortiss.consistency.model.FeedbackLevelClearance;
import org.fortiss.consistency.model.MatchType;
import org.fortiss.consistency.model.RelationTargetInformation;
import org.fortiss.consistency.model.RuleElement;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This class contains methods to extract needed information from XML files.
 * 
 * @author bergemann
 */
public class XmlExtractor {

	/**
	 * Extracts/Parses all paths information out of the given XML file and returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A map with all extracted values as strings.
	 */
	public static Map<String, String> parsePathsInformationFromXmlFile(File file,
			ConsistencyConfiguration config) {
		if(file == null) {
			return null;
		}
		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return null;
		}

		Element element = getFirstXmlElementByName(doc, "rules");
		String rulesPath = getAttributeFromXmlElement(element, "internalPath");

		element = getFirstXmlElementByName(doc, "links");
		String linksPath = getAttributeFromXmlElement(element, "internalPath");

		element = getFirstXmlElementByName(doc, "adapters");
		String adaptersPath = getAttributeFromXmlElement(element, "internalPath");

		element = getFirstXmlElementByName(doc, "viewtypes");
		String viewtypesPath = getAttributeFromXmlElement(element, "internalPath");

		element = getFirstXmlElementByName(doc, "logging");
		String loggingPath = getAttributeFromXmlElement(element, "internalPath");

		Map<String, String> extractedValues = new HashMap<>();
		extractedValues.put("rulesPath", rulesPath);
		extractedValues.put("linksPath", linksPath);
		extractedValues.put("adaptersPath", adaptersPath);
		extractedValues.put("viewtypesPath", viewtypesPath);
		extractedValues.put("loggingPath", loggingPath);

		return extractedValues;
	}

	/**
	 * Extracts/Parses all security information out of the given XML file and returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A map with all extracted values as strings.
	 */
	public static Map<String, String> parseSecurityInformationFromXmlFile(File file,
			ConsistencyConfiguration config) {
		if(file == null) {
			return null;
		}
		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return null;
		}

		Element parentElement = getFirstXmlElementByName(doc, "sslKeyStore");
		String keyStoreFilePath = getValueFromInternalXmlElement(parentElement, "internalPath");
		String keyStorePassword = getValueFromInternalXmlElement(parentElement, "password");

		parentElement = getFirstXmlElementByName(doc, "sslTrustStore");
		String trustStoreFilePath = getValueFromInternalXmlElement(parentElement, "internalPath");
		String trustStorePassword = getValueFromInternalXmlElement(parentElement, "password");

		String privateEncryptionKeyPath =
				getValueFromInternalXmlElement(doc, "encryptionPrivateKeyFile", "internalPath");
		String publicEncryptionKeyPath =
				getValueFromInternalXmlElement(doc, "encryptionPublicKeyFile", "internalPath");

		String clearanceAttributesPath =
				getValueFromInternalXmlElement(doc, "clearanceAttributesFile", "internalPath");
		String hiddenUserInfoPath =
				getValueFromInternalXmlElement(doc, "clearanceUserTokensFile", "internalPath");

		Map<String, String> extractedValues = new HashMap<>();
		extractedValues.put("keyStoreFilePath", keyStoreFilePath);
		extractedValues.put("keyStorePassword", keyStorePassword);
		extractedValues.put("trustStoreFilePath", trustStoreFilePath);
		extractedValues.put("trustStorePassword", trustStorePassword);
		extractedValues.put("privateEncryptionKeyPath", privateEncryptionKeyPath);
		extractedValues.put("publicEncryptionKeyPath", publicEncryptionKeyPath);
		extractedValues.put("clearanceAttributesPath", clearanceAttributesPath);
		extractedValues.put("hiddenUserInfoPath", hiddenUserInfoPath);

		return extractedValues;
	}

	/**
	 * Extracts/Parses all communication information out of the given XML file and returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A map with all extracted values as strings.
	 */
	public static Map<String, String> parseCommunicationInformationFromXmlFile(File file,
			ConsistencyConfiguration config) {
		if(file == null) {
			return null;
		}
		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return null;
		}

		Element parentElement = getFirstXmlElementByName(doc, "consistencyServer");
		String serverAddress = getValueFromInternalXmlElement(parentElement, "address");
		String serverPort = getValueFromInternalXmlElement(parentElement, "port");
		String serverMaxThreads = getValueFromInternalXmlElement(parentElement, "maxThreads");

		parentElement = getFirstXmlElementByName(doc, "timeouts");
		String connectionTimeout =
				getValueFromInternalXmlElement(parentElement, "connectionTimeout");
		String readTimeout = getValueFromInternalXmlElement(parentElement, "readTimeout");

		parentElement = getFirstXmlElementByName(doc, "sslContext");
		String sslProtocol = getValueFromInternalXmlElement(parentElement, "protocol");
		String sslCipherSuite = getValueFromInternalXmlElement(parentElement, "cipherSuite");
		String sslKeyStoreType = getValueFromInternalXmlElement(parentElement, "keyStoreType");
		String sslKeyManagerType = getValueFromInternalXmlElement(parentElement, "keyManagerType");

		parentElement = getFirstXmlElementByName(doc, "restEndpoints");
		String checkEndpoint = getValueFromInternalXmlElement(parentElement, "consistencyCheck");
		String dataEndpoint = getValueFromInternalXmlElement(parentElement, "dataRequest");

		Map<String, String> extractedValues = new HashMap<>();
		extractedValues.put("serverAddress", serverAddress);
		extractedValues.put("serverPort", serverPort);
		extractedValues.put("serverMaxThreads", serverMaxThreads);
		extractedValues.put("connectionTimeout", connectionTimeout);
		extractedValues.put("readTimeout", readTimeout);
		extractedValues.put("sslProtocol", sslProtocol);
		extractedValues.put("sslCipherSuite", sslCipherSuite);
		extractedValues.put("sslKeyStoreType", sslKeyStoreType);
		extractedValues.put("sslKeyManagerType", sslKeyManagerType);
		extractedValues.put("checkEndpoint", checkEndpoint);
		extractedValues.put("dataEndpoint", dataEndpoint);

		return extractedValues;
	}

	/**
	 * Extracts/Parses all information about the registered adapters out of the given XML file and
	 * returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A list with all extracted (registered) tool adapters.
	 * 
	 * @throws IOException
	 */
	public static List<ToolAdapterRegistrationEntry> parseAdaptersFromXmlFile(File file,
			ConsistencyConfiguration config) throws IOException {
		List<ToolAdapterRegistrationEntry> adapters = new ArrayList<>();

		if(file == null) {
			return null;
		}
		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return null;
		}

		List<Element> adapterElements = getAllXmlElementsByName(doc, "registeredAdapter");
		for(Element adapterElement : adapterElements) {
			String identifier = getValueFromInternalXmlElement(adapterElement, "adapterIdentifier");
			String name = getValueFromInternalXmlElement(adapterElement, "fullName");
			String address =
					getValueFromInternalXmlElement(adapterElement, "dataServerHostAddress");
			int port = Integer
					.valueOf(getValueFromInternalXmlElement(adapterElement, "dataServerPort"));
			String relativePublicKeyFilePath =
					getValueFromInternalXmlElement(adapterElement, "encryptionPublicKeyFile");
			String absolutePublicKeyFilePath =
					config.getAbsolutePathOfInternalResourceFile(relativePublicKeyFilePath);
			ToolAdapterRegistrationEntry adapterEntry = createToolAdapterRegistrationEntry(
					identifier, name, address, port, config.getEncryptionManager()
							.getSerializedKeyFromFile(absolutePublicKeyFilePath));
			adapters.add(adapterEntry);
		}

		return adapters;
	}

	/**
	 * Extracts/Parses all information about the registered element links out of the given XML file
	 * and returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A list with all extracted element links.
	 */
	public static HashMap<String, List<RelationTargetInformation>> parseLinksFromXmlFile(File file,
			ConsistencyConfiguration config) {
		// Each model element (instance) that is linked to another model element (instance) exists
		// inside this hash map as key (as identifier string based on its basic element
		// information). Each of these entries has than as value a list of the relation element
		// information of the elements that are linked with it.
		HashMap<String, List<RelationTargetInformation>> elementLinks = new HashMap<>();

		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return elementLinks;
		}

		List<Element> linkElements = getAllXmlElementsByName(doc, "link");
		for(Element linkElement : linkElements) {
			String type = getAttributeFromXmlElement(linkElement, "type");
			String comment = getAttributeFromXmlElement(linkElement, "comment");

			List<BasicElementInformation> elementInfoList = new ArrayList<>();
			List<Element> elements = getAllInternalXmlElementByName(linkElement, "element");
			for(Element element : elements) {
				String elementId = getAttributeFromXmlElement(element, "id");
				String elementName = getAttributeFromXmlElement(element, "name");
				String toolName = getAttributeFromXmlElement(element, "tool");
				String modelName = getAttributeFromXmlElement(element, "model");
				String elementClassString = getValueFromInternalXmlElement(element, "elementClass");

				BasicElementInformation elementInfo = createFullBasicElementInformation(
						elementClassString, elementName, elementId, modelName, toolName);
				elementInfoList.add(elementInfo);
			}

			for(BasicElementInformation elementInfo : elementInfoList) {
				String uuid = generateUniqueIdentifierBasedOnElemInfo(elementInfo);
				List<RelationTargetInformation> remainingElements = new ArrayList<>();
				for(BasicElementInformation basicInfo : elementInfoList) {
					if(!basicInfo.equals(elementInfo)) {
						RelationTargetInformation targetInfo = createRelationTargetInformation(
								EcoreUtil.copy(basicInfo), type, comment);
						remainingElements.add(targetInfo);
					}
				}
				if(elementLinks.containsKey(uuid)) {
					elementLinks.get(uuid).addAll(remainingElements);
				} else {
					elementLinks.put(uuid, remainingElements);
				}
			}
		}

		return elementLinks;
	}

	/**
	 * Extracts/Parses all information about the clearance attributes out of the given XML file
	 * and returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A list with all extracted clearance attributes.
	 */
	public static HashMap<String, List<String>> parseClearanceAttributesFromXmlFile(File file,
			ConsistencyConfiguration config) {
		// The map contains all found clearance attributes with their possible values. The keys are
		// the attribute names and each has as value a list of value names that this specific
		// attribute could form.
		HashMap<String, List<String>> attributeValuesPerAttribute = new HashMap<>();

		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return attributeValuesPerAttribute;
		}

		// Get all attributes defined in possibleAttributes.
		Map<String, String> attributeListNames = new HashMap<>();
		Element possibleAttributeList = getFirstXmlElementByName(doc, "possibleAttributes");
		List<Element> possibleAttributeElements =
				getAllInternalXmlElementByName(possibleAttributeList, "attribute");
		for(Element possibleAttributeElement : possibleAttributeElements) {
			String listName = getAttributeFromXmlElement(possibleAttributeElement, "listName");
			String attributeName = getValueFromXmlElement(possibleAttributeElement);
			attributeValuesPerAttribute.put(attributeName, new ArrayList<String>());
			attributeListNames.put(attributeName, listName);
		}

		// Get for all possible attributes their possible values.
		for(String attribute : attributeValuesPerAttribute.keySet()) {
			String attributeListName = attributeListNames.get(attribute);
			List<String> attributeValues = attributeValuesPerAttribute.get(attribute);

			Element attributeList = getFirstXmlElementByName(doc, attributeListName);
			List<Element> attributeValueElements =
					getAllInternalXmlElementByName(attributeList, attribute);
			for(Element attributeValueElement : attributeValueElements) {
				String attributeValue = getValueFromXmlElement(attributeValueElement);
				attributeValues.add(attributeValue);
			}
		}

		return attributeValuesPerAttribute;
	}

	/**
	 * Extracts/Parses all information about the defined consistency rules out of the given XML file
	 * and returns it.
	 * 
	 * @param file
	 *            The XML file form which the information should be extracted/parsed.
	 * @param config
	 *            The configuration with all the background information (logger, ...).
	 * 
	 * @return A list with all extracted consistency rules.
	 */
	public static List<ConsistencyRule> parseRulesFromXmlFile(File file,
			ConsistencyConfiguration config) {
		List<ConsistencyRule> rules = new ArrayList<>();
		List<String> existingRuleNames = new ArrayList<>();

		Document doc = getXmlDocument(file, config);
		if(doc == null) {
			return rules;
		}

		List<Element> ruleElements = getAllXmlElementsByName(doc, "rule");
		for(Element ruleElement : ruleElements) {
			boolean ignoreRule = false;

			// Get basic rule attributes.
			String ruleName = getAttributeFromXmlElement(ruleElement, "name");
			if(existingRuleNames.contains(ruleName)) {
				String warningMessage = "A consistency rule with the name '" + ruleName +
						"' exists already. The " + config.getConsistencyCheckerIdentifier() +
						" will continue, because the rules can still be distinguished by their UUID," +
						" but for the user it might get difficult the distinguish between feedbacks to these two rules." +
						" Therefore, we recommend to change one of these rule name occurrences.";
				config.logWarning(warningMessage);
			}
			String comment = getAttributeFromXmlElement(ruleElement, "comment");

			// Get rule scope.
			List<String> scopeClasses = new ArrayList<>();
			List<Element> scopeElements =
					getAllInternalXmlElementByName(ruleElement, "scopeElementClass");
			for(Element scopeElement : scopeElements) {
				String scopeElementClassString = getValueFromXmlElement(scopeElement);
				if(scopeElementClassString == null) {
					ignoreRule = true;
					continue;
				}
				scopeClasses.add(scopeElementClassString);
			}
			if(ignoreRule) {
				continue;
			}

			// Get rule context.
			List<AbstractElementRelation> contextCases = new ArrayList<>();
			List<Element> contextCaseElements =
					getAllInternalXmlElementByName(ruleElement, "contextCase");
			for(Element contextCaseElement : contextCaseElements) {
				String sourceIdentifier = getAttributeFromInternalXmlElement(contextCaseElement,
						"sourceClass", "identifier");
				String sourceClassString =
						getValueFromInternalXmlElement(contextCaseElement, "sourceClass");
				if(sourceClassString == null) {
					ignoreRule = true;
					continue;
				}
				RuleElement sourceElement = createRuleElement(sourceIdentifier, sourceClassString);

				List<RuleElement> targetRuleElements = new ArrayList<>();
				List<Element> targetElements =
						getAllInternalXmlElementByName(contextCaseElement, "targetClass");
				for(Element targetElement : targetElements) {
					String targetIdentifier =
							getAttributeFromXmlElement(targetElement, "identifier");
					String targetElementClassString = getValueFromXmlElement(targetElement);
					if(targetElementClassString == null) {
						ignoreRule = true;
						continue;
					}
					RuleElement targetRuleElement =
							createRuleElement(targetIdentifier, targetElementClassString);
					targetRuleElements.add(targetRuleElement);
				}
				if(ignoreRule) {
					continue;
				}

				contextCases.add(createAbstractElementRelation(sourceElement, targetRuleElements));
			}
			if(ignoreRule) {
				continue;
			}

			// Get rule condition.
			String condition = getValueFromInternalXmlElement(ruleElement, "condition");

			// Get rule confidentiality information.
			ConfidentialityStatus confidentialityStatus =
					extractConfidentialityStatusFromRule(ruleElement, config);

			// Create rule object with all extracted information and add it.
			ConsistencyRule rule = createConsistencyRule(ruleName, comment, scopeClasses,
					contextCases, condition, confidentialityStatus);
			rules.add(rule);
			existingRuleNames.add(ruleName);
		}
		return rules;
	}

	/**
	 * Extracts and returns the confidentiality status from the given rule (element) if it has one,
	 * otherwise null is returned.
	 */
	private static ConfidentialityStatus extractConfidentialityStatusFromRule(Element ruleElement,
			ConsistencyConfiguration config) {
		Element confidentialityElement =
				getFirstInternalXmlElementByName(ruleElement, "confidentialityStatus");
		if(confidentialityElement == null) {
			return null;
		}

		// Get the clearance for the rule.
		Clearance ruleClearance = null;
		Element ruleClearanceElement =
				getFirstInternalXmlElementByName(confidentialityElement, "ruleClearance");
		if(ruleClearanceElement != null) {
			ruleClearance = getClearance(ruleClearanceElement, config);
		}

		// Get the feedback detail level.
		FeedbackLevelClearance feedbackLevelClearance = null;
		Element feedbackLevelElement =
				getFirstInternalXmlElementByName(confidentialityElement, "feedbackLevelClearance");
		if(feedbackLevelElement != null) {
			Element inconsistencyWarningClearanceElement = getFirstInternalXmlElementByName(
					feedbackLevelElement, "inconsistencyWarningClearance");
			Clearance inconsistencyWarningClearance =
					getClearance(inconsistencyWarningClearanceElement, config);

			Element ruleWarningClearanceElement =
					getFirstInternalXmlElementByName(feedbackLevelElement, "ruleWarningClearance");
			Clearance ruleWarningClearance = getClearance(ruleWarningClearanceElement, config);

			Element causeWarningClearanceElement =
					getFirstInternalXmlElementByName(feedbackLevelElement, "causeWarningClearance");
			Clearance causeWarningClearance = getClearance(causeWarningClearanceElement, config);

			Element fullWarningClearanceElement =
					getFirstInternalXmlElementByName(feedbackLevelElement, "fullWarningClearance");
			Clearance fullWarningClearance = getClearance(fullWarningClearanceElement, config);

			feedbackLevelClearance = createFeedbackLevelClearance(inconsistencyWarningClearance,
					ruleWarningClearance, causeWarningClearance, fullWarningClearance);
		}

		// Combine everything to the overall status.
		ConfidentialityStatus status =
				createConfidentialityStatus(ruleClearance, feedbackLevelClearance);
		return status;
	}

	/**
	 * Returns a created clearance element from the given XML element representing the clearance.
	 */
	private static Clearance getClearance(Element clearanceElement,
			ConsistencyConfiguration config) {
		if(clearanceElement == null) {
			return null;
		}
		// Identify the basis of this clearance (if starting point is all or none).
		String clearanceBasisString = getAttributeFromXmlElement(clearanceElement, "basis");
		ClearanceBasis clearanceBasis = null;
		switch(clearanceBasisString) {
			case "all":
				clearanceBasis = ALL;
				break;
			case "none":
				clearanceBasis = NONE;
				break;
			default:
				// If it is neither "all" nor "none", we handle it as the safer variant "none".
				clearanceBasis = NONE;
				config.logWarning(
						"The 'basis' element of a rule clearance element is neither 'all' nor 'none' but '" +
								clearanceBasisString +
								"'. It will be handled as 'none'. If this is not correct, please control your rule set.");
		}

		// Identify all exceptions for the previously identified basis/starting point.
		List<ExceptionEntry> exceptionEntries = new ArrayList<>();
		List<String> currentAttributeNames =
				Arrays.asList("role", "hierarchy", "department", "company", "usedTool", "location");
		List<Element> exceptionEntryElements =
				getAllInternalXmlElementByName(clearanceElement, "except");
		for(Element exceptionElement : exceptionEntryElements) {
			List<ExceptionAttribute> exceptionAttributes = new ArrayList<>();
			for(String attributeName : currentAttributeNames) {
				ExceptionAttribute attribute =
						getAttributeOfExceptionByName(exceptionElement, attributeName, config);
				if(attribute != null) {
					exceptionAttributes.add(attribute);
				}
			}
			exceptionEntries.add(createExceptionEntry(exceptionAttributes));
		}

		return createClearance(clearanceBasis, exceptionEntries);
	}

	/** Returns a created exception attribute based on the given attribute name. */
	private static ExceptionAttribute getAttributeOfExceptionByName(Element exceptionElement,
			String attributeName, ConsistencyConfiguration config) {
		Element attributeElement =
				getFirstInternalXmlElementByName(exceptionElement, attributeName);
		if(attributeElement == null) {
			return null;
		}

		String value = getValueFromXmlElement(attributeElement);
		MatchType matchType = null;
		String matchTypeString = getAttributeFromXmlElement(attributeElement, "matchType");
		if(matchTypeString != null) {
			switch(matchTypeString) {
				case "identical":
					matchType = IDENTICAL;
					break;
				case "maximum":
					matchType = MAXIMUM;
					break;
				case "minimum":
					matchType = MINIMUM;
					break;
				default:
					// If it is neither of the above, we handle it as 'identical' since this will be
					// the most usual case.
					matchType = IDENTICAL;
					config.logWarning(
							"The 'matchType' element of a rule exception element is not among the expected ones but '" +
									matchTypeString +
									"'. It will be handled as 'identical'. If this is not correct, please control your rule set.");
			}
		}

		return createExceptionAttribute(attributeName, value, matchType);
	}

	/**
	 * Returns the first XML element with the given element name inside the given XML document.
	 * 
	 * @param parsedDoc
	 *            The parsed XML document.
	 * @param elementName
	 *            The name of the searched element.
	 * @return The first XML element with the given element name inside the given XML document.
	 */
	public static Element getFirstXmlElementByName(Document parsedDoc, String elementName) {
		if(parsedDoc == null) {
			return null;
		}

		NodeList entries = parsedDoc.getElementsByTagName(elementName);
		if(entries.getLength() > 0) {
			Node entry = entries.item(0);
			if(entry.getNodeType() == ELEMENT_NODE) {
				return (Element)entry;
			}
		}

		return null;
	}

	/**
	 * Returns all found XML elements with the given element name inside the given XML document.
	 * 
	 * @param parsedDoc
	 *            The parsed XML document.
	 * @param elementName
	 *            The name of the searched element(s).
	 * @return A list of all found XML elements with the given element name.
	 */
	public static List<Element> getAllXmlElementsByName(Document parsedDoc, String elementName) {
		if(parsedDoc == null) {
			return null;
		}

		List<Element> elements = new ArrayList<>();
		NodeList entries = parsedDoc.getElementsByTagName(elementName);
		for(int counter = 0; counter < entries.getLength(); counter++) {
			Node entry = entries.item(counter);
			if(entry.getNodeType() == ELEMENT_NODE) {
				elements.add((Element)entry);
			}
		}

		return elements;
	}

	/**
	 * Returns the first internal XML element with the given element name inside the given XML
	 * parent element.
	 * 
	 * @param parentElement
	 *            The parent element in which should be searched.
	 * @param internalElementName
	 *            The name of the searched element(s).
	 * @return The first internal XML element with the given element name inside the given XML
	 *         parent element.
	 */
	public static Element getFirstInternalXmlElementByName(Element parentElement,
			String internalElementName) {
		if(parentElement == null) {
			return null;
		}

		NodeList entries = parentElement.getElementsByTagName(internalElementName);
		if(entries.getLength() > 0) {
			Node entry = entries.item(0);
			if(entry.getNodeType() == ELEMENT_NODE) {
				return (Element)entry;
			}
		}

		return null;
	}

	/**
	 * Returns all found internal XML elements with the given element name inside the given XMl
	 * parent element.
	 * 
	 * @param parentElement
	 *            The parent element in which should be searched.
	 * @param internalElementName
	 *            The name of the searched element(s).
	 * @return A list of all found internal XML elements with the given element name.
	 */
	public static List<Element> getAllInternalXmlElementByName(Element parentElement,
			String internalElementName) {
		if(parentElement == null) {
			return null;
		}

		List<Element> elements = new ArrayList<>();
		NodeList entries = parentElement.getElementsByTagName(internalElementName);
		for(int counter = 0; counter < entries.getLength(); counter++) {
			Node entry = entries.item(counter);
			if(entry.getNodeType() == ELEMENT_NODE) {
				elements.add((Element)entry);
			}
		}

		return elements;
	}

	/**
	 * Returns the value of the internal XML element whose name and XML document is given (or null
	 * if not found).
	 * 
	 * @param parsedDoc
	 *            The parsed XML document.
	 * @param parentElementName
	 *            The name of the parent of the searched element(s).
	 * @param internalElementName
	 *            The name of the searched element(s).
	 * @return The value of the internal XML element whose name and XML document is given (or null
	 *         if not found).
	 */
	public static String getValueFromInternalXmlElement(Document parsedDoc,
			String parentElementName, String internalElementName) {
		if(parsedDoc == null) {
			return null;
		}

		Element parentElement = getFirstXmlElementByName(parsedDoc, parentElementName);
		Element internalElement =
				getFirstInternalXmlElementByName(parentElement, internalElementName);
		return getValueFromXmlElement(internalElement);
	}

	/**
	 * Returns the value of the internal XML element whose name and parent element is given (or null
	 * if not found).
	 * 
	 * @param parentElement
	 *            The parent element in which should be searched.
	 * @param internalElementName
	 *            The name of the searched element(s).
	 * @return The value of the internal XML element whose name and parent element is given (or null
	 *         if not found).
	 */
	public static String getValueFromInternalXmlElement(Element parentElement,
			String internalElementName) {
		if(parentElement == null) {
			return null;
		}

		Element internalElement =
				getFirstInternalXmlElementByName(parentElement, internalElementName);
		return getValueFromXmlElement(internalElement);
	}

	/**
	 * Returns the attribute with the given name/identifier of the internal XML element whose name
	 * and parent element is given (or null if not found).
	 * 
	 * @param parentElement
	 *            The parent element in which should be searched.
	 * @param internalElementName
	 *            The name of the searched element(s).
	 * @param attributeName
	 *            The name of the searched attribute.
	 * @return The attribute with the given name/identifier (or null if not found).
	 */
	public static String getAttributeFromInternalXmlElement(Element parentElement,
			String internalElementName, String attributeName) {
		if(parentElement == null) {
			return null;
		}

		Element internalElement =
				getFirstInternalXmlElementByName(parentElement, internalElementName);
		return getAttributeFromXmlElement(internalElement, attributeName);
	}

	/**
	 * Returns the value of the given XML element (or null if not found).
	 * 
	 * @param element
	 *            The element in which should be searched.
	 * @return The value of the given XML element (or null if not found).
	 */
	public static String getValueFromXmlElement(Element element) {
		if(element == null) {
			return null;
		}

		return element.getTextContent();
	}

	/**
	 * Returns the attribute with the given name/identifier of the given XML element (or null if not
	 * found).
	 * 
	 * @param element
	 *            The element in which should be searched.
	 * @param attributeName
	 *            The name of the searched attribute.
	 * @return The attribute with the given name/identifier of the given XML element (or null if not
	 *         found)
	 */
	public static String getAttributeFromXmlElement(Element element, String attributeName) {
		if(element == null) {
			return null;
		}

		return element.getAttribute(attributeName);
	}

	/**
	 * Returns the content of the given file as XML document (or null if not found).
	 * 
	 * @param file
	 *            The file of the XML document.
	 * @param config
	 *            The configuration with the logger.
	 * @return The parsed XML document.
	 */
	public static Document getXmlDocument(File file, ConsistencyConfiguration config) {
		if(file == null) {
			return null;
		}
		Document doc = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setFeature(FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse(file);
			doc.getDocumentElement().normalize();
		} catch(ParserConfigurationException | SAXException | IOException e) {
			config.logError(
					"The content in XML format could not be parsed from a file with this path: '" +
							file.getAbsolutePath() + "'.");
		}
		return doc;
	}
}
