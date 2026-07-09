package com.code.day02;
//9
public class homework9 {
    public static void main(String[] args) {
         int a = 3;
         int b = 1;

        System.out.println((a=b) == 1 ? "Equal" : "Not Equal");
        //编译错误，因为=是赋值运算符，而不是==比较运算符。a和b是int类型，不能进行==比较。正确的写法是(a==b) == 1 ? "Equal" : "Not Equal";
    }
}
