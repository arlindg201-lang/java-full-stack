package com.code.day01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo01 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2");
        for (int i = 0; i < 5; i++) {
            System.out.println("我爱学习");
        }

        List<String> result = list.stream().filter(x -> Integer.parseInt(x) > 1).collect(Collectors.toList());
        System.out.println(result);

    }
}
