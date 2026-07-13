package oop.chapter04.javacollections.list.exercise.sack;

public class Main {
    static void main() {

        // Bonus: Sack
        Sack sack = new Sack();
        sack.add('a');
        sack.add('b');
        sack.add('C');
        sack.add('1');
        sack.add('2');
        System.out.println(sack.getChars());

        System.out.println("get(index): " + sack.get(0));
        System.out.println("size(): " + sack.size());

        sack.removeLast();
        System.out.println(sack.getChars());
        System.out.println("size(): " + sack.size());

        sack.remove(1);
        System.out.println(sack.getChars());
        System.out.println("size(): " + sack.size());

    }
}
