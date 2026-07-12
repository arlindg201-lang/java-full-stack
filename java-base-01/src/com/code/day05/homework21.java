package com.code.day05;

import java.util.Scanner;
public class homework21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入本组学员的人数：");
        int num = scanner.nextInt();
        String[] names = new String[num];
        int[] scores = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("请输入第" + (i + 1) + "个学员的姓名：");
            names[i] = scanner.next();
            System.out.print("请输入第" + (i + 1) + "个学员的成绩：");
            scores[i] = scanner.nextInt();
        }
        System.out.println("本组学员的姓名和成绩如下：");
        for (int i = 0; i < num; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }
        boolean hasFullScore = false;
        for (int i = 0; i < num; i++) {
            if (scores[i] == 100) {
                hasFullScore = true;
                System.out.println(names[i] + " 满分");
            }
        }
        if (!hasFullScore) {
            System.out.println("没有满分学员");
        }
    }
}
