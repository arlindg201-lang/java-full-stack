package com.code.day09;
//- 定义一个类 Point，表示二维平面上的一个点：
//  - 属性 x 和 y 为私有且加final修饰
//  - 提供带参数的构造器；
//  - 提供 getX()、getY() 方法；
//  - 提供 distanceToOrigin() 方法，计算该点到原点 (0, 0) 的距离（使用 Math.sqrt()）；
//  - 提供 distanceTo(Point other) 方法，计算两点之间的距离；
//  - 重写toString方法
//- 编写测试类，创建多个点并测试各种方法。

public class homework4 {
    public class Point {
        private final int x;
        private final int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public double distanceToOrigin() {
            return Math.sqrt(x * x + y * y);
        }
        public double distanceTo(Point other) {
            return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
        }
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public class TestPoint {
        public void main(String[] args) {
            // 创建两个点
            Point p1 = new Point((int) 3.0, (int) 4.0);
            Point p2 = new Point((int) 6.0, (int) 8.0);

            // 输出点信息
            System.out.println("点 p1: " + p1);
            System.out.println("点 p2: " + p2);

            // 计算到原点的距离
            System.out.println("p1 到原点的距离: " + p1.distanceToOrigin());
            System.out.println("p2 到原点的距离: " + p2.distanceToOrigin());

            // 计算两点之间的距离
            System.out.println("p1 和 p2 之间的距离: " + p1.distanceTo(p2));
        }
    }


}
