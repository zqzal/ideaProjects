package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by xuxi on 2018/6/3.
 */
public class UsingFileOutputStream {

    public static void main(String[] args) throws IOException {

        String string = "测试你好123aba";
        try {
            FileOutputStream fileOutputStream= new FileOutputStream("src/test.txt");
            byte[] bytes = string.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
