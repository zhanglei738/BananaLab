package com.littlewhite.lab.lab1;


/**
 * 给定一个Integer 数组，计算这个数组的和
 */

public abstract class CalculateSum {

    public abstract long sum(Integer... numbers);

    public void test(CalculateSum calculateSum){
        Integer[] test = new Integer[2];
        Integer sum_ = 0;
        test[0] = 1;
        test[1] = 2;
        Integer len = test.length;
        for (int i = 0;i<len;i++){
            sum_ += test[i];
        }
        System.out.print(sum_);
    }
}
