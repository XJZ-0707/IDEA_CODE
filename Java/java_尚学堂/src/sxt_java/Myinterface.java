package sxt_java;

/**
 * @author 智障过人的laoxie
 * @create 2019-02-26 15:36 星期二
 */
public interface Myinterface {
    /*public static final */int MAX_AGE=100;
    /*public static final */void test01();
}

class Myclass implements Myinterface{
    @Override
    public void test01() {
        System.out.println("skjk");
    }
}
