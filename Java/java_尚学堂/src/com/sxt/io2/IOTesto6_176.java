package com.sxt.io2;

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
public class IOTesto6_176 {
    public static void main(String[] args) {
        //1.创建源
        File dest = new File("iooi.txt");
        //2.选择流
        Writer witer = null;
        try{
            //os = new FileOutputStream(dest,true);//不会覆盖
            witer = new FileWriter(dest);//会覆盖

            //3.操作(写出)
            //写法一
            /*String msg = "IO is so easy\r\n极客视界111";
            char[] datas = msg.toCharArray();//字符串-->字符数组(编码)
            witer.write(datas,0,datas.length);*/

            //写法二
            /*String msg = "IO is so easy\r\n极客视界222";
            witer.write(msg);
            witer.flush();*/
            //写法三
            witer.append("IO is so easy\r\n极客视界333").append("看到就大额打开了手机了");
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
