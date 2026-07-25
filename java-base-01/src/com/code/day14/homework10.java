package com.code.day14;

public class homework10 {
    {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    void Test(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
    public static void main(String[] args) {
        System.out.println(getOut());
    }
}
