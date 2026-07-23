package com.code.day12;
//（1）创建一个`Currency`枚举，
//
//- 列出几种常见的货币类型，如美元（USD）、欧元（EUR）、人民币（CNY）
//- 定义String类型的final常量：`fullName `与 `symbol`
//- 为每种货币提供一个方法`getSymbol()`，返回该货币的符号
//
//（2）在测试类`TestCurrency`中获取人民币枚举对象，并调用getSymbol()方法。
public class homework1 {

    public enum Currency {
        USD("United States Dollar", "$"),
        EUR("Euro", "€"),
        CNY("Chinese Yuan", "¥");
        private final String fullName;
        private final String symbol;
        Currency(String fullName, String symbol) {
            this.fullName = fullName;
            this.symbol = symbol;
        }

        public String getFullName() {
            return fullName;
        }
        public String getSymbol() {
            return symbol;
        }
    }

    public class TestCurrency {
        public static void main(String[] args) {
            Currency rmb = Currency.CNY;
            System.out.println(rmb);
            System.out.println("全称是：" + Currency.EUR.getFullName());
            System.out.println("符号是：" + Currency.USD.getSymbol());

        }
    }


}
