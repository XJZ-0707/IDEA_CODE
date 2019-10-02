package com.sxt.io;

/**
 * 递归:方法自己调用自己
 * 递归头:何时结束递归
 * 递归体:重复调用
 * @author 智障过人的laoxie
 * @create 2019-03-15 11:58 星期五
 *
 */
public class DirDemo03_169 {
    public static void main(String[] args) {
     printTen(10);
    }

    public static void printTen(int n){
        if(n>10){//递归头:结束递归
            return;
        }
        System.out.println(n);
        printTen(n+1);//递归体:方法自己调用自己
    }
}
