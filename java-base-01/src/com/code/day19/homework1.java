package com.code.day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//案例需求：
//
//（1）定义学生类Student：包含属性name（姓名）和score（成绩），属性私有化，提供有参构造，get/set方法，重写toString方法。
//
//（2）在测试类中，将五名学生添加到ArrayList<Student>集合
//
//（3）使用Collections.sort(List<T> list, Comparator<? super T> c)方法将学生成绩从小到大进行排序，分别使用以下三种形式实现：
//
//- 使用匿名内部类
//- 使用Lambda表达式
//- 使用方法引用	//tips:借助Comparator接口中静态方法comparingInt()方法
//
//学生信息与成绩如下：
//
//| 姓名   | 数学 |
//| ------ | ---- |
//| 谢霆锋 | 85   |
//| 章子怡 | 63   |
//| 刘亦菲 | 77   |
//| 黄晓明 | 33   |
//| 岑小村 | 92   |
public class homework1 {

    public class  Student {
        private String name;
        private int score;

        public Student(){

        }
        public Student(String name,int score){
            this.name = name;
            this.score = score;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getScore(){
            return score;
        }
        public void setScore(int score){
            this.score = score;
        }
        @Override
        public String toString(){
            return "Student [name=" + name + ", score=" + score + "]";
        }
    }

    public void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("谢霆锋", 85));
        list.add(new Student("章子怡", 63));
        list.add(new Student("刘亦菲", 77));
        list.add(new Student("黄晓明", 33));
        list.add(new Student("岑小村", 92));

        // 使用匿名内部类将成绩从小到大排序
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        });

        // 使用Lambda为英语成绩从小到大排序
        Collections.sort(list, (o1, o2) -> o1.getScore() - o2.getScore());

        // 借助comparingInt()使用方法引用
        Collections.sort(list, Comparator.comparingInt(Student::getScore));

        System.out.println(list);
    }
}
