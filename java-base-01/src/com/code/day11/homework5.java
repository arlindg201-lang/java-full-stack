package com.code.day11;

public class homework5 {

    // 定义形状接口
    interface Shape {
        void draw();
    }



    // 定义ShapeFactory类
    public class ShapeFactory {

        // 成员内部类 - 圆形
        private static class Circle implements Shape {
            @Override
            public void draw() {
                System.out.println("Drawing a circle.");
            }
        }

        // 成员内部类 - 正方形
        private static class Square implements Shape {
            @Override
            public void draw() {
                System.out.println("Drawing a square.");
            }
        }

        // 成员内部类 - 三角形
        private static class Triangle implements Shape {
            @Override
            public void draw() {
                System.out.println("Drawing a triangle.");
            }
        }

        // 工厂方法，根据类型创建形状
        public static Shape getShape(String shapeType) {
            switch(shapeType){
                case "circle" :return new Circle();
                case "square":return new Square();
                case "triangle":return new Triangle();
                default:return null;
            }
        }
    }



    public class TestShapeFactory{
        // 主方法用于测试
        public static void main(String[] args) {
            Shape circle = ShapeFactory.getShape("circle");
            circle.draw(); // 应该输出 "Drawing a circle."

            Shape square = ShapeFactory.getShape("square");
            square.draw(); // 应该输出 "Drawing a square."

            Shape triangle = ShapeFactory.getShape("triangle");
            triangle.draw(); // 应该输出 "Drawing a triangle."
        }
    }
}
