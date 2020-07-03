package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Please enter the DocumentWorker version: ");

        String version = sc.next();

        if (version.equalsIgnoreCase("pro")) {
            ProDocumentWorker pro = new ProDocumentWorker();
            System.out.print("To open the document type \"open\". To edit the document type \"edit\". " +
                    "To save the document type \"save\": ");
            String action = sc2.next();
            if (action.equalsIgnoreCase("open")) pro.openDocument();
            else if (action.equalsIgnoreCase("edit")) pro.editDocument();
            else if (action.equalsIgnoreCase("save")) pro.saveDocument();

        }
        else if (version.equalsIgnoreCase("expert")) {
            ExpertDocumentWorker exp = new ExpertDocumentWorker();
            System.out.print("To open the document type \"open\". To edit the document type \"edit\". " +
                    "To save the document type \"save\": ");
            String action = sc2.next();
            if (action.equalsIgnoreCase("open")) exp.openDocument();
            else if (action.equalsIgnoreCase("edit")) exp.editDocument();
            else if (action.equalsIgnoreCase("save")) exp.saveDocument();
        }
        else {
            DocumentWorker base = new DocumentWorker();
            System.out.print("To open the document type \"open\". To edit the document type \"edit\". " +
                    "To save the document type \"save\": ");
            String action = sc2.next();
            if (action.equalsIgnoreCase("open")) base.openDocument();
            else if (action.equalsIgnoreCase("edit")) base.editDocument();
            else if (action.equalsIgnoreCase("save")) base.saveDocument();
        }



        String action = sc2.next();


    }
}
