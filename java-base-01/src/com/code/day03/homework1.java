package com.code.day03;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();

        scanner.close();

        if (num % 5 == 0 && num != 0){
            System.out.println(num + "是5的倍数");

        }else {
            System.out.println(num + "不是5的倍数");
        }

    }
}


