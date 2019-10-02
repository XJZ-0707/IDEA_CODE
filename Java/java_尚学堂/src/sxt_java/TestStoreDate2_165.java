package sxt_java;

import java.util.*;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-14 22:46 星期四
 * 测试表格数据的存储
 * 体会ORM思想
 * 每一行数据使用javabean对象存储，多行使用放到map或list中
 */
public class TestStoreDate2_165 {
    public static void main(String[] args) {
        User01 user1 = new User01(1001,"张三",2000,"2018.5.5");
        User01 user2 = new User01(1002,"李四",30000,"2018.4.5");
        User01 user3 = new User01(1003,"王五",20060,"2019.5.5");

        List<User01> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User01 u:list){
            System.out.println(u);
        }

        Map<Integer,User01> map = new HashMap<>();
        map.put(1001,user1);
        map.put(1002,user2);
        map.put(1003,user3);

        Set<Integer> keyset = map.keySet();
        for (Integer key:keyset){
            System.out.println(key + "===" +map.get(key));
        }

    }

}

class User01{
    private int id;
    private  String name;
    private  double salary;
    private  String hiredate;

    //一个完整的的javabean。要有set和get方法，以及无参的构造器
    public User01(){

    }


    public User01(int id, String name, double salary, String hiredate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "id" +id+",name:" + name + ",salary:" + salary +",hiredate:" + hiredate;
    }
}