package com.code.day14;
//案例需求：把今天的作业文档“d:\\尚硅谷资料\\尚硅谷_JavaSE_第8章_IO流_homework_参考答案.md”，复制一份。
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class homework2 {
    public static void main(String[] args) throws
            IOException {
        FileInputStream fis = new FileInputStream("E:\\BaiduNetdiskDownload\\2026Java全栈AI学习" +
                "\\01.Java基础+AI启蒙\\day14_IO流和异常完整资料" +
                "\\作业\\尚硅谷-第8章_File类与IO流_homework\\尚硅谷_JavaSE_第8章_IO流_homework_参考答案.md");
        FileOutputStream fos = new FileOutputStream("E:\\BaiduNetdiskDownload\\2026Java全栈AI学习" +
                "\\01.Java基础+AI启蒙\\day14_IO流和异常完整资料" +
                "\\作业\\尚硅谷-第8章_File类与IO流_homework\\尚硅谷_JavaSE_第8章_IO流_homework_参考答案_副本.md");
    byte[] b = new byte[1024];
    int len;
    while ((len = fis.read(b)) != -1) {
        fos.write(b, 0, len);
    }
        fis.close();
        fos.close();
    }


}
