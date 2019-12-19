package com.zcw1.demo45;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 151
 * @description: java对象覆写Equals方法时添加trim()方法时错误问题
 * @author: zhaocunwei
 * @create: 2019-12-04 19:30
 */
@Data
public class Person {
    private String name;
    public Person (String _name){
        name = _name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person)obj;
            return name.equalsIgnoreCase(p.getName().trim());
        }
        return false;
    }
    public static void main(String[] args){
       /* Person p1 = new Person("张三");
        *//**
         * 空格，它违背了equals方法的自反性原则：
         * 对于任何非用x.x.equals(x)应该返回true.
         * 只要把trim()去掉即可
         *//*
        Person p2 = new Person("张三 ");
        List<Person> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);
        System.out.println("列表中是否包含张三:"+l.contains(p1));
        System.out.println("列表中是否包含张三:"+l.contains(p2));*/


            String a = "牵头合伙人合作合伙人";
            if(a.indexOf("牵头") !=-1) {
                System.out.print(a);
            }
            if(a.indexOf("合伙人") !=-1) {
                System.out.print(a);
            }

    }
}