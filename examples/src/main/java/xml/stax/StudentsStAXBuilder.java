package xml.stax;

import entity.Student;
import xml.sax.StudentEnum;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StudentsStAXBuilder {
    private HashSet<Student> students = new HashSet<>();
    private XMLInputFactory inputFactory;

    public StudentsStAXBuilder() {
        inputFactory = XMLInputFactory.newInstance();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName) {
        XMLStreamReader reader = null;
        try(FileInputStream inputStream = new FileInputStream(new File(fileName)); ) {
            reader = inputFactory.createXMLStreamReader(inputStream);
            // StAX parsing
            while (reader.hasNext()) {
                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    String name = reader.getLocalName();
                    if (StudentEnum.valueOf(name.toUpperCase()) == StudentEnum.STUDENT) {
                        Student st = buildStudent(reader);
                        students.add(st);
                    }
                }
            }
        } catch (XMLStreamException ex) {
            System.err.println("StAX parsing error! " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("File " + fileName + " not found! " + ex);
        }
    }

    private Student buildStudent(XMLStreamReader reader) throws XMLStreamException {
        Student st = new Student();
        st.setLogin(reader.getAttributeValue(null, StudentEnum.LOGIN.getValue()));
        st.setFaculty(reader.getAttributeValue(null,
                StudentEnum.FACULTY.getValue())); // ????????? ?? null
        String name;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    switch (StudentEnum.valueOf(name.toUpperCase())) {
                        case NAME:
                            st.setName(getXMLText(reader));
                            break;
                        case TELEPHONE:
                            name = getXMLText(reader);
                            st.setTelephone(Integer.parseInt(name));
                            break;
                        case ADDRESS:
                            st.setAddress(getXMLAddress(reader));
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if (StudentEnum.valueOf(name.toUpperCase()) ==
                            StudentEnum.STUDENT) {
                        return st;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element in tag Student");
    }

    private Student.Address getXMLAddress(XMLStreamReader reader)
            throws XMLStreamException {
        Student.Address address = new Student.Address();
        int type;
        String name;
        while (reader.hasNext()) {
            type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    switch (StudentEnum.valueOf(name.toUpperCase())) {
                        case COUNTRY:
                            address.setCountry(getXMLText(reader));
                            break;
                        case CITY:
                            address.setCity(getXMLText(reader));
                            break;
                        case STREET:
                            address.setStreet(getXMLText(reader));
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if (StudentEnum.valueOf(name.toUpperCase()) ==
                            StudentEnum.ADDRESS) {
                        return address;
                    }
                    break;
            }
        }
        throw new XMLStreamException("Unknown element in tag Address");
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }
}
