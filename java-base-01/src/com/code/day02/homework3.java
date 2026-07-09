package com.code.day02;
//3
public class homework3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);
        System.out.println("byte类型的b1和b2的和为：" + b3);

        short s1 =1000;
        short s2 = 2000;
        short s3 = (short)(s1 + s2);
        System.out.println("short类型的s1和s2的和为：" + s3);

        char c1 = 'a';
        int num = 5;
        char letter = (char)(c1 + num);
        System.out.println("char类型的c1和int类型的num的和为：" + letter);

        int i1 = 5;
        int i2 = 2;
        double result = (double)i1 / i2;
        System.out.println("int类型的i1和i2的商为：" + result);


    }
}
