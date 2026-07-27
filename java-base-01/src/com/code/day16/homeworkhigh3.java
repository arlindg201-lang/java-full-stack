package com.code.day16;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

//从键盘输入一组单词，直到输入stop为止（不含stop），按照从短到长排序，并且要求单词不能重复，不区分大小写。
//
//运行效果如下：
//
//```java
//请输入单词，直到stop结束：hello
//请输入单词，直到stop结束：Hello
//请输入单词，直到stop结束：Java
//请输入单词，直到stop结束：world
//请输入单词，直到stop结束：JAVA
//请输入单词，直到stop结束：World
//请输入单词，直到stop结束：atguigu
//请输入单词，直到stop结束：stop
//[Java, hello, world, atguigu]
public class homeworkhigh3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Comparator<String> c = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                return result != 0 ? result : o1.compareToIgnoreCase(o2);
            }
        };
        TreeSet<String> set = new TreeSet<>(c);
        while(true){
            System.out.print("请输入单词，直到stop结束：");
            String word = input.next();
            if("stop".equalsIgnoreCase(word)) {
                break;
            }
            set.add(word);
        }

        System.out.println(set);

        input.close();
    }
}
