package com.code.day19;

import java.time.LocalDateTime;
import java.util.Date;

//案例需求：
//
//1、定义一个函数式接口CurrentTimePrinter,其中抽象方法void printCurrentTime()，使用注解@FunctionalInterface
//
//2、通过lambda表达式分别实现CurrentTimePrinter，完成
//
//（1）实现一：打印当前系统时间毫秒值，用System. currentTimeMillis()
//
//（2）实现二：打印当前系统时间，用Date
//
//（3）实现三：打印本地化当前系统时间，用LocalDateTime
public class homework5 {

    @FunctionalInterface
    public interface CurrentTimePrinter{
        void printCurrentTime();
    }

    public static void main(String[] args) {
        CurrentTimePrinter c1 = () -> System.out.println(System.currentTimeMillis());
        CurrentTimePrinter c2 = () -> System.out.println(new Date());
        CurrentTimePrinter c3 = () -> System.out.println(LocalDateTime.now());

        c1.printCurrentTime();
        c2.printCurrentTime();
        c3.printCurrentTime();


    }
}
