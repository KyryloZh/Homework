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

    public void removePerson(String name) {
        for (Map.Entry<Person, List<Animal>> entry: map.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(name)){
                map.remove(entry);
                System.out.println(name + " is now excluded from the club.");
            } else {
                System.out.println("I don't see any club members named " + name);
            }
        }

    }


    public void addAnimal(String type, String name, String ownersName) {
        Animal animal = new Animal(type, name);

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()){
            if (entry.getKey().getName().equalsIgnoreCase(ownersName)){
                List<Animal> temp = entry.getValue();
                temp.add(animal);
                entry.setValue(temp);
            }
        }

    }

    public void removeAnimalEveryehwere (String name){
      for(Map.Entry<Person, List<Animal>> entry : map.entrySet()){
          int counter = 0;
          List<Animal> temp = entry.getValue();
          for (Animal animal : temp) {
              if (animal.hasInside(name, animal.getType())){
                  temp.remove(animal);
              }
              else { counter++; }
          }
          if (counter == map.size()) {
              System.out.println("There are no pets named " + name + " in our club.");
          } else {
              entry.setValue(temp);
              System.out.println(name + " has been deleted from all records.");
          }
      }
    }

    public void removeAnimalFromTheOwner (String petName, String ownerName){
        int counter = 0;
        for(Map.Entry<Person, List<Animal>> entry : map.entrySet()){
            if (entry.getKey().getName().equalsIgnoreCase(ownerName)){
                List<Animal> temp = entry.getValue();
                for(Animal animal : temp){
                    if (animal.hasInside(petName, animal.getType())){
                        temp.remove(animal);
                    }
                    else { counter++; }
                }
                if (counter == temp.size()){
                    System.out.println("We haven't found a pet named " + petName + " being owned by " + ownerName);
                }
                else {
                    entry.setValue(temp);
                    System.out.println(petName + "is now deleted from " + ownerName + "'s record");
                }

            }
        }

    }


    public void ShowAll() {
        for(Map.Entry<Person, List<Animal>> pair : map.entrySet()){
            if (pair.getValue() == null) {
                System.out.println("Our club members are:" + '\n' + "Owner: " + pair.getKey() + "\n" + "No animal records.");
            } else if(map.size() == 0){ System.out.println("Your club is empty for now."); }
            else { System.out.println("Our club members are:" + '\n' + "Owner: " + pair.getKey() + "\n" + "Pet: " + pair.getValue()); }
        }
    }
}