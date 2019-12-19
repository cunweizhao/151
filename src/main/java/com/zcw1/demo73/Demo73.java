package com.zcw1.demo73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: 151
 * @description: Java:使用Comparator进行数据排序
 * @author: zhaocunwei
 * @create: 2019-12-18 17:17
 */
public class Demo73 {
    /**
     * Comparable接口可以作为实现类的默认排序法，
     * Comparator接口则是一个类的扩展排序工具，
     * @param args
     */
    public static void main(String[] args) {
        List<Employee> list  = new ArrayList<>(5);
        //一个老板
        list.add(new Employee(1001,"张三", Position.Boss));
        //两个经理
        list.add(new Employee(1006,"赵七",Position.Manager));
        list.add(new Employee(1003,"王五",Position.Manager));
        //两个职员
        list.add(new Employee(1002,"李四",Position.Staff));
        list.add(new Employee(1005,"马六",Position.Staff));
        //按照id排序，也就是按照资历深浅排序
        Collections.sort(list);
        System.out.println("按照id号进行升序");
        for(Employee e:list){

            System.out.println(e);
        }
    }
}