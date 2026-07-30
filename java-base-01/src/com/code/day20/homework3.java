package com.code.day20;

import java.text.SimpleDateFormat;
import java.util.Date;

//定义一个日期格式化模板SimpleDateFormat类对象，格式要求是：yyyy-MM-dd HH:mm:ss，创建多个线程，使用同一个日期格式化模板格式化日期，每一个线程的日期时间值都不同，请确保结果正确。
//
//开发提示：
//
//- 定义DateFormatter类，
//  - 包含sdf属性（SimpleDateFormat类型）格式要求是：yyyy-MM-dd HH:mm:ss
//  - 包含format(Date date) 方法，可以将Date日期转为字符串
//- 定义FormatThread类，继承Thread类，重写run方法
//  - 在run方法中调用DateFormatter的format(Date date) 方法，讲一个Date对象进行格式化
//- 定义测试类
//  - 测试类中创建多个线程，并且每个线程在当前系统时间的基础上 n秒来创建Date对象
public class homework3 {

    public class DateFormatter {
        // 定义日期格式模板
        private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 线程安全的格式化方法
        public synchronized String format(Date date) {
            return sdf.format(date);
        }
    }

    public class FormatThread extends Thread {
        private final DateFormatter formatter;
        private final Date date;

        public FormatThread(DateFormatter formatter, Date date, String name) {
            super(name);
            this.formatter = formatter;
            this.date = date;
        }

        @Override
        public void run() {
            String formattedDate = formatter.format(date);
            System.out.println(Thread.currentThread().getName() + " 格式化结果: " + formattedDate);
        }
    }

    public class SimpleDateFormatMultiThreadTest {
        public void main(String[] args) {
            DateFormatter formatter = new DateFormatter();

            // 创建并启动多个线程，每个线程传入不同的时间戳
            for (int i = 0; i < 5; i++) {
                long time = System.currentTimeMillis() + i * 1000;
                new FormatThread(formatter, new Date(time), "线程-" + i).start();
            }
        }
    }
}
