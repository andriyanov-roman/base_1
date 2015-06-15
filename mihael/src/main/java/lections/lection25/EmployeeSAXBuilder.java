package lections.lection25;

import entities.company.*;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Set;

/**
 * Created by Администратор on 15.06.2015.
 */
public class EmployeeSAXBuilder {
    private Set<Employee> employees;
    private EmployeeHandler employeeHandler;
    private XMLReader reader;

    public EmployeeSAXBuilder(){
        employeeHandler = new EmployeeHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(employeeHandler);
        } catch (SAXException e) {
            System.err.print("SAX: " + e);
        }
    }
    public Set<Employee> getEmployees (){
        return employees;
    }

    public void buildSetEmployees(String fileName) {
        try {
            reader.parse(fileName);
        } catch (SAXException e) {
            System.err.print("?????? SAX ???????: " + e);
        } catch (IOException e) {
            System.err.print("?????? I/? ??????: " + e);
        }
        employees = employeeHandler.getEmployees();
    }
}
