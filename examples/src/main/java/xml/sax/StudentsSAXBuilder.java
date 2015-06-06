package xml.sax;

import entity.Student;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Set;

/**
 * Created by user on 6/5/2015.
 */
public class StudentsSAXBuilder {
    private Set<Student> students;
    private StudentHandler sh;
    private XMLReader reader;

    public StudentsSAXBuilder() {
        // ???????? SAX-???????????
        sh = new StudentHandler();
        try {
            // ???????? ???????-???????????
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(sh);
        } catch (SAXException e) {
            System.err.print("?????? SAX ???????: " + e);
        }
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName) {
        try {
            // ?????? XML-?????????
            reader.parse(fileName);
        } catch (SAXException e) {
            System.err.print("?????? SAX ???????: " + e);
        } catch (IOException e) {
            System.err.print("?????? I/? ??????: " + e);
        }
        students = sh.getStudents();
    }
}
