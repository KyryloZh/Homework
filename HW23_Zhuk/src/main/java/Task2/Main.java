package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our ZooClub.");

        inputLoop : while (true) {
        System.out.print("Please choose one of the options below:" + '\n'
                + "1. Add new club member." +           "\n" + "2. Add club member's pet." + "\n"
                + "3. Delete club member's pet." +         "\n" + "4. Delete club member." + "\n"
                + "5. Delete a pet from all club members." + "\n" + "6. Show all records." + "\n"
                + "7. Exit" + "\n" + "Make your choice: ");


            String choice = sc.next();
            switch (choice) {
                case "1": {
                    System.out.print("So you want to add a new club member. What's his/her name? ");
                    String name = sc.next();
                    System.out.print("And his/her age: ");
                    int age = sc.nextInt();
                    zooClub.addPerson(name, age);
                    System.out.println("We welcome " + name + " to the club!"  + '\n');
                    break;
                }
                case "2": {
                    System.out.print("Let's add a new pet! First, what's the type? ");
                    String type = sc.next();
                    System.out.print("Name of the pet as well, please: ");
                    String name = sc.next();
                    System.out.print("Whose pet is it?Please enter owner's name: " );
                    String ownersName = sc.next();
                    zooClub.addAnimal(type, name, ownersName);

                    break;
                }
                case "3": {
                    System.out.print("Please enter the name of the pet you need deleted: ");
                    String petName = sc.next();
                    System.out.println("And its type, please: ");
                    String petType = sc.next();
                    System.out.print("Whose pet is it? ");
                    String ownerName = sc.next();
                    zooClub.removeAnimalFromTheOwner(petName, petType, ownerName);
                    break;
                }
                case "4": {
                    System.out.print("Who do you want to delete? Please enter a name. ");
                    String name = sc.next();
                    zooClub.removePerson(name);
                    System.out.println(name + " and his pet(s) were deleted from the club list.");
                    break;
                }
                case "5": {
                    System.out.print("Please enter the name of the pet you need deleted: ");
                    String name = sc.next();
                    System.out.println("And what's its type? ");
                    String type = sc.next();
                    zooClub.removeAnimalEveryehwere(name, type);
                    break;
                }
                case "6": {
                    zooClub.ShowAll();
                    break;
                }
                case "7": {
                    System.out.println("Thanks for visiting our club. Bye!");
                    break inputLoop;
                }
                default: {
                    System.out.println("Please pick an option from the offered ones! " +
                            "" +
                            "" +
                            "");
                    break;

                }


            }
        }


    }
}
