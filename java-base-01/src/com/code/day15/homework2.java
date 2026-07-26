package com.code.day15;
//获取一个字符串在另一个字符串中出现的次数。
// 比如：获取"ab"在 “abababkkcadkabkebfkabkskab”中出现的次数
public class homework2 {
    public static void main(String[] args) {
        String str1="ab";
        String str2="abababkkcadkabkebfkabkskab";
        System.out.println(str1 + "在" + str2 +"中出现的次数：" + count(str1,str2));
    }

    public static int count(String str1,String str2){
        int count =0;
        while(true){
            int index = str2.indexOf(str1);
            if(index != -1){
                count++;
                str2 = str2.substring(index + str1.length());
            }else{
                break;
            }

        }
        return count;
    }

}
