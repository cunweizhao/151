package com.zcw1.demo52;

/**
 * @program: 151
 * @description: 推荐使用String直接量赋值
 * @author: zhaocunwei
 * @create: 2019-12-16 14:35
 */
public class Demo52 {
    public static void main(String[] args){
        String str1 ="中国";
        String str2 =" 中国 ";
        String str3 = new String("中国");
        String str4 = str3.intern();
        //两个直接量是否相等
        boolean b1 =(str1 == str2);
        //直接量和对象是否相等
        boolean b2 =(str1 == str3);
        //经过intern 处理后的对象与直接是否相等
        boolean b3 =(str1 == str4);
        System.out.println(b2);
        System.out.println("=====");
        System.out.println(b1);
    }
}