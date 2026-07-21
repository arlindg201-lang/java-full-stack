package com.code.day10;


public class homework5 {

    public abstract class BankAccount {
        private String id;
        private double balance;

        public BankAccount() {
        }

        public BankAccount(String id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        protected void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        @Override
        public String toString() {
            return "账号：" + id + ", 余额：" + balance;
        }

        public abstract boolean withdraw(double money);
        public abstract boolean save(double money);

    }


    public class SavingsAccount extends BankAccount{
        public SavingsAccount() {
        }

        public SavingsAccount(String id, double balance) {
            super(id, balance);
        }

        @Override
        public boolean withdraw(double money){
            if(money<0){
                System.out.println("取款失败，金额不能为负数");
                return false;
            }else if(money>getBalance()){
                System.out.println("取款失败，余额不足");
                return false;
            }
            setBalance(getBalance() - money);
            return true;
        }
        @Override
        public boolean save(double money){
            if(money<0){
                System.out.println("存款失败，金额不能为负数");
                return false;
            }
            setBalance(getBalance()+money);
            return true;
        }
    }


    public class CreditCardAccount extends BankAccount {
        private double maxOverdraft;
        private double overdraftAmount;

        public CreditCardAccount() {
        }

        public CreditCardAccount(String id, double balance, double maxOverdraft, double overdraftAmount) {
            super(id, balance);
            this.maxOverdraft = maxOverdraft;
            this.overdraftAmount = overdraftAmount;
        }

        public double getMaxOverdraft() {
            return maxOverdraft;
        }

        public void setMaxOverdraft(double maxOverdraft) {
            this.maxOverdraft = maxOverdraft;
        }

        @Override
        public boolean withdraw(double money) {
            if (money < 0) {
                System.out.println("取款/支付失败，金额不能为负数");
                return false;
            }
            if (money > maxOverdraft - overdraftAmount + getBalance()) {
                System.out.println("取款/支付失败，本次取款/支付金额超过账号余额与可透支额度");
                return false;
            }
            if (money < maxOverdraft - overdraftAmount) {
                //如果取款金额小于允许的透支额度，增加透支金额
                overdraftAmount += money;
            } else {
                // 如果取款金额大于允许的透支额度，但超出部分小于等于账户余额，扣除相应金额
                double amount = money - (maxOverdraft - overdraftAmount);
                setBalance(getBalance() - amount);
                overdraftAmount = maxOverdraft;
            }
            return true;
        }
        @Override
        public boolean save(double money) {
            if(money<0){
                System.out.println("存款/还款失败，金额不能为负数");
                return false;
            }
            if(money <= overdraftAmount){
                // 如果存款金额小于等于当前透支金额，减少透支金额
                overdraftAmount -= money;
            }else{
                // // 如果存款金额大于当前透支金额，增加账户余额，透支金额归零
                double amount = money - overdraftAmount;
                setBalance(getBalance() + amount);
                overdraftAmount = 0;
            }
            return true;
        }

        @Override
        public String toString() {
            return super.toString() + "，每月可透支总额度：" + maxOverdraft +"，本月已透支金额：" + overdraftAmount;
        }
    }

    public class TestBankAccount {
        public void main(String[] args) {
            SavingsAccount s = new SavingsAccount("11111111",5000);
            System.out.println(s);
            System.out.println("取款3000" + (s.withdraw(3000)?"成功":"失败") + "，" + s);
            System.out.println("取款4000" + (s.withdraw(4000)?"成功":"失败") + "，" + s);
            System.out.println("存款5000" + (s.save(5000)?"成功":"失败") + "，" + s);
            System.out.println();

            CreditCardAccount c = new CreditCardAccount("22222222",0,3000,0);
            System.out.println(c);
            System.out.println("取款2000" + (c.withdraw(2000)?"成功":"失败") + "，" + c);
            System.out.println("取款4000" + (c.withdraw(4000)?"成功":"失败") + "，" + c);
            System.out.println("存款3000" + (c.save(3000)?"成功":"失败") + "，" + c);

        }
    }


    }
