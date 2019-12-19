package com.zcw1.demo71;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: 151
 * @description: 一个列表有100个元素，现在要删除索引位置为20-30的元素
 * @author: zhaocunwei
 * @create: 2019-12-18 16:29
 */
public class Demo71 {
    public static void main(String[] args) {
        //初始化固定长度，不可变列表
        List<Integer> initData = Collections.nCopies(100,0);
        //转换为可变列表
        List<Integer> list = new ArrayList<>(initData);
        //遍历，删除符合条件的元素
        for(int i=0;i<list.size();i++){
            if(i>=20 && i<30){
                list.remove(i);
            }
        }
//        for(int i = 20; i<30;i++){
//            if(i<list.size()){
//                list.remove(i);
//            }
//        }

        //删除指定范围的元素
        list.subList(20,30).clear();
    }
}