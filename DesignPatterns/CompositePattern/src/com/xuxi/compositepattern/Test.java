package com.xuxi.compositepattern;

/**
 * Created by xuxi on 2018/9/30.
 */

/**
 * 概述
 *  将对象组合成树形结构以表示"部分-整体"的层次结构。Composite使得用户对单个对象和组合对象
 *  的使用具有一致性。
 * 适用性
 *  你想表示对象的部分-整体层次结构
 *  你希望用户忽略组合对象和单个对象的不同，用户将统一地使用组合结构中的所有对象
 * 参与者
 *  1、Component为组合中的对象声明接口。在适当的情况下，实现所有类共有接口的缺省行为。声明
 *  一个接口用于访问和管理Component的子组件。（可选）在递归结构中定义一个接口，用于访问一个
 *  父部件，并在合适的情况下实现它。
 *  2、Leaf在组合中表示叶节点对象，叶节点没有子节点。在组合中定义节点对象的行为。
 *  3、Composite定义有子部件的那些部件的行为。存储子部件。在Component接口中实现与子部件有
 *  关的操作。
 *  4、Client通过Compoent接口操纵组合部件的对象。
 *
 */

import java.util.List;

/**
 * Client
 */
public class Test {
    public static void main(String[] args) {

        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programeer1 = new Programmer("程序员一");
        Employer programeer2 = new Programmer("程序员二");
        pm.add(pa); //为项目经理添加项目助理
        pm.add(programeer2); //为项目经理添加程序员

        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems){
            System.out.println(em.getName());
        }

    }
}
