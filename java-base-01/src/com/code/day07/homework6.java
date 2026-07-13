package com.code.day07;

public class homework6 {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] arr, int value) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int valueCount(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        for (int i = 0; i < arr.length && i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static String toString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += i == 0 ? "" : ",";
            str += arr[i];
        }
        str += "]";
        return str;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 4, 8, 1, 7};
        System.out.println("arr数组：" + toString(arr)); // 打印数组
        System.out.println("arr数组的长度：" + arr.length);
        System.out.println("arr数组的和：" + sum(arr));
        System.out.println("arr数组的最大值：" + max(arr));
        System.out.println("arr数组的最小值：" + min(arr));
        System.out.println("arr数组中5出现的次数：" + valueCount(arr, 5));
        System.out.println("arr数组中5第一次出现的索引：" + indexOf(arr, 5));
        System.out.println("arr数组中5最后一次出现的索引：" + lastIndexOf(arr, 5));
        sort(arr);
        System.out.println("arr数组排序后：" + toString(arr));
        reverse(arr, 2, 5);
        System.out.println("arr数组反转后（索引2到5）：" + toString(arr));
        int[] newArr = copyOf(arr, 10);
        System.out.println("arr数组复制后长度为10：" + toString(newArr));
    }

}
