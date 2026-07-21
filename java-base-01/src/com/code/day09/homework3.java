package com.code.day09;

//- 定义一个类 Product，表示商品：
//  - 属性 productId（商品编号）、name（名称）、price（价格）为私有；
//  - 提供构造器初始化这三个属性；
//  - 重写toString 方法，输出商品信息；
//  - 提供 applyDiscount(double discountRate) 方法，按折扣率调整价格；
//- 再定义两个子类 Electronics 和 Clothing：
//  - Electronics 类新增属性 warrantyPeriod（保修期，单位：月）；
//  - Clothing 类新增属性 size（尺码）；
//  - 两个子类都重写 toString() 方法，分别显示额外属性；
//- 编写测试类，创建两个子类对象并测试方法。

public class homework3 {
    public class Product {
        private String productId;
        private String name;
        private double price;

        public Product() {
        }

        public Product(String productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }



        // Getter 和 Setter
        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void applyDiscount(double discountRate) {
            if (discountRate > 0 && discountRate <= 1.0) {
                price *= discountRate;
            } else {
                System.out.println("折扣率无效，必须在 0~1 之间");
            }
        }

        @Override
        public String toString() {
            return "商品编号: " + productId + ", 名称: " + name + ", 价格: " + price;
        }
    }
    public class Electronics extends Product {
        private int warrantyPeriod;

        public Electronics() {
        }

        public Electronics(String productId, String name, double price, int warrantyPeriod) {
            super(productId, name, price);
            this.warrantyPeriod = warrantyPeriod;
        }

        public int getWarrantyPeriod() {
            return warrantyPeriod;
        }

        public void setWarrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }

        @Override
        public String toString() {
            return super.toString() + ", 保修期: " + warrantyPeriod + " 个月";
        }
    }
    public class Clothing extends Product {
        private String size;

        public Clothing() {
        }

        public Clothing(String productId, String name, double price, String size) {
            super(productId, name, price);
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return super.toString() + ", 尺码: " + size;
        }
    }

    public void main(String[] args) {
        Product product = new Product("001", "手机", 1999.99);
        Electronics electronics = new Electronics("002", "笔记本", 4999.99, 12);
        Clothing clothing = new Clothing("003", "T恤", 99.99, "M");

        System.out.println(product);
        System.out.println(electronics);
        System.out.println(clothing);

        product.applyDiscount(0.8);
        electronics.applyDiscount(0.9);
        clothing.applyDiscount(0.7);

        System.out.println(product);
        System.out.println(electronics);
        System.out.println(clothing);
    }
}

