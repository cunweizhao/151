package com.zcw1.demo72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: 151
 * @description: java生成字列表后不要再操作原列表
 * @author: zhaocunwei
 * @create: 2019-12-18 16:53
 */
public class Demo72 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> subList = list.subList(0,2);
        //原字符串增加一个元素
        //list.add("D");
        /**
         * 代码修改
         */
        //设置列表为只读状态
        list = Collections.unmodifiableList(list);
        //对list进行只读操作
        System.out.println("原列表长度："+list.size());
        System.out.println("子列表长度："+subList.size());
    }
}