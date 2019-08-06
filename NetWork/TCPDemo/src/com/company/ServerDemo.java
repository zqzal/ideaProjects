package com.company;

/**
 * Created by xuxi on 2018/7/20.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *   TCP传输-服务端
 *      1.建立ServerSocket服务 监听一个端口
 *      2.通过accept方法获取连接过来
 *      3.获取客户端对象和具体的客户端
 *      4.进行IO流数据处理
 *      5.关闭资源
 *
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建serverSocket服务器端对象 监具体的端口
        ServerSocket serverSocket = new ServerSocket(10002);
        //2.获取具体的连接客户端对象
        Socket socket = serverSocket.accept();
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip+"-----connected-----");

        //3.通过客户端对象获取读取流对象，读取客户端发送的消息
        InputStream in = socket.getInputStream();
        byte[] buff = new byte[1024];
        int len = in.read(buff);
        String  str =  new String(buff,0,len);
        System.out.println("Client:"+str);

        //4.获取socket对象将数据写入客户端
        OutputStream out = socket.getOutputStream();
        out.write("已收到！".getBytes());

        //5.关闭流对象
        socket.close();
        serverSocket.close();


















    }
}
