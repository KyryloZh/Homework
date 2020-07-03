package Task1;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    @Override
    public String toString() {
        return "Name: Vasya; age: 45; tail: no";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                tail == animal.tail &&
                name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
