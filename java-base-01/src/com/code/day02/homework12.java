package com.code.day02;
//12
public class homework12 {
    public static void main(String[] args) {

        int a = 8, b = 3;
        System.out.println(a>>>b);
        //1
         /*
        8的二进制：00000000 00000000 00000000 00001000
        8>>>3：   00000000 00000000 00000000 00000001
         */
        System.out.println(a>>>b | 2);
        //3
        /*
        8的二进制：00000000 00000000 00000000 00001000
        8>>>3：   00000000 00000000 00000000 00000001
        1 | 2：    00000000 00000000 00000000 00000011
         */

    }
}
