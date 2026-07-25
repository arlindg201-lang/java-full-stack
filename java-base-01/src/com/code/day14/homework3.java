package com.code.day14;

import java.io.*;


import java.io.FileWriter;
import java.nio.charset.Charset;

//把今天的作业文件夹下的《我想对你说.txt》字符编码为GBK，
// 复制为《柴老师的话.txt》字符编码为UTF-8。
public class homework3 {

    public static void main(String[] args) throws IOException
    {
        InputStreamReader reader = new FileReader("E:\\BaiduNetdiskDownload\\2026Java全栈AI学习\\01.Java基础+AI启蒙\\day14_IO流和异常完整资料\\作业\\尚硅谷-第8章_File类与IO流_homework\\我想对你说.txt", Charset.forName("GBK"));
        OutputStreamWriter writer = new FileWriter("E:\\BaiduNetdiskDownload\\2026Java全栈AI学习\\01.Java基础+AI启蒙\\day14_IO流和异常完整资料\\作业\\尚硅谷-第8章_File类与IO流_homework\\柴老师的话.txt", Charset.forName("UTF-8"));
        char[] data = new char[1024];
        int len;
        while ((len = reader.read(data)) != -1) {
            writer.write(data, 0, len);
        }

        // 关闭流（注意顺序：先开的后关）
        writer.close();
        reader.close();

        System.out.println("文件转换完成！");
    }

}
