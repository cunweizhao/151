package com.zcw1.demo69;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @program: 151
 * @description: java 判断集合是否相等时只须关注元素是否相等即可
 * @author: zhaocunwei
 * @create: 2019-12-18 15:55
 */
public class Demo69 {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("A");

        Vector<String> strs2 = new Vector<>();
        strs2.add("A");
        System.out.println(strs.equals(strs2));
    }
}