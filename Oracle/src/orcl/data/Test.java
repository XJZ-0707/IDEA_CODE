package orcl.data;




import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
/*        //查询指定编号的员工信息
//        QueryEmp();
//        QueryAllEmp();
//        saveEmp();
//        delEmoByEmpno();
          Login();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------欢迎进入员工管理系统------");
            System.out.println("选择功能：");
            System.out.println("\t1.查询所有员工的信息");
            System.out.println("\t2.查询指定编号的员工信息");
            System.out.println("\t3.增加（保存）员工的信息");
            System.out.println("\t4.删除指定编号员工的信息");
            System.out.println("\t5.退出系统");
            int choice = sc.nextInt();
            switch (choice){
                case 1:QueryAllEmp();break;
                case 2:QueryEmp();break;
                case 3:saveEmp();break;
                case 4:delEmoByEmpno();break;
                case 5:System.out.println("退出系统");return;

            }

        }while (true);


 */

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
            //2.获取连接

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345678");
            //3.创建会话
            sta= conn.createStatement();
            //4.发送sql
            String sql = "select * from t_user where username='"+name+"' and passwerd='"+pwd+"'";
            System.out.println("username:"+name+"   " +"password:"+ pwd);
            ResultSet rs=sta.executeQuery(sql);
            //5.处理结果
            if (rs.next()){
                System.out.println("欢迎您，登录成功！如下是员工管理系统");
                do {
                    System.out.println("------欢迎进入员工管理系统------");
                    System.out.println("选择功能：");
                    System.out.println("\t1.查询所有员工的信息");
                    System.out.println("\t2.查询指定编号的员工信息");
                    System.out.println("\t3.增加（保存）员工的信息");
                    System.out.println("\t4.删除指定编号员工的信息");
                    System.out.println("\t5.退出系统");
                    int choice = sc.nextInt();
                    switch (choice){
                        case 1:QueryAllEmp();break;
                        case 2:QueryEmp();break;
                        case 3:saveEmp();break;
                        case 4:delEmoByEmpno();break;
                        case 5:System.out.println("退出系统");return;

                    }

                }while (true);

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

  /*  private static void Login() {
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
            //2.获取连接

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345678");
            //3.创建会话
            sta= conn.createStatement();
            //4.发送sql
            String sql = "select * from t_user where username='"+name+"' and passwerd='"+pwd+"'";
            System.out.println("sql===>"+sql);
            ResultSet rs=sta.executeQuery(sql);
            //5.处理结果
            if (rs.next()){
                System.out.println("欢迎您，登录成功！如下是员工管理系统");


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
*/
    private static void delEmoByEmpno() {
        //输入要删除的员工编号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的员工编号：");
        int empno = sc.nextInt();

        EmpDao ed = new EmpDaoImpl();
        int n = ed.deleteEmp(empno);

        if (n>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    private static void saveEmp() {
        //键盘录入8个信息
        Scanner sc= new Scanner(System.in);
        System.out.print("员工编号：");
        int empno = sc.nextInt();
        System.out.print("姓名：");
        String name = sc.next();
        System.out.print("职位：");
        String job = sc.next();
        System.out.print("上级领导：");
        int mgr = sc.nextInt();
        System.out.print("入职日期：");
        String date = sc.next();
        //String==>util.Date
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d= null;
        try {
            d = df.parse(date);
        } catch (ParseException el) {
            el.printStackTrace();
        }

        System.out.print("薪水：");
        int sal = sc.nextInt();
        System.out.print("津贴：");
        int comm = sc.nextInt();
        System.out.print("部门编号：");
        int deptno = sc.nextInt();

        Emp e=new Emp (empno,name,job,mgr,d,sal,comm,deptno);

        EmpDao ed = new EmpDaoImpl();
        int n= ed.saveEmp(e);
        if (n>0){
            System.out.println("员工信息保存成功");
        }else{
            System.out.println("员工信息保存失败");
        }
    }

    private static void QueryAllEmp() {
        //调用dao层
        EmpDao ed = new EmpDaoImpl();
        List<Emp> list= ed.FindAllEmp();
        System.out.println("员工信息如下：一共("+list.size()+")人");
        if (list.size()>0){
            for (Emp e:list){
                System.out.println(e);
            }
        }else {
            System.out.println("没有查到员工信息");
        }
    }

    private static void QueryEmp() {
        //键盘录入一个你想要查询的员工的编号
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入员工的编号：");
        int empno = sc.nextInt();

        //调用dao层
        EmpDao ed = new EmpDaoImpl();
        Emp emp = ed.FindOneEmp(empno);

        //处理结果
        if (emp!=null){
            System.out.println(emp);
        }else{
            System.out.println("查询失败");

        }
    }
}
