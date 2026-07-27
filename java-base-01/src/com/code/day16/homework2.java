package com.code.day16;

import java.util.ArrayList;
import java.util.Scanner;

//案例需求：
//
//（1）定义学生`Student`类，属性为姓名，年龄，属性私有化，提供有参构造，get/set，重写toString。
//
//（2）在测试类中，创建`ArrayList`集合中。
//
//（3）从键盘录入学生信息，创建学生对象，保存到集合中。
//
//循环录入的方式，1：表示继续录入，0：表示结束录入。
//
//案例效果如下所示：
//
//```java
//选择（1、录入；0、退出）：1
//姓名：张三
//年龄：23
//选择（1、录入；0、退出）：1
//姓名：李四
//年龄：26
//选择（1、录入；0、退出）：1
//姓名：王五
//年龄：27
//选择（1、录入；0、退出）：0
//Student{name='张三', age=23}
//Student{name='李四', age=26}
//Student{name='王五', age=27}
//超过25岁的有：[Student{name='李四', age=26}, Student{name='王五', age=27}]
public class homework2 {

    public class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("选择（1、录入；0、退出）：");
            int select = input.nextInt();
            if(select == 0){
                break;
            }
            System.out.print("姓名：");
            String name = input.next();
            System.out.print("年龄：");
            int age = input.nextInt();

            list.add(new Student(name,age));
        }

        ArrayList<Student> old = new ArrayList<>();
        for (Student stu : list) {
            System.out.println(stu);
            if(stu.getAge()>25){
                old.add(stu);
            }
        }
        System.out.println("超过25岁的有：" + old);

        input.close();
    }
}
