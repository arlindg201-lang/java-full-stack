package com.code.day07;

public class homework8 {
    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i);
    }

    public static void change(int i){
        i++;
    }
}
