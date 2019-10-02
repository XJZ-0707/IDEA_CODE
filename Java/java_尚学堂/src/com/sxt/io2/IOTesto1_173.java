package com.sxt.io2;

import java.io.*;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class IOTesto1_173 {
    public static void main(String[] args) {
        //1.创建流
        File src = new File("io.txt");
        //2.选择流
        try{
            InputStream is = new FileInputStream(src);
            //3.操作(读取)
            int data1 = is.read();//第一个数据h
            int data2 = is.read();//第一个数据e
            int data3 = is.read();//第一个数据l
            int data4 = is.read();//第一个数据l
            int data5 = is.read();//第一个数据l

            System.out.println((char)data1);
            System.out.println((char)data2);
            System.out.println((char)data3);
            System.out.println(data4);
            System.out.println(data5);

            //4.释放
            is.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
