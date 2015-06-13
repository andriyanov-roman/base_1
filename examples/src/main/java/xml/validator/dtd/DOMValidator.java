package xml.validator.dtd;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ErrorHandler;


public class DOMValidator {
    public static void main(String[] args) {
        try {
            File x = new File("simple_tests/src/resources/dictionary.xml");
            DocumentBuilderFactory f
                    = DocumentBuilderFactory.newInstance();
            f.setValidating(true); // Default is false
            DocumentBuilder b = f.newDocumentBuilder();
            // ErrorHandler h = new DefaultHandler();
            ErrorHandler h = new MyErrorHandler();
            b.setErrorHandler(h);
            Document d = b.parse(x);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.toString());
        }
    }
    private static class MyErrorHandler implements ErrorHandler {
        public void warning(SAXParseException e) throws SAXException {
            System.out.println("Warning: ");
            printInfo(e);
        }
        public void error(SAXParseException e) throws SAXException {
            System.out.println("Error: ");
            printInfo(e);
        }
        public void fatalError(SAXParseException e)
                throws SAXException {
            System.out.println("Fattal error: ");
            printInfo(e);
        }
        private void printInfo(SAXParseException e) {
            System.out.println("   Public ID: "+e.getPublicId());
            System.out.println("   System ID: "+e.getSystemId());
            System.out.println("   Line number: "+e.getLineNumber());
            System.out.println("   Column number: "+e.getColumnNumber());
            System.out.println("   Message: "+e.getMessage());
        }
    }
}
