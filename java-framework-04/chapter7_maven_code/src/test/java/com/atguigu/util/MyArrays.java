package com.atguigu.util;


import org.junit.jupiter.api.Test;
public class MyArrays {
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max>arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public class TestMyArrays {
        @Test
        public void test1() {
            int[] arr = {2, 5, 8, 6, 3};
            int max = MyArrays.max(arr);
            System.out.println("max = " + max);
        }


        public void test2() {
            int[] arr = {2, 5, 8, 6, 3};
            assert MyArrays.max(arr) == 8 : "查找最大值错误";
        }
    }
}
