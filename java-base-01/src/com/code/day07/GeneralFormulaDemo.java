package com.code.day07;

public class GeneralFormulaDemo {
    public static void main(String[] args) {
        System.out.println("10的通项公式：" + f(10));
    }
    public static int f(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + f(n - 1);
        }
    }
}
