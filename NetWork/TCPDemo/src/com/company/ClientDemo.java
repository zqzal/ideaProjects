package com.company;

/**
 * Created by xuxi on 2018/7/20.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  TCP传输-客户端
 *     1.建立客户端的socket服务
 *     2.连接成功，通过socket对象的方法获取socket的IO流
 *     3.读取数据进行操作
 *     4.关闭资源
 *
 */

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1.建立客户端的socket服务 指定目标地址以及端口
        Socket socket = new Socket("192.168.1.7",10002);
        //2.通过socket对象向服务器写入数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello,服务器！".getBytes());
        //2.1通过socket对象获取服务器返回的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        String string = new String(buf,0,len);
        System.out.println("server:"+string);


        //3.关闭资源
        socket.close();

    }
}
