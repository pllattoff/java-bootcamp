package oop.chapter02.vererbung;

public class Main {

    static void main() {

        Vehicle vehicle = new Vehicle("Porsche", "911", 2010);
        Car car = new Car("Porsche", "911", 2010, 2);

        vehicle.getInformation();
        car.getInformation();

    }

}
