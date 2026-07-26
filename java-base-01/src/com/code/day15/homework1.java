package com.code.day15;
//案例需求：1个字符串中可能包含a-z中的多个字符，字符也可能重复，
// 例如：String data = “aabcexmkduyruieiopxzkkkkasdfjxjdsds”;写一个程序，
// 对于给定一个这样的字符串求出字符串出现次数最多的那个字母以及出现的次数
// （若次数最多的字母有多个，则全部求出）
public class homework1 {

    public static void main(String[] args) {
        String str = "aabbyolhljlhlxxmnbwyteuhfhjloiqqbhrg";

        //统计每个字母的次数
        int[] counts = new int[26];
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            counts[letters[i]-97]++;
        }

        //找出最多次数值
        int max = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if(max < counts[i]) {
                max = counts[i];
            }
        }
        //找出所有最多次数字母
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] == max) {
                System.out.println((char)(i+97));
            }
        }
    }
}
