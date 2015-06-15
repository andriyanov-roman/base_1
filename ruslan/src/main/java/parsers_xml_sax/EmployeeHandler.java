/*
package parsers_xml_sax;

import home_works.ñompany.entities.company.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;


import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

*/
/**
 * Created by Programmer on 13.06.2015.
 *//*

public class EmployeeHandler extends DefaultHandler {
    private Set<Employee> employee;
    private Employee current = null;
    private EmployeeEnum currentEnum = null;
    private EnumSet<EmployeeEnum> withText;

    public Employee getCurrent() {
        return current;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if ("employee".equals(localName)) {
            current = new Employee();
            current.setName(attrs.getValue(0));
            if (attrs.getLength() == 2) {
                current.setSecondName(attrs.getValue(1));
            }
        } else {
            EmployeeEnum temp = EmployeeEnum.valueOf(localName.toUpperCase());
            if (withText.contains(temp)) {
                currentEnum = temp;
            }

        }

    }
    public void endElement(String uri, String localName, String qName) {
        if ("employee".equals(localName)) {
            employee.add(current);
        }
    }
}

*/
