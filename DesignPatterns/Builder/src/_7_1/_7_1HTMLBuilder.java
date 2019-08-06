package _7_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xuxi on 2018/11/17.
 */
public class _7_1HTMLBuilder implements _7_1Buidler {


    private String filename;         //文件名

    private PrintWriter writer;      //用于编写文件的PrintWriter

    @Override
    public void makeTitle(String title) { //HTML文件的标题

        filename = title + ".html";       //将标题作文文件名
        try {
            writer = new PrintWriter(new FileWriter(filename));//生成PrintWriter
        }catch (IOException e){
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        //输出标题
        writer.println("<h1>"+title+"</h1>");

    }

    @Override
    public void makeString(String str) {        //HTML文件中的字符串
        writer.println("<p>" + str + "</p>");   //用<p>标签输出

    }

    @Override
    public void makeItems(String[] items) {     //HTML文件中的条目
        writer.println("<u1>");                 //用<ul>和<li>输出
        for (int i = 0;i<items.length;i++){
            writer.println("<li>" + items[i] + "</li>");
        }
    }

    @Override
    public void close() {                  //完成文档
        writer.println("</body></html>");  //关闭标签
        writer.close();                    //关闭文件
    }
    public String getResult(){              //编写完成的文档
        return  filename;                   //返回文件命
    }
}
