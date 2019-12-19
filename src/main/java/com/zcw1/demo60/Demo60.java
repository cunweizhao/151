package com.zcw1.demo60;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: 151
 * @description: java性能要求较高的场景中使用数组替代集合
 * @author: zhaocunwei
 * @create: 2019-12-16 16:17
 */
public class Demo60 {
    //对数组求和
    public static int sum(int [] datas){
        int sum = 0;
        for(int i=0;i<datas.length;i++){
            sum += datas[i];
        }
        return sum;
    }
    //队列表求和计算
    public static int sum1(List<Integer>datas){
        int sum =0;
        for(int i=0;i<datas.size();i++){
            sum +=datas.get(i);
        }
        return  sum;
    }

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日：HH:mm:ss---SSS(毫秒)");
        String format = date.format(new Date(System.currentTimeMillis()));

        int [] datas1 ={10,20,30,40,50,60};
        System.out.println("当前时间："+format);
        System.out.println(sum(datas1));
        System.out.println("当前时间："+format);
        List<Integer> datas = new ArrayList<>();
        datas.add(10);
        datas.add(20);
        datas.add(30);
        datas.add(40);
        datas.add(50);
        datas.add(60);
        System.out.println(sum1(datas));
        System.out.println("当前时间："+format);
    }
}