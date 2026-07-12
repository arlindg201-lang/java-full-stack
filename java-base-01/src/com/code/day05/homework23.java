package com.code.day05;
//案例需求：随机产生10个[1,100]之间的偶数存储到数组中，并按照从小到大排序输出。
//
//开发提示：
//
//- 随机产生[1,50]范围内的整数 * 2 就能得到[1,100]之间的偶数





public class homework23 {
    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 50+1) * 2;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[i] > arr[j+1]) {
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
