package com.company;

import java.io.File;
import java.io.IOException;

/**
 * 文件的创建、删除、重命名
 * 文件夹的创建、删除、重命名
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        //创建src
        File file = new File("src/newHello.text");
        //重新命名
        File newFile = new File("newHello.text");

        try {
            if (file.createNewFile()){
                System.out.println("文件创建成功");
            }else {
                System.out.println("文件已经创建");
//                file.delete();
//                System.out.println("文件删除成功");

                file.renameTo(newFile);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
