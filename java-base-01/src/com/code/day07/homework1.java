package com.code.day07;

class Light {
    String color;
    int time;
}
public class homework1 {
    public static void main(String[] args) {

        //创建3个交通灯对象，分别红色60秒，绿色90秒，黄色3秒
        Light red = new Light();
        red.color = "红";
        red.time = 60;
        System.out.println(red.color+"颜色的灯亮" + red.time +"秒");

        Light green = new Light();
        green.color = "绿";
        green.time = 90;
        System.out.println(green.color +"颜色的灯亮" + green.time+"秒");

        Light yellow = new Light();
        yellow.color = "黄";
        yellow.time = 3;
        System.out.println(yellow.color +"颜色的灯亮" + yellow.time +"秒");
    }
}
