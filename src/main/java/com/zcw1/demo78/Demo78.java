package com.zcw1.demo78;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: 151
 * @description: java项目中尽量让HashMap中的元素少，并简单，防止出现内存溢出
 * @author: zhaocunwei
 * @create: 2019-12-19 15:32
 */
public class Demo78 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        final Runtime rt =Runtime.getRuntime();
        //JVM终止前记录内存信息
        rt.addShutdownHook(new Thread(){
            @Override
            public void run(){
                StringBuffer sb = new StringBuffer();
                long heapMaxSize = rt.maxMemory() >> 20;
                sb.append("最大可用内存："+heapMaxSize + "M\n");
                long total = rt.totalMemory() >> 20;
                sb.append("对内存大小："+total +"M\n");
                long free = rt.freeMemory() >> 20;
                sb.append("空闲内存："+free +"M");
                System.out.println(sb);
            }
        });
        /**
         * 最大可用内存：3612M
         * 对内存大小：243M
         * 空闲内存：173M
         */
        //放入近40万键值对
//        for(int i = 0 ; i<393217;i++){
//            map.put("key" + i,"value"+i);
//        }
        /**
         * 最大可用内存：3612M
         * 对内存大小：243M
         * 空闲内存：185M
         */
        //List
        List<String> list = new ArrayList<>();
        /**Runtime增加的钩子函数相同，不再赘述*/
        //放入40万同样的字符串
        for(int i = 0;i<400000;i++){
            list.add("key"+i);
            list.add("value"+i);
        }
    }

}