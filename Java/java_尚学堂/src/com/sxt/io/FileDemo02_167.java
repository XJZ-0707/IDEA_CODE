package com.sxt.io;

import java.io.File;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-15 12:49 星期五
 *相对路径与绝对路径:
 * 1)存在盘符:绝对路径
 * 2)不存在盘符:相对路径
 *
 */
public class FileDemo02_167 {
    public static void main(String[] args) {
        String path = "D:/IntelliJ IDEA workspace/Java/05.jpg";


        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());

        //相对路径
        System.out.println(System.getProperty("src.dir"));
        src = new File("05.jpg");
        System.out.println(src.getAbsolutePath());

    }
}
