package com.sxt.io3;

import java.io.*;

/**
 * PrintStream
 * @author 智障过人的laoxie
 * @create 2019-06-20 20:57 星期四
 */
public class PrintTest01_186 {
    public static void main(String[] args) throws FileNotFoundException {
        //打印流Systrm.out
        PrintStream ps=System.out;
        ps.println("打印流");
        ps.println(true);

        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")));
        ps.println("打印流");
        ps.println(true);
        ps.flush();
        ps.close();

        //重定向
        System.setOut(ps);
        System.out.println("change");

        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("i will back");

    }
}
