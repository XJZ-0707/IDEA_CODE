package com.sxt.Thread;

/**
 * Lambda推到
 * @author 智障过人的laoxie
 * @create 2019-06-22 9:43 星期六
 */
public class LambdaTest01 {
    //静态内部类
    static class Like2 implements Ilike{

        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        Ilike like = new Like();

        like = new Like2();
        like.lambda();

        //匿名内部类
        like = new Ilike(){

            @Override
            public void lambda() {
                System.out.println("i like lambda3");

            }
        };

        //lambda
        like = ()->{
            System.out.println("i like lambda3");
        };
    }
}

interface Ilike{
    void lambda();
}

/*外部类*/
class Like implements Ilike{

    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}