package com.code.day16;

import java.util.LinkedHashSet;
import java.util.Scanner;

//案例需求：从键盘输入一组单词，直到输入stop为止（不含stop），
//
//- 统计这些单词中出现过哪些字母，按字母出现的顺序输出。
//- 统计这些单词中未出现过哪些字母
//
//```java
//请输入单词，直到stop结束：hello
//请输入单词，直到stop结束：world
//请输入单词，直到stop结束：atguigu
//请输入单词，直到stop结束：java
//请输入单词，直到stop结束：good
//请输入单词，直到stop结束：perfect
//请输入单词，直到stop结束：stop
//单词中出现的字母有：[h, e, l, o, w, r, d, a, t, g, u, i, j, v, p, f, c]
//单词中未出现的字母有：[b, k, m, n, q, s, x, y, z]
public class homework6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        while(true){
            System.out.print("请输入单词，直到stop结束：");
            String word = input.next();
            word = word.toLowerCase();
            if("stop".equals(word)) {
                break;
            }
            char[] chars = word.toCharArray();
            for (int i=0; i<chars.length;i++) {
                set.add(chars[i]);
            }
        }
        System.out.println("单词中出现的字母有：" + set);

        LinkedHashSet<Character> allLetters = new LinkedHashSet<>();
        for(char c='a'; c<='z';c++){
            allLetters.add(c);
        }
        allLetters.removeAll(set);
        System.out.println("单词中未出现的字母有：" + allLetters);


        input.close();
    }
}
