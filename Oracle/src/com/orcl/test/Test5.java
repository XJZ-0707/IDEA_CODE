package com.orcl.test;

import java.sql.*;

/**
 * @author 智障过人的laoxie
 * @create 2019-06-29 14:31 星期六
 */
public class Test5 {
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
            String sql = "SELECT * from Dept";
            ResultSet rs= sta.executeQuery(sql);//Resultset结果集
            System.out.println("发送sql成功");

            //5.处理结果
            System.out.println("deptno"+ "---"+"deptno"+ "---"+ "loc");

            while (rs.next()){
                //将数据取出
                int deptno= rs.getInt("DEPTNO");
                String dname= rs.getString("DNAME");
                int loc= rs.getInt("LOC");
                System.out.println(deptno + "---" + dname +"---"+ loc);
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
