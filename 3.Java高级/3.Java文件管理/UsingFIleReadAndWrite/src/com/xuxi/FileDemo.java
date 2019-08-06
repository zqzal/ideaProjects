package com.xuxi;

/**
 * Created by xuxi on 2018/6/1.
 */

import java.io.*;

/**
 * 文件的读取方式
 * 文件的写入方式
 *
 * 文件的读取方式
 *
 * 文件内容的读取方式如下：
 *  1.FileInputStream:文件数据输入字节流
 *  2.InputStreamReader:字节流到字符流的桥梁
 *  3.BufferedReader:读取字符流缓冲区
 *
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("src/com/xuxi/hello.txt");
        try {

            file.createNewFile();

        } catch (IOException e) {

            e.printStackTrace();

        }

            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            while ((str = bufferedReader.readLine())!=null){
                System.out.println(str);
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();




    }
}
