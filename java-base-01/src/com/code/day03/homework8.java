package com.code.day03;

public class homework8 {
    public static void main(String[] args) {
        int month = 12;
        int day = 2;

        //以下判断是基于月份和日期在合法范围内的
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18 )) {
            System.out.println("生日" + month + "月" + day + "日是水瓶座");
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            System.out.println("生日" + month + "月" + day + "日是双鱼座");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.println("生日" + month + "月" + day + "日是白羊座");
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.println("生日" + month + "月" + day + "日是金牛座");
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            System.out.println("生日" + month + "月" + day + "日是双子座");
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            System.out.println("生日" + month + "月" + day + "日是巨蟹座");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("生日" + month + "月" + day + "日是狮子座");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("生日" + month + "月" + day + "日是处女座");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 23)) {
            System.out.println("生日" + month + "月" + day + "日是天平座");
        } else if ((month == 10 && day >= 24) || (month == 11 && day <= 22)) {
            System.out.println("生日" + month + "月" + day + "日是天蝎座");
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            System.out.println("生日" + month + "月" + day + "日是射手座");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.println("生日" + month + "月" + day + "日是摩羯座");
        }

        System.out.println("Hello World!");
    }
}
