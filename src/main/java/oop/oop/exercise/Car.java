package oop.oop.exercise;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;

    private boolean isStarted = false;
    private int speed = 0;

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void start() {
        isStarted = true;
        System.out.println(brand + " " + model + ": The engine is running");
    }

    public void stop() {
        speed = 0;
        isStarted = false;
        System.out.println(brand + " " + model + ": The engine is stopped");
    }

    public void setSpeed(int speed) {
        isStarted = true;

        if (speed > this.speed) {
            System.out.println(brand + " " + model + ": The car accelerated. New speed: " + speed);
        } else if (speed < this.speed) {
            System.out.println(brand + " " + model + ": The car slowed down. New speed: " + speed);
        } else {
            System.out.println(brand + " " + model + ": The car's speed did not change");
        }
        this.speed = speed;
    }

}
