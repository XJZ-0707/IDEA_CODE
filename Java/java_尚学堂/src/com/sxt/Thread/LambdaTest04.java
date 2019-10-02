package com.sxt.Thread;

/**
 * 202集
 * Lambda推导 + 参数 +返回值
 * @author 智障过人的laoxie
 * @create 2019-06-22 9:43 星期六
 */
public class LambdaTest04 {

    public static void main(String[] args) {
        new Thread(()->{
            for (int i=0;i<20;i++){
                System.out.println("一边学习Lambda");
            }

        }).start();

        new Thread(()-> System.out.println("一边崩溃Lambda"))
                .start();
    }
}
