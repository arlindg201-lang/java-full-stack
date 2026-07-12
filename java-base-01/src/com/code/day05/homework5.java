package com.code.day05;

//随机生成验证码，要求包含大小写字母和数字，长度为6位
public class homework5 {
    public static void main(String[] args) {

        char[] letters = new char[26*2+10];
        for (int i = 0; i < letters.length; i++) {
            if (i < 26) {
                letters[i] = (char) ('a' + i);
            } else if (i < 26 + 26) {
                letters[i] = (char) ('A' + i - 26);
            } else {
                letters[i] = (char) ('0' + i - 26 - 26);
            }
        }
        String code = "";
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * letters.length);
            code += letters[index];
        }
        System.out.println("生成的验证码是：" + code);
    }
}
