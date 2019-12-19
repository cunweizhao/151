package com.zcw1.demo55;

/**
 * @program: 151
 * @description: 在“+”表达式中，String字符串具有最高优先级
 * @author: zhaocunwei
 * @create: 2019-12-16 15:22
 */
public class Demo55 {
    /**
     * java 对加号的处理机制：在使用加号进行计算的表达式中，
     * 只要遇到String字符串，则所有的数据都会转换为String类型进行拼接，
     * 如果是原始数据，则直接拼接，如果是对象，则调用toString 方法的返回值然后拼接
     * @param args
     */
    public static void main(String[] args) {
        String str1 = 1 + 2 + "apples";
        String str2 = "apples:" + 1 + 2;
        System.out.println(str1);
        System.out.println("===");
        System.out.println(str2);
    }
}