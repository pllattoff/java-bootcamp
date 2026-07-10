package oop.chapter01.einfuehrung;

public class Main {
    static void main() {

        System.out.println("======================================");

        Car car1 = new Car("BMW", "M5", "gray", 2025);
        Car car2 = new Car("Porsche", "911", "white", 2010);
        Car car3 = new Car("Porsche", "911", "white", 2010);

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

        System.out.println("--------------------------------------");
        System.out.println("car1.toString(): " + car1);
        System.out.println("car2.toString(): " + car2);
        System.out.println("car3.toString(): " + car3);
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car2.equals(car3): " + car2.equals(car3));
        System.out.println("car2 == car3: " + (car2 == car3));
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("car2.hashCode(): " + car2.hashCode());
        System.out.println("car3.hashCode(): " + car3.hashCode());


        System.out.println("======================================");

        Person person1 = new Person("Max", 31, "m");
        Person person2 = new Person("Jack", 45, "m");
        Person person3 = new Person("Jack", 45, "m");

        person1.introduce();
        person2.introduce();
        person3.introduce();

        System.out.println("--------------------------------------");

        System.out.println("person1.toString(): " + person1);
        System.out.println("person2.toString(): " + person2);
        System.out.println("person3.toString(): " + person3);
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person2.equals(person3): " + person2.equals(person3));
        System.out.println("person2 == person3: " + (person2 == person3));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());

        System.out.println("======================================");

    }
}
