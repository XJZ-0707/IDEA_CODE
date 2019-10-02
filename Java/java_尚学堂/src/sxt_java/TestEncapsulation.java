package sxt_java;

/**
 * @author 智障过人的laoxie
 * @create 2019-02-03 0:35 星期日
 * 四种访问控制符：
 * 1.private：表示私有，只有自己类能访问
 * 2.default：表示没有修饰符，只有同一个包的类能访问
 * 3.protect：表示可以被同一个包的类以及其他包中的子类访问
 * 4.public: 表示可以被该项目的所有包中的所有类访问
 *
 * 类的属性是处理：
 * 1.一般使用private访问权限
 * 2.提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值与读取操作（注意boolean变量的get方法是is开头！）
 * 3.一些只用于本类的辅助性方法可以用private修饰，希望其他类调用的方法用public修饰
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.sayage1();
       //h.age = 10;

        TestEncapsulation2 b = new TestEncapsulation2();
        b.setAge(30);
        b.getAge();
    }
}

class Human{
    private int age1=10;
    void sayage1(){
        System.out.println(age1);
    }
}

class Boy extends Human{
    void syahello(){
        //System.out.println(age);//子类无法父类的属性和方法

    }
}

