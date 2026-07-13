package com.code.day06;

import java.util.Scanner;
public class homework1 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int remainder(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Remainder: " + remainder(a, b));
    }

}

