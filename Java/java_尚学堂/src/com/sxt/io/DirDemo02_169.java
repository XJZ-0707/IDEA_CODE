package com.sxt.io;

import java.io.File;

/**
 * 列出下一级
 * 1.list():列出下级名称
 * 2.listFiles():列出下级File对象
 * @author 智障过人的laoxie
 * @create 2019-03-15 11:58 星期五
 *
 */
public class DirDemo02_169 {
    public static void main(String[] args) {
        File dir = new File("D:/IntelliJ IDEA workspace/Java/");

        //列出下级名称 list
        String[] subNames = dir.list();
        for(String temp : subNames){
            System.out.print(temp +"  ");
        }

        //列出下级对象
        File[] subFiles = dir.listFiles();
        for (File s:subFiles){
            System.out.println(s.getAbsolutePath());
        }

        //所有盘符
        File[] roots = dir.listRoots();
        for (File r:roots){
            System.out.println(r);
        }
    }
}
