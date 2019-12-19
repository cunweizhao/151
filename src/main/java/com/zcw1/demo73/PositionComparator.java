package com.zcw1.demo73;

import java.util.Comparator;

/**
 * @program: 151
 * @description: 按照职位进行排序
 * @author: zhaocunwei
 * @create: 2019-12-18 17:57
 */
public class PositionComparator implements Comparator<Employee> {
    //按照职位降序排列
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getPosition().compareTo(o2.getPosition());
    }
}