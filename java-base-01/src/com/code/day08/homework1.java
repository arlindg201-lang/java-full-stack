package com.code.day08;

public class homework1 {
    public class Employee {
        public String name;
        public int age;
        public double salary;
        public String tel;
        public String cardId;

        public Employee() {
        }
        public Employee(String name, int age, double salary, String tel, String cardId) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.tel = tel;
            this.cardId = cardId;
        }
    }

    public static void main(String[] args) {
        Employee emp = new homework1().new Employee("张三", 18, 5000.0, "123456789012345678", "123456789012345678");
        System.out.println("员工姓名：" + emp.name + "，员工年龄：" + emp.age + "，员工工资：" + emp.salary + "，员工电话：" + emp.tel + "，员工身份证：" + emp.cardId);

        Employee emp2 = new homework1().new Employee();
        emp2.name = "张三";
        emp2.age = 18;
        emp2.salary = 5000.0;
        emp2.tel = "123456789012345678";
        emp2.cardId = "123456789012345678";
        System.out.println("员工姓名：" + emp2.name + "，员工年龄：" + emp2.age + "，员工工资：" + emp2.salary + "，员工电话：" + emp2.tel + "，员工身份证：" + emp2.cardId);
    }
}
