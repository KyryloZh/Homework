package Task2;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();
    //   List<Animal> animalsList = new LinkedList<Animal>();


    public void addPerson(String name, int age) {
        Person person = new Person(name, age);
        List<Animal> animalsList = new LinkedList<Animal>();

        map.put(person, animalsList);
    }

    public void removePerson(String personName) {
        int counter = 0;
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equals(personName)) {
                map.remove(entry.getKey());
                System.out.println(personName + " is now excluded from the club." + '\n');
                break;
            } else {
                counter++;
            }
        }
        if (counter == map.size()) {
            System.out.println("I don't see any club members named " + personName + '\n');
        }

    }


    public void addAnimalToOnePerson(String type, String name, String ownersName) {
        Animal animal = new Animal(type, name);
        int counter = 0;

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(ownersName)) {
                List<Animal> temp = entry.getValue();
                temp.add(animal);
                entry.setValue(temp);
                System.out.println('\n' + name + " is now added as " + ownersName + "'s pet." + "\n");
            } else if (counter == map.size()) System.out.println("We haven't found " + ownersName + " in our list.");
        }
    }

    public void addAnimalToMultiplePeople(String type, String petName, List<String> ownerNames) {
        Animal animal = new Animal(type, petName);
        int counter = 0;

        for (int i = 0; i < ownerNames.size(); i++) {
            for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
                if (entry.getKey().getName().equalsIgnoreCase(ownerNames.get(i))) {
                    List<Animal> temp = entry.getValue();
                    temp.add(animal);
                    entry.setValue(temp);
                    System.out.println('\n' + petName + " is now added as " + ownerNames.get(i) + "'s pet." + "\n");
                } else if (counter == map.size()) {
                    System.out.println("We don't see these people in our list, sorry.");
                }
            }
        }
    }


    public void removeAnimalEveryehwere(String name, String type) {
        int counter = 0;
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            List<Animal> temp = entry.getValue();
            for (Animal animal : temp) {
                if (animal.getName().equalsIgnoreCase(name) && animal.getType().equalsIgnoreCase(type)) {
                    temp.remove(animal);
                } else {
                    counter++;
                }
            }
            entry.setValue(temp);
        }
        if (counter == map.size()) {
            System.out.println("There are no pets named " + name + " in our club." + '\n');
        } else {
            System.out.println(name + " has been deleted from all records." + '\n');
        }
    }

    public void removeAnimalFromTheOwner(String petName, String petType, String ownerName) {
        boolean deleted = false;
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(ownerName)) {
                List<Animal> temp = entry.getValue();
                for (Animal animal : temp) {
                    if (animal.hasInside(petName, petType)) {
                        temp.remove(animal);
                        deleted = true;
                    }

                }
                if (deleted == true) {
                    System.out.println(petName + " is now deleted from " + ownerName + "'s record" + '\n');
                } else {
                    System.out.println("We haven't found a pet named " + petName + " being owned by " + ownerName + '\n');


                }
            }

        }
    }


    public void showAll() {
        System.out.println('\n' + "Our club members are:" + '\n');
        if (map.size() == 0) {
            System.out.println("Your club is empty for now." + '\n');
        }
        for (Map.Entry<Person, List<Animal>> pair : map.entrySet()) {
            if (pair.getValue() == null) {
                System.out.println("Owner: " + "\n" + pair.getKey() + "\n" + "No animal records." + '\n');
            } else {
                System.out.println("Owner: " + pair.getKey() + "\n" + "Pet: " + pair.getValue());
            }
        }
    }
}