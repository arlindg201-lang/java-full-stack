package com.code.day16;
//案例需求：

//        （1）声明MyArrays工具类，包含泛型方法：

//        ​	`public static <T> void reverse(T[] arr)`：可以接收一个任意引用类型的数组，并反转数组中的所有元素

//        （2）在主方法中调用reverse方法进行测试

import com.code.day06.homework3;

import java.util.Arrays;

//        ```java
//        Integer[] arr = {1,2,3,4,5,6};
public class homework10 {

    public static <T> void reverse(T[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            T temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public class MyArrays {

        /**
         * 反转任意类型数组（泛型方法）
         */
        public static <T> void reverse(T[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                T temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
