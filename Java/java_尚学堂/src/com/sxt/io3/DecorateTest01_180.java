package com.sxt.io3;

/**
 * @author 智障过人的laoxie
 * @create 2019-03-23 17:54 星期六
 */
public class DecorateTest01_180 {
    public static void main(String[] args) {
        Person p = new Person();
        p.say();

        //装饰
        Amplifier am = new Amplifier(p);
        am.say();
    }

}

interface Say{
    void say();
}

//放大器
class Person implements Say{
    //属性
    private int voice = 10;
    @Override
    public void say() {
        System.out.println("人的声音为：" + this.getVoice());
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}

class Amplifier implements Say{
    private Person p;
    Amplifier (Person p){
        this.p=p;
    }
    @Override
    public void say() {
        System.out.println("人的声音为：" + p.getVoice()*100);
        System.out.println("噪音，，，");

    }
}