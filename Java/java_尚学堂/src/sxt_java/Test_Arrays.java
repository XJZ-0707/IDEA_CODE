package sxt_java;

import java.util.Arrays;

/**
 * @author 智障过人的laoxie
 * @create 2019-02-28 22:09 星期四
 * 测试java.util.Arrays工具类的使用
 */
public class Test_Arrays {
    public static void main(String[] args) {
        int[] a = {10,20,30,5,87,23};
        System.out.println(a);
        System.out.println(Arrays.toString(a));//打印数组元素
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//打印数组元素
        System.out.println(Arrays.binarySearch(a,30));//打印数组元素




        //测试多维数组
        int[][] a1 = new int[3][];
        a1[0] = new int[]{19,39};
        a1[1] = new int[]{19,31,49};
        a1[2] = new int[]{19,35,55,33};
        System.out.println(a1[1][1]);//打印数组元素


        //静态初始化二维数组
        int[][] b = {
                {20,30,40},
                {20,30},
                {20,32,47}
        };
        System.out.println(b[1][1]);//打印数组元素


        //测试object数组
        Object[] emp1 = {1001,"老谢",18,"student","2006-4-6"};
        Object[] emp2 = {1001,"老谢2",19,"student","2006-4-6"};
        Object[] emp3 = {1001,"老谢3",10,"student","2006-4-6"};

        Object[][] tabledata = new Object[3][];
        tabledata[0] = emp1;
        tabledata[1] = emp2;
        tabledata[2] = emp3;

        for (Object[] temp:tabledata){
            System.out.println(Arrays.toString(temp));
        }

    }
}
