package _7_2;

import com.company.Director;
import com.company.TextBuilder;

/**
 * Created by xuxi on 2018/11/17.
 */
public class Main7_2 {
    public static void main(String[] args) {
        System.out.println("Usage:java Main plain      编写纯文本文档");
        TextBuilder7_2 builder = new TextBuilder7_2();
        Director7_2 director = new Director7_2(builder);
        director.construct();
        System.out.println(builder.getResult());



        System.out.println("Usage:java Main html       编写HTML文档");
        HTMLBuilder7_2 builder7_2 = new HTMLBuilder7_2();
        Director7_2 director1 = new Director7_2(builder7_2);
        director1.construct();
        System.out.println(builder7_2.getResult()+"文件编程完成。");

    }
}
