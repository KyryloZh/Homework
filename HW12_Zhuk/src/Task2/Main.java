package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler base = new XMLHandler();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter your file format: ");
        String fileVersion = sc1.next();
         
            switch (fileVersion) {
                case "Doc": {}
                case "doc": {
                    base = new DOCHandler();
                    break;
                }

                case "Txt": {}
                case "txt": {
                    base = new TXTHandler();
                    break;
                }
                case "Xml": {}
                case "xml": {
                    base = new XMLHandler();
                    break;
                }
                default: {
                    System.out.println("Please enter a valid format.");
                }
            }

            Scanner sc2 = new Scanner(System.in);
            System.out.print("Please enter the action you would like to perform on your document" +
                    " (create, open, change, save): ");
            String action = sc2.next();

            switch (action){
                case "create":{
                    base.create();
                    break;
                }
                case "open":{
                    base.open();
                    break;
                }
                case "change":{
                    base.change();
                    break;
                }
                case "save":{
                    base.save();
                    break;
                }
                default:{
                    System.out.println("Please enter a valid action.");
                }

            }
    }
}
