package com.code.day16;

import java.util.ArrayList;
import java.util.Random;

//## 第1题：随机验证码
//
//案例需求：
//
//随机验证码。
//
//* 随机生成十组六位字符组成的验证码。
//* 验证码由大小写字母、数字字符组成。
//
//案例效果示例：
//
//```java
//10组验证码：[OgmZ8L, oxjaVL, IQ51Sz, yb47TZ, jySohu, cCXBql, HohyHF, st9yWZ, RivAHo, l6tzUR]
//```
//
//开发提示：
//
//* 把26个大小写字母，数字0-9保存到一个ArrayList集合letterList中
//* 利用Random类生成随机索引从letterList中取字符组成验证码放到另一个ArrayList集合checkCodeList中
public class homework1 {

    public static void main(String[] args) {
        ArrayList<Character> letterList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            letterList.add((char)('a'+i));
            letterList.add((char)('A'+i));
        }
        for (int i = 0; i < 10; i++) {
            letterList.add((char)('0'+i));
        }
        System.out.println(letterList);

        Random random = new Random();
        ArrayList<String> checkCodeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String code = "";
            for (int j = 0; j < 6; j++) {
                int index = random.nextInt(0, letterList.size());
                code+=letterList.get(index);
            }
            checkCodeList.add(code);
        }
        System.out.println(checkCodeList);
    }
}
