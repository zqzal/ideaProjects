package com._2_8_example;

import java.io.IOException;

/**
 * Created by xuxi on 2018/11/6.
 */
public class Main2_8 {

    public static void main(String[] args) {

        FileIO f = new FileProperties();
        try {
            //本地项目txt路径
            f.readFromFile("/Users/xuxi/IdeaProjects/DesignPatterns/Adapter/src/com/_2_8_example/file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","21");
            //本地项目txt路径
            f.writeToFile("/Users/xuxi/IdeaProjects/DesignPatterns/Adapter/src/com/_2_8_example/newfile.txt");
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
