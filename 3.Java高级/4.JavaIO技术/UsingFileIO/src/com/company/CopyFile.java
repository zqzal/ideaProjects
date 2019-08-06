package com.company;

import java.io.*;

/**
 * Created by xuxi on 2018/6/3.
 */
public class CopyFile {
    public static void main(String[] args){

        try {
            FileInputStream fileInputStream = new FileInputStream("src/ww.gif");
            FileOutputStream fileOutputStream = new FileOutputStream("src/ww1.gif");
            byte[] bytes = new byte[30];

            while (fileInputStream.read(bytes) != -1){
                fileOutputStream.write(bytes);

            }
            fileOutputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
