package com.zcw1.demo70;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 151
 * @description: java判断两个列表是否相等
 * @author: zhaocunwei
 * @create: 2019-12-18 16:06
 */
public class Demo70 {
    public static void main(String[] args) {
        //定义一个包含两个字符串的列表
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");
        //构造一个包含c列表的字符串列表
        List<String> c1 = new ArrayList<>(c);
        //subList 生成与c相同的列表
        List<String> c2 = c.subList(0,c.size());
        //c2 增加一个元素
        c2.add("c");
        System.out.println("c == c1?"+c.equals(c1));
        System.out.println("c == c2?"+c.equals(c2));

        System.out.println("=========================");
        String str ="AB";
        String str1 = new String(str);
        String str2 = str.substring(0) +"c";
        System.out.println("str == str1?"+str1.equals(str1));
        System.out.println("str == str2?"+str.equals(str2));

    }
}