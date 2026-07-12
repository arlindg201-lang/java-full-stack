package com.code.day05;

import java.util.Scanner;

public class homework24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个英语单词：");
        String word = input.next();
        //假如输入的英语单词是mom

        input.close();

        char[] wordCharArray = word.toCharArray();
        // wordCharArray字符数组内容是{'m','o','m'}

        //(1)先假设它是对称的
        boolean flag = true;

        //(2)遍历，查看数组的元素是否首尾对称
        //left表示左边的下标
        //right表示右边的下标
        for(int left=0,right=wordCharArray.length-1; left<right; left++,right--){
            if(wordCharArray[left] != wordCharArray[right]){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println(word + "是回文单词");
        }else{
            System.out.println(word + "不是回文单词");
        }

    }
}
