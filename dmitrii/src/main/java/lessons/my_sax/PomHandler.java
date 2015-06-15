package lessons.my_sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Programmer on 13.06.2015.
 */
public class PomHandler extends DefaultHandler{
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //super.startElement(uri, localName, qName, attributes);
        if ("module".equals(localName)) {
            /*current = new Student();
            current.setLogin(attrs.getValue(0));
            if (attrs.getLength() == 2) {
                current.setFaculty(attrs.getValue(1));
            }*/
        } else {
            /*StudentEnum temp = StudentEnum.valueOf(localName.toUpperCase());
            if (withText.contains(temp)) {
                currentEnum = temp;
            }*/
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
    }
}
