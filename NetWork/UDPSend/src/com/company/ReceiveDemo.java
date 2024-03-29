package com.company;

/**
 * Created by xuxi on 2018/7/20.
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP传输-接收端
 *    1.建立UDP的DatagramSocket接收端服务
 *    2.准备好数据包用来存放接收到的字节数据
 *    3.调用接收方法，将接收到的数据都存储到准备好的数据包中
 *    4.将数据包中的数据解析出来并展示
 *    5.关闭资源
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //1.建立udp接收端的socket服务
        DatagramSocket socket = new DatagramSocket(9527);
        while (true){

            //2.准备用于存储发送数据的数据包
            byte[] buff = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buff,buff.length);
            //3.调用udp的socket的接收方法接收数据存储到数据包
            socket.receive(dp);//阻塞式方法
            //4.通过数据包中的方法获取具体的数据
            String ip = dp.getAddress().getHostAddress(); //接收端的ip地址
            int port = dp.getPort();//接收端端口号

            String text = new String(dp.getData(),0,dp.getLength());//发送的具体字符串数据
            System.out.println("ip:"+ip+"发送内容："+text+"端口"+port);
            if ("886".equals(text)){
                break;
            }
        }
        //5.关闭资源
        socket.close();


    }
}
