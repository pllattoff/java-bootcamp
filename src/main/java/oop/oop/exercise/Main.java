package oop.oop.exercise;

public class Main {
    static void main() {

        Car car1 = new Car("BMW", "M5", "gray", 2025);
        Car car2 = new Car("Porsche", "911", "white", 2010);

        car1.start();
        car2.start();

        car1.setSpeed(100);
        car2.setSpeed(105);

        car1.setSpeed(200);
        car2.setSpeed(205);

        car1.setSpeed(50);
        car2.setSpeed(50);

        car1.stop();
        car2.stop();


        Person person1 = new Person("Max", 31, "m");
        Person person2 = new Person("Jack", 45, "m");
        Person person3 = new Person("Max", 31, "m");

        person1.introduce();
        person2.introduce();
        person3.introduce();

        System.out.println("person1.toString(): " + person1);
        System.out.println("person2.toString(): " + person2);
        System.out.println("person3.toString(): " + person3);
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());

    }
}
