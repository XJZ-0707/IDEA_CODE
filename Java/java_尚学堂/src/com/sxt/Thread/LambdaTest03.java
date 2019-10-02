package com.sxt.Thread;

/**
 * 202集
 * Lambda推导 + 参数 +返回值
 * @author 智障过人的laoxie
 * @create 2019-06-22 9:43 星期六
 */
public class LambdaTest03 {


    public static void main(String[] args) {

        IInterest interest = (int a,int c)-> {
            System.out.println("i like lambda-->"+(a+c));
            return a+c;
        };
        interest.lambda(100,100);

        //简化
        IInterest interest2 = (a,c)-> {
            System.out.println("i like lambda-->"+(a+c));
            return a+c;
        };
        interest.lambda(10,10);
    }
}

interface IInterest {
    int lambda(int a, int b);
}

/*外部类*/
class Interest implements IInterest {

    @Override
    public int lambda(int a,int c) {
        System.out.println("i like lambda-->"+(a+c));
        return a+c;
    }
}
