package com.sxt.io;

import javax.xml.crypto.Data;
import java.io.UnsupportedEncodingException;

/**
 *编码:字符串-->字节
 *
 * @author 智障过人的laoxie
 * @create 2019-03-17 16:50 星期日
 */
public class ContentEncode_171 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "姓名生命使命a";
        //编码:字节数组
        byte[] Datas = msg.getBytes();//默认使用工程的字符集
        System.out.println(Datas.length);

        //编码:其他字符集
        Datas = msg.getBytes("UTF-16LE");
        System.out.println(Datas.length);
    }
}
