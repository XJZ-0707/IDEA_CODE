package com.sxt.io2;

import java.io.*;

/**
 * 字节数组输出流 ByteArrayOutputStream
 * 1.创建流 内部维护
 * 2.选择流：不关联源
 * 3.操作（写出内容）
 * 4.释放资源：可以不用
 *
 * 获取数据：toByteArray()
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class IOTesto8_177 {
    public static void main(String[] args) {
        //1.创建源
        byte[] dest = null;
        //2.选择流 (新增方法)
        ByteArrayOutputStream baos = null;
        try{
            baos = new ByteArrayOutputStream();
            //3.操作(读取)
            String msg = "show me the code";
            byte[] datas = msg.getBytes();//字符串-->字节数组(编码)
            baos.write(datas,0,datas.length);
            baos.flush();
            //获取数据
            dest = baos.toByteArray();
            System.out.println(dest.length + "-->" + new String(dest,0,baos.size()));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.释放
            try {
                if (null!=baos){
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
