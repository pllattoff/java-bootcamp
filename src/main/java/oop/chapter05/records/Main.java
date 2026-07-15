package oop.chapter05.records;

import java.util.List;

public class Main {
    static void main() {

        Species dogSpecies = new Species("Dog", 500);
        Species rabbitSpecies = new Species("Rabbit", 150);
        Species catSpecies = new Species("Cat", 250);

        Owner ownerJohn = new Owner("John Smith", 35, "Main Street 12");
        Owner ownerAnna = new Owner("Anna Schmidt", 28, "Park Avenue 5");

        Animal animal1 = new Animal(1, "Buddy", dogSpecies, 5, ownerJohn);
        Animal animal2 = new Animal(2, "Charlie", dogSpecies, 8, ownerJohn);
        Animal animal3 = new Animal(3, "Max", rabbitSpecies, 2, ownerAnna);
        Animal animal4 = new Animal(3, "Max", rabbitSpecies, 2, ownerAnna);

        System.out.println("toString(): " + animal1);
        System.out.println("equals(): " + animal3.equals(animal4));

        animal1 = new Animal(animal1.id(), animal1.name(), animal1.species(), animal1.age(), ownerAnna);
        System.out.println("Аnimal 1 was modified: " + animal1);

        // Bonus: Zoo
        Zoo zoo = new Zoo(List.of(animal1, animal2, animal3, animal4));
        System.out.println("zoo.getTotalFoodAmount(): " + zoo.getTotalFoodAmount());

        // Bonus: With-Methoden
        animal1 = animal1.withId(9)
                .withName("Tom")
                .withSpecies(catSpecies);

        System.out.println(animal1);
    }
}
