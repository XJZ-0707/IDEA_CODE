package com.sxt.Thread;

/**
 * 静态代理
 * 接口：
 * 1.真实角色
 * 2.代理角色
 *
 * @author 智障过人的laoxie
 * @create 2019-06-22 8:22 星期六
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();

    }
}

interface Marry{
    void happyMarry();
}
/*真实角色*/
class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("you and 嫦娥终于本月了。。。");
    }
}

//代理角色
class WeddingCompany implements Marry{
    //真实角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("闹玉兔。。。");
    }

    private void ready(){
        System.out.println("布置猪窝。。");
    }
}
