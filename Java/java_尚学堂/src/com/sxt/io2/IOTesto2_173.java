package com.sxt.io2;

import java.io.*;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class IOTesto2_173 {
    public static void main(String[] args) {
        //1.创建流
        File src = new File("io.txt");
        //2.选择流
        InputStream is = null;
        try{
            is = new FileInputStream(src);
            //3.操作(读取)
            int temp;
            while((temp=is.read())!=-1){
                System.out.println((char)temp);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.释放
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
