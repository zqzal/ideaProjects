package com.company;

import java.io.File;

/**
 * Created by xuxi on 2018/5/31.
 */
public class CreateNewDir {

    public static void main(String[] args){

        File file = new File("src/com2/test");
        File newFileDir = new File("src/com2/test2");
        if (file.mkdirs()){
            System.out.println("文件夹创建成功");
        }else {
            System.out.println("文件夹创建失败");
//            file.delete();
            file.renameTo(newFileDir);
        }

    }


}
