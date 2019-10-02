package sxt_java;

/**
 * @author 智障过人的laoxie
 * @create 2019-01-31 22:46 星期四
 * 构造方法调用顺序：
 * 构造方法第一句总是：super（）来调用父类对应的构造方法。所以，流程是：先向上追溯到Object，然后在依次乡下执行类的初始化块和构造方法 ，
 * 直到当前子类为止。
 */
public class Super02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象、、、");
        new ChildClass2();
    }
}

class FatherClass2{
    public FatherClass2(){
        super();
        System.out.println("创建FatherClass");
    }
}
class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        super();
        System.out.println("创建ChildClass");
    }
}