package com.sxt.Thread;

/**
 * 创建线程方式一：
 * 1，创建：继承Thread + 重写run
 * 2，启动：创建子类对象 + start
 * @author 智障过人的laoxie
 * @create 2019-06-21 9:12 星期五
 */
public class StartThread extends Thread{
    /*
    *线程入口
    */
    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }



    public static void main(String[] args) {
        //创建子类对象
        StartThread st = new StartThread();
        //启动
        st.start();
        for (int i=0;i<20;i++){
            System.out.println("一边coding");
        }

    }
}
