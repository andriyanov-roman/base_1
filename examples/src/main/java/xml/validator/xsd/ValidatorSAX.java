package xml.validator.xsd;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class ValidatorSAX {
    public static void main(String[ ] args) {
        String filename ="examples\\src\\main\\resources\\students_with_xsd.xml";
        String schemaname = "examples\\src\\main\\resources\\students.xsd";
        String logname = "log.txt";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        try {
            // установка проверки с использованием XSD
            schema = factory.newSchema(new File(schemaname));

            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            // создание объекта-парсера

            SAXParser parser = spf.newSAXParser();
            // установка обработчика ошибок и запуск
            parser.parse(filename, new StudentErrorHandler(logname));
            System.out.println(filename + " is valid");
        } catch (ParserConfigurationException e) {
            System.err.println(filename + " config error: " + e.getMessage());
        } catch (SAXException e) {
            e.printStackTrace();
            System.err.println(filename + " SAX error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

}
