package oop.chapter02.vererbung;

public class Main {

    static void main() {

        Vehicle vehicle = new Vehicle("Porsche", "911", 2010);
        Car car = new Car("Porsche", "911", 2010, 2);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2024, "Sportbike");

        vehicle.printInformation();
        car.printInformation();
        motorcycle.printInformation();

        motorcycle.printType();

    }

}
