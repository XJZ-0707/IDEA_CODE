package com.sxt.io3;

import java.io.*;

/**
 * PrintWriter
 * @author 智障过人的laoxie
 * @create 2019-06-20 20:57 星期四
 */
public class PrintTest02_186 {
    public static void main(String[] args) throws FileNotFoundException {

      PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print2.txt")));
        pw.println("打印流");
        pw.println(true);
        pw.flush();
        pw.close();

    }
}
