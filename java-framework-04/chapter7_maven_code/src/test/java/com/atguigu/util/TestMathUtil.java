package com.atguigu.util;

//2、请创建一个 JUnit 测试类TestMathUtil，用于测试MathUtil类的功能,你需要编写以下内容：
//
//- 使用 @Test 编写两个测试方法，分别验证：
//  - add(2, 3) 返回 5
//  - divide(10, 2) 返回 5
//- 使用 @BeforeEach 注解的方法，在每次测试前打印 "测试开始前准备环境"。
//- 使用 @AfterEach 注解的方法，在每次测试后打印 "测试结束后清理资源"。
//- 使用 @BeforeAll注解的方法，在所有测试执行前打印 "整个测试类开始执行"。
//- 使用 @AfterAll 注解的方法，在所有测试执行后打印 "整个测试类执行结束"。

import org.junit.jupiter.api.*;


public class TestMathUtil {
    private MathUtil mathUtil;

    @BeforeAll
    public static void entireTestStart() {
        System.out.println("整个测试类开始执行");
    }

    @AfterAll
    public static void entireTestEnd() {
        System.out.println("整个测试类执行结束");
    }

    @BeforeEach
    public void setup() {
        System.out.println("测试开始前准备环境");
        mathUtil = new MathUtil();
    }

    @AfterEach
    public void teardown() {
        System.out.println("测试结束后清理资源");
    }

    @Test
    public void testAdd() {
        System.out.println("测试add");
        int result = mathUtil.add(2, 3);
        assert  result == 5 : "add方法返回结果应该是5";
        System.out.println("测试通过");
    }

    @Test
    public void testDivide() {
        System.out.println("测试divide");
        int result = mathUtil.divide(10, 2);
        assert result == 5 : "divide方法返回结果应该是5";
        System.out.println("测试通过");
    }


}
