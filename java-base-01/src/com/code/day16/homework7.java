package com.code.day16;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

//（1）存储一组字符串到第一个Set集合中
//
//```java
//hello,java,world,atguigu,chailinyan
//```
//
//（2）存储一组字符串到第二个Set集合中
//
//```java
//hello,atguigu
//```
//
//（3）编写代码模拟removeAll方法的效果：
//
//使用迭代器遍历第一个Set集合，如果这个单词在第二个集合中，那么删除这个单词
public class homework7 {

    public static void main(String[] args) {
        TreeSet<Integer> red = new TreeSet<Integer>();
        Random rand = new Random();
        while(red.size()<6){
            red.add(rand.nextInt(1,33));
        }
        ArrayList<Integer> list = new ArrayList<>(red);
        list.add(rand.nextInt(1,17));//蓝色号码

        System.out.print("双色球的红色号码：");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("蓝色号码：" + list.get(list.size()-1));
    }




}
