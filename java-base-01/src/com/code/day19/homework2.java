package com.code.day19;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//案例需求：
//
//（1）以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
//
//```java
//全球
//　　1、 《教父》
//　　2、 《肖申克的救赎》
//　　3、 《辛德勒的名单》
//　　4、 《公民凯恩》
//　　5、 《卡萨布兰卡》
//　　6、 《教父续集》
//　　7、 《七武士》
//　　8、 《星球大战》
//　　9、 《美国美人》
//　　10、 《飞跃疯人院》
//　
//
//华人
//
//　  1、 《霸王别姬》
//　　2、 《大闹天宫》
//　　3、 《鬼子来了》
//　　4、 《大话西游》
//　　5、 《活着》
//　　6、 《饮食男女》
//　　7、 《无间道》
//　　8、 《天书奇谭》
//　　9、 《哪吒脑海》
//　　10、 《春光乍泄》
//
//```
//
//（2）定义电影Film类，包含name属性，属性私有化，提供有参构造，get/set方法，重写toString方法。
//
//（3）现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList<String>集合
//
//（4）通过流的方式
//
//- 打印全球影片排行榜中的前三甲影片名
//
//- 打印华人影片排行榜中倒数5名的影片名
//
//- 将两个排行榜中的前5名挑出来共同存入新的集合
//
//- 以影片名为name创建Film对象并保存至集合
public class homework2 {

    public static class Film {
        private String name;

        public Film(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Film{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        ArrayList<String> globalList = new ArrayList<>();
        globalList.add("《教父》");
        globalList.add("《肖申克的救赎》");
        globalList.add("《辛德勒的名单》");
        globalList.add("《公民凯恩》");
        globalList.add("《卡萨布兰卡》");
        globalList.add("《教父续集》");
        globalList.add("《七武士》");
        globalList.add("《星球大战》");
        globalList.add("《美国美人》");
        globalList.add("《飞跃疯人院》");

        ArrayList<String> china = new ArrayList<>();
        china.add("《霸王别姬》");
        china.add("《大闹天宫》");
        china.add("《鬼子来了》");
        china.add("《大话西游》");
        china.add("《活着》");
        china.add("《饮食男女》");
        china.add("《无间道》");
        china.add("《天书奇谭》");
        china.add("《哪吒脑海》");
        china.add("《春光乍泄》");

        // 1）打印全球影片排行榜中的前三甲影片名
        globalList.stream().limit(3).forEach(System.out::println);
        System.out.println();

        // 2）打印华人影片排行榜中倒数5名的影片名
        china.stream().skip(china.size() - 5).forEach(System.out::println);
        System.out.println();

        // 3）将两个排行榜中的前5名挑出来共同存入新的集合
        Stream.concat(globalList.stream().limit(5), china.stream().limit(5))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        // 4）将所有影片以影片名为name创建Film对象并保存至集合
        Stream.concat(globalList.stream(), china.stream()).map(Film::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
