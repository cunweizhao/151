package com.zcw1.demo81;


import lombok.Data;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @program: 151
 * @description: 非稳定排序推荐使用Lsit
 * @author: zhaocunwei
 * @create: 2019-12-20 14:55
 */
public class Demo81 {
    public static void main(String[] args) {
        /**
         * 身高：175
         * 身高：180
         */
        SortedSet<Person> set = new TreeSet<>();
        //身高180cm
        set.add(new Person(180));
        //身高175CM
        set.add(new Person(175));
        for(Person person :set){
            System.out.println("身高："+ person.getHeight());
        }
        System.out.println("====================五年以后，175涨了 10CM============");
        //身高最矮的人大变身
        set.first().setHeight(185);
        //优化代码
        //set重新排序
        set = new TreeSet<>(new ArrayList<>(set));
        for(Person person :set){
            /**
             * 身高：185
             * 身高：180
             */
            System.out.println("身高："+person.getHeight());
            /**
             * 优化后
             * 身高：180
             * 身高：185
             */
        }
    }
    @Data
    static class Person implements Comparable<Person>{
      //身高
        private int height;
        public Person(int _height){
            height = _height;
        }
        @Override
        public int compareTo(Person o) {
            return height-o.height;
        }
    }
}