package com.zcw1.demo62;

import java.util.Arrays;

/**
 * @program: 151
 * @description: 警惕数组的潜拷贝
 * @author: zhaocunwei
 * @create: 2019-12-18 10:55
 */
public class Demo62 {
    public static void main(String[] args) {
        //气球的数量
        int ballonNum = 7;
        //第一个箱子
        Balloon[] box1 = new Balloon[ballonNum];
        //初始化第一个箱子中的气球
        for(int i = 0;i<ballonNum; i++){
            box1[i] = new Balloon(Color.values()[i],i);
        }
        //第二个箱子的气球是拷贝的第一个箱子里的
        Balloon[] box2 = Arrays.copyOf(box1,box1.length);
        //修改最后一个气球颜色
        box2[6].setColor(Color.Blue);
        //打印出第一个箱子中的气球颜色
        for(Balloon b:box1){
            System.out.println(b);
        }
    }

}