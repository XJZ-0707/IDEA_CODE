package com.sxt.Thread;

/**
 * 202集
 * Lambda推导 + 参数
 * @author 智障过人的laoxie
 * @create 2019-06-22 9:43 星期六
 */
public class LambdaTest02 {

    public static void main(String[] args) {
        ILove love = (int a)-> {
            System.out.println("i like lambda-->"+a);
        };
        love.lambda(100);
        //简化
        love = (a)-> {
            System.out.println("i like lambda-->"+a);
        };
        love.lambda(50);
        //简化（如果只有一个参数）
        love = a-> {
            System.out.println("i like lambda-->"+a);
        };
        love.lambda(5);

        //简化（如果代码只有一行）
        love = (a)-> System.out.println("i like lambda-->"+a);
        love.lambda(0);

    }
}

    interface ILove {
        void lambda(int a);
    }

 /*   *//*外部类*//*
    class Love implements ILove {

        @Override
        public void lambda(int a) {
            System.out.println("i like lambda-->"+a);
        }
    }
*/