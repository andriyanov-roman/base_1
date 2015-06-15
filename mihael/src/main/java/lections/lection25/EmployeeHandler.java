package lections.lection25;


import entities.company.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Programmer on 13.06.2015.
 */
public class EmployeeHandler extends DefaultHandler {
    private Set<Employee> employees;
    private Employee current = null;
    private EmployeeEnum currentEnum = null;
    private EnumSet<EmployeeEnum> withText;
    public EmployeeHandler(){
        employees = new HashSet<Employee>();
        withText= EnumSet.range(EmployeeEnum.NAME,EmployeeEnum.SECONDNAME);
    }
    public Set<Employee> getEmployees(){
        return employees;
    }
//    @Override
//    public void startDocument(){
//        System.out.println("Parsing started");
//    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
//        String s = localName;
//
//        for (int i = 0; i < attrs.getLength(); i++) {
//            s += " " + attrs.getLocalName(i) + "=" + attrs.getValue(i);
//        }
//        System.out.print(s.trim());

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

    @Override
    public void characters (char ch[], int start, int length)
            throws SAXException
    {
        System.out.print(new String(ch, start, length));
        String s = new String(ch, start, length).trim();
        if (currentEnum != null) {
            switch (currentEnum) {
                case NAME:
                    current.setName(s);
                    break;
                case AGE:
                    current.setAge(Integer.parseInt(s));
                    break;
                case SECONDNAME:
                    current.setSecondName(s);
                    break;
//                case CITY:
//                    current.getAddress().setCity(s);
//                    break;
//                case COUNTRY:
//                    current.getAddress().setCountry(s);
//                    break;
                default:
                    throw new EnumConstantNotPresentException(
                            currentEnum.getDeclaringClass(), currentEnum.name());
            }
        }
        currentEnum = null;
    }


    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.print(localName);
        if ("employee".equals(localName)) {
            employees.add(current);
        }
    }

//    @Override
//    public void endDocument() {
//        System.out.println("\nParsing ended");
//    }
}
