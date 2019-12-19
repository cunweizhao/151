package com.zcw1.demo66;

import java.util.Arrays;
import java.util.List;

/**
 * @program: 151
 * @description: asList方法产生的List对象不可更改
 * @author: zhaocunwei
 * @create: 2019-12-18 14:33
 */
public class Demo66 {
    public static void main(String[] args){
        //五天工作制
        Week[] workDays ={Week.Mon,Week.Tue,Week.Wed,Week.Thu,Week.Fri};
        //转换为列表
        List<Week> list = Arrays.asList(workDays);
        //增加周六也为工作日
        list.add(Week.Sat);
        /**工作日开始干活*/
    }
    /**
     * 主要原因是asLsit返回的是一个长度不可变得列表，数组是多长，转换成的列表也就是多长，换句话说
     * 此处的列表只是数组的一个外壳，不再保持列表动态变长的特性
     */
}