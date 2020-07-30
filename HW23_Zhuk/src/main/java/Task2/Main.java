package Task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        System.out.println("Welcome to our ZooClub.");

            inputLoop:
            while (true) {
                try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please choose one of the options below:" + '\n'
                        + "1. Add new club member." + "\n" + "2. Add club member's pet." + "\n"
                        + "3. Delete club member's pet." + "\n" + "4. Delete club member." + "\n"
                        + "5. Delete a pet from all club members." + "\n" + "6. Show all records." + "\n"
                        + "7. Exit" + "\n" + "Make your choice: ");


                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.print("So you want to add a new club member. What's his/her name? ");
                            String name = sc.next();
                            System.out.print("And age: ");
                            int age = sc.nextInt();
                            zooClub.addPerson(name, age);
                            System.out.println("\n" + "We welcome " + name + " to the club!" + '\n');
                            break;
                        }
                        case 2: {
                            boolean flag = false;
                            System.out.print("Let's add a new pet! First, what's the type? ");
                            String type = sc.next();
                            System.out.print("Name of the pet as well, please: ");
                            String petName = sc.next();
                            int numOfOwners = 0;

                            System.out.print("How many owners does " + petName + " have? ");
                            numOfOwners = sc.nextInt();
                                if (numOfOwners == 0) {
                                    System.out.println("We can't accept a pet without his owner. Please enter the number of owners.");
                                } else if (numOfOwners == 1) {
                                    System.out.print("Please enter owner's name: ");
                                    String ownersName = sc.next();
                                    zooClub.addAnimalToOnePerson(type, petName, ownersName);
                                } else {
                                    System.out.print("Then we need the first owner's name: ");
                                    String name = sc.next();
                                    List<String> ownerNames = new ArrayList<>();
                                    ownerNames.add(name);

                                    for (int i = 1; i < numOfOwners; i++) {
                                        System.out.print("And who's the other owner? ");
                                        ownerNames.add(sc.next());
                                    }
                                    zooClub.addAnimalToMultiplePeople(type, petName, ownerNames);
                                }
                            break;
                        }
                        case 3: {
                            System.out.print("Please enter the name of the pet you need deleted: ");
                            String petName = sc.next();
                            System.out.print("And its type, please: ");
                            String petType = sc.next();
                            System.out.print("Whose pet is it? ");
                            String ownerName = sc.next();
                            zooClub.removeAnimalFromTheOwner(petName, petType, ownerName);
                            break;
                        }
                        case 4: {
                            System.out.print("Who do you want to delete? Please enter a name. ");
                            String personName = sc.next();
                            zooClub.removePerson(personName);
                            break;
                        }
                        case 5: {
                            System.out.print("Please enter the name of the pet you need deleted: ");
                            String name = sc.next();
                            System.out.println("And what's its type? ");
                            String type = sc.next();
                            zooClub.removeAnimalEveryehwere(name, type);
                            break;
                        }
                        case 6: {
                            zooClub.showAll();
                            break;
                        }
                        case 7: {
                            System.out.println("Thanks for visiting our club. Bye!");
                            break inputLoop;
                        }
                        default: {
                            System.out.println("Please pick an option from the offered ones! " +
                                    "\n");
                            continue;

                        }


                    }

                } catch (InputMismatchException e) {
                    System.out.println("Please enter a number for one of the options! " +
                            "\n");
                }
            }


    }
}
