package com.code.day04;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int num = scanner.nextInt();

        System.out.println("请输入月份：");
        int month = scanner.nextInt();

        System.out.println("请输入日期：");
        int day = scanner.nextInt();

        scanner.close();

        int days = day;
        for (int i = 1; i < month; i++){
            if (i ==4 || i ==6 || i ==9 || i ==11){
                days += 30;
            }else if (i ==1 || i ==3 || i ==5 || i ==7 || i ==8 || i ==10 || i ==12){
                days += 31;
            }else if (i ==2){
                days += 28;
            }
        }
        System.out.println("这一天是今年的第" + days + "天");
        System.out.println("Hello World");
    }
}
