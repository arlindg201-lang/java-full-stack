package com.code.day15;
//编写代码完成如下方法：
//public static String replace(String text, String target, String replace)
//
//示例：replace(“aabbccbb”, “bb”, “dd”);  结果：aaddccdd
//
//注意：不能使用String及StringBuffer等类的replace，repalceAll等现成的替换API方法
public class homework5 {

    public static void main(String[] args) {
        System.out.println(replace("aabbcbcbb", "bb", "dd"));
    }

    public static String replace(String text, String target, String replace) {
        while (true) {
            int index = text.indexOf(target);
            if (index != -1) {
                text = text.substring(0, index) + replace + text.substring(index + target.length());
            } else {
                break;
            }
        }
        return text;
    }
}
