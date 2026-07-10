package com.code.day03;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您想知道结果的日期：");
        System.out.print("年份：");
        int year = scanner.nextInt();
        System.out.print("月份：");
        int month = scanner.nextInt();
        System.out.print("日期：");
        int day = scanner.nextInt();
        scanner.close();

        if (year > 0) {
            if (month >= 1 && month <= 12) {
                //计算month月的总天数
                int days;
                if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                } else {
                    days = 31;
                }

                if(day >= 1 && day <= days) {
                    System.out.println(year + "-" + month + "-" + day);
                }else{
                    System.out.println("日期输入不合法");
                }
            } else {
                System.out.println("月份输入不合法");
            }
        } else {
            System.out.println("年份输入不合法");
        }
    }
}
