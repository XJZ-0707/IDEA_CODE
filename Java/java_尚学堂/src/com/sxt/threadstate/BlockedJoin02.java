package com.sxt.threadstate;


/**
 * join:合并线程，插队线程
 *
 * @author 智障过人的laoxie
 * @create 2019-06-22 17:03 星期六
 */
public class BlockedJoin02 {
    public static void main(String[] args) {
        System.out.println("爸爸和儿子买烟的故事");
        new Thread(new Father()).start();
    }
}

class Father extends Thread{
    @Override
    public void run(){
        System.out.println("想抽烟，发现没了");
        System.out.println("让儿子去买中华");
        Thread t = new Thread(new Son());
        t.start();
        try {
            //fathet被阻塞
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("孩子走丢了，老爸出去找孩子了。。。");
        }
        System.out.println("老爸接过烟，把零钱给儿子了。。。");

    }
}

class Son extends Thread{
    @Override
    public void run(){
        System.out.println("接过老爸的钱出去了。。。");
        System.out.println("路边有个游戏厅，玩了10秒");
        for (int i=0;i<10;i++){
            System.out.println(i+"秒过去了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("赶紧买烟去。。。");
        System.out.println("手拿一包中华回家了。。。");

    }
}