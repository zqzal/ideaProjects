package com.xuxi.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * IP&TCP&UDP协议
 *
 *
 *   IP协议简介
 *
 *     TCP/IP协议模型中关键部分，Internet中所有数据包都是通过IP包的方式进行传输
 *     能够适应各种不同的网络硬件
 *     IP协议使用众多的局域网构成一个庞大的通信系统
 *
 *   IP协议的特点
 *
 *     无连接
 *       IP协议并不维护任何关于后续数据报的状态信息。每个数据报的处理是 相互独立 的。这也说明，
 *       IP数据报可以不按发送顺序接收。
 *     不可靠
 *       它不能保证IP数据报能成功地到达目的地。IP仅提供传输服务。如果发生某种错误时，IP有一个
 *       简单的错误处理算法：丢弃该数据报，然后发送ICMP消息报给信源端。任何可靠性的要求必须由上层来提供（如TCP）。
 *
 *
 *   TCP协议简介
 *
 *      TCP协议是面向连接的，可靠的，基于字节流的传输层通信协议。
 *      位于IP协议之上，可靠的端对端协议。
 *      利用重发技术保证通讯的可靠性。在保证数据内容准确，数据发送顺序正确的情况下进行重发。确保即使在拥堵的网络
 *      环境下进行重发。确保即使在拥堵的网络环境下，TCP协议也能准确可靠。
 *
 *   TCP协议的特点
 *
 *      建立连接，形成传输数据的通道
 *      在连接中进行大数据量传输
 *      三次握手完成连接，属于可靠协议
 *      必须建立连接，效率稍低
 *
 *
 *    UDP协议简介
 *
 *      UDP协议是用户数据报协议，是OSI参考模型中一种无连接的传输层协议。
 *      提供面向事务的简单、不可靠信息传送服务。
 *      位于IP协议之上，即UDP数据报是封装在IP数据包中进行传输的。
 *      常用于网络视频会议等情景中。
 *
 *    UDP协议的特点
 *
 *      将数据源及目的封装成数据包，不需要建立连接
 *      每个数据报大小限制在64k内
 *      因无连接，是不可靠协议
 *      不需要建立连接，速度快
 *
 */

/**
 * Created by xuxi on 2018/7/19.
 */
public class IpAddressDemo {

    /**
     * 演示ip对象的具体使用
     * @param args
     */

    public static void main(String[] args) throws UnknownHostException {

//        InetAddress inetAddress = InetAddress.getLocalHost();  //获取本地主机
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");//获取指定主机
        System.out.println("ip地址:"+inetAddress.getHostAddress());
        System.out.println("主机名:"+inetAddress.getHostName());

    }
}
