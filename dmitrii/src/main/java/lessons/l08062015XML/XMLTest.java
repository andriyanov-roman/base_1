package lessons.l08062015XML;

import entities.company.Company;
import entities.company.Employee;
import org.jsoup.nodes.Element;
import org.w3c.dom.Document;
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
public class XMLTest {
    private static File XMLFile = new File("dmitrii\\src\\main\\resources\\xml\\company.xml");

    private static Document getDoc(){
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        Document doc = null;
        try {
            documentBuilder = dbFactory.newDocumentBuilder();
            doc = documentBuilder.parse(XMLFile);
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return doc;

    }
    public static void parseXMLFile() {
        Document doc = getDoc();
        NodeList nodeListCompanies = doc.getElementsByTagName("companyname");
        Company company = new Company();
        company.setWorkers(new ArrayList<>());
        company.setCompanyName(nodeListCompanies.item(0).getTextContent());
        NodeList emplNodeList = doc.getElementsByTagName("employee");
        for (int i = 0; i < emplNodeList.getLength(); i++) {
            Node node = emplNodeList.item(i);
            if (node.getNodeType()== Node.ELEMENT_NODE){
                org.w3c.dom.Element eElement = (org.w3c.dom.Element) node;
                Employee e = new Employee();
                e.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                e.setSurname(eElement.getElementsByTagName("surname").item(0).getTextContent());
                e.setSalary(Double.parseDouble(eElement.getElementsByTagName("salary").item(0).getTextContent()));
                e.setGender(Boolean.parseBoolean(eElement.getElementsByTagName("gender").item(0).getTextContent()));
                e.setAge(Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent()));
                company.getWorkers().add(e);
            }
        }
        System.out.println(company);
    }



    public static void main(String[] args) {
        parseXMLFile();
    }
}
