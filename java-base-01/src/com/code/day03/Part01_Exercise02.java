package com.code.day03;

public class Part01_Exercise02 {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 0;
        boolean flag = false;
        if(flag=true){
            c = a++ + b;
            /*
			（1）a++
			先取a的值1，a自增为2
			（2）加法
			1+2=3
			（3）把3赋值给c

			a=2,b=2,c=3
			*/
        }

        if(flag=false){
            c = ++a - b;
            /*
			（1）++a
			先自增，a从1变为2
			（2）减法
			2-2=0
			（3）赋值
			c=0

			a=2,b=2,c=0
			*/
        }
        System.out.println("a = " + a);
        // 2
        System.out.println("b = " + b);
        // 2
        System.out.println("c = " + c);
        // 3
    }
}
