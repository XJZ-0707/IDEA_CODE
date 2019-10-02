package com.sxt.io3;

import java.io.*;
import java.util.Date;

/**
 * ObjectOutputStream
 * ObjectInputStteam
 * @author 智障过人的laoxie
 * @create 2019-06-19 8:57 星期三
 */
public class ObjectTest02_185 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写出-->序列化
        ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.txt")));
        //操作数据类型+数据
        dos.writeUTF("编码新书A类");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.writeObject("水解几点开始");
        dos.writeObject(new Date());
        Employee emp = new Employee("马云",400);
        dos.writeObject(emp);
        dos.flush();
        dos.close();
        //读取-->反序列化
        ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.txt")));
        //顺序与写出一致
        String msg =dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(msg);
        System.out.println(age);
        System.out.println(flag);
        System.out.println(ch);

        //对象的数据还原
        Object str = dis.readObject();
        Object date = dis.readObject();
        Object employee = dis.readObject();


        if (str instanceof String){
            String strObj = (String)str;
            System.out.println(strObj);
        }
        if (date instanceof Date){
            Date DateObj = (Date)date;
            System.out.println(DateObj);
        }
        if (employee instanceof Employee){
            Employee empObj = (Employee)employee;
            System.out.println(empObj.getName()+"-->" + empObj.getSalary());
        }
        dos.close();
    }


}
/*

//javabean封装数据
class Employee implements Serializable{
    private String name;
    private double salary;
    public Employee(){

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
}*/
