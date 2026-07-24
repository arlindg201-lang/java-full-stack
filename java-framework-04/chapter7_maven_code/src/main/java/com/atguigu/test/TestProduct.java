package com.atguigu.test;

//在test/java的com.atguigu.test包下，创建TestProduct类，在3单元测试方法中，分别用无参构造，全参构造，必填项构造器创建Product对象，并调用Product对象的方法进行测试。

import com.atguigu.bean.Product;
import org.testng.annotations.Test;

public class TestProduct {
    @Test
    public void test1(){
        Product p = new Product();
        p.setProductId("1001");
        p.setName("鼠标");
        p.setPrice(86.5);
        System.out.println(p);
    }

    @Test
    public void test2(){
        Product p = new Product("1002","U盘",98.0,1000);
        System.out.println(p);
    }

    @Test
    public void test3(){
        Product p = new Product("1003","靠垫",29.9);
        System.out.println(p);
    }
}
