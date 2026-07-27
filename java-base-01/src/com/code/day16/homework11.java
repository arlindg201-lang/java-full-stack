package com.code.day16;

import java.util.Comparator;

//案例需求：
//
//1、声明MyArrays工具类，包含泛型方法：
//
//`public static <T extends Comparable<? super T>> void sort(T[] arr)`：可以给任意对象数组按照元素的自然排序实现从小到大排序，用冒泡排序实现
//
//`public static <T> void sort(T[] arr, Comparator<? super T> c)`：可以给任意对象数组按照指定的比较器实现从小到大排序，用冒泡排序实现
//
//2、有如下四个学生的成绩：
//
//![1559896951791](images/1559896951791.png)
//
//（1）用`Comparable`接口对下列四位同学的成绩做降序排序，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。请正确指定泛型。
//
//（2）用`Comparator`实现按照姓名排序，请正确指定泛型
public class homework11 {

    public class Student implements Comparable<Student> {
        private String name;
        private int age;
        private double score;

        public Student(String name, int age, double score) {
            super();
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public Student() {
            super();
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

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
        }

        @Override
        public int compareTo(Student stu) {
            if (this.getScore() > stu.getScore()) {
                return -1;
            } else if (this.getScore() < stu.getScore()) {
                return 1;
            }
            return this.getAge() - stu.getAge();
        }


    }

    public class MyArrays {
        public static <T extends Comparable<? super T>> void sort(T[] arr){
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr.length-i; j++) {
                    if(arr[j].compareTo(arr[j+1])>0){
                        T temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        public static <T> void sort(T[] arr, Comparator<? super T> c){
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr.length-i; j++) {
                    if(c.compare(arr[j], arr[j+1])>0){
                        T temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }

    public void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("liusan",20,90.0);
        students[1] = new Student("lisi",22,90.0);
        students[2] = new Student("wangwu",20,99.0);
        students[3] = new Student("sunliu",22,100.0);

        System.out.println("按照成绩和年龄排序：");
        MyArrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("按照姓名排序：");
        Comparator<Student> c = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        MyArrays.sort(students, c);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
