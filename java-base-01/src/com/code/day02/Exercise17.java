package com.code.day02;

public class Exercise17 {

    public static void main(String[] args) {
         int a = 5;
         System.out.println(((a & 1) == 1) ? "奇数" : "偶数");
         System.out.println((a % 2 == 1) ? "奇数" : "偶数");
    }

}
