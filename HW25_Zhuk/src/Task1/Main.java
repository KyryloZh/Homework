package Task1;

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

        File file = new File("file");

        if (file.exists()) parser.parse(file, new myHandler());


    }
}

//Створіть клас, використовуючи SAXParser, в якому опишіть ієрархію XML файлу.
//Необхідно, щоб проект створював XML файл і будував дерево (місто, назва вулиці, будинок).
//У місті використовуйте атрибут (наприклад, <city size = "big> Kiev </ city>).