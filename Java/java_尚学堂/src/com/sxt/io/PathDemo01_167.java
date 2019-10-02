package com.sxt.io;

import java.io.File;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-15 10:48 星期五
 */
public class PathDemo01_167 {
    //D:\IntelliJ IDEA workspace\Java
    public static void main(String[] args) {
        String path = "D:\\IntelliJ IDEA workspace\\Java\\05.jpg";
        System.out.println(File.separatorChar);
        //建议
        //1./
        path = "D:/IntelliJ IDEA workspace/Java/05.jpg";
        //2.常量拼接
        path = "D:" + File.separatorChar +"IntelliJ IDEA workspace"+ File.separatorChar  +"Java"+ File.separatorChar + "05.jpg";
        System.out.println(path);
    }
}
