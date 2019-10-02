package com.sxt.io;

import java.io.File;

/**
 * 创建目录
 * 1.mkdir():确保上机目录存在,不存在创建失败
 * 2.mkdirs():上机目录可以不存在,不存在一同来创建
 * @author 智障过人的laoxie
 * @create 2019-03-15 11:58 星期五
 *
 */
public class DirDemo01_168 {
    public static void main(String[] args) {
//        String path = "D:/IntelliJ IDEA workspace/Java/05.jpg";
        File dir = new File("D:/IntelliJ IDEA workspace/Java/dir/dir2");
        //创建目录mkdirs()
        boolean flag = dir.mkdir();
        System.out.println(flag);

        //创建目录:mkdirs();建议用mkdirs
        flag = dir.mkdirs();
        System.out.println(flag);
    }
}
