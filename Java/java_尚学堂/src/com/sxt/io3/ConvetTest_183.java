package com.sxt.io3;

import java.io.*;

/**
 * 183转换流_字符集
 * 转换流：InputStreamreader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 * @author 智障过人的laoxie
 * @create 2019-06-17 22:54 星期一
 */
public class ConvetTest_183 {
    public static void main(String[] args) {
        //操作System.in 和 System.out
        try(BufferedReader reader =new  BufferedReader( new InputStreamReader(System.in));
            BufferedWriter writer =new BufferedWriter( new OutputStreamWriter(System.out))) {
            //循环获取键盘的输入（exit,退出）输出此内容
            String msg="";
            while(!msg.equals("exit")){
                msg = reader.readLine();//循环读取
                writer.write(msg);//循环写出
                writer.newLine();
                writer.flush();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
