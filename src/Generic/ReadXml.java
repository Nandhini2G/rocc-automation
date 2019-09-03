package Generic;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXml {
	
	public static String ReadEmailID(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	
	public static String ReadPassword(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	public static String ReadUsername(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
	
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	public static String ReadDeviceID(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(0);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	
	public static String ReadDeviceName(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	
	public static String ReadSiteID(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	
	public static String ReadSiteName(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	
	public static String ReadSeatLocation(String mainTagName, String subTagName,int temp) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("./xmlfiles/usercreds.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		
		NodeList nList = doc.getElementsByTagName(mainTagName);
		
		Node nNode = nList.item(temp);
		
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(subTagName).item(0).getTextContent();
		
		
		}
	
	
	
	
	

}
