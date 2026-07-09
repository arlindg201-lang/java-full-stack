package com.code.day02;
//16
public class Exercise16 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("交换之前：a = " + a + "，b = " + b);


        a =a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换之后：a = " + a + "， b = " + b);
    }
}
