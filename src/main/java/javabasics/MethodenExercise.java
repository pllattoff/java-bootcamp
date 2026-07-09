package javabasics;

public class MethodenExercise {

    static void main() {

        //Level 1 – Easy
        //1
        printHello();
        //2
        String greeting = getGreeting();
        System.out.println(greeting);
        //3
        printName("Max");


        //Level 2 – Medium
        //1
        System.out.println(add(2,5));
        //2
        System.out.println(calculateArea(33.3, 22.1));
        //3
        checkPositive(-5);


        //Level 3 – Bonus
        //1
        System.out.println(isEven(8));
        //2
        printSumMessage(3, 5);
        //
        int a = 5;
        int b = 0;
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));


    }

    //Level 1 – Easy
    //1
    public static void printHello() {
        System.out.println("Hallo Welt");
    }
    //2
    public static String getGreeting() {
        return "Willkommen im Java-Kurs";
    }
    //3
    public static void printName(String name) {
        System.out.println("Hallo " + name);
    }

    //Level 2 – Medium
    //1
//    public static int add(int a, int b) {
//        return a + b;
//    }
    //2
    public static double calculateArea(double width, double height) {
        return width * height;
    }
    //3 (Vorzeitiges Beenden)
    public static void checkPositive(int num) {
        if (num < 0) {
            System.out.println("Negative Zahl");
            return;
        }
        System.out.println("Positive Zahl");

    }

    //Level 3 – Bonus
    //1
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    //2
    public static void printSumMessage(int a, int b) {
        System.out.println("Die Summe der gegebenen Zahlen: " + add(a, b));
    }
    //3
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero");
        }
        return a / b;
    }

}
