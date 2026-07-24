package com.code.day13;
//案例需求：将GBK编码的文本文件，转换为UTF-8编码的文本文件。

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

import java.io.*;

// 例如：将编码为GBK的文件“file_gbk.txt”，转换为编码为UTF-8的文件“file_utf8.txt”。
public class Exercise3 {





    /**
     * 文件编码转换工具
     * 将GBK编码的文本文件转换为UTF-8编码
     */
    public class EncodingConverter {

        public static void main(String[] args) {
            // 源文件（GBK编码）
            String sourceFile = "file_gbk.txt";
            // 目标文件（UTF-8编码）
            String targetFile = "file_utf8.txt";

            try {
                convertEncoding(sourceFile, targetFile, "GBK", "UTF-8");
                System.out.println("编码转换成功！");
                System.out.println("源文件: " + sourceFile + " (GBK)");
                System.out.println("目标文件: " + targetFile + " (UTF-8)");
            } catch (IOException e) {
                System.err.println("编码转换失败: " + e.getMessage());
                e.printStackTrace();
            }
        }

        /**
         * 文件编码转换方法
         *
         * @param sourcePath  源文件路径
         * @param targetPath  目标文件路径
         * @param sourceCharset 源文件字符集（如 GBK）
         * @param targetCharset 目标文件字符集（如 UTF-8）
         * @throws IOException 读写异常
         */
        public static void convertEncoding(String sourcePath, String targetPath,
                                           String sourceCharset, String targetCharset) throws IOException {
            // 1. 使用源编码读取文件（字符流）
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(sourcePath), sourceCharset));
                 // 2. 使用目标编码写入文件（字符流）
                 BufferedWriter writer = new BufferedWriter(
                         new OutputStreamWriter(new FileOutputStream(targetPath), targetCharset))) {

                char[] buffer = new char[8192];  // 8KB缓冲区，提高效率
                int length;

                // 3. 读取并写入
                while ((length = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, length);
                }
            }
            // 使用 try-with-resources，会自动关闭流
        }
    }



}
