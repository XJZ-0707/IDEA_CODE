package com.sxt.io3;

import java.io.*;

/**
 * 四个步骤:文件字节输入流
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class BufferedTest04_182 {
    public static void main(String[] args) {
        //1.创建源
        File dest = new File("iooi.txt");
        //2.选择流
        BufferedWriter witer = null;
        try{
            //os = new FileOutputStream(dest,true);//不会覆盖
            witer =new BufferedWriter( new FileWriter(dest));//会覆盖

            //3.操作(写出)
            witer.append("IO is so easy");
            witer.newLine();
            witer.append("欢迎你！");
            witer.flush();

            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.释放
            try {
                if (null!=witer){
                    witer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
