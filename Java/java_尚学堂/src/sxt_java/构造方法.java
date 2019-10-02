package sxt_java;

/**
 * @author laoxie
 * @reate 2019-01-27 18:57
 * 要点：
 * 1.通过new关键字调用
 * 2.构造器虽然有返回值，但是不能定义返回值的类型（返回值的类型可定是本类），不能再构造器里面使用return返回某个值。
 * 3.如果我们没有定义构造器，则编译器会自动定义一个无参的构造函数。如果已定义则编译器不会自动添加！
 * 4.构造器的方法名必须和类名一样
 * */
class Point {
    double x,y;
    public Point(double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDisteance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

}

public class 构造方法{
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(p.getDisteance(origin));
    }
}