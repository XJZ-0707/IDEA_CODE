package orcl.data;

import java.util.List;

/**
 * @author 智障过人的laoxie
 * @create 2019-06-29 21:21 星期六
 */
public interface EmpDao {
    //登录


    //查询所有员工信息
    List<Emp> FindAllEmp();

    //查询指定员工编号的员工的信息
    Emp FindOneEmp(int empno);

    //保存员工信息
    int saveEmp(Emp e);

    //删除指定编号的员工
    int deleteEmp(int empno);


}
