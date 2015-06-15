package parsers.xml.dom;

import home_works.ñompany.entities.company.Admin;
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
public class EmployeeDomParser {
    private static final String admin = "admin";
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

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

    public ArrayList<Admin> parseXml() {

        ArrayList<Admin> admins = new ArrayList<>();
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
                if (admin.equals(eElement.getAttribute("position"))) {
                    Admin admin = new Admin();
                    admin.setName(eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    admin.setName(eElement.getElementsByTagName("secondname").item(0).getTextContent());
                    admin.setName(eElement.getElementsByTagName("age").item(0).getTextContent());
                    admin.setName(eElement.getElementsByTagName("salary").item(0).getTextContent());
                    admin.setName(eElement.getElementsByTagName("gender").item(0).getTextContent());

                    admins.add(admin);
                }
            }
        }
        return admins;
    }
}
