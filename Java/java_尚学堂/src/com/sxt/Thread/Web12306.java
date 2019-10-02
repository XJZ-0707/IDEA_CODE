package com.sxt.Thread;

/**
 * 资源共享，并发（线程安全）
 * @author 智障过人的laoxie
 * @create 2019-06-21 16:56 星期五
 */
public class Web12306 implements Runnable {
    /*票数*/
    private int tickeNums = 99;

    @Override
    public void run() {
        while (true){
            if (tickeNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+tickeNums--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web,"码农").start();
        new Thread(web,"马处").start();
        new Thread(web,"玛丽").start();


    }
}
