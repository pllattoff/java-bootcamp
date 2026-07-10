package oop.chapter02.staticandfinal;

public class Calculator {

    private Calculator() {
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int prod(int a, int b) {
        return a * b;
    }

    public static double quotient(int a, int b) {
        return (double) a / b;
    }

}
