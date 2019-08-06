package com.xuxi;

/**
 * Created by xuxi on 2019/1/7.
 */

/**
 *  如果对基本数据类型执行算术运算或按位运算，大家会发现，只要类型比int小
 *  (即char、byte或short)，那么在运算之前，这些值会自动转换成int。这样一来
 *  ，最终生成的结果就是int类型。如果想把结果赋值给较小的类型，就必须使用类型转换
 *  (既然把结果赋给了较小的类型，就可能出现信息丢失)。通常，表达式中出现的最大的
 *  数据类型决定了表达式最终结果的数据类型。如果将一个float值与一个double值相乘
 *  ，结果就是double，如果将一个int和一个long值相加，则结果位long。
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("Math.round(above):"+Math.round(above));
        System.out.println("Math.round(below):"+Math.round(below));
        System.out.println("Math.round(fabove):"+Math.round(fabove));
        System.out.println("Math.round(fbelow):"+Math.round(fbelow));
    }
}
