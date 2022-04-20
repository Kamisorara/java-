package com.lambda;

import java.util.function.IntBinaryOperator;

public class lambdaDemo2 {
    /**
     * 练习匿名内部类的使用
     */
    public static void main(String[] args) {
        int i = calculateNum(new IntBinaryOperator() { //new IntBinaryOperator()取重写里面的方法
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(i);

        /**
         * 下面是使用lambda表达式表达的j结果
         * 总之lambda表达式需要取关注的就是参数列表，方法体
         */
        int i1 = calculateNum((a, b) -> {
            return a + b;
        });
        System.out.println(i1);
    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 1;
        int b = 1;
        return operator.applyAsInt(a, b);
    }

}
