package xml;

import apps.Employees.Employee;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;


public class ReadEmployeeXML {
    private static DocumentBuilderFactory dbFactory ;
    private static DocumentBuilder dBuilder;
    private static Document doc;
    private static ArrayList<Employee> employees;
    private static Employee employee;
    private static NodeList nList;
    private static Node nNode;
    private static Element eElement;
    private static int temp;

    public static void main(String[] args) {
        employees=new ArrayList<>();
        try {
            File fXmlFile = new File("matveu\\src\\main\\java\\xml\\EmployeesXML.xml");
             dbFactory = DocumentBuilderFactory.newInstance();
             dBuilder = dbFactory.newDocumentBuilder();
             doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            nList = doc.getElementsByTagName("employee");
            System.out.println("----------------------------");

            for (temp = 0; temp < nList.getLength(); temp++) {
                employee=new Employee();
                nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    employee = new Employee();
                    eElement = (Element) nNode;
                    System.out.println("Employee id : " + eElement.getAttribute("id"));
                    System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Second Name : " + eElement.getElementsByTagName("secondName").item(0).getTextContent());
                    System.out.println("Sex : " + eElement.getElementsByTagName("sex").item(0).getTextContent());
                    System.out.println("Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                    System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                    createdEmpl();
                }

            }
            System.out.println(employees.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void createdEmpl(){
        employee.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
        employee.setSecondName(eElement.getElementsByTagName("secondName").item(0).getTextContent());
        employee.setSex(eElement.getElementsByTagName("sex").item(0).getTextContent());
        employee.setAge(Integer.parseInt(eElement.getElementsByTagName("age").item(0).getTextContent()));
        employee.setSalary(Integer.parseInt(eElement.getElementsByTagName("salary").item(0).getTextContent()));
        employees.add(employee);
    }
}





