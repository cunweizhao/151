package com.zcw1.demo80;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 151
 * @description: 多线程下时间Vector或HashTable
 * @author: zhaocunwei
 * @create: 2019-12-20 14:28
 */
public class Demo80 {
   public static void main(String [] args){
       /*//火车票列表
       final List<String> tickets = new ArrayList<String>();
       //初始化票据池
       for(int i = 0; i<100000;i++){
           tickets.add("火车票"+i);
       }
       //退票
       Thread returnThread = new Thread(){
           public void run(){
               while(true){
                   tickets.add("车票"+new Random().nextInt());
               }
           }
       };
       //售票
       Thread saleThread  = new Thread(){
         public void   run(){
             for(String ticket :tickets){
                 tickets.remove(ticket);
             }
         }
       };
       //启动退票线程
       returnThread.start();
       //启动售票线程
       saleThread.start();*/
       //============================代码修改============
       //火车票列表
       final List<String> tickets = new ArrayList<>();
//       final List<String> tickets = new Vector<>();
       //初始化票据池
       for(int i=0; i<100000;i++){
           tickets.add("火车票"+i);
       }
       //10个 窗口售票
       for(int i =0;i<10;i++){
           new Thread(){
               public void run(){
                   while(true){
                       System.out.println(Thread.currentThread().getId()+"-------"+tickets.remove(0));
                   }
               }
           }.start();
       }
   }
}