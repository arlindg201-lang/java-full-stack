package com.code.day09;

//（1）声明员工类Employee，
//
//- 包含属性：姓名、性别、年龄、工资、电话、邮箱，属性私有化
//
//- 提供无参和有参构造
//
//- 提供get/set方法
//
//- 重写String toString()方法
//
//
//（2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出

import java.util.Scanner;

public class homework6 {
    public String name;
    //姓名
    public String gender;
    //性别
    public int age;
    //年龄
    public double salary;
    //工资
    public String phone;
    //电话
    public String email;
    //邮箱
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public class Employee {
        private String name;//姓名
        private char gender;//性别
        private int age;//年龄
        private double salary;//工资
        private String phone;//电话号码
        private String email;//电子邮箱

        public Employee() {
        }

        public Employee(String name, char gender, int age, double salary, String phone, String email) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.salary = salary;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getInfo() {
            return name + "\t" + gender + "\t\t" + age + "\t\t" + salary + "\t\t" + phone + "\t\t" + email;
        }
    }

    public class TestEmployee {
        public void main(String[] args) {
            Employee[] arr = new Employee[3];
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++) {
                System.out.println("-------------添加第"+(i+1)+"个员工-----------------");
                System.out.print("姓名：");
                String name = input.next();
                System.out.print("性别：");
                char gender = input.next().charAt(0);
                System.out.print("年龄：");
                int age = input.nextInt();
                System.out.print("工资：");
                double salary = input.nextDouble();
                System.out.print("电话：");
                String phone = input.next();
                System.out.print("邮箱：");
                String email = input.next();

                // 创建Employee对象
                arr[i] = new Employee(name,gender,age,salary,phone,email);
            }
            System.out.println("-------------添加完成-----------------");
            System.out.println("-------------员工列表-----------------");
            System.out.println("编号\t姓名\t性别\t年龄\t工资\t\t电话\t\t邮箱");
            for (int i = 0; i < arr.length; i++) {
                System.out.println((i+1) + "\t\t" + arr[i].getInfo());
            }

            System.out.println("-------------员工列表完成-----------------");
            input.close();
        }
    }

}

