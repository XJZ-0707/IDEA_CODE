package com.sxt.io;

import java.io.File;
import java.io.IOException;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-16 21:19 星期六
 * 其他信息
 * createNewFile() :不存在才创建,存在创建成功
 * delete():删除已经存在的文件
 */
public class FileDemo06_168 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:/IntelliJ IDEA workspace/Java/io.txt");
        boolean flag = src.createNewFile();
        System.out.println(flag);

        //不是文件夹
        src = new File("D:/IntelliJ IDEA workspace/Java/ioee");
        flag = src.createNewFile();
        System.out.println(flag);

        flag = src.delete();
        System.out.println(flag);


        //补充:con com3....操作系统的设备名,不能正确创建
        src = new File("D:/IntelliJ IDEA workspace/Java/con2");
        src.createNewFile();

    }
}
