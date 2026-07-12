package com.code.day05;
import java.util.Scanner;
public class homework22 {
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
        int maxScore = 0;
        String maxName = "";
        for (int i = 0; i < num; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxName = names[i];
            }
        }
        System.out.println("最高分同学的姓名是：" + maxName);
    }
}
