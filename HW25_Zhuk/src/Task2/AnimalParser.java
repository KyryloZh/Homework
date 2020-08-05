package Task2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AnimalParser extends DefaultHandler {
    String tag;

    @Override
    public void startDocument() throws SAXException {
       //System.out.println("Start Document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tag = qName;
        }


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       if (tag.equalsIgnoreCase("name")){
           System.out.println("Name: " + new String(ch, start, length));
       }
       else if (tag.equalsIgnoreCase("breed")){
           System.out.println("Breed: " + new String(ch, start, length) + '\n');
       }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        tag = "not" + qName;

    }

    @Override
    public void endDocument() throws SAXException{

    }


}
