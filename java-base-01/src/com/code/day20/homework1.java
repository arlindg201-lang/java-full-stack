package com.code.day20;
//## 题1：计数器
//
//创建多个线程，每个线程对一个共享计数器进行递增操作（比如1000次）。最终验证计数器的结果是否正确（即所有线程操作后的总次数是否等于预期值）。
//
//✅ 问题目标：
//
//- 多个线程并发执行
//- 每个线程对共享变量 counter 执行固定次数的递增操作
//- 使用 synchronized 保证线程安全
//- 最终验证计数器值是否等于预期总和
//
//✅ 开发提示：
//
//- 创建共享计数器类Counter，
//  - 包含属性count（int类型），
//  - 提供increment()，每次调用increment方法，count都自增1；
//  - 提供getCount()方法，返回count值
//- 创建CounterThread线程类，继承Thread类，重写run方法，在run方法中使用循环实现调用Counter类的increment()方法n次。
//- 在测试类中，创建多个线程，判断多个线程执行完之后，最终结果是否正确。
public class homework1 {

    public class Counter {
        private int count = 0;
        public synchronized void increment() {
            count++;
        }
        public int getCount() {
            return count;
        }
    }

    public class CounterThread extends Thread {
        private final Counter counter;
        private  final int iterations;

        public CounterThread(Counter counter, int iterations) {
            this.counter = counter;
            this.iterations = iterations;
        }
        @Override
        public void run() {
            for (int i = 0; i < iterations; i++) {
                counter.increment();
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " finished.");
        }
    }

    public class SharedCounterTest {
        public void main(String[] args) throws InterruptedException {
            // 共享计数器
            Counter counter = new Counter();

            // 线程数量和每个线程递增次数
            int threadCount = 10;
            int iterationsPerThread = 1000;

            // 创建并启动线程
            Thread[] threads = new Thread[threadCount];
            for (int i = 0; i < threadCount; i++) {
                threads[i] = new CounterThread(counter, iterationsPerThread);
                threads[i].start();
            }

            // 等待所有线程执行完成
            for (Thread thread : threads) {
                thread.join();
            }

            // 验证最终结果
            System.out.println("最终计数器值: " + counter.getCount());
            int expectedCount = threadCount * iterationsPerThread;
            System.out.println("预期值: " + expectedCount);
            System.out.println("结果是否正确: " + (counter.getCount() == expectedCount ? "是" : "否"));
        }
    }
}
