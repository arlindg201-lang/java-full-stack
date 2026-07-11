package com.code.day04;

public class homework2 {
    public static void main(String[] args) {
        //定义一个计数器，初始值为0
        int count = 0;
        //定义一个变量zf，表示珠穆朗玛峰的高度，单位为米
        int zf = 884860;
        //定义一个变量paper，表示初始纸张的厚度，单位为毫米
        //定义一个循环，当纸张厚度小于珠穆朗玛峰高度时，继续循环
        for (double paper = 0.1; paper < zf; paper *= 2) {
            //每次循环，计数器加1
            count++;

        }
        //输出结果
        System.out.println("需要折叠" + count + "次");
    }
}
