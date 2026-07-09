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

    }
}
