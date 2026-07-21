package com.code.day10;

import java.util.Scanner;


    public class CustomerView {
        private CustomerList customerList = new CustomerList(3);
        private Scanner scanner = new Scanner(System.in);
        public void enterMainMenu() {
            while (true) {
                System.out.println("*********************客户信息管理软件*********************");
                System.out.println("                   1 添加客户");
                System.out.println("                   2 修改客户");
                System.out.println("                   3 删除客户");
                System.out.println("                   4 客户列表");
                System.out.println("                   5 退    出");
                System.out.print("                   请选择（1-5）：");
                switch (scanner.nextInt()) {
                    case 1 -> addNewCustomer();
                    case 2 -> modifyCustomer();
                    case 3 -> deleteCustomer();
                    case 4 -> listAllCustomers();
                    default -> {
                        System.out.println("欢迎下次再来！");
                        scanner.close();
                        return;
                    }
                }
            }
        }
        private void addNewCustomer() {
            System.out.println("---------------------添加客户---------------------");
            System.out.print("姓名：");
            String name = scanner.next();
            System.out.print("性别：");
            char gender = scanner.next().charAt(0);
            System.out.print("年龄：");
            int age = scanner.nextInt();
            System.out.print("电话：");
            String phone = scanner.next();
            System.out.print("邮箱：");
            String email = scanner.next();
            Customer customer = new Customer(name, gender, age, phone, email);
            if (customerList.addCustomer(customer)) {
                System.out.println("---------------------添加完成---------------------");
            } else {
                System.out.println("---------------------添加失败---------------------");
            }
        }

        private void modifyCustomer() {
            System.out.println("---------------------修改客户---------------------");
            System.out.print("请输入待修改客户编号(-1结束)：");
            int id = scanner.nextInt();
            scanner.nextLine();//用于读取“请输入待修改客户编号(-1结束)：数字”后面的回车符
            if(id==-1){
                return;
            }
            Customer customer = customerList.getCustomer(id);
            if(customer != null){
                System.out.print("姓名(" + customer.getName() + ")");
                String name = scanner.nextLine();
                if(!name.isBlank()){
                    customer.setName(name);
                }
                System.out.print("性别(" + customer.getGender() + ")");
                String gender = scanner.nextLine();
                if(!gender.isBlank()){
                    customer.setGender(gender.charAt(0));
                }
                System.out.print("年龄(" + customer.getAge() + ")");
                String age = scanner.nextLine();
                if(!age.isBlank()){
                    customer.setAge(Integer.parseInt(age));
                }
                System.out.print("电话(" + customer.getPhone() + ")");
                String phone = scanner.nextLine();
                if(!phone.isBlank()){
                    customer.setPhone(phone);
                }
                System.out.print("邮箱(" + customer.getEmail() + ")");
                String email = scanner.nextLine();
                if(!email.isBlank()){
                    customer.setEmail(email);
                }
                if(customerList.replaceCustomer(customer)){
                    System.out.println("---------------------修改完成---------------------");
                }else{
                    System.out.println("---------------------修改失败---------------------");
                }
            }else{
                System.out.println("---------------------客户不存在---------------------");
            }

        }
        private void deleteCustomer() {
            System.out.println("---------------------删除客户---------------------");
            System.out.print("请选择待删除客户编号(-1退出)：");
            int id = scanner.nextInt();
            if(id==-1){
                return;
            }
            Customer customer = customerList.getCustomer(id);
            if(customer == null){
                System.out.println("---------------------客户不存在---------------------");
                return;
            }
            System.out.print("确认是否删除（Y/N）：");
            char c = scanner.next().toUpperCase().charAt(0);
            if(c == 'N'){
                return;
            }
            if(customerList.deleteCustomer(id)){
                System.out.println("---------------------删除完成---------------------");
            }else{
                System.out.println("---------------------删除失败---------------------");
            }
        }
        private void listAllCustomers() {
            System.out.println("---------------------客户列表---------------------");
            if(customerList.getTotal() == 0){
                System.out.println("没有客户记录！");
            }else{
                System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
                Customer[] customers = customerList.getAllCustomers();
                for(       Customer customer : customers){
                    System.out.println( customer);
                }
            }
        }
        public static void main(String[] args) {
            CustomerView customerView = new CustomerView();
            customerView.enterMainMenu();
        }

    }
