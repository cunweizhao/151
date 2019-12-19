package com.zcw1.demo77;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @program: 151
 * @description: java伪抽奖程序
 * @author: zhaocunwei
 * @create: 2019-12-19 14:25
 */
public class Demo77Shuffle {
    public static void main(String[] args) {
        int tagCloudNum =10;
        List<Integer> tagClouds = new ArrayList<>(tagCloudNum);
        //初始化标签云，一般是从数据库读入，省略
        Random rand = new Random();

        for(int i =0;i<tagCloudNum;i++){
            //取得随机位置
            int randomPosition = rand.nextInt(tagCloudNum);
            //当前元素与随机元素交换
//            String temp = tagClouds.get(i);
//            tagClouds.set(i,tagClouds.get(randomPosition));
//            tagClouds.set(randomPosition,temp);
            //当前元素与随机元素交换
            //Collections.swap(tagClouds,i,randomPosition);
            tagClouds.add(randomPosition);
        }
        //打乱顺序
        Collections.shuffle(tagClouds);
        System.out.println(tagClouds);
    }
}