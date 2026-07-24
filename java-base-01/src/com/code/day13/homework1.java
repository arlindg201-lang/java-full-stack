package com.code.day13;

public class homework1 {

    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;
        //包装类 vs 包装类：看是否在缓存范围（-128~127），在则 true，不在则 false。
        int i3 = 128;
        int i4 = 128;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i1 == i3);
        //包装类 vs 基本类型：包装类自动拆箱，比较数值，true。
    }


}
