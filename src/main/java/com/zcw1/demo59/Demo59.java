package com.zcw1.demo59;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/**
 * @program: 151
 * @description: 对中文进行排序，可以适当的使用Collator类
 * @author: zhaocunwei
 * @create: 2019-12-16 15:54
 */
public class Demo59 {
    public static void main(String[] args) {
        String[] strs = {"张三(Z)","李四(L)","王五(W)"};
        //定义一个中文排序器
        Comparator c= Collator.getInstance(Locale.CHINA);
        //升序排列
        Arrays.sort(strs,c);
        int i=0;
        for(String str: strs){
            System.out.println((++i) + "、"+ str);
        }

        //////////////////////////////////////
        String [] strs2 = {"犇(B)","鑫(X)"};
        Arrays.sort(strs2,Collator.getInstance(Locale.CHINA));
        int i1 = 0;
        for(String str1 : strs2){
            System.out.println((++i1) +"、"+str1);
        }
    }
}