package com.company;

public class Main {

    public static void main(String[] args) {
            System.out.println("Usage:java Main plain      编写纯文本文档");
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());

            System.out.println("Usage:java Main html       编写HTML文档");
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director1 = new Director(htmlBuilder);
            director1.construct();
            System.out.println(htmlBuilder.getResult()+"文件编程完成。");
    }
}
