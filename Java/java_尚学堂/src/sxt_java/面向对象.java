package sxt_java;

/**
 * @author laoxie
 * @reate 2019-01-23 22:17
 */
public class 面向对象 {
    int id;
    String name;
    void stu(){
        System.out.println("在学习！");
    }
    void stu2(){
        System.out.println("学习是不可能的！");
    }
    public static void main(String[] args){
        面向对象 s = new 面向对象();
        s.stu();
        s.stu2();
        int d = s.id=33;
        System.out.println(d);
        System.out.println(Math.PI);
    }
}







