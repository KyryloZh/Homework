package Task2;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();

    public void addPerson(String name, int age) {
        Person person = new Person(name, age);
        map.put(person, null);
    }

    public void removePerson(String name) {
        map.remove(name);
    }


    public void addAnimal(String type, String name, String ownersName) {
        Animal animal = new Animal(type, name);
        List<Animal> animalsList = new LinkedList<Animal>();
        animalsList.add(animal);
    }


    public void ShowAll() {
        for(Map.Entry<Person, List<Animal>> pair : map.entrySet()){
            if (pair.getValue() == null) {
                System.out.println("Our club members are:" + '\n' + pair.getKey() + " - " + "No animal records.");
            } else { System.out.println("Our club members are:" + '\n' + pair.getKey() + " - " + pair.getValue()); }
        }
    }
}