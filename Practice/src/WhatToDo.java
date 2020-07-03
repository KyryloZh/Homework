import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;

public class WhatToDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Hello, friend. Don't know what to do?");
        System.out.println( "Here are your options:\n" +
                "1. Java \n 2. SWIFT \n 3. Reading \n 4. Video games \n 5. New languages");
        System.out.print("Choose your option: ");

        int option = sc.nextInt();

        switch (option){
            case 1:{
                System.out.print("You need more practice. Finish your homework, get how this works. " +
                        "Update this once done.");
                break;
            }
            case 2:{
                System.out.print("You still have Emission/Reception profiles and RMA to set up.");
                break;
            }
            case 3:{
                System.out.print("You have Allen Carr to finish. After that you can find something new.");
                break;
            }
            case 4:{
                System.out.print("Uncharted 1. Or Red Dead Redemption. Or buy Doom.");
                break;
            }
            case 5:{
                System.out.print("You can always start learning German on Duolingo.");
                break;
            }
            default:{
                System.out.print("C'mon, start doing something!");
            }


        }
        System.out.println("\n" + "Anyway, start doing something!");

    }


}
