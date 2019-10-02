package com.orcl.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author 智障过人的laoxie
 * @create 2019-06-29 14:31 星期六
 */
public class Test4 {
    public static void main(String[] args){
        Connection conn=null;
        Statement sta=null;
        try {
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
            String sql = "UPDATE Dept set DNAME='andriod' WHERE DEPTNO=10";
            int n=sta.executeUpdate(sql);
            System.out.println("发送sql成功");

            //5.处理结果
            System.out.println("n==="+ n);
            if (n>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
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
