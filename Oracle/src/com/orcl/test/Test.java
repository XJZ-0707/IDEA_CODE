package com.orcl.test;

import java.sql.*;

/**
 * @author 智障过人的laoxie
 * @create 2019-06-29 14:31 星期六
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

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
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345678");
        System.out.println("获取连接成功");
        //3.创建会话
        Statement sta= conn.createStatement();
        System.out.println("创建回话成功");

        //4.发送sql
        String sql = "insert into Dept values(20,'java',3)";
        int n=sta.executeUpdate(sql);
        System.out.println("发送sql成功");

        //5.处理结果
        if (n>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        //6.关闭数据库资源
        sta.close();
        conn.close();
    }

}
