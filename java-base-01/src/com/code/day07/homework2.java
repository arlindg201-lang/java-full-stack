package com.code.day07;

public class homework2 {
    public class Goods{
        //商品类
        public String id;
        //编号
        public String title;
        //名称
        public double price;
        //价格
        public int stock;
        //库存
    }
    public class TestGoods {
        public static void main(String[] args) {
            Goods javaBook = new homework2().new Goods();
            javaBook.id = "1001024585";
            javaBook.title = "尚硅谷剑指Java";
            javaBook.price = 99.99;
            javaBook.stock = 1000;

            Goods mysqlBook = new homework2().new Goods();
            mysqlBook.id = "1001023385";
            mysqlBook.title = "尚硅谷剑指MySQL";
            mysqlBook.price = 88.88;
            mysqlBook.stock = 1000;

            //打印商品的详细信息
            System.out.println("javaBook的id" + javaBook.id + "，title" + javaBook.title + "，price" + javaBook.price + "，stock" + javaBook.stock);
            System.out.println("mysqlBook的id" + mysqlBook.id + "，title" + mysqlBook.title + "，price" + mysqlBook.price + "，stock" + mysqlBook.stock);
        }
    }
}
