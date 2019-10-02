package orcl.data;

import java.sql.*;

//数据库工具类
public class  DBUtils  {
    //获取连接
    public static Connection getConnection(){
        Connection conn = null;

        try {
            //1.加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345678");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    //关闭数据库资源
    public static void closeAll(Statement sta, Connection conn, ResultSet rs){
        //6.关闭数据库资源
        try {
            if (rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
