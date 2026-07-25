package com.code.day14;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

//（1）用从键盘输入三句话，用PrintStream打印到一个words.txt文件中
//
//（2）再用Scanner一行一行读取显示
public class homework5 {
    @Test
    public void test01() {
        try (Scanner input = new Scanner(System.in);
             PrintStream ps = new PrintStream("words.txt", "UTF-8")) {

            System.out.println("===== 开始输入 =====");
            for (int i = 0; i < 3; i++) {
              System.out.print("请输入第 " + (i + 1) + " 句要对柴老师说的话：");
                String content = input.nextLine();
                ps.println(content);
            }
            System.out.println("===== 输入完成 =====");

        } catch (FileNotFoundException e) {
            System.err.println("文件创建失败：" + e.getMessage());
        } catch (Exception e) {
            System.err.println("操作失败：" + e.getMessage());
        }
    }

    @Test
    public void test02() {
        File file = new File("words.txt");
        if (!file.exists()) {
            System.out.println("文件不存在，请先运行 test01()");
            return;
        }

        try (Scanner input = new Scanner(file, "UTF-8")) {
            System.out.println("===== 读取文件内容 =====");
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("文件未找到：" + e.getMessage());
        } catch (Exception e) {
            System.err.println("读取失败：" + e.getMessage());
        }
    }

}
