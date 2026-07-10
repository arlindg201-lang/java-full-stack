package com.code.day03;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入方程： ax的平方+bx+c=0，中的三个系数：");
        System.out.println("请输入系数a：");
        double a = scanner.nextDouble();
        System.out.println("请输入系数b：");
        double b = scanner.nextDouble();
        System.out.println("请输入系数c：");
        double c = scanner.nextDouble();

        scanner.close();

        if (a != 0) {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("方程的两个根为：" + x1 + " 和 " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("方程的根为：" + x);
            } else {
                System.out.println("方程无实数根");

            }


        } else {
            if (b != 0) {
                double x = -c / b;
                System.out.println("一元一次方程的根为：" + x);
            }else {
                System.out.println("方程没有实数根，输入的值有误。");
            }
        }
    }
}


