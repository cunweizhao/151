package com.zcw1.demo;

/**
 * @program: 151
 * @description: java中构造函数与构造代码块加载顺序
 * @author: zhaocunwei
 * @create: 2019-12-04 14:15
 */
public class Demo36 {
    {
        //构造代码块
        System.out.println("执行构造代码块");
    }
    public Demo36(){
        System.out.println("执行构造代码块");
        System.out.println("执行无参构造");
    }
    public Demo36(String _str){
        System.out.println("执行构造代码块");
        System.out.println("执行有参构造");
    }

    public static void main(String[] args) {
        Demo36 demo36 = new Demo36();

    }
}

