package com.code.day03;

public class Part01_Exercise03_1 {
    public static void main(String[] args){
        part1();
        part2();
        part3();
        part4();
    }

    public static void part1(){
        System.out.println("part1");
        int x = 1;
        int y = 1;
        if(x++==2 && ++y==2){
            x =7;

        }
        System.out.println("x="+x+",y="+y);

    }
    public static void part2(){
        System.out.println("part2");
        int x =1,y = 1;
        if(x++==2 & ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
    }
    public static void part3(){
        System.out.println("part3");
        int x = 1,y =1;
         if (x++==1 | ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
    }
    public static void part4(){
        System.out.println("part4");
        int x =1,y = 1;

        if (x++==1 || ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
    }

}
