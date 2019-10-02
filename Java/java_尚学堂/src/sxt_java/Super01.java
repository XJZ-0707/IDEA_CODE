package sxt_java;

/**
 * @author 智障过人的laoxie
 * @create 2019-01-31 22:24 星期四
 * super是直接父类对象的引用。可以直接通过super来访问父类中被子类覆盖的方法或属性。
 * 使用super调用普通方法。语句没有位置限制，可以在子类中随便调用
 * 若是构造方法的第一行代码没有显式的调用super（...）或者this(...)；那么java默认都会调用super（），含义是调用父类的无参数构造方法。
 * 这里的super（）可以省略。
 */
public class Super01 {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass{
    public int value;
    public void f(){
        value = 100;
        System.out.println("sxt_java.FatherClass.value=" + value);
    }
}

class ChildClass extends FatherClass{
    public int value;
    public void f(){
        super.f();//调用父类对象的普通方法
        value = 200;
        System.out.println("sxt_java.ChildClass.value = "+ value);
        System.out.println(value);
        System.out.println(super.value);
    }
}
