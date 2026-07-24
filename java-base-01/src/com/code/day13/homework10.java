package com.code.day13;

//（1）声明一个银行账户类Account，
//
//- 成员变量：利率、账号、余额，其中所有账户的利率是相同的，所有成员变量都私有化。
//- 实现Serializable接口，并添加serialVersionUID。
//- 提供get/set
//- 提供有参构造public Account(String id ,double balance)
//- 提供计算年利息方法public double annualInterest()，余额*利率
//- 重写toString方法，返回账号和余额、年利息
//
//（2）在测试类的test1方法中，设置利率为0.035，创建账户类的对象，账号为“11111”，余额为“1000”元，打印账户信息，并把该账户对象保存到bank.dat文件中。
//
//（3）在测试类的test2方法中，调整利率为0.03，读取bank.dat文件中账号对象，再次打印账号信息


import org.junit.Test;

import java.io.*;

public class homework10 {
    public class Account implements Serializable {
        private static final long serialVersionUID = 1L;
        private static double rate;
        private String id;
        private double balance;

        public Account(String id, double balance) {
            this.id = id;
            this.balance = balance;
        }
        public static double getRate() {
            return rate;
        }

        public static void setRate(double rate) {
            Account.rate = rate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double annualInterest(){
            return balance * rate;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "id='" + id + '\'' +
                    ", balance=" + balance +
                    ", 年利息 =" + annualInterest() +
                    '}';
        }
    }

    public class Exercise4 {
        @Test
        public void test01() throws IOException, IOException {
            Account.setRate(0.035);
            Account account = new Account("11111",1000);
            System.out.println(account);

            FileOutputStream fos = new FileOutputStream("bank.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(account);

            oos.close();
            fos.close();
        }

        @Test
        public void test02() throws IOException, ClassNotFoundException {
            Account.setRate(0.03);
            FileInputStream fis = new FileInputStream("bank.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Account a1 = (Account) ois.readObject();
            System.out.println(a1);

            ois.close();
            fis.close();
        }
    }


}
