package com.zcw1.demo;

/**
 * @program: 151
 * @description: java 统计一个类的实例数量
 * @author: zhaocunwei
 * @create: 2019-12-04 14:36
 */
public class Demo37 {
    public static void main(String[] args){
        new Base();
        new Base("");
        new Base(0);
        System.out.println("实例对象数量："+Base.getNumOfObjects());

    }
}