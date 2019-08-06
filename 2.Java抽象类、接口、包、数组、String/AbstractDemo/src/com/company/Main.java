package com.company;

/**
 * Abstract 应用场景：
 *    应用场景"假设人分为学生和工人，学生和工人都可以说话，但是学生和工人说话的内容是不一样的
 *    ，那么说话应该是一个具体的功能，说什么则是由学生和工人自己来决定。
 *    所以此时可以使用抽象来实现"
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student = new Student("托马斯赵四",35,60.9f);
        student.say();

        Worker worker = new Worker("詹姆斯李三",24,80.0f);
        worker.say();

    }
}
