package com.sxt.io;

import java.io.File;

/**
 * 名称或路径
 * getName():名称
 * getPath():相对,绝对
 * getAbsolutePath():绝对
 * getParent():上路径,不存在,返回空
 * @author 智障过人的laoxie
 * @create 2019-03-15 12:58 星期五
 */
public class FileDemo03_168 {
    public static void main(String[] args) {
        File src = new File("D:/IntelliJ IDEA workspace/Java/05.jpg");
        //基本信息
        System.out.println("name:"+src.getName());
        System.out.println("路径:"+src.getPath());
        System.out.println("绝对路径:"+src.getAbsolutePath());
        System.out.println("父路径:"+src.getParent());
        System.out.println("父对象:"+src.getParentFile().getName());

    }
}
