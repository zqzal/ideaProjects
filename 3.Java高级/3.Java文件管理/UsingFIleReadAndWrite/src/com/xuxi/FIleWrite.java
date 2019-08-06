package com.xuxi;

import java.io.*;

/**
 * Created by xuxi on 2018/6/2.
 */

/**
 * 文件内容的写入方式如下：
 * 1.FileOutputStrea: 文件数据输出流
 * 2.OutputStreamWriter: 字符流到字节流的桥梁
 * 3.BufferedWriter: 写入字符输出流缓冲区
 */
public class FIleWrite {

    public static void main(String[] args) throws IOException {

        File file = new File("src/com/xuxi/newFile.txt");

        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("eeeee1111");

        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();

    }

}
