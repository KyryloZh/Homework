package Task2;

import java.util.ArrayList;

public class Zoo {
        ArrayList<String> animals = new ArrayList();

        public void addAnimals() {
            animals.add(0, "cobra");
            animals.add(1, "zebra");
            animals.add(2, "panda");
            animals.add(3, "puma");
            animals.add(4, "wombat");
            animals.add(5, "quokka");
            animals.add(6, "capybara");
            animals.add(7, "bat");
        }

        public ArrayList<String> getAnimals(){
            return animals;
        }

        public void showAnimals(){
            System.out.println(animals);
        }

}
