package com.sxt.threadstate;

/**
 * yield礼让线程，暂停线程直接进入就绪状态
 *
 * @author 智障过人的laoxie
 * @create 2019-06-22 16:25 星期六
 */
public class YieldDemo01 {
    public static void main(String[] args) {
        MyYield my  = new MyYield();
        new Thread(my,"a").start();
        new Thread(my,"b").start();

    }
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->start");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"-->end");

    }
}