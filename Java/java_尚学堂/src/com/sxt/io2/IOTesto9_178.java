package com.sxt.io2;

import java.io.*;

/**
 * 1.图片读取到字节数组
 * 2.字节数组写出到文件
 * 获取数据：toByteArray()
 *
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class IOTesto9_178 {
    public static void main(String[] args) {
        //图片转成字节数组
        byte[] datas = fileToByteArray("05.jpg");
        System.out.println(datas.length);

        byteArrayToFile(datas, "05byte.jpg");
    }

    /*
     *1.图片读取到字节数组
     * 1)图片到程序 FileInputStream
     * 2)程序到字节数组 ByteArrayOutputStream
     */
    public static byte[] fileToByteArray(String filePath) {
        //1.创建源与目的地
        File src = new File(filePath);
        byte[] dest = null;

        //2.选择流
        InputStream is = null;
        ByteArrayOutputStream baos = null;

        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();

            //3.操作(分段读取)
            byte[] flush = new byte[1024 * 10];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                baos.write(flush, 0, len);//写出到字节数组中
            }
            baos.flush();
            return baos.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /*
     *2.字节数组写出到文件
     * 1)字节数组到程序 ByteArrayInputStream
     * 2)程序到文件 FileOutputStream
     */
    public static void byteArrayToFile(byte[] src, String filePath) {
        //1.创建源
        File dest = new File(filePath);
        //2.选择流
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);

            //3.操作(读取)
            byte[] flush = new byte[5];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);//写出到文件

            }
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放
            try {
                if (null!=os){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
