package com.company11_2;

/**
 * Created by xuxi on 2018/12/24.
 */
public class File_11_2 extends Entry_11_2 {

    private String name;
    private int size;

    public File_11_2(String name,int size){
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
