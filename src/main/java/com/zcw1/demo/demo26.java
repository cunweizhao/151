package com.zcw1.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 151
 * @description: 提防包装类型的null值
 * @author: zhaocunwei
 * @create: 2019-12-03 10:16
 */
public class demo26 {
    //计算list中所有元素之和
    public static int f(List<Integer> list){
        int count = 0;
        for(Integer i : list){
            count +=(i !=null) ?i:0;
        }
        return count;
    }

    /**
     * 包装类型参与for循环运算时，要做null值校验，
     * 程序在for循环中，隐含了一个拆箱的过程，在此过程中包装类型转换为了基本
     * 类型，我们知道，拆箱过程是通过调用包装对象的intValue方法实现的，
     * 由于包装对象时null值，访问其intValue 方法报空指针异常
     * @param args
     */
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(f(list));
    }
}
