package com._2_8_example;

import java.io.IOException;

/**
 * Created by xuxi on 2018/11/6.
 */
public interface FileIO {

    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);

}
