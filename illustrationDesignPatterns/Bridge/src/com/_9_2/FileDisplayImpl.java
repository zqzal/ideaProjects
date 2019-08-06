package com._9_2;

import com._9.DisplayImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by xuxi on 2018/11/26.
 */
public class FileDisplayImpl extends DisplayImpl {

    private String filename;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096; //循环显示的极限（缓存大小限制）
    public FileDisplayImpl(String filename){
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try{
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("============="+ filename + "==============");//装饰框
    }

    @Override
    public void rawPrint() {
        try{
            String line;
            reader.reset(); //回到mark的位置
            while ((line = reader.readLine()) != null){
                System.out.println("> " + line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=============");//装饰框
        try {
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
