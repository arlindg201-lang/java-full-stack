package com.atguigu.util;


//1、在main/java的com.atguigu.util包下定义MathUtil类，该类包含一个加法方法 add(int a, int b) 和一个除法方法 divide(int a, int b)。


public class MathUtil {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为零");

        }
        return a / b;

    }
}
