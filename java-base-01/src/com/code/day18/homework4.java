package com.code.day18;

import java.util.Stack;

//目标：编写一个程序，检查一个字符串是否为回文串。
//
// 提示：使用栈来存储字符串的前半部分字符，依次弹出栈中字符与字符串后半部分进行比较
public class homework4 {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        int mid = str.length() / 2;

        // 将字符串的前半部分压入栈中
        for (int i = 0; i < mid; i++) {
            stack.push(str.charAt(i));
        }

        // 如果长度为奇数，跳过中间的字符
        int start = str.length() % 2 == 0 ? mid : mid + 1;

        // 与后半部分进行比较
        for (int i = start; i < str.length(); i++) {
            if (stack.isEmpty() || str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = "hello";
        String test3 = "madam";
        String test4 = "A man a plan a canal Panama";
        String test5 = "";

        System.out.println(test1 + (isPalindrome(test1)?"是回文单词":"不是回文单词"));
        System.out.println(test2 + (isPalindrome(test2)?"是回文单词":"不是回文单词"));
        System.out.println(test3 + (isPalindrome(test3)?"是回文单词":"不是回文单词"));
        System.out.println(test4 + (isPalindrome(test4)?"是回文单词":"不是回文单词"));
        System.out.println(test5 + (isPalindrome(test5)?"是回文单词":"不是回文单词"));
    }
}
