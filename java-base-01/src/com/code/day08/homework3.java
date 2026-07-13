package com.code.day08;
//（1）声明员工`Employee`类，包含实例变量：姓名、年龄、薪资、电话、身份证号码，包含无参和有参构造
//
//- 将实例变量私有化
//- 提供get/set方法
//- 提供getInfo方法，返回员工对象的基本信息
//
//（2）在测试类的主方法中，分别用无参构造和有参构造创建2个员工对象，打印员工基本信息
public class homework3 {
    public class Employee { //实例变量私有化
        private String name;
        private int age;
        private double salary;
        private String tel;
        private String cardId;

        //构造器
        //无参构造
        public Employee() {
        }

        //有参构造
        public Employee(String name, int age, double salary, String tel, String cardId) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.tel = tel;
            this.cardId = cardId;
        }

        //get/set方法
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

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getCardId() {
            return cardId;
        }

        public void setCardId(String cardId) {
            this.cardId = cardId;
        }

        //返回对象信息的方法
        public String getInfo() {
            return "姓名：" + name +
                    "，年龄：" + age +
                    "，工资：" + salary +
                    "，电话：" + tel +
                    "，银行卡：" + cardId;
        }
    }


    public class TestEmployee {
        public static void main(String[] args) {
            Employee e1 = new homework3().new Employee();
            //打印e1对象的详细信息
            System.out.println("e1对象的信息：" + e1.getInfo());

            Employee e2 = new homework3().new Employee("李四", 19, 6000, "13999999999", "2222222222222222"    );
            e2.setName("李四");
            e2.setAge(19);
            e2.setSalary(6000);
            e2.setTel("13999999999");
            e2.setCardId("2222222222222222");
            System.out.println("e2对象信息：" + e2.getInfo());
        }
    }
}
