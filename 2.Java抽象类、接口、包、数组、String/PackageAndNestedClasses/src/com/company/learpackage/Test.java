package com.company.learpackage;


import com.company.hello.Hello;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

//import com.company.usingpackage.Hello;
/**
 * Created by xuxi on 2018/5/20.
 */
public class Test {
    public static void main(String [] agrs){
        Hello hello = new Hello();
        File file = new File("");

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

    }
}
