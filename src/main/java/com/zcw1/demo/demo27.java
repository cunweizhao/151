package com.zcw1.demo;

/**
 * @program: 151
 * @description: 谨慎包装类型的大小比较
 * @author: zhaocunwei
 * @create: 2019-12-03 10:28
 */
public class demo27 {
    public static void main(String[] args){
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        compare(i,j);

    }
    //比较两个包装对象大小
    public static void compare(Integer i,Integer j){
        System.out.println(i == j);
        System.out.println(i >j);
        System.out.println(i<j);
    }
    /**
     * 注意 在java中 == 是用来判断两个操作数是否有相等的关系的，
     * 如果是基本类型则判断值是否相等，如果是对象则判断是否是一个对象的两个引用，
     * 也就是地址是否相等，
     * 在java中 > < 用来判断两个数字类型的大小关系，
     * 注意只能是数字类型的判断，对于Integer包装类型，是根据其intValue()方法返回值
     * 也就是其相应的基本类型进行比较，其他包装类型是根据相应的value值来比较的
     */
}