package com.code.day10;
//每个客户的信息被保存在Customer对象中。
//以一个Customer类型的数组来记录当前所有的客户。
//每次“添加客户”（菜单1）后，客户（Customer）对象被添加到数组中。
//每次“修改客户”（菜单2）后，修改后的客户（Customer）对象替换数组中原对象。
//每次“删除客户”（菜单3）后，客户（Customer）对象被从数组中清除。
//执行“客户列表 ”（菜单4）时，将列出数组中所有客户的信息。


public class Customer {
        private int id;
        private String name;
        private char gender;
        private int age;
        private String phone;
        private String email;

        public Customer() {

        }

        public Customer(int id, String name, char gender, int age, String phone, String email) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.phone = phone;
            this.email = email;
        }

        public Customer(String name, char gender, int age, String phone, String email) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.phone = phone;
            this.email = email;
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


    }

