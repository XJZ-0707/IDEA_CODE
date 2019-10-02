package sxt_java;

/**
 * @author laoxie
 * @reate 2019-01-27 23:14
 * 1.在类中，用static声明的成员变量为静态成员变量，也称为类变量。类变量的生命周期和类相同，在整个应用程序执行期间都有效
 * 2.static修饰的成员变量和方法，从属于类。普通变量和方法从属于对象。
 */
/*
public class sxt_java.static静态成员变量 {
     int  id;//id
     String name;//账户名
     String pwd;//密码

    static String company = "北京尚学堂";

    public sxt_java.static静态成员变量(int id,String name){
        this.id = id;
        this.name = name;
    }
    public  void login(){
        System.out.println("登录"+name);
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args){
        sxt_java.static静态成员变量 u = new sxt_java.static静态成员变量(101,"高小其");
        sxt_java.static静态成员变量.company = "北京阿里爷爷";
        sxt_java.static静态成员变量.printCompany();
        sxt_java.static静态成员变量.printCompany();
    }

}
*/


/*
测试静态初始化块的使用
 */

public class static静态成员变量{
    int id;
    String name;
    String pwd;
    static String company;

    public static void printCompany(){
        System.out.println(company);
    }
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }

    public static void main(String[] args) {
        static静态成员变量 u3 = null;
    }

}
