package com.code.day11;
//案例需求：
//
//（1）普通员工`Employee`类
//
//- 包含编号`id`、姓名`name`、年龄`age`、工资`salary`，属性私有化
//- 提供无参和有参构造器
//- 提供get/set方法
//- 提供`String say()`方法：返回员工基本信息
//- 重写`String toString()`方法，返回员工基本信息，即直接调用say()
//
//（2）程序员`Programmer`类，继承普通员工类
//
//- 提供无参和有参构造器
//
//- 重写`String toString()`方法，返回员工基本信息以及职位“程序员”
//
//（3）设计师`Designer`类，继承程序员类
//
//- 增加奖金`bonus`属性
//- 提供无参和有参构造器
//- 重写`String toString()`方法，返回员工基本信息以及职位“设计师”和奖金信息
//
//（4）架构师`Architect`类，继承设计师类
//
//- 增加股票`block`属性
//- 提供无参和有参构造器
//- 重写`String toString()`方法，返回员工基本信息以及职位“架构师”和奖金、股票信息
//
//（5）在测试类中创建员工数组，并存储1个普通员工对象，2个程序员对象，1个架构师对象，1个设计师对象
public class homework2 {

    public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    @Override
    public String toString() {
        return say();
    }
    }
    public class Programmer extends Employee {
    public Programmer() {
    }
    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }
    @Override
    public String toString() {
        return "Programmer{" +

                ", position='程序员'" +
                '}';
    }
    }
    public class Designer extends Programmer {
        private double bonus;// : 奖金

        public Designer() {
        }

        public Designer(int id, String name, int age, double salary, double bonus) {
            super(id, name, age, salary);
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        public String toString() {
            return super.say() + "\t\t设计师" + "\t" + bonus;
        }
    }

    public class Architect extends Designer {
        private int stock;// : 股票

        public Architect() {
        }

        public Architect(int id, String name, int age, double salary, double bonus, int stock) {
            super(id, name, age, salary, bonus);
            this.stock = stock;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return super.say() + "\t\t架构师" + "\t" + getBonus() + "\t" + stock;
        }
    }

    public class TestEmployees {
        public void main(String[] args) {
            Employee[] arr = new Employee[5];
            arr[0] =  new Employee(1,"段誉",22,3000);
            arr[1] =  new Architect(2,"令狐冲",32,18000,15000,2000);
            arr[2] =  new Programmer(3,"任我行",23,7000);
            arr[3] =  new Programmer(4,"张三丰",24,7300);
            arr[4] =  new Designer(5,"周芷若",28,10000,5000);

            System.out.println("----------------员工信息管理-------------------");
            System.out.println("编号\t姓名\t年龄\t工资\t\t职位\t奖金\t股票");
            for(int i=0; i<arr.length; i++){
                arr[i].setId(i+1);
                System.out.println(arr[i]);
            }
            System.out.println("----------------------------------------------");
        }
    }
}
