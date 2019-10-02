package com.sxt.threadstate;

/**
 * sleep模拟网络延迟，放大了发生问题的可能性
 *
 * @author 智障过人的laoxie
 * @create 2019-06-22 15:47 星期六
 */
public class BlockSleep {
        public static void main(String[] args) {
            //一份资源
            com.sxt.Thread.Web12306 web = new com.sxt.Thread.Web12306();
            System.out.println(Thread.currentThread().getName());
            //多个代理
            new Thread(web,"码农").start();
            new Thread(web,"马处").start();
            new Thread(web,"玛丽").start();


        }
}

class Web12306 implements Runnable {
    /*票数*/
    private int tickeNums = 99;

    @Override
    public void run() {
        while (true){
            if (tickeNums<0){
                break;
            }
            //模拟延迟
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+tickeNums--);
        }
    }


}
