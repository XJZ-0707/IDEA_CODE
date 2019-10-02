package com.sxt.io;

import java.io.File;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-16 21:19 星期六
 * 其他信息
 * length():文件的字节数
 */
public class FileDemo05_168 {
    public static void main(String[] args) {
        File src = new File("D:/IntelliJ IDEA workspace/Java/05.jpg");
        System.out.println("长度:" + src.length());

        src = new File("D:/IntelliJ IDEA workspace/Java");
        System.out.println("长度:" + src.length());
    }
}
