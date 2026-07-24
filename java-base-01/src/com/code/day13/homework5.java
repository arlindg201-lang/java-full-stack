package com.code.day13;

import java.util.Arrays;
import java.util.Comparator;

//（1）定义商品类`Goods`
//
//- 包含：编号`id`，名称`name`，价格`price`，销量`salesVolume`，好评率`favorableRate`
//- 包含：无参和有参构造，get/set等
//- 重写`toString()`方法，返回商品信息
//
//（2）让商品类实现`Comparable`接口，重写`int compareTo(Object o)`方法，按照`id`比较大小
//
//（3）在测试类`TestGoods`中，创建5个商品对象，放到数组中，并遍历数组
//
//- 调用`Arrays.sort(Object[] arr)`对数组进行排序，实现按照id升序排列。
//- 创建匿名内部类对象，实现`Comparator`接口，重写`int compare(Object o1, Object o2)`方法，
// 按照商品的价格比较大小，如果价格相同，按照`id值`比较大小。调用`Arrays.sort(Object[] arr,Comparator c)`对数组进行排序，实现按照价格升序排列。
//
//- 创建匿名内部类对象，实现`Comparator`接口，重写`int compare(Object o1, Object o2)`方法，
// 按照商品的销量比较大小，如果销量相同，按照`id值`比较大小。调用`Arrays.sort(Object[] arr,Comparator c)`对数组进行排序，实现按照销量降序排列。
//- 创建匿名内部类对象，实现`Comparator`接口，重写`int compare(Object o1, Object o2)`方法，
// 按照商品的好评率比较大小，如果好评率相同，按照`id值`比较大小。调用`Arrays.sort(Object[] arr,Comparator c)`对数组进行排序，实现按照好评率降序排列。
public class homework5 {
    public class Goods implements Comparable {
        private int id;
        private String name;
        private double price;
        private int salesVolume;
        private double favorableRate;

        public Goods(int id, String name, double price, int salesVolume, double favorableRate){
            this.id = id;
            this.name = name;
            this.price = price;
            this.salesVolume = salesVolume;
            this.favorableRate = favorableRate;
        }

        public Goods(){

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
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getSalesVolume() {
            return salesVolume;
        }
        public void setSalesVolume(int salesVolume) {
            this.salesVolume = salesVolume;
        }
        public double getFavorableRate() {
            return favorableRate;
        }
        public void setFavorableRate(double favorableRate) {
            this.favorableRate = favorableRate;
        }
        @Override
        public String toString() {
            return "Goods{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", salesVolume=" + salesVolume +
                    ", favorableRate=" + favorableRate +
                    '}';
        }
        @Override
        public int compareTo(Object o) {
            return this.id - ((Goods)o).id;
        }

        public class TestGoods {
            public void main(String[] args) {
                Goods[] arr = new Goods[5];
                arr[0] = new Goods(2,"《剑指MySQL》",63.6,1000,0.99);
                arr[1] = new Goods(1,"《剑指Java》",89.9,5000,0.98);
                arr[2] = new Goods(3,"《剑指JVM》",66.0,500,0.99);
                arr[3] = new Goods(4,"《剑指Web》",53.6,400,0.95);
                arr[4] = new Goods(5,"《剑指大数据》",39.1,6000,0.98);

                System.out.println("尚硅谷部分书籍：");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }

                System.out.println("按照编号升序排列：");
                Arrays.sort(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }

                System.out.println("按照价格升序排列：");
                Comparator priceComparator = new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Goods g1 = (Goods) o1;
                        Goods g2 = (Goods) o2;
                        int result = Double.compare(g1.getPrice(),g2.getPrice());
                        return result != 0 ? result : Integer.compare(g1.getId(),g2.getId());
                    }
                };
                Arrays.sort(arr,priceComparator);
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }

                System.out.println("按照销量降序排列：");
                Comparator saleComparator = new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Goods g1 = (Goods) o1;
                        Goods g2 = (Goods) o2;
                        int result = Double.compare(g2.getSalesVolume(),g1.getSalesVolume());
                        return result != 0 ? result : Integer.compare(g1.getId(),g2.getId());
                    }
                };
                Arrays.sort(arr,saleComparator);
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }

                System.out.println("按照好评率降序排列：");
                Comparator favorableComparator = new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Goods g1 = (Goods) o1;
                        Goods g2 = (Goods) o2;
                        int result = Double.compare(g2.getFavorableRate(),g1.getFavorableRate());
                        return result != 0 ? result : Integer.compare(g1.getId(),g2.getId());
                    }
                };
                Arrays.sort(arr,favorableComparator);
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
