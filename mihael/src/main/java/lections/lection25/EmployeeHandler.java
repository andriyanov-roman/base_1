package lections.lection25;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Programmer on 13.06.2015.
 */
public class EmployeeHandler extends DefaultHandler {
    @Override
    public void startDocument(){
        System.out.println("Parsing started");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        String s = localName;

        for (int i = 0; i < attrs.getLength(); i++) {
            s += " " + attrs.getLocalName(i) + "=" + attrs.getValue(i);
        }
        System.out.print(s.trim());
    }

    @Override
    public void characters (char ch[], int start, int length)
            throws SAXException
    {
        System.out.print(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.print(localName);
    }

    @Override
    public void endDocument() {
        System.out.println("\nParsing ended");
    }
}
