package com.code.day19;

import java.util.ArrayList;

//案例需求：
//
//（1）声明一个员工类型Employee，包含编号、姓名、薪资、年龄、性别，属性私有化，提供有参构造，get/set方法，重写toString方法。
//
//（2）在测试类中
//
//- 添加5个员工对象到管理的集合中，遍历集合
//
//
//- 筛选出
//
//
//​	①编号是偶数的员工
//
//​	②薪资低于10000的员工
//
//​	③年龄大于30岁的女员工
//
//​	④姓张的员工
//
//- 删除
//
//
//​	①年龄大于30岁的女员工
//
//​	②删除“张三”这个员工
//
//- 给剩下的员工涨薪10%
public class homework3 {

    public class Employee {

        private int id;
        private String name;
        private double salary;
        private int age;
        private char gender;
        public Employee(int id, String name, double salary, int age, char gender) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.gender = gender;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public Employee() {
            super();
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public char getGender() {
            return gender;
        }
        public void setGender(char gender) {
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
                    + "]";
        }
    }

    public void main(String[] args) {
        ArrayList<Employee> es = new ArrayList<>();
        es.add(new Employee(1, "张三", 8000, 23, '男'));
        es.add(new Employee(2, "王小二", 12000, 22, '男'));
        es.add(new Employee(3, "李四", 12000, 24, '女'));
        es.add(new Employee(4, "王五", 11000, 34, '女'));
        es.add(new Employee(5, "赵六", 6000, 34, '女'));

        System.out.println("目前员工数量：" + es.size());
        es.forEach(System.out::println);

        System.out.println("编号是偶数的员工有：");
        es.stream().filter(e->e.getId()%2==0).forEach(System.out::println);

        System.out.println("薪资低于10000的员工有：");
        es.stream().filter(e->e.getSalary()<10000).forEach(System.out::println);

        System.out.println("年龄大于30岁的女员工有：");
        es.stream().filter(e->e.getAge()>30 && e.getGender()=='女').forEach(System.out::println);

        System.out.println("姓张的员工有：");
        es.stream().filter(e->e.getName().startsWith("张")).forEach(System.out::println);

        System.out.println("删除年龄大于30岁的女员工后：");
        es.removeIf(e->e.getAge()>30 && e.getGender()=='女');
        es.forEach(System.out::println);

        System.out.println("删除“张三”这个员工后：");
        es.removeIf(e->e.getName().equals("张三"));
        es.forEach(System.out::println);

        System.out.println("给剩下的员工涨薪10%后：");
        es.forEach(e->e.setSalary(e.getSalary()*(1+0.1)));
        es.forEach(System.out::println);


    }

}
