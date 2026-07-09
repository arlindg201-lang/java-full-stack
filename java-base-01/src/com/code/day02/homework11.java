package com.code.day02;

public class homework11 {
    public static void main(String[] args) {
        int i = 2;
        i *=i++;
/*
        i = i * (i++);

        =右边从左往右解析表达式
        (1)取i的值2
        (2)取i的值2
        (3)i自增
        (4)2*2=4
        (5)i=4
         */

        int j = 2;
        j *=j+1;
/*
        j = j * (j + 1 );

        =右边从左往右解析表达式
        (1)取j的值2
        (2)取j的值2
        (3)算j+1=3
        (4)2*3=6
        (5)j=6
         */


        int k = 2;
        k *= ++k;
/*
        k = k * (++k);

        =右边从左往右解析表达式
        (1)取k的值2
        (2)k自增
        (3)取k的值3
        (4)2*3=6
        (5)k=6
         */

        System.out.println("I=" + i);
        System.out.println("J=" + j);
        System.out.println("K=" + k);

    }
}
