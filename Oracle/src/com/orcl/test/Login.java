package com.orcl.test;

import java.sql.*;
import java.util.Scanner;

/**
 * @author 智障过人的laoxie
 * @create 2019-06-29 17:13 星期六
 */
public class Login {
    public static void main(String[] args){
        Connection conn=null;
        Statement sta=null;
        try {
            //从键盘录入账号密码
            Scanner sc=new Scanner(System.in);
            System.out.print("账号:");
            String name = sc.next();
            System.out.print("密码:");
            String pwd = sc.next();

            //JDBC步骤
            //1.加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("加载驱动成功");
            //2.获取连接
            /*
             * url:协议+IP+端口+资源
             * user:用户名
             * password:密码
             * */
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345678");
            System.out.println("获取连接成功");
            //3.创建会话
            sta= conn.createStatement();
            System.out.println("创建回话成功");

            //4.发送sql
            String sql = "select * from t_user where username='"+name+"' and passwerd='"+pwd+"'";
            System.out.println("sql===>"+sql);
            ResultSet rs=sta.executeQuery(sql);
            //5.处理结果
            if (rs.next()){
                System.out.println("欢迎您，登录成功！");
            }else{
                System.out.println("登录失败");

            }

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //6.关闭数据库资源
            try {
                if (sta!=null){
                    sta.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
