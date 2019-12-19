package com.zcw1.demo62;

import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @program: 151
 * @description: 气球
 * @author: zhaocunwei
 * @create: 2019-12-18 11:07
 */
@Data
public class Balloon {
    //编号
    private int id;
    //颜色
    private Color color;
    public Balloon(Color _color,int _id){
        color = _color;
        id = _id;
    }
    public String toString(){
        return new ToStringBuilder(this)
                .append("编号",id)
                .append("颜色",color)
                .toString();
    }
}