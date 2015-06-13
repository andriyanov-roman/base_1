package xml;


import apps.Employees.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHandler extends DefaultHandler {


    private Set<Employee> employees;
    private Employee current = null;
    private EmployeeEnum currentEnum = null;
    private EnumSet<EmployeeEnum> withText;

    public EmployeeHandler() {
        employees = new HashSet<Employee>();
        withText = EnumSet.range(EmployeeEnum.NAME, EmployeeEnum.SALARY);
    }

    public Set<Employee> getEmployee() {
        return employees;
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if ("employee".equals(localName)) {
            current = new Employee();
            current.setId(Integer.parseInt(attrs.getValue(0)));
        } else {
            EmployeeEnum temp = EmployeeEnum.valueOf(localName.toUpperCase());
            if (withText.contains(temp)) {
                currentEnum = temp;
            }
        }
    }

    public void endElement(String uri, String localName, String qName) {
        if ("employee".equals(localName)) {
            employees.add(current);
        }
    }

    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length).trim();
        if (currentEnum != null) {
            switch (currentEnum) {
                case NAME:
                    current.setName(s);
                    break;
                case SECONDNAME:
                    current.setSecondName(s);
                    break;
                case SEX:
                    current.setSex(s);
                    break;
                case AGE:
                    current.setAge(Integer.parseInt(s));
                    break;
                case SALARY:
                    current.setSalary(Integer.parseInt(s));
                    break;
                default:
                    throw new EnumConstantNotPresentException(
                            currentEnum.getDeclaringClass(), currentEnum.name());
            }
        }
        currentEnum = null;
    }

}
