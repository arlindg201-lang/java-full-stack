package com.code.day15;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//从键盘输入两个日期，格式：yyyy-MM-dd：
//
//- 判断第一个日期是否在第二个日期之前；
//- 计算两个日期之间间隔的天数；
//- 判断第一个日期是闰年吗；
//- 第一个日期加上100天，查看新的日期值。
public class TestLocalDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate one = null;
        LocalDate two = null;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        while(true) {
            System.out.print("请输入第一个日期(yyyy-MM-dd)：");
            String first = input.next();
            try {
                one = LocalDate.from(df.parse(first));
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("日期格式不正确，正确的格式为：1995-05-06");
            }
        }

        while(true) {
            System.out.print("请输入第二个日期(yyyy-MM-dd)：");
            String second = input.next();
            try {
                two = LocalDate.from(df.parse(second));
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("日期格式不正确，正确的格式为：1995-05-06");
            }
        }

        System.out.println(one+"在" + two+"之前吗？"  + one.isBefore(two));
        long days = Math.abs(one.toEpochDay() - two.toEpochDay());
        System.out.println("两个日期之间间隔的天数：" + days);
        System.out.println(one +"是闰年吗？" + one.isLeapYear());
        LocalDate three = one.plusDays(100);
        System.out.println(one+"加100天后：" + three);

        input.close();
    }

}
