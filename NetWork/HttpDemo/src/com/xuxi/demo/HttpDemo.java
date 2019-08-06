package com.xuxi.demo;

/**
 * Created by xuxi on 2018/7/25.
 */

/**
 *  HTTP是Hyper Text Transfer Protocok(超文本传输协议)
 *  HTTP协议是一种应用层协议
 *  HTTP协议建立在TCP协议之上的一种协议
 *  浏览器客户端和服务器之间数据传输的格式规范
 *
 *  特点
 *    支持B/S及C/S模式
 *    简单快捷
 *    灵活
 *    无状态
 *
 */
/**
 *  HttpURLConnection基本使用
 *     通过网址获取网络连接的url对象
 *     通过url获取网络连接（HttpURLConnection）
 *     设置请求方式url.setRequestMethod("GET")
 *     设置读取时间限制url.setReadTimeout(5000)
 *     获取响应模式url.getResponeCode()
 *     获取文件流getInputStream字节输入流InputStream读取流的内容while循环读入
 *
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *  HTTP工作方式
 *  统一资源定位符URL
 *
 */
public class HttpDemo {
    public static void main(String[] args) throws IOException {

        URL url = new URL("www.baidu.com");

        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.connect();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Content-type","");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(20*1000);
        httpURLConnection.setReadTimeout(20*1000);

        OutputStream outputStream =httpURLConnection.getOutputStream();
        InputStream is = httpURLConnection.getInputStream();




    }
}
