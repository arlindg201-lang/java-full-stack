package com.code.day03;

public class hw4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        boolean flag = false;
        if (flag == true) {
            c = a++ + b;
        }

        if (flag == false) {
            c = ++a - b;

            /*
			(1)++a
			先对a自增，a从1变为2
			(2)减法
			2-2=0
			(3)赋值
			c=0
			*/
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
