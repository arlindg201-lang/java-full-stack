package com.code.day03;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个字符：");
        char ch = scanner.next().charAt(0);

        scanner.close();
        if (ch >= '0' && ch <= '9'){
            System.out.println(ch + "是数字字符");

        }else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + "是字母字符");
        }else {
            System.out.println(ch + "是其他非数字非字母字符");
        }
    }



}
