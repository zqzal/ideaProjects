package com.company;

/**
 * Created by xuxi on 2018/5/17.
 */
public class ObjectAttribute {
    public  static void main(String []args){
        /**
         //封装、继承、多态
         //封装
         1.把类中的一些描述细节隐藏内部，用户只能通过接口来访问类中的内容，这种组织模块的方式称为"封装"
         2.封装是信息隐藏的一种方式，留给用户访问对象的接口（简称API ：Application Program Interface），内部信息外部不可以直接访问
         3.封装可以通过"private"关键字实现
         */
        Peoples people = new Peoples();
//         people.name = "li";
//         System.out.println(people.name);
        people.setName("里斯");
        System.out.println(people.getName());


    }
}
class Peoples{
    private String name = "";

    public void setName(String _name){
        this.name= _name;
    }

    public String getName() {
        return this.name;
    }
}