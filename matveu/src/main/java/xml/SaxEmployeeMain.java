package xml;


import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class SaxEmployeeMain {
    public static void main(String[] args) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SimpleEmployeeHandler handler = new SimpleEmployeeHandler();
            reader.setContentHandler(handler);
            reader.parse("matveu\\src\\main\\java\\xml\\EmployeesXML.xml");

            EmployeeSaxBuilder saxBuilder = new EmployeeSaxBuilder();
            saxBuilder.buildSetEmployee("matveu\\src\\main\\java\\xml\\EmployeesXML.xml");
            System.out.println(saxBuilder.getEmployees());
        } catch (SAXException e) {
            System.err.print("?????? SAX ??????? " + e);
        } catch (IOException e) {
            System.err.print("?????? I/? ?????? " + e);
        }
    }
}
