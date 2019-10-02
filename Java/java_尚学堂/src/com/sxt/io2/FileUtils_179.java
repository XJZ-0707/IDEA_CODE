package com.sxt.io2;

import java.io.*;

/**
 * 1.封装拷贝
 * 2.封装释放
 * @author 智障过人的laoxie
 * @create 2019-03-23 16:46 星期六
 */
public class FileUtils_179 {
    public static void main(String[] args) {
        //文件到文件
        try {
            InputStream is = new FileInputStream("io.txt");
            OutputStream os = new FileOutputStream("io-copy.txt");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //文件到字节数组
        byte[] datas = null;
        try {
            InputStream is = new FileInputStream("05.jpg");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is,os);
            datas = os.toByteArray();
            System.out.println(datas.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("05-copy.jpg");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    对接输入输出流
    @param is
    @param os
     */
    public static void copy(InputStream is,OutputStream os){
        try {
            //3.操作(分段读取)
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while((len=is.read(flush))!=-1){
                os.write(flush,0,len);//分段写出
            }
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.释放资源 分别关闭 先打开的后关闭
         close(is,os);
        }
    }

    /*
    释放资源
   @param is
   @param os
    */
    public static void close(InputStream is,OutputStream os){
        try {
            if (null!=os){
                os.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (null!=is){
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void close(Closeable...ios){
        for (Closeable io:ios){
            try {
                if (null!=io){
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

