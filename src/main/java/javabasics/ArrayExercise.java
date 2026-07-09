package javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {

    static void main() {

        //Level 1 – Easy
        //1
        System.out.println("1) Einfache Zahlenfolge ausgeben:");
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
        //2
        System.out.println("2) Alle Elemente eines Arrays anzeigen:");
        String[] names = {"Max", "Den", "Anna"};
        for (String name : names) {
            System.out.println(name);
        }
        //3
        System.out.println("3) Quadratzahlen berechnen:");
        int[] nums2 = {2, 4, 6, 8};
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i] * nums2[i]);
        }

        //Level 2 – Medium
        //1
        System.out.println("Level 2 – Medium:");
        System.out.println("for-each-Schleife:");
        int[] nums3 = {1,2,3,4,5,6,7,8,9,10};
        for (int num : nums3) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("for-Schleife:");
        for (int  i = 0; i < nums3.length; i++) {
            if (nums3[i] % 2 == 0) System.out.print(nums3[i] + " ");
        }
        System.out.println();

        //2
        System.out.println("2) Summe berechnen:");
        int[] nums4 = {2,3,7};
        int sum4 = 0;
        for (int num : nums4) {
            sum4 += num;
        }
        System.out.println(sum4);

        //3
        System.out.println("3) Index mit ausgeben:");
        String[] cities = {"Berlin","München","Stuttgart","Hamburg", "Öhringen"};
        for (int i = 0; i < cities.length; i++) {
            System.out.println(i + " : " + cities[i]);
        }

        //4
        System.out.println("4) Minimum und Maximum finden:");
        int[] nums5 = {5,9,16,0,-2,-18,41};
        int min5 = nums5[0];
        int max5 = nums5[0];
        for (int num : nums5) {
            if (num < min5) min5 = num;
            if (num > max5) max5 = num;
        }
        System.out.println("min = " + min5 + "; max = " + max5);

        //Level 3 – Bonus
        //1
        System.out.println("1) Array-Werte verdoppeln:");

        int[] nums6 = {2, 3, 4, 5, 12, 50};
        for (int i = 0; i < nums6.length; i++) {
            nums6[i] *= 2;
        }
        for (int num : nums6) {
            System.out.print(num + " ");
        }
        System.out.println();

        //2
        System.out.println("2) Zwei Arrays kombinieren:");
        String[] vornames = {"Max","Den","Ann"};
        String[] nachnames = {"Müller","Weber","Meyer"};

        for (int i = 0; i < vornames.length; i++) {
            System.out.println(vornames[i] + " " + nachnames[i]);
        }

        //3
        System.out.println("3) Benutzereingabe verarbeiten:");
        Scanner scanner = new Scanner(System.in);

        int[] nums7 = new int[5];
        for (int i = 0; i < nums7.length; i++) {
            System.out.println("Enter a number " + (i+1) + ":");
            nums7[i] = scanner.nextInt();
        }
        for (int num : nums7) {
            System.out.print(num + " ");
        }
        System.out.println();

        //4
        System.out.println("4) Einfacher Notenrechner:");
        int[] grades = {85, 70, 95, 60};
        int sum = 0;
        double average;

        for (int grade: grades) {
            sum += grade;
        }

        average = (double) sum / grades.length;
        if (average >= 70) {
            System.out.println("Bestanden: Durchschnitt = " + average);
        } else {
            System.out.println("Nicht bestanden: Durchschnitt = " + average);
        }

        //5
        System.out.println("5) Zufallszahlen sortieren:");
        int[] nums8 = new int[10];
        for (int i = 0; i < nums8.length; i++) {
            nums8[i] = (int) (Math.random() * 100 + 1);
        }
        printIntArray(nums8);

        Arrays.sort(nums8);
        printIntArray(nums8);

        int min8 = nums8[0];
        int max8 = nums8[0];
        int sum8 = 0;
        for (int num : nums8) {
            if (num < min8) min8 = num;
            if (num > max8) max8 = num;
            sum8 += num;
        }
        double avg8 = (double) sum8 / nums8.length;
        System.out.println("min = " + min8 + "; max = " + max8 + "; avg = " + avg8);

    }

    public static void printIntArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
