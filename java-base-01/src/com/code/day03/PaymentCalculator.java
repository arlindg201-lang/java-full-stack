package com.code.day03;

import java.util.Scanner;

public class PaymentCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //提示输入商品的价格
        System.out.print("请输入商品的价格：");
        double price = scanner.nextDouble();

        //提示输入商品的数量
        System.out.print("请输入商品的数量：");
        int quantity = scanner.nextInt();

        //计算商品的总价
        double totalPayment = price * quantity;

        //输出商品的总价
        System.out.println("商品的总价为：" + totalPayment);

        //关闭scanner对象
        scanner.close();
    }



}
