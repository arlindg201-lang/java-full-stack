package com.code.day02;
//19
public class Exercise19 {
    public static void main(String[] args) {
        int n = 16;
        //如果n是偶数，那么n&1就是0。2与n的最小公倍数就是n。
        System.out.println(n << (n&1));

        n = 25;
        //如果n是奇数，那么n&1就是1。2与n的最小公倍数就是n*2。
        System.out.println(n << (n&1));

    }


}
