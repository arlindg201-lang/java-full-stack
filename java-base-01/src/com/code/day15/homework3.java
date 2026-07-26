package com.code.day15;

import java.util.Scanner;

//* 键盘录入一个源字符串存储在src变量中，例如："java woaijava,i likejajavava i enjoy java"
//* 再录入要删除的字符串存储在del变量中，例如："ja"
//* 从src字符串中删除del，例如：删除"java woaijava,i likejajavava i enjoy java"中所有"ja"
//* 并统计del字符串在src中出现的次数，例如：统计“ja”共出现几次
public class homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入原字符串：");
        String src = input.next();

        System.out.print("请输入要删除的字符串：");
        String del = input.next();

        String result = src.replaceAll(del, "");

        int count = (src.length() - result.length())/del.length();
        System.out.println(del+"共出现了：" + count + "次");
        System.out.println("删除" + del + "后字符串：" + result);

        input.close();
    }
}
