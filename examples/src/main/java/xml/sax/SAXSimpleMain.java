package xml.sax;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

/**
 * Created by user on 6/5/2015.
 */
public class SAXSimpleMain {
    public static void main(String[] args) {
        try {
            // ???????? SAX-???????????
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SimpleStudentHandler handler = new SimpleStudentHandler();
            reader.setContentHandler(handler);
            reader.parse("vault\\src\\main\\resources\\student.xml");

            StudentsSAXBuilder saxBuilder = new StudentsSAXBuilder();
            saxBuilder.buildSetStudents("vault\\src\\main\\resources\\student.xml");
            System.out.println(saxBuilder.getStudents());
        } catch (SAXException e) {
            System.err.print("?????? SAX ??????? " + e);
        } catch (IOException e) {
            System.err.print("?????? I/? ?????? " + e);
        }
    }
}
