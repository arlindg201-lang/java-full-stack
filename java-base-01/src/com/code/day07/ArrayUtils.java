package com.code.day07;

public class ArrayUtils {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i] + "]";
            }
        }
        return result;
    }

    public static String toString(double[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i] + "]";
            }
        }
        return result;
    }

    public static String toString(char[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i] + "]";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        sort(arr);
        System.out.println(toString(arr));
        double[] arr2 = {3.1, 5.2, 1.3, 8.4, 2.5};
        sort(arr2);
        System.out.println(toString(arr2));
        char[] arr3 = {'c', 'a', 'b', 'd', 'e'};
        sort(arr3);
        System.out.println(toString(arr3));
    }
}
