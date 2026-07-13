package com.code.day07;
//定义一个TriangleTools类，声明如下方法：
//
//- boolean isTriangle(double a, double b, double c)：判断a,b,c的值是否构成一个三角形
//- boolean isRightTriangle(double a, double b, double c)：判断a,b,c的值是否一个直角三角形
//- boolean isIsoscelesTriangle(double a, double b, double c)：判断a,b,c的值是否一个等腰三角形
//
//- boolean isEquilateralTriangle(double a, double b, double c)：判断a,b,c的值是否一个等边三角形
//
//- double area(double a, double b, double c)：根据a,b,c三条边，用海伦公式求面积
//
//- double perimeter(double a, double b, double c)：根据a,b,c三条边，求周长
//
//（2）在测试类的main方法,调用方法测试，三条边的值为3,4,5
public class homework7 {
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public static boolean isRightTriangle(double a, double b, double c) {
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }
    public static boolean isIsoscelesTriangle(double a, double b, double c) {
        return a == b || a == c || b == c;
    }
    public static boolean isEquilateralTriangle(double a, double b, double c) {
        return a == b && b == c;
    }
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        System.out.println("是否构成三角形：" + isTriangle(a, b, c));
        System.out.println("是否直角三角形：" + isRightTriangle(a, b, c));
        System.out.println("是否等腰三角形：" + isIsoscelesTriangle(a, b, c));
        System.out.println("是否等边三角形：" + isEquilateralTriangle(a, b, c));
        System.out.println("面积：" + area(a, b, c));
        System.out.println("周长：" + perimeter(a, b, c));
    }
}
