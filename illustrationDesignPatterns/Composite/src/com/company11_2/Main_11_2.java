package com.company11_2;

import com.company11_1.FileTreatMentException;

/**
 * 例如，HTML中的列表(ul标签、ol标签、dl标签)和表格等都可以用Composite模式表示
 */

/**
 * Created by xuxi on 2018/12/24.
 */
public class Main_11_2 {
    public static void main(String[] args) {
        try {
            Directory_11_2 rootdir = new Directory_11_2("root");
            Directory_11_2 usrdir = new Directory_11_2("usr");
            rootdir.add(usrdir);
            Directory_11_2 yuki = new Directory_11_2("yuki");
            usrdir.add(yuki);
            File_11_2 file = new File_11_2("Composite.java",100);
            yuki.add(file);
            rootdir.printList();

            System.out.println("");
            System.out.println("file = " + file.getFullName());
            System.out.println("yuki = " + yuki.getFullName());

        }catch (FileTreatMentException e){
            e.printStackTrace();
        }
    }
}
