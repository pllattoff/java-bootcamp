package javabasics;

import java.util.Scanner;

public class DataTypesExercise {
    static void main() {
        //Level 1 – Easy
        int myAge = 37;
        System.out.println(myAge);

        double height = 1.82;
        System.out.println(height);

        char firstLetterOfName = 'S';
        System.out.println(firstLetterOfName);

        String myName = "Stanislav";
        System.out.println(myName);

        //Level 2 – Medium
        System.out.println("-------");
        //1
        System.out.println("Mein Name ist " + myName + ", ich bin " + myAge + " Jahre alt und "
                + height + " Meter groß.");

        //2
        boolean isAdult = myAge >= 18;
        if (isAdult) {
            System.out.println("Age verified: adult");
        }

        //3
        int num1 = 6;
        int num2 = 2;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("num1 = "+ num1 + "; num2 = " + num2);
        System.out.println("sum = "+ sum + "; difference = " + difference
                + "; product = " + product + "; quotient = " + quotient);

        //4
        String str = "Collect moments, not things.";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.toUpperCase());


        //Level 3 – Tough
        //1
        System.out.println("-------");

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String userName = input.nextLine();
//
//        System.out.println("Enter your age:");
//        int userAge = input.nextInt();
//        input.nextLine(); //Der Puffer wird vom verbleibenden "Enter" geleert.
//
//        System.out.println("Enter your favorite letter:");
//        String userFavoriteLetter = input.nextLine();
//
//        System.out.println("Hallo "+userName+", dein Lieblingsbuchstabe ist "+userFavoriteLetter+" und du bist "+userAge+" Jahre alt.");
//
//        //2
//        double doubleNum1 = 5.7;
//        double doubleNum2 = 0.9;
//        System.out.println("doubleNum1 = "+doubleNum1+"; doubleNum2 = "+doubleNum2);
//        if (doubleNum1 + doubleNum2 > 10) {
//            System.out.println("Die Summe ist größer als 10.");
//        } else {
//            System.out.println("Die Summe ist kleiner oder gleich 10.");
//        }
//
//        //3
//        System.out.println("Enter a character:");
//        String inputCharString = input.nextLine();
//
//        char inputChar = inputCharString.toLowerCase().charAt(0);
//
//        boolean isVokal;
//
//        switch (inputChar) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                isVokal = true;
//                break;
//            default:
//                isVokal = false;
//        }
//
//        if (isVokal) {
//            System.out.println(inputCharString + " - is a vowel");
//        } else {
//            System.out.println(inputCharString + " - is not a vowel");
//        }

        //4. Mini-Programm
        System.out.println("Enter an integer value:");
        int int41 = input.nextInt();
        System.out.println("Enter the second integer value:");
        int int42 = input.nextInt();
        System.out.println("Enter a floating-point number:");
        double double4 = input.nextDouble();

        double result = (int41 - int42) * double4;
        System.out.println("(int41 - int42) * double4 = " + result);
        if (result > 0) {
            System.out.println("The calculation result is positive.");
        } else {
            System.out.println("The calculation result is negative or equal to zero.");
        }

    }
}
