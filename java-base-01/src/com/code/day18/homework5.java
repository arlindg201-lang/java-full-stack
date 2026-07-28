package com.code.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

//- **目标**：设计一个系统来管理学生的成绩，能够添加成绩、查询单个学生成绩和计算班级平均分。
//- **提示**：使用`HashMap<String, Integer>`来存储学生姓名及其对应的成绩。
//- 运行效果如下：
//
//```java
//请输入学生人数：3
//请输入第1个学生的姓名：张三
//请输入第1个学生的成绩：86
//请输入第2个学生的姓名：李四
//请输入第2个学生的成绩：98
//请输入第3个学生的姓名：王五
//请输入第3个学生的成绩：92
//{李四=98, 张三=86, 王五=92}
//平均分：92.0
//请输入你要查询成绩的学生姓名：李四
//李四考了98分
public class homework5 {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("请输入第"+i+"个学生的姓名：");
            String name = input.next();

            System.out.print("请输入第"+i+"个学生的成绩：");
            int score = input.nextInt();

            map.put(name,score);
        }
        System.out.println(map);
        Collection<Integer> values = map.values();
        double sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        System.out.println("平均分：" + sum/ map.size());

        System.out.print("请输入你要查询成绩的学生姓名：");
        String find = input.next();

        Integer score = map.get(find);
        if(score==null){
            System.out.println(find+"未参加考试，没有成绩！");
        }else{
            System.out.println(find +"考了" + score +"分");
        }
        input.close();
    }
}
