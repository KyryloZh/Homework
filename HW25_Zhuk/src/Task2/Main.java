package Task2;

import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        File file = new File("/Users/kyrylozhuk/IdeaProjects/HW25_Zhuk/resources/animals.xml");

        if (file.exists()) parser.parse(file, new AnimalParser());


    }
}