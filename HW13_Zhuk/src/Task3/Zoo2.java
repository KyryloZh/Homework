package Task3;

import Task2.Zoo;

import java.util.ArrayList;

public class Zoo2 {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        ArrayList<String> animals = myZoo.getAnimals();
        myZoo.addAnimals();
        myZoo.showAnimals();

        animals.remove(6);
        System.out.println(animals);

        animals.remove(4);
        System.out.println(animals);

        animals.remove(2);
        System.out.println(animals);

        System.out.println(animals.size());
    }


}
