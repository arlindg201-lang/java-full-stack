package com.code.day16;

import java.util.ArrayList;
import java.util.Random;

//## 第1题：扑克牌
//
//案例：
//
//​	1、用一个String[]数组存点数
//
//​	2、用一个String[]数组存花色
//
//​	3、用一个String[]数组存大王、小王
//
//​	4、用上面的数组，生成一副扑克牌
//
//​	5、遍历显示全副扑克牌
//
//​	6、模拟给4个人随机发牌，每个人11张牌
//
//​	7、显示每个人的牌和剩余的牌
//
//​	效果如下：
//
//```java
//所有扑克牌：
//黑桃A  黑桃2  黑桃3  黑桃4  黑桃5  黑桃6  黑桃7  黑桃8  黑桃9  黑桃10  黑桃J  黑桃Q  黑桃K
//红桃A  红桃2  红桃3  红桃4  红桃5  红桃6  红桃7  红桃8  红桃9  红桃10  红桃J  红桃Q  红桃K
//方片A  方片2  方片3  方片4  方片5  方片6  方片7  方片8  方片9  方片10  方片J  方片Q  方片K
//梅花A  梅花2  梅花3  梅花4  梅花5  梅花6  梅花7  梅花8  梅花9  梅花10  梅花J  梅花Q  梅花K
//大王  小王
//发牌：
//第1个人：[红桃Q, 黑桃Q, 黑桃9, 黑桃5, 梅花4, 红桃3, 梅花A, 梅花7, 方片2, 红桃5, 黑桃6]
//第2个人：[方片5, 梅花J, 大王, 黑桃4, 红桃10, 梅花2, 梅花3, 梅花K, 红桃A, 方片3, 方片6]
//第3个人：[红桃J, 黑桃8, 小王, 黑桃10, 梅花9, 红桃8, 红桃K, 方片7, 黑桃7, 方片9, 黑桃2]
//第4个人：[梅花10, 梅花6, 方片8, 方片4, 梅花8, 方片10, 黑桃3, 红桃7, 梅花5, 方片A, 黑桃J]
//剩余：[黑桃A, 黑桃K, 红桃2, 红桃4, 红桃6, 红桃9, 方片J, 方片Q, 方片K, 梅花Q]
public class HomeworkHigh1 {

    public static void main(String[] args) {
        String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] hua = {"黑桃","红桃","方片","梅花"};
        String[] wang = {"大王","小王"};

        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < hua.length; j++) {
            for (int i = 0; i < dian.length; i++) {
                list.add(hua[j]+dian[i]);
            }
        }
        for (int i = 0; i < wang.length; i++) {
            list.add(wang[i]);
        }

        System.out.println("所有扑克牌：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");
            if((i+1)%13==0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("发牌：");

        Random rand = new Random();
        ArrayList<String> one = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            one.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList<String> two = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            two.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList<String> three = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            three.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList<String> four = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            four.add(list.remove(rand.nextInt(list.size())));
        }

        System.out.println("第1个人：" + one);
        System.out.println("第2个人：" + two);
        System.out.println("第3个人：" + three);
        System.out.println("第4个人：" + four);
        System.out.println("剩余：" + list);
    }


}
