package sxt_java;

/**
 * @author laoxie
 * @reate 2019-01-23 12:55
 */
public class 条件运算符 {
    public static void main(String[] args) {
        int score=80;
        int x=-100;
        String type = score<60?"及格":"不及格";
        System.out.println(type);
        System.out.println(x>0?1:(x==0?0:-1));

    }
}
