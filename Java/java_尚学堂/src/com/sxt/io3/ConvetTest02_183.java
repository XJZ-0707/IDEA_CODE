package com.sxt.io3;

import java.io.*;
import java.net.URL;

/**
 * 183转换流_字符集
 * 转换流：InputStreamreader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 * @author 智障过人的laoxie
 * @create 2019-06-17 22:54 星期一
 */
public class ConvetTest02_183 {
    public static void main(String[] args) {
        //网络流 下载百度的源代码
        try(BufferedReader is = new BufferedReader(new InputStreamReader(new URL("https://www.bilibili.com/").openStream(),"UTF-8"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bilibil.html"),"UTF-8"))) {
            //3.操作(读取)
            String msg ;
            while((msg=is.readLine())!=null){
                // System.out.print(msg);
                writer.write(msg);//字符集不统一，出现乱码
                writer.newLine();
            }
            writer.flush();
        }catch (IOException e) {
            //System.out.println("操作异常");
        }

    }
    public static void test2(){
        //网络流 下载百度的源代码
        try(InputStreamReader is =new InputStreamReader(new URL("https://www.bilibili.com/").openStream(),"UTF-8") ) {
            //3.操作(读取)
            int temp;
            while((temp=is.read())!=-1){
                System.out.print((char)temp);
            }
        }catch (IOException e) {
            System.out.println("操作异常");
        }
    }

    public static void test1() {
        //网络流 下载百度的源代码
        try(InputStream is = new URL("https://www.bilibili.com/").openStream()) {
            //3.操作(读取)
            int temp;
            while((temp=is.read())!=-1){
                System.out.print((char)temp);//字节数不够出现乱码
            }
        }catch (IOException e) {
            e.printStackTrace();

        }

    }
}
