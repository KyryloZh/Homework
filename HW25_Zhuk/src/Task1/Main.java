package Task1;

import java.util.Scanner;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city: ");
        String city = sc.next();

        System.out.print("Enter street: ");
        String street = sc.next();

        System.out.print("Enter house: ");
        String house = sc.next();

        MapHelper helper = new MapHelper();
        Map map = new Map();
        map.setCity(city);
        map.setSize("Big");
        map.setStreet(street);
        map.setHouse(house);

        helper.addMap(map);

        System.out.println("Address: " + house + street + ".st " + ", " + city + " is added to the map.");





    }
}