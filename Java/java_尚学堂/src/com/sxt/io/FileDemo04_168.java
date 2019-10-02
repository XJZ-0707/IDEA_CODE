package com.sxt.io;

import java.io.File;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-16 11:12 星期六
 * 文件状态
 * 1.不存在:exists
 * 2.存在:
 *      文件:isFile
 *      文件夹:isDirectory
 */
public class FileDemo04_168 {
    public static void main(String[] args) {
        File src = new File("Java/05.jpg");
        System.out.println(src.getAbsolutePath());
        System.out.println("是否存在:"+src.exists());
        System.out.println("是否文件:"+src.isFile());
        System.out.println("是否文件夹:"+ src.isDirectory());

        src = new File("05.jpg");
        System.out.println("======");
        System.out.println(src.getAbsolutePath());
        System.out.println("是否存在:"+src.exists());
        System.out.println("是否文件:"+src.isFile());
        System.out.println("是否文件夹:"+ src.isDirectory());

        src = new File("D:\\IntelliJ IDEA workspace\\Java");
        System.out.println("======");
        System.out.println(src.getAbsolutePath());
        System.out.println("是否存在:"+src.exists());
        System.out.println("是否文件:"+src.isFile());
        System.out.println("是否文件夹:"+ src.isDirectory());

        //文件状态
        src = new File("");
        if (null ==src || !src.exists()){
            System.out.println("文件不存在");
        }
        else {
            if (src.isFile()){
                System.out.println("文件操作");
            }
            else {
                System.out.println("文件夹操作");
            }
        }

    }
}
