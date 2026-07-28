package com.code.day18;

import java.util.ArrayList;
import java.util.HashMap;

//案例：
//
//​	添加如下省份与城市信息到map中，并遍历显示
//
//```java
//浙江省
//	绍兴市
//	温州市
//	湖州市
//	嘉兴市
//	台州市
//	金华市
//	舟山市
//	衢州市
//	丽水市
//	杭州市
//	宁波市
//海南省
//	海口市
//	三亚市
//北京市
//	北京市
//```
//
//开发提示：
//
//​	其中key为省份名，value为该省份所有的市辖区
public class homework6 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("浙江省",new ArrayList<>());
        map.get("浙江省").add("绍兴市");
        map.get("浙江省").add("温州市");
        map.get("浙江省").add("湖州市");
        map.get("浙江省").add("嘉兴市");
        map.get("浙江省").add("台州市");
        map.get("浙江省").add("金华市");
        map.get("浙江省").add("舟山市");
        map.get("浙江省").add("衢州市");
        map.get("浙江省").add("丽水市");
        map.get("浙江省").add("杭州市");
        map.get("浙江省").add("宁波市");
        map.put("海南省",new ArrayList<>());
        map.get("海南省").add("海口市");
        map.get("海南省").add("三亚市");
        map.put("北京市",new ArrayList<>());
        map.get("北京市").add("北京市");
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key);
            for (String value : map.get(key)) {
                System.out.println("\t"+value);
            }
        }
    }
}
