package com.code.day16;

import java.util.ArrayList;

//案例需求：
//
//（1）声明学生`Student`类，包含姓名、成绩属性等，实现`Comparable`接口，重写`int compareTo(Student s)`方法，按照成绩比较大小
//
//（2）在测试类中
//
//- 创建本班学生对象放到`ArrayList`集合中
//- 找出最高分
//- 找出最高分有哪些同学
//
//开发提示：可以对`ArrayList`集合进行排序
//
//案例效果：
//
//```java
//Student{name='张三', score=98}
//Student{name='赵六', score=98}
//Student{name='钱七', score=98}
//Student{name='李四', score=86}
//Student{name='王五', score=85}
//最高分：98
//获得最高分的有：[张三, 赵六, 钱七]
public class homeworkhigh2 {

    public class Student implements Comparable<Student>{
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return o.score-this.score;
        }
    }

    public void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",98));
        list.add(new Student("李四",86));
        list.add(new Student("王五",85));
        list.add(new Student("赵六",98));
        list.add(new Student("钱七",98));

        list.sort(null);

        Student maxStudent = list.get(0);

        ArrayList<String> maxList = new ArrayList<>();
        for (Student student : list) {
            if(student.getScore() == maxStudent.getScore()){
                maxList.add(student.getName());
            }else{
                break;
            }
        }
        System.out.println("最高分：" + maxStudent.getScore());
        System.out.println("获得最高分的有：" + maxList);
    }


}
