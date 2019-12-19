package com.zcw1.demo;

import lombok.Data;

/**
 * @program: 151
 * @description: java使用静态内部类提高封装性
 * @author: zhaocunwei
 * @create: 2019-12-04 15:17
 */
@Data
public class Person {
    //姓名
    private String name;
    //家庭
    private Home home;
    //构造函数设置属性值
    public Person(String _name){
        name = _name;
    }
    @Data
    public static class Home{
        //家庭地址
        private String address;
        //家庭电话
        private String tel;
        public Home(String _address,String _tel){
            address = _address;
            tel = _tel;
        }
    }
    public static void main(String[] args){
        //定义张三这个人
        Person person = new Person("张三");
        //设置张三的家庭信息
        person.setHome(new Person.Home("上海","021"));
        System.out.println(person);
    }
    /**
     * 提高封装性
     * 静态内部类是外部类的子行为或子属性，两者直接保持着一定的关系，
     * 提高代码的可读性：
     * 相关联的代码放到一起，
     */
    /**
     * 静态内部类与普通内部类区别：
     * 静态内部类不持有外部类的引用
     * 在普通内部类中，我们可以直接访问外部类的属性、方法、
     * 即使private类型也可以访问，这是因为内部类持有一个外部类
     * 的引用，可以自用访问，
     * 而静态内部类则只可以访问外部类的静态方法和静态属性。
     * 如果是private权限也能访问，这是由其代码位置所决定的，
     * 其他则不能访问。
     * 静态内部类不依赖外部类：
     * 普通内部类与外部类之间是相互依赖的关系，内部类实例不能脱离外部类实例。
     * 也就是说它们会同生同死。一起声明，一起被垃圾回收器回收。
     * 而静态内部类是可以独立存在的，即使外部类消亡了，静态内部类还是可以存在的。
     * 普通内部类不能声明static的方法和变量
     * 普通内部类不能声明static的方法和变量，注意这里说的是变量，常量
     * 也就是final static 修饰的属性，还是可以的，而静态内部类形似外部类，没有任何限制。
     */
}