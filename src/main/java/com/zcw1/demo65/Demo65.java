package com.zcw1.demo65;

import java.util.Arrays;
import java.util.List;

/**
 * @program: 151
 * @description: java基本类型数组转换成列表时注意事项
 * @author: zhaocunwei
 * @create: 2019-12-18 12:02
 */
public class Demo65 {
    public static void main(String [] args){
        int [] data1 ={1,2,3,4,5};
        List list1 = Arrays.asList(data1);
        System.out.println("列表中的元素数量是:"+list1.size());

        System.out.println("================================");
        int [] data2 ={1,2,3,4,5};
        List list2 = Arrays.asList(data2);
        System.out.println("元素类型："+ list1.get(0).getClass());
        System.out.println("前后是否相等:"+data2.equals(list2.get(0)));
        System.out.println("==================================");
        Integer [] data3 = {1,2,3,4,5};
        List list3 = Arrays.asList(data3);
        System.out.println("列表中的元素数量是："+list3.size());

        /**
         * 总结：原始类型数组不能作为，asList的输入参数，否则会引起程序逻辑混乱
         */
    }

}