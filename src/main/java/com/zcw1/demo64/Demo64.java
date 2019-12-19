package com.zcw1.demo64;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * @program: 151
 * @description: Java查找数组中最大值
 * @author: zhaocunwei
 * @create: 2019-12-18 11:46
 */
public class Demo64 {
    /**
     * 最值计算使用集合最简单，使用数组性能最优
     */
    //自行实现，快速查找最大值
    public static int max(int [] data){
        int max =data[0];
        for(int i:data){
            max = max > i ? max : i;
        }
        return max;
    }

    /**
     * 如果数据量少于 1万，两者基本上没有差别
     * @param data
     * @return
     */
    //先排序，后取值
    public static int max2(int [] data){
        //先排序
        Arrays.sort(data.clone());
        //然后取值
        return data[data.length -1];
    }
    //查找几次于最大值得元素
    public static int getSecond(Integer [] data){
        //转换为列表
        List<Integer> dataList = Arrays.asList(data);
        //转换为TreeSet 删除重复元素并升序排列
        TreeSet<Integer> ts = new TreeSet<>(dataList);
        //取值比最大值小的最大值，也就是老二
        return ts.lower(ts.last());
    }
}