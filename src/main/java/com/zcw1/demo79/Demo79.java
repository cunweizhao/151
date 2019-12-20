package com.zcw1.demo79;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: 151
 * @description: java：百万数据遍历，map 与list 对比速度
 * @author: zhaocunwei
 * @create: 2019-12-20 14:10
 */
public class Demo79 {
    public static void main(String[] args) {
        int size =1000000;
        List<String> list = new ArrayList<>();
        //初始化
        for(int i=0;i<size;i++){
            list.add("value"+i);
        }
        //记录开始时间，单位为纳秒
        long start =System.nanoTime();
        //开始查找
        list.contains("value"+(size-1));
        //记录结束时间
        long end = System.nanoTime();
        System.out.println("list执行时间"+(end-start)+"ns");
        //Map的查找时间
        Map<String,String> map = new HashMap<>(size);
        for(int i=0;i<size;i++){
            map.put("key"+i,"value"+i);
        }
        start = System.nanoTime();
        map.containsKey("key"+(size-1));
        end = System.nanoTime();
        System.out.println("map执行时间："+(end - start)+"ns");
    }

}