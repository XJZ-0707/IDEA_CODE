package com.sxt.io3;

import java.io.*;

/**
 * 文件拷贝:文件字节输入、输出流 BufferedInputStream提升效率
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @author 智障过人的laoxie
 * @create 2019-03-17 22:56 星期日
 */
public class CopyTxt_182 {
    public static void main(String[] args) {
       copy("io.txt","ioc.txt");//仅限于纯文本
    }

    public static void copy(String srcPath,String deskPath){
        //1.创建源
        File src = new File(srcPath);//源头
        File dest = new File(deskPath);//目的地
        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try{
            BufferedReader br =new BufferedReader(new FileReader(src)) ;
            BufferedWriter bw =new BufferedWriter( new FileWriter(dest));
            //3.操作(逐行读取)
            String line = null;
            while((line=br.readLine())!=null){
                bw.write(line);//逐行写出
                bw.newLine();
            }
            bw.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //4.释放资源 分别关闭 先打开的后关闭
            try {
                if (null!=os){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

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
