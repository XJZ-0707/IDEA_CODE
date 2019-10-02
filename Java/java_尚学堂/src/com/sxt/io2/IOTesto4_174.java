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
public class IOTesto4_174 {
    public static void main(String[] args) {
        //1.创建源
        File dest = new File("iooi.txt");
        //2.选择流
        OutputStream os = null;
        try{
            //os = new FileOutputStream(dest,true);//不会覆盖
            os = new FileOutputStream(dest,false);//会覆盖

            //3.操作(写出)
            String msg = "IO is so easy\r\n";
            byte[] datas = msg.getBytes();//字符串-->字节数组(编码)
            os.write(datas,0,datas.length);
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
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
