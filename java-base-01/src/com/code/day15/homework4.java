package com.code.day15;
////面试题：自己定义reverse(String str,int start,int end)方法，
// 将字符串中指定部分进行反转。比如将“abcdefgho”实现[2,5]部分反转，
// 结果为”abfedcgho”
public class homework4 {
    public static void main(String[] args) {
        String str = "abcdefgho";
        String result = reverse(str, 2, 5);
        System.out.println(result);
    }

    public static String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}

