package com.code.day09;
//- 定义一个类 Vehicle，表示交通工具：
//  - 属性 speed（速度）和 color（颜色）为私有；
//  - 提供构造器初始化这两个属性；
//  - 提供 move() 方法，输出“正在移动”；
//  - 提供 get/set方法
//  - 重写toString方法
//- 定义两个子类 Car 和 Bicycle：
//  - Car 类新增属性 numDoors（车门数量），并重写 move() 方法，输出“汽车正在移动”；重写toString方法。
//  - Bicycle 类新增属性 wheelSize（轮子大小），并重写 move() 方法，输出“自行车正在移动”；重写toString方法。
//- 编写测试类，实例化两个子类对象，并调用它们的方法。
public class homework1 {
    public class Vehicle {
        private double speed;
        private String color;
        
        public Vehicle(){
            
        }

        public Vehicle(double speed, String color) {
        }

        public void move(){
            System.out.println("正在移动");
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getSpeed() {
            return speed;
        }
        public void setSpeed(double speed) {
            this.speed = speed;
        }
        @Override
        public String toString() {
            return "Vehicle [速度=" + speed + ", 颜色=" + color + "]";
        }
    }
    
    public class Car extends Vehicle {
        private int numDoors;
        
        public Car(){
            
        }
        public Car(double speed, String color, int numDoors){
            super(speed, color);
            this.numDoors = numDoors;
        }
        @Override
        
        public  void move(){
            System.out.println("汽车正在移动");
        }
        public int getNumDoors() {
            return numDoors;
        }
        public void setNumDoors(int numDoors) {
            this.numDoors = numDoors;
        }
        @Override
        public String toString() {
            return "Car [车门数量=" + numDoors + ", 速度=" + getSpeed() + ", 颜色=" + getColor() + "]";
        }
    }
    public class Bicycle extends Vehicle {
        private double wheelSize;
        
        public Bicycle(){
            
        }
        public Bicycle(double speed, String color, double wheelSize){
            super(speed, color);
            this.wheelSize = wheelSize;
        }
        @Override
        public void move(){
            System.out.println("自行车正在移动");
            
        }
        public double getWheelSize() {
            return wheelSize;
        }
        public void setWheelSize(double wheelSize) {
            this.wheelSize = wheelSize;
        }
        @Override
        public String toString() {
            return "Bicycle [轮子大小=" + wheelSize + ", 速度=" + getSpeed() + ", 颜色=" + getColor() + "]";
        }
    }
    public void main(String[] args) {
        //实例化 Car 对象
        Car car = new Car(120.0, "红色", 4);
        car.move();
        System.out.println(car);   
        //修改颜色
        car.setColor("蓝色");
        System.out.println("修改颜色后：" + car.getColor());
        
        //实例化 Bicycle 对象
        Bicycle bicycle = new Bicycle(25.0,"绿色", 26.5);
        bicycle.move();
               
        System.out.println(bicycle);        
    }
}
