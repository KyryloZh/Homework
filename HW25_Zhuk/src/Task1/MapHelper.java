package Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;


public class MapHelper {
    private Document document;
    public MapHelper() throws ParserConfigurationException, IOException, SAXException {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
    DocumentBuilder builder = factory.newDocumentBuilder();
        this.document = builder.parse("/Users/kyrylozhuk/IdeaProjects/HW25_Zhuk/resources/map.xml");
    }

    public void addMap (Map newMap)throws FileNotFoundException, TransformerException {
        Element root = this.document.getDocumentElement();

        Element map = this.document.createElement("map");
        Element city = this.document.createElement("city");
        Element street = this.document.createElement("street");
        Element house = this.document.createElement("house");

        city.setAttribute("size", String.valueOf(newMap.getSize()));
        city.setTextContent(newMap.getCity());
        street.setTextContent(newMap.getStreet());
        house.setTextContent(newMap.getHouse());
        map.appendChild(city);
        map.appendChild(street);
        map.appendChild(house);
        root.appendChild(map);

        DOMSource source = new DOMSource(this.document);
        String outputURL = "/Users/kyrylozhuk/IdeaProjects/HW25_Zhuk/resources/map.xml";
        StreamResult result = new StreamResult(new FileOutputStream(outputURL));
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.transform(source, result);


    }

}
