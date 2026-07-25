package com.code.day14;
//
//（1）使用绝对路径，在D盘下创建一个testIO文件夹，
// 然后在testIO文件夹中创建一个1.txt文件

import org.junit.Test;

import java.io.File;
import java.io.IOException;
// （2）使用相对路径，在当前模块下创建一个testIO文件夹，
  // 然后在testIO文件夹中创建一个1.txt文件
public class homework1 {

    @Test
    public void test1() throws IOException {
        File dir = new File("D:/testIO");
        dir.mkdir();
        File file = new File(dir, "1.txt");
        file.createNewFile();
    }
    @Test
    public void test2() throws IOException {
        File dir = new File("testIO");
        dir.mkdir();
        File file = new File(dir, "1.txt");
        file.createNewFile();
    }


}
