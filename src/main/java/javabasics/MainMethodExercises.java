package javabasics;

import java.util.Scanner;

public class MainMethodExercises {

    static void main() {

        //Level 1
        System.out.println("Hallo World 1");
        System.out.println("Hallo World 2");

        //Level 2
        String str = "Hallo World";
        int num = 3;
        System.out.println(str + " " + num);

        int num1 = 6;
        int num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        //Level 3
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hallo " + name);

        //Aufgabe 9: Ausgabe formatieren
        System.out.printf("%-15s %-5d%n", "Jon", 31);
        System.out.printf("%-15s %-5d%n", "Ann", 25);
        System.out.printf("%-15s %-5d%n", "Den", 41);

        //Aufgabe 10: Mini-Challenge – Dein erstes eigenes Programm
        System.out.println("Name: Stanislav");
        System.out.println("Age: 37");
        System.out.println("Collect moments, not things.");
        System.out.println(100-99);

    }

}
