package com.sxt.io3;

import java.io.*;

/**
 * 数据流
 * DataOutputStream
 * DataInputStteam
 * @author 智障过人的laoxie
 * @create 2019-06-19 8:57 星期三
 */
public class DataTest_184 {
    public static void main(String[] args) throws IOException {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
        //操作数据类型+数据
        dos.writeUTF("编码新书A类");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();
        byte[] datas = baos.toByteArray();
        System.out.println(datas.length);
        //读取
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出一致
        String msg =dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(msg);
        System.out.println(age);
        System.out.println(flag);
        System.out.println(ch);

    }
}
