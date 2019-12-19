package com.zcw1.demo67;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @program: 151
 * @description: Java, list不同的遍历方法,效率问题
 * @author: zhaocunwei
 * @create: 2019-12-18 15:03
 */
public class Demo67 {
    public static void main(String[] args) {
        //学生数量 80万
        int stuNum = 80 * 10000;
        //list 集合，记录所有学生的分数
        List<Integer> scores = new ArrayList<>(stuNum);
        //写入分数
        for(int i =0;i<stuNum;i++){
            scores.add(new Random().nextInt(150));
        }
        //记录开始计算时间
        long start = System.currentTimeMillis();
        System.out.println("平均分数是："+average3(scores));
        System.out.println("执行时间："+(System.currentTimeMillis()-start)+"ms");
    }
    //计算平均数

    /**
     * 平均分数是：74
     * 执行时间：26ms
     * @param list
     * @return
     */
    public static int average(List<Integer> list){
        int sum = 0 ;
        //遍历求和
        for(int i :list){
            sum +=i;
        }
        //除以人数，计算平均值
        return sum/list.size();
    }
    //第二种计算平均值

    /**
     * 平均分数是：74
     * 执行时间：17ms
     * @param list
     * @return
     */
    public static int average2(List<Integer> list){
        int sum = 0;
        //遍历求和
        for(int i = 0; i<list.size();i++){
            sum += list.get(i);
        }
        //除以人数，计算平均值
        return sum/list.size();
    }
    //第三种

    /**
     * 平均分数是：74
     * 执行时间：24ms
     * @param list
     * @return
     */
    public static int average3(List<Integer> list){
        int sum = 0;
        for(Iterator<Integer> i = list.iterator();i.hasNext();){
            sum += i.next();
        }
        //除以人数，计算平均值
        return sum/list.size();
    }
}