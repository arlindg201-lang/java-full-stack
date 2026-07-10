package com.code.day03;

import java.util.Scanner;

public class DateFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //提示输入年份
        System.out.print("请输入年份(yyyy)：");
        int year = scanner.nextInt();

        //提示输入月份
        System.out.print("请输入月份(mm)：");
        int month = scanner.nextInt();

        //提示输入日期
        System.out.print("请输入日期(dd)：");
        int day = scanner.nextInt();

        //关闭scanner对象
        scanner.close();
        //拼接日期字符串
        String formattedDate = year + "-" + month + "-" + day;

        //输出日期
        //System.out.println("输入的日期是：" + year + "年" + month + "月" + day + "日");
        System.out.println("日期格式为：" + formattedDate);


    }



}
