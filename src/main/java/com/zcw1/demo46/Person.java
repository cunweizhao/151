package com.zcw1.demo46;

import com.flipthebird.gwthashcodeequals.HashCodeBuilder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: 151
 * @description: 测试类
 * @author: zhaocunwei
 * @create: 2019-12-16 12:13
 */
@Data
public class Person {

    private String name;
    public Person (String _name){
        name = _name;
    }
    @Override
    public boolean equals(Object obj){
       /* if(obj instanceof Person){
            Person p = (Person)obj;
            return name.equalsIgnoreCase(p.getName().trim());
        }*/
       //修改代码：
        /*if(obj instanceof Person){
            Person p = (Person)obj;
            if(p.getName() == null || name == null){
                return false;
            }else {
                return name.equalsIgnoreCase(p.getName());
            }
        }*/
        if(obj !=null && obj.getClass() == this.getClass()){
            Person p =(Person)obj;
            if(p.getName() == null || name == null){
                return false;
            }else {
                return name.equalsIgnoreCase(p.getName());
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return new HashCodeBuilder().append(name).toHashCode();
    }
    public static void main(String[] args){
//        Person p1 = new Person("张三");
//        Person p2 = new Person(null);
//        List<Person> l = new ArrayList<>();
//        l.add(p1);
//        l.add(p2);
//        System.out.println("列表中是否包含张三："+l.contains(p1));
//        System.out.println("列表中是否包含张三："+l.contains(p2));
        /**
         * 覆写equals 方法必须覆写hashCode方法
         */
        //Person类的实例作为Map的key
        Map<Person,Object> map = new HashMap<Person,Object>(){
            {
                put(new Person("张三"),new Object());
            }
        };
        //Person类的实例作为list的元素
        List<Person> list = new ArrayList<Person>(){
            {
                add(new Person("张三"));
            }
        };
        //列表中是否包含
        boolean b1 = list.contains(new Person("张三"));
        System.out.println("列表中是否包含："+b1);
        //Map 中是否包含
        boolean b2 = map.containsKey(new Person("张三"));
        System.out.println("Map 中是否包含："+b2);
    }
}