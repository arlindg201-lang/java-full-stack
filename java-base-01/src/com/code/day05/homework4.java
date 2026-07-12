package com.code.day05;

public class homework4 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String [] huase = {"♠", "♥", "♣", "♦"};
        String [] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String [] pu = new String[huase.length*numbers.length+2];
        for(int i=0,k=0; i<huase.length; i++){
            for(int j=0; j<numbers.length; j++,k++){
                pu[k] = huase[i]+numbers[j];
            }
        }
        pu[pu.length-2] = "大王";
        pu[pu.length-1] = "小王";

        for (int i = 1; i <= pu.length; i++) {
            System.out.print(pu[i-1]+" ");
            if(i%13==0){
                System.out.println();
            }
        }
    }
}
