package com.code.day13;
//
// 编写一个程序，输入美元金额, 和汇率，使用 BigDecimal 进行精确乘法运算，输出转换后的人民币金额，保留两位小数。
public class homework4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入美元金额: ");
        double usdAmount = scanner.nextDouble();
        System.out.print("请输入汇率: ");
        double exchangeRate = scanner.nextDouble();
        java.math.BigDecimal bd1 = new java.math.BigDecimal(String.valueOf(usdAmount));
        java.math.BigDecimal bd2 = new java.math.BigDecimal(String.valueOf(exchangeRate));
        java.math.BigDecimal result = bd1.multiply(bd2);
        result = result.setScale(2, java.math.RoundingMode.HALF_UP);
        System.out.println("转换后的人民币金额: " + result);
    }
}
