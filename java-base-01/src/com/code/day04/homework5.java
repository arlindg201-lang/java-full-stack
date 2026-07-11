package com.code.day04;

public class homework5 {
    public static void main(String[] args) {
    //输入两个正整数m和n，求其最大公约数和最小公倍数
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入第一个正整数：");
        int m = scanner.nextInt();
        System.out.print("请输入第二个正整数：");
        int n = scanner.nextInt();
        int gcd = 1;
        int lcm = m * n;
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        lcm = (m / gcd) * n;
        System.out.println("最大公约数是：" + gcd);
        System.out.println("最小公倍数是：" + lcm);
    }

}
