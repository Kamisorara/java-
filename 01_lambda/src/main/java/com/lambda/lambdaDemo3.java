package com.lambda;

import java.util.function.IntConsumer;

public class lambdaDemo3 {
    /**
     * 继续练习lambda表达式的使用
     */
    public static void main(String[] args) {
        foreachArr(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });
        //写成lambda表达式的结果
        foreachArr((int value) -> {
            System.out.println(value);
        });
    }

    public static void foreachArr(IntConsumer consumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i :
                arr) {
            consumer.accept(i);

        }
    }
    /**
     * lambda其实本质就是对匿名内部类的一种优化
     */
}
