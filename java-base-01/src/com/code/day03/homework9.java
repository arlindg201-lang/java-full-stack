package com.code.day03;

import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您想知道的月份：");
        int month = scanner.nextInt();

        scanner.close();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("输入的月份不存在,请重新输入！");

                /*

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入月份值：");
        int month = input.nextInt();

        input.close();

        String monthName = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "月份值输入有误！";
        }
        System.out.println(month +"对应的月份单词：" + monthName);
    }

                 */
        }
    }
}
