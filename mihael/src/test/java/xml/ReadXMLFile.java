package xml;

import entities.company.*;
import org.junit.Test;
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
 * Created by Programmer on 10.06.2015.
 */
public class ReadXMLFile {
    private File file = new File("src\\main\\resources\\xmlEmployees.xml");
    private ArrayList<Employee> employees = new ArrayList<Employee>();

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

    @Test
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
                    System.out.println("name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("secondName : " + eElement.getElementsByTagName("secondName").item(0).getTextContent());
                    System.out.println("salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                    System.out.println("sex : " + eElement.getElementsByTagName("sex").item(0).getTextContent());
                    System.out.println("age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                    System.out.println("position : " + eElement.getElementsByTagName("position").item(0).getTextContent());
                    String position = eElement.getElementsByTagName("position").item(0).getTextContent();
                    Employee employee = getEmployeeBy(position);
//                    if(employee instanceof Employee) {System.out.println("instanceof Employee");}
//                    if(employee instanceof Manager) {System.out.println("instanceof Manager");}
//                    if(employee instanceof Sysadmin) {System.out.println("instanceof Sysadmin");}
//                    if(employee instanceof Programmer) {System.out.println("instanceof Programmer");}


                    employee.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                    employee.setSecondName(eElement.getElementsByTagName("secondName").item(0).getTextContent());
                    employee.setSalary(Double.valueOf(eElement.getElementsByTagName("salary").item(0).getTextContent()));
                    employee.setSex(eElement.getElementsByTagName("sex").item(0).getTextContent());
                    employee.setAge(Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent()));

                    System.out.println(employee);

                    Employee testEmployee = new Employee();
                    testEmployee.setAge(3);
                    testEmployee.setSalary(3);
                    testEmployee.setSecondName("s");
                    testEmployee.setName("a");
                    testEmployee.setSex("m");

                    System.out.println(testEmployee);

                    employees.add(testEmployee);

                    employees.add(employee);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Employee getEmployeeBy(String position) throws XmlNotValidFormatException {
        if (position.equals("Manager")) {
            return new Manager();
        } else if (position.equals("Programmer")) {
            return new Programmer();
        } else if (position.equals("Sysadmin")) {
            return new Sysadmin();
        }
        throw new XmlNotValidFormatException();
    }
}
