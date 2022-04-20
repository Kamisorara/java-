package com.lambda;

public class lambdaDemo01 {
    public static void main(String[] args) {
        //在不使用lambda表达式创建多线程的方式
        new Thread(new Runnable() {  //使用匿名内部类的方法
            @Override
            public void run() {
                System.out.println("新线程中的run方法启动了");
            }
        }).start();
        /**
         * 如果这个匿名内部是一个接口，并且只有一个抽象方法需要重写
         * 上面的方法可以优化成下面nayang
         */
        new Thread(() -> {
            System.out.println("lambda方法启动了");

        }).start();

    }

}
