package com.sxt.threadstate;

/**
 * 观察线程的状态
 * @author 智障过人的laoxie
 * @create 2019-06-22 17:23 星期六
 */
public class Allstate {
    public static void main(String[] args) {
        Thread t = new Thread(()->
        {
            for (int i=0;i<5;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("....");
        });

        //Thread t = new Thread(()-> System.out.println("...."));
        //观察状态
        Thread.State state = t.getState();
        //NEW
        System.out.println(state);

        t.start();
        state = t.getState();
        //RUNNABLE
        System.out.println(state);

        while (state!=Thread.State.TERMINATED){

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //TIMED_WAITING
            state = t.getState();
            System.out.println(state);
        }
    }
}
