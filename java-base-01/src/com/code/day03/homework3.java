package com.code.day03;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入订单总价：");
        double totalPrice = scanner.nextDouble();

        scanner.close();

        if (totalPrice >= 0) {
            double discount;
            if (totalPrice >= 500) {
                discount = 0.8;
            } else if (totalPrice >= 400) {
                discount = 0.85;
            } else if (totalPrice >= 300) {
                discount = 0.9;

            } else if (totalPrice >= 200) {
                discount = 0.95;

            } else {
                discount = 1;
            }
            System.out.println("订单总价为：" + totalPrice + "，折扣为：" + discount + "，最终价格为：" + totalPrice * discount);
        } else {
            System.out.println("输入的订单总价有误");
        }
    }
}
