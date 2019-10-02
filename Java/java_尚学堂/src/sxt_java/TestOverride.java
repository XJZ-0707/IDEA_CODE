package sxt_java;

/**
 * 重写Override/覆盖
 * @author 智障过人的laoxie
 * @create 2019-01-29 23:27 星期二
 * 注意三点：
 * 1.“==” 方法名，形参列表相同
 * 2.“<=” 返回值类型和声明异常类型，子类小于等于父类
 * 3.“>=” 访问权限，子类大于等于父类
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        Vehicle v = new Vehicle();
        h.run();
        h.stop();
        v.run();
        h.share();
    }
}

class Vehicle{
    public void run(){
        System.out.println("跑!!");
    }
    public void stop(){
        System.out.println("停止！");
    }
}

class Horse extends Vehicle{
    public void run(){
        System.out.println("四蹄翻飞，的得得得、、");
    }
    public void stop(){
    }
    public void share(){
        System.out.println("马儿停止！");
        System.out.println("分享！");
    }
}
