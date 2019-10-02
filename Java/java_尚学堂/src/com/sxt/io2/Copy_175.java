package com.sxt.io2;

import java.io.*;

/**
 * 文件拷贝:文件字节输入、输出流
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class Copy_175 {
    public static void main(String[] args) {
       copy("05.jpg","009.jpg");
    }

    public static void copy(String srcPath,String deskPath){
        //1.创建源
        File src = new File(srcPath);//源头
        File dest = new File(deskPath);//目的地
        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
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
    }
}
