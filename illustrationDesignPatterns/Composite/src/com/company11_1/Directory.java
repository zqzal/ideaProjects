package com.company11_1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xuxi on 2018/12/21.
 */
public class Directory extends Entry {

    private String name;            //文件夹的名字
    private ArrayList directory = new ArrayList(); //文件夹中目录条目的集合

    public Directory(String name){  //构造函数
        this.name = name;
    }

    @Override
    public String getName() {   //获取名字
        return name;
    }

    @Override
    public int getSize() {  //获取大小
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry){   //增加目录条目
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {  //显示目录条目一览
        System.out.println(prefix + "/" +this.toString());
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
