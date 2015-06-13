package xml;

import apps.Employees.Employee;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Set;


public class EmployeeSaxBuilder {
    private Set<Employee> employees;
    private EmployeeHandler eh;
    private XMLReader reader;

    public EmployeeSaxBuilder() {
        eh = new EmployeeHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(eh);
        } catch (SAXException e) {
            System.err.print("?????? SAX ???????: " + e);
        }
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void buildSetEmployee(String fileName) {
        try {
            reader.parse(fileName);
        } catch (SAXException e) {
            System.err.print("?????? SAX ???????: " + e);
        } catch (IOException e) {
            System.err.print("?????? I/? ??????: " + e);
        }
        employees = eh.getEmployee();
    }
}
