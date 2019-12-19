package com.zcw1.demo41;

/**
 * @program: 151
 * @description: 儿子
 * @author: zhaocunwei
 * @create: 2019-12-04 18:24
 */
public class Son extends FatherImpl implements Mother {

    @Override
    public int strong(){
        //儿子比父亲还强壮
        return super.strong() +1;
    }
    @Override
    public int kind() {
        return new MotherSpecial().kind();
    }

    /**
     * 内部类可以继承一个与外部类无关的类，
     * 保证了内部类的独立性，正是基于这一点，
     * 多重继承才会成为可能。
     */
    private class MotherSpecial extends MotherImpl{
        public int kind(){
            //儿子温柔指数降低了
            return super.kind() -1;
        }
    }
}
























