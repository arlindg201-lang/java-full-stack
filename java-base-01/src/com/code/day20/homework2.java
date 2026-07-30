package com.code.day20;

import java.util.ArrayList;
import java.util.List;

//## 题2：集合操作
//
//创建多个线程，每个线程对同一个数据缓冲区添加元素（比如1000次），数据缓冲区用ArrayList模拟。最终验证集合元素个数是否正确（即所有线程操作后的总次数是否等于预期值）。
//
//✅ 问题目标：
//
//- 多个线程并发访问和修改同一个 ArrayList
//- 使用同步机制保证线程安全
//- 验证最终集合中的元素数量是否与预期一致
//
//✅ 开发提示：
//
//- 创建共享缓冲区类SharedList，
//  - 包含属性list（ArrayList类型），
//  - 提供addElement(int value)，每次调用addElement方法，往list集合添加一个值；
//  - 提供getSize()方法，返回list集合的元素个数
//- 创建ListAddThread线程类，继承Thread类，重写run方法，在run方法中使用循环实现调用SharedList类的addElement方法n次。
//- 在测试类中，创建多个线程，判断多个线程执行完之后，最终结果是否正确。
public class homework2 {

    public class SharedList {
        // 使用 ArrayList，不是线程安全的
        private List<Integer> list = new ArrayList<>();

        // 添加元素的方法，使用 synchronized 保证线程安全
        public synchronized void addElement(int value) {
            list.add(value);
        }

        public int getSize() {
            return list.size();
        }
    }

    public class ListAddThread extends Thread {
        private final SharedList sharedList;
        private final int iterations;

        public ListAddThread(SharedList sharedList, int iterations) {
            this.sharedList = sharedList;
            this.iterations = iterations;
        }

        @Override
        public void run() {
            for (int i = 0; i < iterations; i++) {
                sharedList.addElement(i);
            }
            System.out.println(Thread.currentThread().getName() + " 完成添加 " + iterations + " 个元素");
        }
    }

    public class ArrayListMultiThreadTest {
        public void main(String[] args) throws InterruptedException {
            // 创建共享的列表对象
            SharedList sharedList = new SharedList();

            // 线程数量和每个线程添加元素的次数
            int threadCount = 5;
            int iterationsPerThread = 1000;

            // 创建并启动线程
            Thread[] threads = new Thread[threadCount];
            for (int i = 0; i < threadCount; i++) {
                threads[i] = new ListAddThread(sharedList, iterationsPerThread);
                threads[i].start();
            }

            // 等待所有线程执行完成
            for (Thread thread : threads) {
                thread.join();
            }

            // 验证结果
            int expectedSize = threadCount * iterationsPerThread;
            int actualSize = sharedList.getSize();

            System.out.println("实际集合大小: " + actualSize);
            System.out.println("预期大小: " + expectedSize);
            System.out.println("验证结果: " + (actualSize == expectedSize ? "正确" : "错误"));
        }
    }
}
