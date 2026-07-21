package com.code.day09;
//- 定义一个父类 Employee，包含以下内容：
//  - 私有属性 name 和 employeeId；
//  - 构造器用于初始化姓名和员工编号；
//  - 方法 work() 输出“员工正在工作”；
//  - 提供toString方法：显示姓名和编号
//- 再定义两个子类 Manager 和 Developer：
//  - Manager 类新增属性 teamSize（管理团队人数）；
//  - Developer 类新增属性 language（使用的编程语言）；
//  - 分别重写 work() 方法，输出更具体的描述，如“经理正在管理团队”或“开发者正在编写代码”；
//  - 重写toString方法
//- 编写测试类，创建对象并调用 work() 方法。

public class homework2 {
    public class Employee {
        private String name;
        private String employeeId;

        public Employee() {
        }

        public Employee(String name, String employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        // Getter 和 Setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        public void work() {
            System.out.println("员工正在工作");
        }

        @Override
        public String toString() {
            return "姓名: " + name + ", 员工编号: " + employeeId;
        }
    }

    public class Manager extends Employee {
        private int teamSize;

        public Manager() {
        }

        public Manager(String name, String employeeId, int teamSize) {
            super(name, employeeId);
            this.teamSize = teamSize;
        }

        public int getTeamSize() {
            return teamSize;
        }

        public void setTeamSize(int teamSize) {
            this.teamSize = teamSize;
        }

        @Override
        public void work() {
            System.out.println("经理正在管理团队");
        }

        @Override
        public String toString() {
            return super.toString() + ", 团队人数: " + teamSize;
        }
    }

    public class Developer extends Employee {
        private String language;

        public Developer() {
        }

        public Developer(String name, String employeeId, String language) {
            super(name, employeeId);
            this.language = language;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        @Override
        public void work() {
            System.out.println("开发者正在编写代码");
        }

        @Override
        public String toString() {
            return super.toString() + ", 编程语言: " + language;
        }
    }

    public class TestEmployee {
        public void main(String[] args) {
            // 创建 Manager 对象
            Manager manager = new Manager("张伟", "M1001", 10);
            System.out.println(manager);
            manager.work();  // 输出：经理正在管理团队

            // 创建 Developer 对象
            Developer developer = new Developer("李娜", "D2001", "Java");
            System.out.println(developer);
            developer.work();  // 输出：开发者正在编写代码
        }
    }
}

