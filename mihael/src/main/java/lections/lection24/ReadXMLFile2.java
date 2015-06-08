package lections.lection24;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Programmer on 08.06.2015.
 */



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXMLFile2 {


        private File file = new File("mihael\\src\\main\\java\\lections\\lection24\\company.xml");

        private Document getDoc() {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            Document doc = null;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
                doc = dBuilder.parse(file);
                doc.getDocumentElement().normalize();
            } catch (IOException | SAXException | ParserConfigurationException e) {
                e.printStackTrace();
            }
            return doc;
        }

        public void parseXml() {
            try {
                //optional, but recommended
                //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
                System.out.println("Root element :" + getDoc().getDocumentElement().getNodeName());
                NodeList nList = getDoc().getElementsByTagName("employee");
                System.out.println("----------------------------");
                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        //System.out.println("name : " + eElement.getAttribute("name"));
                        System.out.println("name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                        System.out.println("secondName : " + eElement.getElementsByTagName("secondName").item(0).getTextContent());
                        System.out.println("salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                        System.out.println("sex : " + eElement.getElementsByTagName("sex").item(0).getTextContent());
                        System.out.println("age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                        System.out.println("position : " + eElement.getElementsByTagName("position").item(0).getTextContent());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
