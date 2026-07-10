package com.code.day03;

import java.util.Scanner;

public class GreetingGenerator {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       //提示用户输入名字
       System.out.print("请输入你的名字：");
       String name = scanner.nextLine();

       //提示用户输入性别
       System.out.print("请输入你的性别(男/女)：");
       String gender = scanner.nextLine();

       //根据性别输出不同的问候语
       System.out.println("尊敬的" + name + ("男".equals(gender)? "先生" : "女士") + "，您好！");

       //关闭scanner对象
       scanner.close();
    }
}
