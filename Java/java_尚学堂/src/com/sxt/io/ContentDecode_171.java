package com.sxt.io;

import java.io.UnsupportedEncodingException;

/**
 *解码: 字节-->字符串
 *
 * @author 智障过人的laoxie
 * @create 2019-03-17 16:50 星期日
 */
public class ContentDecode_171 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "姓名生命使命";
        //编码:字节数组
        byte[] datas = msg.getBytes();//默认使用工程的字符集

        //解码:字符集String(byte[] bytes,int offset,int length,String charsetName)
        msg = new String(datas,0,datas.length,"utf8");
        System.out.println(msg);

        //乱码:
        //1),字节数不够
        msg = new String(datas,0,datas.length-4,"utf8");
        System.out.println(msg);
        msg = new String(datas,0,datas.length-1,"utf8");
        System.out.println(msg);
        //2)字符集不统一
        msg = new String(datas,0,datas.length,"gbk");
        System.out.println(msg);

    }
}
