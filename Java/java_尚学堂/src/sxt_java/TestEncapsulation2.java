package sxt_java;

/**
 * @author 智障过人的laoxie
 * @create 2019-02-03 1:07 星期日
 */
public class TestEncapsulation2 {
    private int id;
    private String name;
    private int age;
    private boolean man;

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

    public int getAge() {
       // return age;
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        if(age>=1&&age<=130){
            this.age = age;
        }
        else {
            System.out.println("请输入正确的年龄！");
        }

    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
