package com.sxt.Thread;

/**
 * 创建线程方式二：
 * 1，创建：实现Runnable + 重写run
 * 2，启动：创建实现类对象 +Thread对象 + start
 *
 * 推荐：避免单继承的局限性，优先使用接口
 * 方便共享资源
 * @author 智障过人的laoxie
 * @create 2019-06-21 9:12 星期五
 */
public class StartRunn implements Runnable {

    //线程入口

    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
       /* //创建实现类对象
        StartRunn sr = new StartRunn();
        //创建代理类对象
        Thread t = new Thread(sr);
        //启动
        t.start();*/
        //把上面三句话合为一句
        //如果对象只用一次
        new Thread(new StartRunn()).start();



    }
}
