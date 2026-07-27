package com.code.day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

////案例需求：
//
//（1）声明MyArrays工具类，包含泛型方法：
//
//`public static <T> void swap( T[] arr,int a,int b)`：可以实现任意对象数组指定位置元素交换。
//
//（2）在主方法中调用上述方法进行测试
//
//```java
//Integer[] arr = {1,2,3,4,5,6};
//String[] strings = {"hello","world","java","atguigu"};
public class homework12 {

    public static <T> void method( T[] arr,int a,int b){
        //元素互换
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static <T> void print(T[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        System.out.println("原数组：" + Arrays.toString(arr));

        Collections MyArrays = null;
        MyArrays.swap(List.of(arr),0,1);
        System.out.println("交换[0]与[1]位置元素后：" + Arrays.toString(arr));

        System.out.println("=====================");
        String[] strings = {"hello","world","java","atguigu"};
        System.out.println("原数组：" + Arrays.toString(strings));
        MyArrays.swap(List.of(strings),0,strings.length-1);
        System.out.println("交换首尾位置元素后：" +Arrays.toString(strings));
    }
}
