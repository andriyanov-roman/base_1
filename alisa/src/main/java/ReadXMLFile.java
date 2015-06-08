import entity.Company;
import entity.Employee;
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
 * Created by User on 08.06.2015.
 */
public class ReadXMLFile {
    private static File file = new File("alisa\\src\\result\\xml\\Employee.xml");

    public static void main(String[] args) {
        parse();
    }

    private static Document getDoc() {
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
    public static void parse () {
        try {
            Company company = new Company();
            System.out.println("Root element :" + getDoc().getDocumentElement().getNodeName());
            NodeList dList = getDoc().getElementsByTagName("company");
            Element companyNameElement = (Element)dList.item(0);
            String companyName = companyNameElement.getElementsByTagName("companyname").item(0).getTextContent();
            company.setCompanyName(companyName);
            company.setEmployees(new ArrayList<>());
            NodeList nList = getDoc().getElementsByTagName("employee");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Employee e = new Employee();
                    Element eElement = (Element) nNode;
                    e.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                    //System.out.println("Employee id : " + eElement.getAttribute("id"));
                   /* System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Surname : " + eElement.getElementsByTagName("surname").item(0).getTextContent());
                    System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                    System.out.println("Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());*/
                   e.setSalary(Double.parseDouble(eElement.getElementsByTagName("salary").item(0).getTextContent()));
                    company.getEmployees().add(e);
                    System.out.println(company);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
