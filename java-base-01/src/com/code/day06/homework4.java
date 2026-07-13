package com.code.day06;

public class homework4 {
        public static void main(String[] args) {
                String[][] employees = {
                        {"10", "1", "段誉", "22", "3000"},
                        {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                        {"11", "3", "任我行", "23", "7000"},
                        {"11", "4", "张三丰", "24", "7300"},
                        {"12", "5", "周芷若", "28", "10000", "5000"},
                        {"11", "6", "赵敏", "22", "6800"},
                        {"12", "7", "张无忌", "29", "10800", "5200"},
                        {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                        {"12", "9", "杨过", "26", "9800", "5500"},
                        {"11", "10", "小龙女", "21", "6600"},
                        {"11", "11", "郭靖", "25", "7100"},
                        {"12", "12", "黄蓉", "27", "9600", "4800"}

                };
                System.out.println("员工类型\t部门编号\t员工姓名\t员工年龄\t员工工资\t奖金\t股票");
                for (int i = 0; i < employees.length; i++) {
                        switch (employees[i][0]) {
                                case "10":
                                        System.out.print("普通员工\t");
                                        break;
                                case "11":
                                        System.out.print("部门经理\t");
                                        break;
                                case "12":
                                        System.out.print("高级员工\t");
                                        break;
                        }
                        for (int j = 1; j < employees[i].length; j++) {
                                System.out.print(employees[i][j] + "\t");
                        }
                        System.out.println();
                }
        }
}
