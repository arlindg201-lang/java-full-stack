package com.code.day04;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
     //统计输入的正数，负数的个数
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        while (true) {
            System.out.print("请输入一个整数（0表示结束）：");
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                break;
            }
        }
        System.out.println("正数个数：" + positiveCount);
        System.out.println("负数个数：" + negativeCount);

        scanner.close();
        System.out.println("Hello World");
    }
}
