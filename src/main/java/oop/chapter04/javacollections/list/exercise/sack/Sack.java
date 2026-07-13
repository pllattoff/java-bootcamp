package oop.chapter04.javacollections.list.exercise.sack;

public class Sack {

    private char[] chars = new char[0];

    public void add(char ch) {
        char[] newChars = new char[chars.length+1];

        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[i];
        }
        newChars[newChars.length-1] = ch;

        chars = newChars;
    }

    public char get(int index) {
        return chars[index];
    }

    public char[] getChars() {
        return chars;
    }

    public int size() {
        return chars.length;
    }

    public void removeLast() {
        char[] newChars = new char[chars.length-1];

        for (int i = 0; i < chars.length-1; i++) {
            newChars[i] = chars[i];
        }
        chars = newChars;
    }

    public void remove(int index) {
        char[] newChars = new char[chars.length-1];

        for (int i = 0; i < chars.length; i++) {
            if (i < index) {
                newChars[i] = chars[i];
            } else if (i > index) {
                newChars[i-1] = chars[i];
            }
        }
        chars = newChars;
    }
}
