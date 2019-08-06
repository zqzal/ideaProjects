package com.company;

/**
 * 异常的概念
 *   什么是异常？
 *     程序出错分为两部分：编译时出错和运行时出错。编译时出错是编译器在编译源码时发生的错误；
 *     运行时出错，则是编译通过，在运行时出现的错误。这样情况叫异常
 *     例：如数组越界，除数为0，文件找不到等等。
 *
 *   异常的层次应该是：
 *   Object
 *     Throwable
 *       Error
 *       Exception
 *          RuntimeException
 *          IOExcepiton
 *
 *  常用异常类
 *
 *  异常子类                             说明
 *  ArithmeticException                算术错误，如除以0
 *  IlleglARgmentException             方法收到非法参数
 *  ArrayIndexOutOfBoundsExcetion       数组下标出界
 *  NullPointerExcetion                 试图访问null对象引用
 *  SecurityException                   试图违反安全行
 *  ClassNotFoundException              不能加载请求的类
 *  ClassCastException                  试图将对象强制转换为不是该实例的子类时
 *  NegativeArraySizeException          应用程序试图创建大小为负的数组
 *  AWTExcepiton                        AWT中的异常
 *  IOException                         I/O异常的根类
 *  FileNotFoundException               不能找到文件
 *  EOFException                        文件结束
 *  IIIegaIAccessException              对类的访问被拒绝
 *  NoSuchMethodException               请求的方法不存在
 *  InterruputedException               线程中断
 *  SQLException                        数据库访问异常
 *
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int number1 = 5;
        int number2 = 0;
        int result = 0;


        try {
            System.out.println("try语句代码发生异常之前会被执行");
            result = number1 / number2;
            System.out.println("结果"+result);
        }catch (Exception e){
            //当发生异常以后，该做的动作
            System.out.println(e);

        }finally {
            //处理以后
            System.out.println("处理完成");

        }







    }
}
