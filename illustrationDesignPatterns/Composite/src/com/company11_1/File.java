package com.company11_1;

/**
 * Created by xuxi on 2018/12/21.
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
    }
}
