package com.code.day18;

//案例：添加你喜欢的歌手以及该歌手唱过的歌曲
//
//例如：
//
//```java
//张学友=[《一路上有你》, 《吻别》, 《一千个伤心的理由》]
//王菲=[《红豆》, 《传奇》, 《容易受伤的女人》]

import java.util.ArrayList;
import java.util.HashMap;

public class homework7 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        map.put("张学友",new ArrayList<>());
        map.get("张学友").add("一路上有你");
        map.get("张学友").add("吻别");
        map.get("张学友").add("一千个伤心的理由");
        map.put("王菲",new ArrayList<>());
        map.get("王菲").add("红豆");
        map.get("王菲").add("传奇");
        map.get("王菲").add("容易受伤的女人");
        System.out.println(map);
        System.out.println(map.get("王菲"));
        System.out.println(map.get("王菲").get(1));
        System.out.println(map.get("王菲").size());
        System.out.println(map.get("王菲").contains("传奇"));
        System.out.println(map.get("王菲").remove("传奇"));
        System.out.println(map.get("王菲"));



    }
}
