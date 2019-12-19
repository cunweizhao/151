package com.zcw1.demo46;

import lombok.Data;

/**
 * @program: 151
 * @description: 注意：在覆写equals时建议使用getClass进行判断，而不要使用instanceof
 * @author: zhaocunwei
 * @create: 2019-12-16 12:29
 */
@Data
public class Employee  extends Person{
    private int id;
    public Employee(String _name,int _id) {
        super(_name);
        id = _id;
    }
    @Override
    public boolean equals(Object object){
        /*if(object instanceof Employee){
            Employee e = (Employee) object;
            return super.equals(object) && e.getId() == id;
        }*/
        //修改代码：
        if( object !=null && object.getClass() == this.getClass()){
            Employee employee =(Employee) object;
            return super.equals(object) && employee.getId() == id;
        }
        return false;
    }

    public static void main(String[] args){
        Employee e1 = new Employee("张三",100);
        Employee e2 = new Employee("张三",10001);
        Person p1 = new Person("张三");
        System.out.println(p1.equals(e1));
        System.out.println(p1.equals(e2));
        System.out.println(e1.equals(e2));
    }
}