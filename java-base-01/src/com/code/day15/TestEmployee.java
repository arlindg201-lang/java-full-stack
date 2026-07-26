package com.code.day15;
import com.code.day08.homework1;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

//（1）声明员工类Employee，包含姓名、出生日期（LocalDate类型）
//
//（2）在测试类中创建Employee[]数组，创建5个员工对象。
//
//- 找出本月生日的员工，给这些员工送上生日祝福
//- 找出已满40周岁的员工，给这些员工送上一份体检套餐
//- 找出闰年出生的员工，给这些员工送上一个盲盒
public class TestEmployee {

    public class Employee {
        private String name;          // 姓名
        private LocalDate birthday;   // 出生日期（LocalDate类型）

        // 构造器
        public Employee(String name, LocalDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        // getter / setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", birthday=" + birthday +
                    '}';
        }
    }

    public void main(String[] args) {
        // 1. 创建员工数组，存放5个员工
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("张三", LocalDate.of(1988, 7, 15));
        employees[1] = new Employee("李四", LocalDate.of(1996, 7, 26));   // 本月生日（假设现在是7月）
        employees[2] = new Employee("王五", LocalDate.of(1980, 3, 10));
        employees[3] = new Employee("赵六", LocalDate.of(1976, 12, 1));
        employees[4] = new Employee("孙七", LocalDate.of(2000, 2, 29));   // 闰年出生

        // 获取当前日期（模拟：假设现在是 2026年7月26日）
        LocalDate today = LocalDate.of(2026, 7, 26);
        int currentMonth = today.getMonthValue();   // 当前月份
        int currentYear = today.getYear();          // 当前年份

        // 存放结果
        List<String> birthdayList = new ArrayList<>();   // 本月生日的员工
        List<String> age40List = new ArrayList<>();      // 已满40周岁的员工
        List<String> leapYearList = new ArrayList<>();   // 闰年出生的员工

        // 2. 遍历员工数组，进行分类
        for (Employee emp : employees) {
            LocalDate birth = emp.getBirthday();

            // 判断1：本月生日（月份相同）
            if (birth.getMonthValue() == currentMonth) {
                birthdayList.add(emp.getName());
            }

            // 判断2：已满40周岁（当前日期 - 出生日期 >= 40年）
            int age = Period.between(birth, today).getYears();
            if (age >= 40) {
                age40List.add(emp.getName());
            }

            // 判断3：闰年出生（使用 Year.isLeap() 方法）
            int birthYear = birth.getYear();
            if (Year.isLeap(birthYear)) {
                leapYearList.add(emp.getName());
            }
        }

        // 3. 输出结果
        System.out.println("===== 今日日期：" + today + " =====");
        System.out.println();

        // 本月生日祝福
        if (!birthdayList.isEmpty()) {
            System.out.println("🎂 本月生日的员工有：" + String.join("、", birthdayList));
            for (String name : birthdayList) {
                System.out.println("   → 祝 " + name + " 生日快乐！🎉");
            }
        } else {
            System.out.println("本月没有员工过生日。");
        }
        System.out.println();

        // 已满40周岁员工
        if (!age40List.isEmpty()) {
            System.out.println("🏥 已满40周岁的员工有：" + String.join("、", age40List));
            for (String name : age40List) {
                System.out.println("   → " + name + "，请到公司前台领取一份体检套餐。");
            }
        } else {
            System.out.println("没有员工已满40周岁。");
        }
        System.out.println();

        // 闰年出生的员工
        if (!leapYearList.isEmpty()) {
            System.out.println("🎁 闰年出生的员工有：" + String.join("、", leapYearList));
            for (String name : leapYearList) {
                System.out.println("   → " + name + "，请到公司前台领取一个盲盒。");
            }
        } else {
            System.out.println("没有员工在闰年出生。");
        }
    }
}

