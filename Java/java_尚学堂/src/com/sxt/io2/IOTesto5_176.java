package com.sxt.io2;

import java.io.*;

/**
 * 四个步骤:文件字符输入流
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class IOTesto5_176 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("io.txt");
        //2.选择流
        Reader reader = null;
        try{
            reader = new FileReader(src);
            //3.操作(读取)
            char[] flush = new char[1024];//缓冲容器
            int len = -1;//接收长度
            while((len=reader.read(flush))!=-1){
                //字符数组-->字符串(解码)
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.释放
            try {
                if (null!=reader){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
