package com.zcw1.demo;

import java.util.Scanner;

/**
 * @program: 151
 * @description: java开发中优先使用整形池，
 *               通过包装类的valueOf生成包装实例可以显著提提高空间和时间性能
 * @author: zhaocunwei
 * @create: 2019-12-04 12:46
 */
public class demo28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int ii = input.nextInt();
            System.out.println("\n ===="+ii+"的相等判断=======");
            //两个通过new 产生的Integer对象
            Integer i = new Integer(ii);
            Integer j = new Integer(ii);
            System.out.println("new 产生的对象："+(i==j));
            //基本类型转为包装类型后比较
            i =ii;
            j=ii;
            System.out.println("基本类型转换的对象："+(i == j));
            //通过静态方法生成一个实例
            i = Integer.valueOf(ii);
            j = Integer.valueOf(ii);
            System.out.println("valueOf 产生的对象:"+(i==j));
        }
    }
}

