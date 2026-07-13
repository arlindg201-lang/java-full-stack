package com.code.day06;

public class homework3 {
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
        int[] arr = {5,6,2,8,7,1,3,9,10};
        System.out.println("arr数组：" + java.util.Arrays.toString(arr));
        System.out.println("所有元素之和：" + sum(arr));
        System.out.println("最大值：" + max(arr));
        System.out.println("最小值：" + min(arr));
        System.out.println("元素10首次出现的位置：" + indexOf(arr,10));
        System.out.println("元素10最后1次出现的位置：" + lastIndexOf(arr,10));
        System.out.println("元素10总共出现：" + valueCount(arr,10)+"次");
        sort(arr);
        System.out.println("从小到大排序：" + java.util.Arrays.toString(arr));
        reverse(arr,0, arr.length);
        System.out.println("反转数组");
        System.out.println("从大到小排序：" + java.util.Arrays.toString(arr));
    }
}
