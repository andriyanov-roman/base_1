package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class ReadXmlFile {
    public static void main(String argv[]) {
        try {
            File fXmlFile = new File("vorobey/src/main/java/xml/company.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("employee");
            System.out.println("********************");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Login : " + eElement.getAttribute("Vorobey"));
                    System.out.println("Name and Secondname: " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Telephone : " + eElement.getElementsByTagName("telephone").item(0).getTextContent());
                    System.out.println("Address : " + eElement.getElementsByTagName("address").item(0).getTextContent());
                    System.out.println("Country : " + eElement.getElementsByTagName("country").item(0).getTextContent());
                    System.out.println("City : " + eElement.getElementsByTagName("city").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
