package com.code.day12;

import java.util.Scanner;

//（2）声明一个属性，私有化，加final修饰
//
//- 描述：`description`（例如：JANUARY的description为一月，FEBRUARY的description为二月，依次类推）
//
//（3）声明一个有参构造`Month(String description)`
//
//（4）包含`public static Month of(int value)`：返回对应月份值的枚举对象，例如实参传入1，则返回JANUARY对象。
//
//（5）包含`public int getValue()`：返回月份对象对应的月份数值。例如JANUARY对象返回1.
//
//（6）包含`public int length(boolean leapYear)`：返回这个月的总天数，如果当前对象是FEBRUARY，并且leapYear是true，则返回29，否则返回28。其他月份对象无论leapYear参数是true还是false，都正常返回月份总天数。
//
//2、在测试类`TestMonth`中，从键盘输入年份和月份值，获取对应的月份对象，并打印月份对象详细信息，并获取月份总天数。
public class homework3 {
    public enum Month {
        JANUARY("一月"),
        FEBRUARY("二月"),
        MARCH("三月"),
        APRIL("四月"),
        MAY("五月"),
        JUNE("六月"),
        JULY("七月"),
        AUGUST("八月"),
        SEPTEMBER("九月"),
        OCTOBER("十月"),
        NOVEMBER("十一月"),
        DECEMBER("十二月");
        private final String description;

        Month(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static Month of(int value) {
            if (value >= 1 && value <= 12) {
                return Month.values()[value - 1];
            }
            return null;
        }

        public int getValue() {
            return ordinal() + 1;
        }

        public int length(boolean leapYear) {
            switch (this) {

                case FEBRUARY:
                    return leapYear ? 29 : 28;
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    return 30;
                default:
                    return 31;

            }
        }


    }

    public class TestMonth {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入年份：");
            int year = scanner.nextInt();
            System.out.print("请输入月份：");
            int monthValue = scanner.nextInt();
            Month month = Month.of(monthValue);
            System.out.println("月份对象详细信息：" + month.getDescription());
            System.out.println("月份总天数：" + month.length(year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
        }
    }
}
