package com.company;

/**
 * 访问控制权限
 *  我们之前接触过：pulic、private、default
 *
 *  private：可以定义方法，属性，定义的方法和属性不能被类的外部所看到
 *  defalut：可以在本包中的任意地方访问
 *  protected：保护，不同包的非子类不可以访问
 *  public：公共的，都可以访问，不受任何限制
 *
 *
 *   范围        priviate    default    protected     public
 * 同一类中         可以        可以        可以          可以
 *同一包中的类                  可以        可以          可以
 *不同包的子类                              可以          可以
 *其他包中的类                                           可以
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
