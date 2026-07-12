package com.code.day05;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("输入数值有误");
        }else {
            System.out.println("月份：" + months[month - 1]);
        }
        scanner.close();
    }


}
