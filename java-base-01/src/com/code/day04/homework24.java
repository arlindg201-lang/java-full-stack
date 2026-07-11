package com.code.day04;

public class homework24 {
    public static void main(String[] args) {
        part1();
        part2();


    }
    public static void part1() {
        System.out.println("part1");
        for (int i=1;i<=7;i++){

            for(int j=1;j<=7;j++){
                if (i==j || i+j==8) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void part2() {
        System.out.println("part2");
        //上半部分：正的等腰三角形
        for (int i=1;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");

            }
            for (int j=1;j<=2*i-1;j++){
                //不是全部打印*
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //下半部分：倒的等腰三角形
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");

            }
            for (int j=1;j<=9-2*i;j++){
                //不是全部打印*
                if (j==1 || j==9-2*i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
