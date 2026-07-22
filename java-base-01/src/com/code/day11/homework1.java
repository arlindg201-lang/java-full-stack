package com.code.day11;
//案例需求：
//
//（1）在`Person`类中，包含
//
//- 属性：姓名`name`，年龄`age`，职业`job`
//- 包含无参和有参构造，get/set方法
//- `public void eat()`：打印xx吃饭，xx代表姓名
//- `public void toilet()`：打印xx上洗手间
//- 重写`public String toString()`：返回姓名、年龄、职业信息。
//
//（2）在`Man`类中，包含
//
//- 包含无参和有参构造
//- 重写`eat()`：xx狼吞虎咽吃饭
//- 增加  `public void smoke()`：打印xx抽烟
//
//（3）在`Woman`类中，包含
//
//- 包含无参和有参构造，get/set方法
//- 重写`eat()`：xx细嚼慢咽吃饭
//- 增加` public void makeup()`：打印xx化妆
//
//（4）周末一群男男女女相亲，在测试类`TestPeople`创建不同对象，
//
//- 所有对象调用`toString`方法，自我介绍，
//- 所有对象调用吃饭`eat`方法
//- 所有对象调用上厕所`toilet`方法，男的上完厕所抽烟`smoke`，女的上完厕所补妆`makeup`。
public class homework1 {

    public class Person {
        private String name;
        private int age;
        private String job;

        public Person() {
        }

        public Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
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

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public void eat() {
            System.out.println(name + "吃饭");
        }

        public void toilet() {
            System.out.println(name + "上洗手间");
        }

        @Override
        public String toString() {
            return "Person{" +
                    "名字='" + name + '\'' +
                    ", 年龄='" + age + '\'' +
                    ", 职业='" + job + '\'' +
                    '}';
        }
    }

    public class Man extends Person {
        public Man() {
        }

        public Man(String name, int age, String job) {
            super(name, age, job);
        }

        @Override
        public void eat() {
            System.out.println(getName() + "狼吞虎咽的吃饭");
        }
        public void smoke(){
            System.out.println(getName() + "抽烟");
        }
    }

    public class Woman extends Person {
        public Woman() {
        }

        public Woman(String name, int age, String job) {
            super(name, age, job);
        }

        @Override
        public void eat() {
            System.out.println(getName()  + "细嚼慢咽的吃饭");
        }
        public void makeup(){
            System.out.println(getName() + "化妆");
        }
    }
    public void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Man("张三",23,"Java中级工程师");
        arr[1] = new Man("李四",24,"大数据工程师");
        arr[2] = new Woman("子轩",22,"UI设计师");
        arr[3] = new Woman("张伟",23,"前端设计师");

        System.out.println("------------初次见面--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-------------开始聚餐--------------");
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
        }

        System.out.println("---------------饭后休息-------------");
        for (int i = 0; i < arr.length; i++) {
            arr[i].toilet();
            if(arr[i] instanceof Man m){
                m.smoke();
            }else if(arr[i] instanceof Woman w){
                w.makeup();
            }
        }
    }

}
