package Task2;

import java.util.List;

import java.util.Map;

public class ZooClub {
    private Map<Person, List<Animal>>map;

    public void addPerson (String name, int age){
        Person person = new Person (name, age);
        System.out.println(person);

    }
}
