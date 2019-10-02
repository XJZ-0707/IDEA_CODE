package sxt_java;

/**
 * @author laoxie
 * @reate 2019-01-23 13:47
 */
public class 使用Scanner键盘输入 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入名字：");
//        String name=scanner.nextLine();
//        System.out.println("请输入你的爱好：");
//        String favor = scanner.nextLine();
//        System.out.println("请输入你的年龄");
//        int age = scanner.nextInt();
//        System.out.println(name+"的爱好是"+favor);


//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");//Delimiter分隔符
//        System.out.println(s.nextInt());
//        System.out.println(s.nextInt());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        s.close();


//        double d = Math.random();//返回【0，1）
//        System.out.println(d);
//        double d2 = 6*d;
//        System.out.println(d2);
//        int i = (int)(6*d+1);
//        System.out.println(i);
//        if(i<3){
//            System.out.println("小");
//        }
//        else {
//            System.out.println("大");
//        }


//        int total=0;//定义计数器
//        System.out.println("Begin");
//        while (true){
//            total++;//每循环一次计数器加一
//            int i = (int)Math.round(100*Math.random());
//            System.out.println(i);
//            if(i==50){
//                break;
//            }
//        }
//        System.out.println("Game over "+total+" times!");
//
//        outer:for(int i=101;i<150;i++){//带标签的continue
//            for(int j=2;j<i/2;j++){
//                if(i%j==0){
//                    continue outer;
//                }
//            }
//            System.out.print(i+" ");
//        }

        //阶乘
        long d1=System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n",20,factorial(20));
        long d2=System.currentTimeMillis();
        System.out.printf("递归费时：%s%n",d2-d1);
    }
    static double factorial(int n){
        if(n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
