package com.code.day05;

public class homework2 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        char[] letters = new char[26];


        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + i);
            System.out.print(letters[i] + "->" + (char) (letters[i] - 32) + " ");
        }
    }
}
