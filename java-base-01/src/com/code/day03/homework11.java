package com.code.day03;
import java.util.Scanner;


public class homework11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入日期：");
        System.out.print("年：");
        int year = input.nextInt();

        System.out.print("月：");
        int month = input.nextInt();

        System.out.print("日：");
        int day = input.nextInt();

        input.close();

        //输入日期值合法性验证
        boolean flag = false;
        if (year > 0) {
            if (month >= 1 && month <= 12) {
                //计算month月的总天数
                int days;
                if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                } else {
                    days = 31;
                }

                if(day >= 1 && day <= days) {
                    flag = true;
                }else{
                    System.out.println("日期输入不合法");
                }
            } else {
                System.out.println("月份输入不合法");
            }
        } else {
            System.out.println("年份输入不合法");
        }

        if(flag){
            //判断这一天是当年的第几天==>从1月1日开始，累加到xx月xx日这一天
            //(1)[1,month-1]个月满月天数
            //(2)单独考虑2月份是否是29天（依据是看year是否是闰年）
            //(3)第month个月的day天

            //声明一个变量days，用来存储总天数
            int days = 0;

            //累加[1,month-1]个月满月天数
            switch (month) {
                case 12:
                    //累加的1-11月
                    days += 30;
                    //这个30是代表11月份的满月天数
                    //这里没有break，继续往下走
                case 11:
                    //累加的1-10月
                    days += 31;
                    //这个31是代表10月的满月天数
                    //这里没有break，继续往下走
                case 10:
                    days += 30;
                    //9月
                    days += 31;
                    //8月
                case 8:
                    days += 31;
                    //7月
                    days += 30;
                case 6:
                    days += 31;
                    //5月
                    days += 30;
                case 4:
                    days += 31;
                    //3月
                    days += 28;
                    //在这里考虑是否可能是29天
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days++;
                        //多加1天
                    }
                case 2:
                    days += 31;
                    //1月
                case 1:
                    days += day;
                    //第month月的day天
            }

            System.out.print(year + "-" + month + "-" + day + "这一天是");
            System.out.println((days % 5 == 1 || days % 5 == 2 || days % 5 == 3 ? "打鱼" : "晒网"));
        }
    }

}
