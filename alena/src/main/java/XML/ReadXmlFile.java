package XML;

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
public class ReadXmlFile {
    private static File file = new File("alena/src/main/java/XML/Employee.xml");
    private static Document getDoc() {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;
        try{
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } return doc;
    }

    public static void parseXml() {
        ArrayList<Employee> employeeeee = new ArrayList();
        try {

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            System.out.println("Root element :" + getDoc().getDocumentElement().getNodeName());
            NodeList nList = getDoc().getElementsByTagName("employee");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                Element eElement = null;
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    eElement = (Element) nNode;
                    System.out.println("First Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Last Name : " + eElement.getElementsByTagName("secondName").item(0).getTextContent());
                    System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                    System.out.println("Sex : " + eElement.getElementsByTagName("sex").item(0).getTextContent());
                    System.out.println("Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                }

                Employee e = new Employee();
                e.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                e.setSecondName(eElement.getElementsByTagName("secondName").item(0).getTextContent());
                //e.setSalary(eElement.getElementsByTagName("salary").item(0).getTextContent());



                employeeeee.add(e);
            }
            System.out.println(employeeeee.get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        parseXml();
    }
}
