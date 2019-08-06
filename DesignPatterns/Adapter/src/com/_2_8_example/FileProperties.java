package com._2_8_example;

import java.io.*;
import java.util.Properties;

/**
 * Created by xuxi on 2018/11/6.
 */
public class FileProperties extends Properties implements FileIO  {

    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName),"written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key,"");
    }


}
