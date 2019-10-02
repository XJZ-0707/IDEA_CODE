package com.sxt.io;

import java.io.File;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-15 11:58 星期五
 * 构建File对象
 */
public class FileDemo01_167 {
    public static void main(String[] args) {
        String path = "D:/IntelliJ IDEA workspace/Java/05.jpg";

        //构建File对象
        File src = new File(path);
        System.out.println(src.length());
        //2.构建File对象()
        src = new File("D:/IntelliJ IDEA workspace/Java/05.jpg");
        System.out.println(src.length());

        //构建File对象
        src = new File(new File("D:/IntelliJ IDEA workspace"),"Java/05.jpg");
        System.out.println(src.length());

    }
}
