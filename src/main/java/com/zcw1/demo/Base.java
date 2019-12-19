package com.zcw1.demo;

/**
 * @program: 151
 * @description: 目标类
 * @author: zhaocunwei
 * @create: 2019-12-04 14:37
 */
public class Base {
     //对象计数器
    private static int numOfObJects = 0;
    {
        //构造代码块，计算产生对象数量
        numOfObJects ++;
    }
    public Base(){

    }
    //有参构造调用无参构造
    public Base(String _str){
        this();
    }
    //有参构造不调用其他构造
    public Base(int _i){

    }
    //返回一个JVM中，创建了多少个实例对象
    public static int getNumOfObjects(){
        return numOfObJects;
    }
}