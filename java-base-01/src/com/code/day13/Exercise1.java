package com.code.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise1 {

    public static void main(String[] args) throws IOException, IOException {
        // 1.创建流对象
        // 1.1 指定数据源
        FileInputStream fis = new FileInputStream("E:\\BaiduNetdiskDownload\\2026Java全栈AI学习\\01.Java基础+AI启蒙\\day13_基础API和IO流\\视频\\day13_01复习(1).mp4");//该文件必须存在
        // 1.2 指定目的地
        FileOutputStream fos = new FileOutputStream("E:\\BaiduNetdiskDownload\\2026Java全栈AI学习\\01.Java基础+AI启蒙\\day13_基础API和IO流\\视频\\day13_01复习(1).mp4");//该文件会自动创建，如果之前已经存储会覆盖

        // 2.读写数据
        // 2.1 定义数组
        byte[] data = new byte[1024];
        // 2.2 定义长度
        int len;
        // 2.3 循环读取
        while ((len = fis.read(data))!=-1) {
            // 2.4 写出数据
            fos.write(data, 0 , len);
        }

        // 3.关闭资源
        fos.close();
        fis.close();
    }
}

