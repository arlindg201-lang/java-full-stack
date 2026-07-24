package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//2、在main/java的com.atguigu.bean包下，创建Product 类
//
//Product 类应包含以下字段： productId（商品唯一标识）、name（商品名称）、price（价格）、stock（库存）。
//
//其中productId、name、price是非空必填的。
//
//在Product 类上加@NoArgsConstructor、@AllArgsConstructor、@Data、@RequiredArgsConstructor注解
//
//2、在test/java的com.atguigu.test包下，创建TestProduct类，在3单元测试方法中，分别用无参构造，全参构造，必填项构造器创建Product对象，并调用Product对象的方法进行测试。
@NoArgsConstructor
@AllArgsConstructor
@Data
@RequiredArgsConstructor

public class Product {
    private String productId;
    //商品唯一标识
    private String name;
    //商品名称
    private double price;
    //价格
    private int stock;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    //库存


}
