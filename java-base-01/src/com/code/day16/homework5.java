package com.code.day16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

//（1）从键盘输入第一组单词放到HashSet集合a中，直到输入stop结束（不含stop）。
//
//（2）从键盘输入第二组单词放到TreeSet集合b中，直到输入stop结束（不含stop）。
//
//（3）从键盘输入第三组单词放到LinkedHashSet集合c中，直到输入stop结束（不含stop）。
//
//（4）分别查看3个集合的元素，观察它们有什么不同？
//
//（5）求HashSet与TreeSet集合的交集，a ∩ b
//
//（6）求HashSet与LinkedHashSet的并集， a ∪ c
//
//（7）求TreeSet与LinkedHashSet的差集 ，b - c
public class homework5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<String> a = new HashSet<>();
        while(true){
            System.out.print("请输入第一组单词，直到stop结束：");
            String word = input.next();
            if("stop".equalsIgnoreCase(word)) {
                break;
            }
            a.add(word);
        }

        TreeSet<String> b = new TreeSet<>();
        while(true){
            System.out.print("请输入第二组单词，直到stop结束：");
            String word = input.next();
            if("stop".equalsIgnoreCase(word)) {
                break;
            }
            b.add(word);
        }

        LinkedHashSet<String> c = new LinkedHashSet<>();
        while(true){
            System.out.print("请输入第三组单词，直到stop结束：");
            String word = input.next();
            if("stop".equalsIgnoreCase(word)) {
                break;
            }
            c.add(word);
        }

        System.out.println("a集合：" + a);
        System.out.println("b集合：" + b);
        System.out.println("c集合：" + c);

        HashSet<String> joinSet = new HashSet<>(a);
        joinSet.retainAll(b);
        System.out.println("a,b集合的交集：" + joinSet);

        HashSet<String> unionSet = new HashSet<>(a);
        unionSet.addAll(c);
        System.out.println("a,c集合的并集：" + unionSet);

        HashSet<String> differentSet = new HashSet<>(b);
        differentSet.removeAll(c);
        System.out.println("b,c集合的差集：" + differentSet);



        input.close();
    }
}
