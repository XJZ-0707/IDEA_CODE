package orcl.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 智障过人的laoxie
 * @create 2019-06-29 21:27 星期六
 */
public class EmpDaoImpl implements EmpDao {
    @Override
    public List<Emp> FindAllEmp() {
        Connection conn=null;
        Statement sta=null;
        List<Emp> list=new ArrayList<Emp>();
        ResultSet rs=null;
        try {
            //JDBC步骤
            conn =DBUtils.getConnection();
            //3.创建会话
            sta= conn.createStatement();

            //4.发送sql
            String sql = "SELECT * from emp";
            rs= sta.executeQuery(sql);//Resultset结果集

            //5.处理结果
            while (rs.next()){
                //将数据获取
                int eno=rs.getInt("empno");
                String ename=rs.getString("ename");
                String job=rs.getString("job");
                int mgr=rs.getInt("mgr");
                Date d=rs.getDate("hiredate");
                double sal=rs.getDouble("sal");
                double comm=rs.getDouble("comm");
                int deptno=rs.getInt("deptno");
                //每条记录封装成一个Eep对象
               Emp emp=new Emp(eno,ename,job,mgr,d,sal,comm,deptno);
               //将这个对象放入list集合中
                list.add(emp);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //6.关闭数据库资源
            //6.关闭数据库资源
            DBUtils .closeAll(sta,conn,rs);
        }


        return list;

    }

    @Override
    public Emp FindOneEmp(int empno) {
        Connection conn=null;
        Statement sta=null;
        Emp emp=null;
        ResultSet rs=null;
        try {
            //JDBC步骤
            conn =DBUtils.getConnection();
            //3.创建会话
            sta= conn.createStatement();

            //4.发送sql
            String sql = "SELECT * from emp WHERE empno="+ empno;
            rs= sta.executeQuery(sql);//Resultset结果集

            //5.处理结果
           if (rs.next()){
               //将数据获取
               int eno=rs.getInt("empno");
               String ename=rs.getString("ename");
               String job=rs.getString("job");
               int mgr=rs.getInt("mgr");
               Date d=rs.getDate("hiredate");
               double sal=rs.getDouble("sal");
               double comm=rs.getDouble("comm");
               int deptno=rs.getInt("deptno");

               emp=new Emp(eno,ename,job,mgr,d,sal,comm,deptno);
           }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //6.关闭数据库资源
          DBUtils .closeAll(sta,conn,rs);
        }

        return emp;
    }

    @Override
    public int saveEmp(Emp e) {
        Connection conn=null;
        PreparedStatement ps= null;
        int n=0;
        try {
            conn = DBUtils.getConnection();
            //3.创建会话
            ps=conn.prepareStatement("INSERT into emp VALUES (?,?,?,?,?,?,?,?)");
            //设置？的值
            ps.setInt(1,e.getEmpno());
            ps.setString(2,e.getEname());
            ps.setString(3,e.getJob());
            ps.setInt(4,e.getMgr());
            //util-->sql
            java.sql.Date d = new java.sql.Date(e.getHiredate().getTime());
            ps.setDate(5,d);
            ps.setDouble(6,e.getSal());
            ps.setDouble(7,e.getComm());
            ps.setInt(8,e.getDeptno());

            n=ps.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {
        //6.关闭数据库资源
        DBUtils.closeAll(ps,conn,null);
        }

        return n;
    }

    @Override
    public int deleteEmp(int empno) {
        Connection conn=null;
        PreparedStatement ps= null;
        int n=0;
        try {
            conn = DBUtils.getConnection();
            //3.创建会话
            ps=conn.prepareStatement("DELETE FROM emp WHERE empno = ?");
            //设置？的值
            ps.setInt(1,empno);

            n=ps.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {
            //6.关闭数据库资源
            DBUtils.closeAll(ps,conn,null);
        }

        return n;
    }
}
