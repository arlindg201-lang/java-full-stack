package com.code.day13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Exercise2 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\java-code\\java-full-stack\\java-base-01\\src\\com\\code\\day01\\Demo01.java");
        //该文件必须存在
        FileWriter fw = new FileWriter("D:\\java-code\\java-full-stack\\java-base-01\\src\\com\\code\\day02\\Demo01.java");
        //该文件会自动创建，如果之前已经存储会覆盖

        char[] data = new char[1024];
        int len;
        while((len=fr.read(data)) != -1){
            fw.write(data,0,len);
        }

        fw.close();
        fr.close();
    }


}
