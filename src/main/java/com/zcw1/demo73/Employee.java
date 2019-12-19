package com.zcw1.demo73;

import lombok.Data;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @program: 151
 * @description: 员工基本信息类
 * @author: zhaocunwei
 * @create: 2019-12-18 17:17
 */
@Data
public class Employee implements Comparable<Employee> {
    //id是根据进入公司的先后顺序编码的
    private int id;
    //姓名
    private String name;
    //职位
    private Position position;
    public Employee(int _id,String _name,Position _position){
        id = _id;
        name = _name;
        position = _position;
    }
    //按照id号排序，也就是资历的深浅排序
    @Override
    public int compareTo(Employee o) {
        return new CompareToBuilder()
                .append(id,o.id).toComparison();
    }
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}