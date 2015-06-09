package parser.xml;

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
import java.util.ArrayList;

/**
 * Created by Programmer on 08.06.2015.
 */
public class ListOfEmployee {
   private File file= new File("vlas\\src\\main\\resources\\staff.xml");



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
        try  {
            System.out.println("Root element :" + getDoc().getDocumentElement().getNodeName());
            NodeList nList = getDoc().getElementsByTagName("employee");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("employee id : " + eElement.getAttribute("id"));
                    System.out.println("name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("second : " + eElement.getElementsByTagName("second").item(0).getTextContent());
                    System.out.println("salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                }
            }
        }
            catch (Exception e){
                e.printStackTrace();
            }
    }

//    public  ArrayList <employee> get employees(){
// }
}
