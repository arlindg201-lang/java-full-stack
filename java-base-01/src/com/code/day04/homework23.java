package com.code.day04;

public class homework23 {
    public static void main(String[] args) {
    for (int i =1; i <= 5 ; i++){
        for (int j = 4; j >= i; j--){
            System.out.print(" ");

        }
        for (int j = 1; j <= 2*i-1; j++){
            System.out.print(i);
        }
        System.out.println();
    }
    }


}
