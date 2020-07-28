package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our ZooClub. Please choose one of the options below: ");
        System.out.println("1. Add new club member." + "\n" + "2. Add club member's pet." + "\n"
                + "3. Delete club member's pet." + "\n" + "4. Delete club member." + "\n"
                + "5. Delete a pet from all club members." + "\n" + "6. Show all records." + "\n"
                + "7. Exit" + "\n" + "Make your choice: ");

        int choice = sc.nextInt();

        switch (choice){
            case 1:{
                System.out.println("Enter member's name: ");
                String name = sc.next();
                System.out.println("Enter member's age: ");
                int age = sc.nextInt();
                zooClub.addPerson(name, age);
            }
        }


    }
}
