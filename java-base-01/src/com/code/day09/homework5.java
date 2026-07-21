package com.code.day09;

//（1）设计一个`Product`类，它代表一个商品，包含以下属性：
//
//- `id`：一个`int`类型的实例变量，表示产品ID。
//- `name`：一个`String`类型的实例变量，表示产品的名称。
//- `price`：一个`double`类型的实例变量，表示产品的价格。
//- `totalProducts`：一个`static int`类型的静态变量，用于记录创建了多少个`Product`对象。
//
//确保所有变量都是私有的，并提供适当的getter和setter方法。提供`getDetail`方法，返回产品对象的详细信息。
//
// 在`Product`类的构造器中，每创建一个新对象时，使`totalProducts`递增。
//
//（2）声明测试类`TestProduct`，在main方法中，创建3个产品类对象放到数组中，并且遍历输出，最后输出`totalProducts`的值，确认它正确反映了创建的对象数量。

public class homework5 {
    public class Product {
        private int id;
        private String name;
        private double price;
        private static int totalProducts;
        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
            totalProducts++;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
        public static int getTotalProducts() {
            return totalProducts;
        }
        public String getDetail() {
            return "编号: " + id + ", 名称: " + name + ", 价格: " + price;
        }
    }
    public class TestProduct {
        public void main(String[] args) {
            Product[] products = new Product[3];
            products[0] = new Product(1, "产品1", 100.0);
            products[1] = new Product(2, "产品2", 200.0);
            products[2] = new Product(3, "产品3", 300.0);

            for (Product product : products) {
                System.out.println(product.getDetail());
            }

            System.out.println("创建的总产品数量: " + Product.getTotalProducts());
        }
    }
}
