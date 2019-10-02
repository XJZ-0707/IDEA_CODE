package com.sxt.Thread;

/**
 * Lambda表达式，简化线程的使用（用一次）
 * @author 智障过人的laoxie
 * @create 2019-06-21 9:12 星期五
 */
public class LambdaThread {
    static class Test implements Runnable{
    //静态内部类
    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
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
        new Thread(new Test()).start();

        class Test2 implements Runnable {
            //局部内部类
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边听歌");
                }
            }
        }

        new Thread(new Test2()).start();

        //匿名内部类，必须借助接口或者父类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边听歌");
                }
            }
        }).start();

        //jdk8简化Lambda表达式
        new Thread(()-> {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边听歌");
                }
        }).start();


    }
}
