package com.sxt.io;

import java.io.File;

/**
 * 统计文件夹的大小
 * @author 智障过人的laoxie
 * @create 2019-03-15 11:58 星期五
 *
 */
public class DirCount_170 {
    //大小
    private long len;
    //文件夹
    private String Path;
    //文件的个数
    private int filesizes;
    //文件大小
    private int dirSize;
    //源
    private File src;

    public DirCount_170(String Path){
        this.Path = Path;
        this.src = new File(Path);
        count(this.src);
    }


    public static void main(String[] args) {
        DirCount_170 dir= new DirCount_170("D:/IntelliJ IDEA workspace/Java/");
        System.out.println(dir.getLen()+"-->"+dir.getFilesizes()+"-->"+dir.getDirSize() );

        DirCount_170 dir2= new DirCount_170("D:/IntelliJ IDEA workspace/Java/src");
        System.out.println(dir2.getLen()+"-->"+dir2.getFilesizes()+"-->"+dir2.getDirSize() );

    }
    //统计大小
    private  void count(File src){
        //获取大小
        if (null!= src && src.exists()){
            if (src.isFile()){//大小
                len +=src.length();
                this.filesizes++;
            }else {//子孙级
                this.dirSize++;
                for(File s:src.listFiles()){
                    count(s);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public void setLen(long len) {
        this.len = len;
    }

    public int getFilesizes() {
        return filesizes;
    }

    public void setFilesizes(int filesizes) {
        this.filesizes = filesizes;
    }

    public int getDirSize() {
        return dirSize;
    }

    public void setDirSize(int dirSize) {
        this.dirSize = dirSize;
    }
}
