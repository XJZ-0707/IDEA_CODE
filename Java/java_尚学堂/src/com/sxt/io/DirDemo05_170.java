package com.sxt.io;

import java.io.File;

/**
 * 统计文件夹的大小
 * @author 智障过人的laoxie
 * @create 2019-03-15 11:58 星期五
 *
 */
public class DirDemo05_170 {
    public static void main(String[] args) {
        File src = new File("D:/IntelliJ IDEA workspace/Java/");
        count(src);
        System.out.println(len);
    }

    public static long len = 0;
    public static void count(File src){
        //获取大小
        if (null != src && src.exists()){
            if (src.isFile()){//大小
                len +=src.length();
            }else {//子孙级
                for(File s:src.listFiles()){
                    count(s);
                }
            }
        }
    }
}
