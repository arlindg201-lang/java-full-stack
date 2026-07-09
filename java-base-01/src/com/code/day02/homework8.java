package com.code.day02;

public class homework8 {
    public static void main(String[] args) {
        int week = 2;
        week = week + 100;
        week %= 7;
        System.out.println("今天会死周2，一百天后是周" + (week == 0 ? "日" : week));
    }
}
