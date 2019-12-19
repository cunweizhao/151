package com.zcw1.demo44;

import java.io.Serializable;

/**
 * @program: 151
 * @description: 被拷贝的类
 * @author: zhaocunwei
 * @create: 2019-12-04 19:07
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 7181857676170404671L;
    /**
     * 对象的内部属性都是可序列化的
     * 如果有内部属性不可序列化，则会抛出序列化异常，
     */
    /**
     * 注意方法和属性的特殊修饰符
     * 比如 final,static 变量的序列化问题会引入到对象拷贝中来
     * 这点需要注意，同时transient变量（瞬态变量，不进行序列化的变量）
     * 也会影响到拷贝的效果
     */
}