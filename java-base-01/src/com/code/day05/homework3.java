package com.code.day05;

import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入小组的人数：");
        int num = scanner.nextInt();

        String[] names = new String[num];
        for (int i = 0; i < names.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个成员的姓名：");
            names[i] = scanner.next();
        }

        //全部输入完后，输出所有成员的姓名
        System.out.print("小组成员有：");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
        }
        System.out.println();
        scanner.close();

        System.out.println("Hello, World!");
    }
}
