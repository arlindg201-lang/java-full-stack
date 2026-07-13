package com.code.day07;

public class MaxFinder {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int max = findMax(arr);
        System.out.println("这组数组的最大值是: " + max);
    }
}
